package fr.umontpellier.iut;

import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private double solde;
    private ArrayList<OffreEnchere> mesEncheres;

    public Compte(String pseudo, String email, String adresse, double solde) {
        this.email = email;
        this.adresse = adresse;
        this.pseudo = pseudo;
        this.solde = solde;
        mesEncheres = new ArrayList<>();
    }
    public void crediter(double somme){
        solde = solde + somme;
    }

    public double getSolde() {
        return solde;
    }

   public void  setPrix(double newPrix){

    }

    public OffreEnchere creerOffre(Produit produit, double prix, double prixMax) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");

    }


}
