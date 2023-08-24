package modelInventaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoInventaire implements IDaoInventaire {
    private static Connection conn = null;
    private static DaoInventaire instanceDao = null;

    // MySQL
    //private static final String PILOTE = "com.mysql.jdbc.Driver";
    private static final String URL_BD = "jdbc:mysql://localhost/fleuriste_titania";
    private static final String USAGER = "root";
    private static final String PASS = "";

    private static final String MAJ = "UPDATE inventaire SET nom=?, couleur=?, prix=?, quantite=? WHERE id=?";
    private static final String GET_ALL = "SELECT * FROM inventaire ORDER BY id";
    private static final String GET_BY_ID = "SELECT * FROM inventaire WHERE id=?";
    private static final String GET_BY_NAME = "SELECT * FROM inventaire WHERE nom=?";
    private static final String SUPPRIMER = "DELETE FROM inventaire WHERE id=?";
    private static final String AJOUTER = "INSERT INTO inventaire VALUES(0,?, ?, ?, ?)";
    

    // Singleton de connexion à la BD
    // getConnexion() est devenu une zonne critique. 
    // Pour ne pas avoir deux processus légers (threads) qui
    // appellent au même temps getConnexion

    private DaoInventaire(){};
    
    public static synchronized DaoInventaire getInventaireDao () {
        try {
            // Class.forName(PILOTE);
            if (instanceDao == null) {
                instanceDao = new DaoInventaire();
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL_BD, USAGER, PASS);
            }
            return instanceDao;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    


    //IMPLÉMENTATION DES MÉTHODES PROPRES À LA GESTION DE LA TABLE inventaire DE LA BDD

    // Update, il faut avant appeler MdlI_GetById(id) pour obtenir
    // les données à modifier via une interface et après envoyer 
    // à MdlI_Enregistrer(fleur) pour faire la mise à  jour.
    public int MdlI_MiseAJour(Inventaire fleur) {
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(MAJ);
            stmt.setString(1, fleur.getName());
            stmt.setString(2, fleur.getColor());
            stmt.setInt(3, fleur.getPrice());
            stmt.setInt(4, fleur.getQuantity());

            return stmt.executeUpdate(); //devrait retourner 1 car une ligne de la table a été modifiée
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            MdlF_Fermer(stmt);
            MdlF_Fermer(conn);
        }
    }


    public List<Inventaire> MdlI_GetAll() {
        PreparedStatement stmt = null;
        List<Inventaire> listeInventaire = new ArrayList<Inventaire>();

        try {
            stmt = conn.prepareStatement(GET_ALL);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Inventaire fleur = new Inventaire();
                fleur.setId(rs.getInt("id"));
                fleur.setName(rs.getString("nom"));
                fleur.setColor(rs.getString("couleur"));
                fleur.setPrice(rs.getInt("prix"));
                fleur.setQuantity(rs.getInt("quantite"));

                listeInventaire.add(fleur);
            }
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            MdlF_Fermer(stmt);
            MdlF_Fermer(conn);
        }

        return listeInventaire;
    }

    public Inventaire MdlI_GetById(int id) {
        PreparedStatement stmt = null;

        try {

            stmt = conn.prepareStatement(GET_BY_ID);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Inventaire fleur = new Inventaire();
                fleur.setId(rs.getInt("id"));
                fleur.setName(rs.getString("nom"));
                fleur.setColor(rs.getString("couleur"));
                fleur.setPrice(rs.getInt("prix"));
                fleur.setQuantity(rs.getInt("quantite"));

                return fleur;
            } else {
                return null;
            }
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            MdlF_Fermer(stmt);
            MdlF_Fermer(conn);
        }
    }

    public Inventaire MdlI_GetByName(String name) {
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(GET_BY_NAME);
            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Inventaire fleur = new Inventaire();
                fleur.setId(rs.getInt("id"));
                fleur.setName(rs.getString("nom"));
                fleur.setColor(rs.getString("couleur"));
                fleur.setPrice(rs.getInt("prix"));
                fleur.setQuantity(rs.getInt("quantite"));

                return fleur;
            } else {
                return null;
            }
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            MdlF_Fermer(stmt);
            MdlF_Fermer(conn);
        }
    }


    public int MdlI_Supprimer(int id) {
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(SUPPRIMER);
            stmt.setInt(1, id);

            return stmt.executeUpdate();
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            MdlF_Fermer(stmt);
            MdlF_Fermer(conn);
        }
    }

    public String MdlI_Ajouter(Inventaire fleur) {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(AJOUTER, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, fleur.getName());
            stmt.setString(2, fleur.getColor());
            stmt.setInt(3, fleur.getPrice());
            stmt.setInt(4, fleur.getQuantity());
            
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                fleur.setId(rs.getInt(1));
            }
            return "Fleur bien ajoutée à l'inventaire";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MdlF_Fermer(stmt);
            MdlF_Fermer(conn);
        }
    }

    //UTILITAIRES
    private static void MdlF_Fermer(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    private static void MdlF_Fermer(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
