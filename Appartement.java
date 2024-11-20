public class Appartement extends PropriétéPrivée {
    private int numEtage;

    public Appartement(int id, Personne responsable, String adresse, double surface, int nbPieces, int numEtage) {
        super(id, responsable, adresse, surface, nbPieces);
        this.numEtage = numEtage;
    }
    public String toString() {
        return super.toString() + ", Appartement{" +"numEtage=" + numEtage +'}';
    }
}