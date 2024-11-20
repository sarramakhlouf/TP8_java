public interface GestionPropriete {
    int MAX_PROPRIETES = 10;
    void afficherPropriétés();
    boolean ajouter(Propriété p);
    boolean supprimer(Propriété p);
}

