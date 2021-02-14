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

    public String getPseudo() {
        return pseudo;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        ArrayList<OffreEnchere> encheresGagnantes = new ArrayList<>();
        for (OffreEnchere mesEnchere : mesEncheres) {
            if (mesEnchere.isEtatGagnant()) {
                encheresGagnantes.add(mesEnchere);
            }
        }
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", solde=" + solde +
                ", enchères gagnantes :"+ encheresGagnantes +
                '}';
    }

    public OffreEnchere creerOffre(Produit produit, double prix, double prixMax) {
        if (prix <= prixMax && solde>= prixMax ){
            OffreEnchere retour = new OffreEnchere(prix,prixMax,produit,this);
            if (produit.verifierOffre(retour)){
                solde = solde - (prixMax + produit.getCoutParticipation());
                mesEncheres.add(retour);
                produit.ajouterOffre(retour);
                return retour;
            }
        }
        return null;
    }


}
