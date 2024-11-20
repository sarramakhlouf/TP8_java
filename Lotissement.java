public class Lotissement implements GestionPropriete {
    protected Propriété[] tabProp;
    protected int nombre;

    public Lotissement(int capacite) {
        tabProp = new Propriété[capacite];
        nombre = 0;
    }
    public void afficherPropriétés() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i] + ", Impot: " + tabProp[i].calculImpot());
        }
    }
    public boolean ajouter(Propriété p) {
        if (nombre < MAX_PROPRIETES) {
            tabProp[nombre++] = p;
            return true;
        }
        return false;
    }
    public boolean supprimer(Propriété p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].id == p.id) {
                tabProp[i] = tabProp[nombre - 1];
                tabProp[nombre - 1] = null;
                nombre--;
                return true;
            }
        }
        return false;
    }
    public Propriété getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;
    }
    public int getNbPieces() {
        int nbtotalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropriétéPrivée) {
                nbtotalPieces += ((PropriétéPrivée) tabProp[i]).nbPieces;
            }
        }
        return nbtotalPieces;
    }
}