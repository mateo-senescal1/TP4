package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private LocalDate date;
    private LocalTime heure;
    private double prixEnCours;
    private double prixMax;
    private Produit produit;
    private boolean etatGagnant;
    private Compte monCompte;

    public OffreEnchere(double prixEnCours, double prixMax, Produit produit, Compte monCompte) {
        this.prixEnCours = prixEnCours;
        this.prixMax = prixMax;
        this.produit = produit;
        date = LocalDate.now();
        heure = LocalTime.now();
        etatGagnant = false;
        this.monCompte = monCompte;
    }

    public boolean isEtatGagnant() {
        return etatGagnant;
    }

    public Compte getMonCompte() {
        return monCompte;
    }

    public double getPrixEnCours() {
        return prixEnCours;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setPrixEnCours(double prixEnCours) {
        this.prixEnCours = prixEnCours;
    }

    public void setEtatGagnant(boolean etat) {
        this.etatGagnant = etat;
        if (etat = false){
            monCompte.crediter(prixMax);
        }
    }

    @Override
    public String toString() {
        return "OffreEnchere{" +
                "date=" + date +
                ", heure=" + heure +
                ", prixEnCours=" + prixEnCours +
                ", prixMax=" + prixMax +
                ", produit=" + produit.getNumProduit() +
                ", est gagnante  ? -> " + etatGagnant +
                '}';
    }
}
