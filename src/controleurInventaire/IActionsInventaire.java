package controleurInventaire;

import modelInventaire.Inventaire;
import java.util.*;

public interface IActionsInventaire {

    // met à jour la base de donnée suite à un commande (restock) ou à une vente
    public int CtrI_MiseAJour(Inventaire fleur);

    // affiche l'inventaire
    public List<Inventaire> CtrI_GetAll();

    //affiche une fleur paticulière de l'inventaire à partir de son ID
    public Inventaire CtrI_GetById(int id);

    // affiche une fleur paticulière de l'inventaire à partir de son nom
    public Inventaire CtrI_GetByName(String name);

    // supprimer une fleur paticulière de l'inventaire à partir de son ID
    public int CtrI_Supprimer(int id);

    // ajoute un type de fleur à l'inventaire
    public String CtrI_Ajouter(Inventaire fleur); 

}