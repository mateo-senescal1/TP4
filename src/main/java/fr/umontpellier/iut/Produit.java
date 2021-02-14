package fr.umontpellier.iut;
import java.util.ArrayList;

public class Produit {
    private int numProduit;
    private String descriptionProduit;
    private double prixCourant;
    private static double pasEnchere;
    private double coutParticipation;
    private boolean disponible;
    private static ArrayList<OffreEnchere> Offres;
    private OffreEnchere offreGagnante;

    public Produit(int numProduit, String descriptionProduit, double prixCourant, double coutParticipation) {
        this.descriptionProduit = descriptionProduit;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.numProduit = numProduit;
        disponible = false;
        Offres = new ArrayList<>();

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
         Offres.add(o);
         o.setEtatGagnant(true);
         if (offreGagnante != null){
         offreGagnante.setEtatGagnant(false);}
         offreGagnante = o;

    }

    public double getCoutParticipation() {
        return coutParticipation;
    }

    public OffreEnchere getOffreGagnante() {
        return offreGagnante;
    }

    public boolean estDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "numProduit=" + numProduit +
                ", offreGagnante=" + offreGagnante +
                '}';
    }

    // vérifie si l'offre est valide
    public boolean verifierOffre(OffreEnchere offre) {

        if((!disponible) | (offre.getPrixEnCours() < prixCourant + pasEnchere )){
            return false;
        }

        if(offre.getPrixMax() < offre.getPrixMax()){
            offre.setPrixEnCours(offre.getPrixMax());
            prixCourant = offre.getPrixMax();
            return false;
        }
        if (offre.getPrixEnCours() > offre.getPrixMax()){
            prixCourant = offre.getPrixEnCours();
            return true;
        }
        offre.setPrixEnCours(offre.getPrixMax());
        prixCourant = offre.getPrixEnCours();
        return true;
    }
    }





