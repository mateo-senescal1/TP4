package fr.umontpellier.iut;

import java.util.ArrayList;

public class Produit {
    private int numProduit;
    private String descriptionProduit;
    private double prixCourant;
    private double pasEnchere;
    private double coutParticipation;

    private boolean enchereEnCours = false;

    public Produit(int numProduit, String descriptionProduit, double prixCourant, double coutParticipation) {
        this.descriptionProduit = descriptionProduit;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.numProduit = numProduit;
    }

    public int getNumProduit() {
        return numProduit;
    }

    // question 2
    public void setPasEnchere(double pas) {
        pasEnchere = pas;
    }

    public void demarrerEnchere() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public void arreterEnchere() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public void ajouterOffre(OffreEnchere o) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public double getCoutParticipation() {
        return coutParticipation;
    }

    public OffreEnchere getGagnant() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }
}
