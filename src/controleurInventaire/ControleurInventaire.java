package controleurInventaire;

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
    public String CtrI_MiseAJour(Inventaire fleur) {
        String message = null;
        message = String.valueOf(Dao_Instance.MdlI_MiseAJour(fleur)); //renvoi le nombre de ligne qui ont été mises à jour
        return message;
    }

    public List<Inventaire> CtrI_GetAll() {
        List<Inventaire> inventaireComplet = new ArrayList<>();
        inventaireComplet = Dao_Instance.MdlI_GetAll();
        return inventaireComplet;
    }


    // public Inventaire CtrI_GetById(int id) {
    //     Inventaire message = null;
    //     message = String.valueOf(Dao_Instance.MdlI_MiseAJour(fleur)); //renvoi le nombre de ligne qui ont été mises à jour
    //     return message;
    // }


    // public Inventaire CtrI_GetByName(String name) {
    //     String message = null;
    //     message = String.valueOf(Dao_Instance.MdlI_MiseAJour(fleur)); //renvoi le nombre de ligne qui ont été mises à jour
    //     return message;
    // }


    // public int CtrI_Supprimer(int id) {
    //     String message = null;
    //     message = String.valueOf(Dao_Instance.MdlI_MiseAJour(fleur)); //renvoi le nombre de ligne qui ont été mises à jour
    //     return message;
    // }


    // public String CtrI_Ajouter(Inventaire fleur) {
    //     String message = null;
    //     message = String.valueOf(Dao_Instance.MdlI_MiseAJour(fleur)); //renvoi le nombre de ligne qui ont été mises à jour
    //     return message;
    // }
}
