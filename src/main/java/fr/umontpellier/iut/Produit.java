package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {
    private int numProduit;
    private String descriptionProduit;
    private double prixCourant;
    private LocalDate dateDebutEnchere;
    private LocalTime heureDebutEnchere;
    private double pasEnchere;
    private double coutParticipation;

    private boolean enchereEnCours = false;

    private ArrayList<OffreEnchere> encheresDeposees;
    private OffreEnchere enchereGagnanteActuelle;

    public Produit(int numProduit, String descriptionProduit, double prixCourant, double coutParticipation) {
        this.descriptionProduit = descriptionProduit;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.numProduit = numProduit;
        encheresDeposees = new ArrayList<>();
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

    public boolean ajouterOffre(OffreEnchere o) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }


    @Override
    public String toString() {
        return "Produit{" +
                "numProduit=" + numProduit +
                ", dateDebutEnchere=" + dateDebutEnchere +
                ", heureDebutEnchere=" + heureDebutEnchere +
                ", \n coutParticipation=" + coutParticipation +
                ", pasEnchere=" + pasEnchere +
                ", \n descriptionProduit='" + descriptionProduit + '\'' +
                ", \n prixCourant=" + prixCourant +
                ", vente en cours ? : " + enchereEnCours +
                ", \n enchereGagnanteActuelle=" + enchereGagnanteActuelle +
                ", liste des encheres deposees =" + encheresDeposees +
                '}';
    }

    public double getCoutParticipation() {
        return coutParticipation;
    }

    public OffreEnchere getGagnant() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }
}
