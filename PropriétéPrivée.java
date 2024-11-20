public class PropriétéPrivée extends Propriété {
    protected int nbPieces;

    public PropriétéPrivée(int id, Personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }
    public String toString() {
        return super.toString() + ", ProprietePrivee{" +"nbPieces=" + nbPieces +'}';
    }
    public double calculImpot() {
        return (50 * surface / 100) + (10 * nbPieces);
    }
}