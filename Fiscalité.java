public class Fiscalité {
    public static void main(String[] args) {
        Personne p1 = new Personne(1, "Makhlouf", "Sarra");
        Personne p2 = new Personne(2, "Jemai", "Ghofrane");
        Personne p3 = new Personne(3, "Kerkeni", "Fatma");
        Lotissement lotissement = new Lotissement(10);
        Lotissement lt= new LotissementPrivée(10);
        lotissement.ajouter(new PropriétéPrivée(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));
        System.out.println ("la liste des propriétés:");
        lotissement.afficherPropriétés();
        System.out.println("Nombre total de pièces: " + lotissement.getNbPieces());
        double minImpot = Double.MAX_VALUE;
        PropriétéPrivée proprieteMinImpot = null;
        for (int i = 0; i < lotissement.nombre; i++) {
            if (lotissement.tabProp[i] instanceof PropriétéPrivée) {
                double impot = lotissement.tabProp[i].calculImpot();
                if (impot < minImpot) {
                    minImpot = impot;
                    proprieteMinImpot = (PropriétéPrivée) lotissement.tabProp[i];
                }
            }
        }
        if (proprieteMinImpot != null) {
            System.out.println("Propriété privée avec le moins d'impôts: " + proprieteMinImpot.responsable.getNom() + ", Impôt: " + minImpot);
        }

        // Suppression de l'appartement
        lotissement.supprimer(lotissement.tabProp[2]);
        System.out.println("Après suppression de l'appartement:");
        lotissement.afficherPropriétés();
        //Lotissement privée 
        lt.ajouter(new PropriétéPrivée(1, p1, "Corniche", 350, 4));
        lt.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lt.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
        System.out.println ("la liste des propriétés:");
        lt.afficherPropriétés();
        System.out.println("Nombre total de pièces: " + lt.getNbPieces());
        for (int i =0 ;i <lt.nombre; i++)
        {
            if (lt.getProprieteByIndex(i) instanceof Villa)
            {
                Villa p = (Villa)lt.getProprieteByIndex(i);
                if (p.adresse.equals("Dar Chaabane")){
                    lt.supprimer(p);
                    System.out.println("Villa dar Chaabane est supprimé.");
                    break;
                }

            }
        }
        System.out.println("Liste des propriétés après suppression de lotissement privée:");
        lt.afficherPropriétés();

    } 
}