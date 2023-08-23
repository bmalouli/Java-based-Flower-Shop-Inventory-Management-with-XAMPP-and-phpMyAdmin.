package controleurInventaire;

import modelInventaire.Inventaire;

public interface IActionsInventaire {
    // Pour le CRUD - Create Read Update Delete

    // Create
    public String ctrI_MiseAJour(Inventaire fleur);
    
    // // Read
    // public List<Film> CtrF_GetAllFilms();

    // public Film CtrF_GetFilmById(int idf);

    // public Film CtrF_GetFilmByTitre(String titre);

    // // Update
    // public int CtrF_Modifier(Film user);

    // // Delete
    // public int CtrF_Enlever(int idf); 
}
