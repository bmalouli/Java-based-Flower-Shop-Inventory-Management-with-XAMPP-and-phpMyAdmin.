package controleurInventaire;
import java.util.List;
import modelInventaire.Inventaire;
import modelInventaire.DaoInventaire;
import java.util.*;

public class ControleurInventaire implements IActionsInventaire {

    private static ControleurInventaire CtrI_Instance = null;
    private static DaoInventaire Dao_Instance = null;
    // Singleton du contrôleur
    // getControleurFilm() est devenu une zonne critique.
    // Pour ne pas avoir deux processus légers (threads) qui
    // appellent au même temps getConnexion
    private ControleurInventaire(){}

    public static synchronized ControleurInventaire getControleurInventaire() {
        try {
            if (CtrI_Instance == null) {
                CtrI_Instance = new ControleurInventaire();
                Dao_Instance = DaoInventaire.getInventaireDao();
            }
            return CtrI_Instance;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Actions sur modèle
    public int CtrI_MiseAJour(Inventaire fleur) {
        int reponse = 0;
        reponse = Dao_Instance.MdlI_MiseAJour(fleur); //renvoi le nombre de lignes qui ont été mises à jour
        return reponse;
    }

    public List<Inventaire> CtrI_GetAll() {
        List<Inventaire> inventaireComplet = new ArrayList<>();
        inventaireComplet = Dao_Instance.MdlI_GetAll();
        return inventaireComplet;
    }


    public Inventaire CtrI_GetById(int id) {
        Inventaire fleur = null;
        fleur = Dao_Instance.MdlI_GetById(id); 
        return fleur;
    }


    public Inventaire CtrI_GetByName(String name) {
        Inventaire fleur = null;
        fleur = Dao_Instance.MdlI_GetByName(name);
        return fleur;
    }


    public int CtrI_Supprimer(int id) {
        int reponse = -1;
        reponse = Dao_Instance.MdlI_Supprimer(id); //renvoi le nombre de lignes qui ont été supprimées
        return reponse;
    }


    public String CtrI_Ajouter(Inventaire fleur) {
        String message = null;
        message = Dao_Instance.MdlI_Ajouter(fleur); //message de confirmation
        return message;
    }

    public void CtrI_Fermer() {
        Dao_Instance.MdlI_FermerTout();
    }
}
