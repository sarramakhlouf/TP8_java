public class PropriétéProfessionnelle extends Propriété {
    private int nbEmployes;
    private boolean estEtatique;
    public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }
    public String toString() {
        return super.toString() + ", ProprieteProfessionnelle{" +"nbEmployes=" + nbEmployes +", estEtatique=" + estEtatique +'}';
    }
    public double calculImpot() {
        if (!estEtatique) {
            return (100 * surface / 100) + (30 * nbEmployes);
        }
        return 0;
        
    }
}