public class LotissementPrivée extends Lotissement {
    public LotissementPrivée(int capacite) {
        super(capacite);
    }
    public boolean ajouter(Propriété p) {
        if (p instanceof PropriétéPrivée) {
            return super.ajouter(p);
        }
        return false;
    }
    public PropriétéPrivée getProprieteByIndex(int i) {
        return (PropriétéPrivée) super.getProprieteByIndex(i);
    }
    public int getNbPieces() {
        return super.getNbPieces();
    }
}