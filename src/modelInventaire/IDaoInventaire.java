package modelInventaire;

import java.util.List;

public interface IDaoInventaire {

    // met à jour la base de donnée suite à un commande (restock) ou à une vente
    public int MdlI_MiseAJour(Inventaire fleur);

    // affiche l'inventaire
    public List<Inventaire> MdlI_GetAll();

    // affiche une fleur paticulière de l'inventaire à partir de son ID
    public Inventaire MdlI_GetById(int id);

    // affiche une fleur paticulière de l'inventaire à partir de son nom
    public Inventaire MdlI_GetByName(String name);

    // supprimer une fleur paticulière de l'inventaire à partir de son ID
    public int MdlI_Supprimer(int id);

    // ajoute un type de fleur à l'inventaire
    public String MdlI_Ajouter(Inventaire fleur); 

}
