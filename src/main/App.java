package main;

import controleurInventaire.ControleurInventaire;
import modelInventaire.Inventaire;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // Selon le choix de l'utilisateur faudra appeler la bonne méthode
        // du contrôleur.
        // CAS 1 : Enregistrer un film
        // Inventaire fleur = new Inventaire ();

        // fleur.setName();
        // fleur.setColor();
        // fleur.setPrice();
        // fleur.setQuantity();
        
        ControleurInventaire CtrF = ControleurInventaire.getControleurInventaire();
        // String message = CtrF.CtrI_Enregistrer(fleur);
        System.out.println(CtrF.CtrF_GetAllFilms());
    }
}
