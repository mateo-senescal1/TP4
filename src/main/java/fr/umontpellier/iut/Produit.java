package fr.umontpellier.iut;

public class Produit {
    private int numProduit;
    private String descriptionProduit;
    private double prixCourant;
    private static double pasEnchere;
    private double coutParticipation;

    private boolean disponible;

    public Produit(int numProduit, String descriptionProduit, double prixCourant, double coutParticipation) {
        this.descriptionProduit = descriptionProduit;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.numProduit = numProduit;
        disponible = false;

    }

    public int getNumProduit() {
        return numProduit;
    }

    // question 1
    public static void setPasEnchere(double pas) {
        pasEnchere = pas;
    }

    public void demarrerEnchere() {
        disponible = true;

    }

    public void arreterEnchere() {
        disponible = false;
    }

    public void ajouterOffre(OffreEnchere o) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public double getCoutParticipation() {
        return coutParticipation;
    }

    public OffreEnchere getOffreGagnante() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public boolean estDisponible() {
        return disponible;
    }

    // vérifie si l'offre est valide
    public boolean verifierOffre(OffreEnchere offre) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }
}
