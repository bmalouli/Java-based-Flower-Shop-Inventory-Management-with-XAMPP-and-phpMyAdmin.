package controleurInventaire;

import modelInventaire.Inventaire;
import modelInventaire.DaoInventaire;

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
    public String ctrI_MiseAJour(Inventaire fleur) {
        String message = null;
        message = String.valueOf(Dao_Instance.MdlI_MiseAJour(fleur)); //vérifier valeur de retour
        return message;
    }
}
