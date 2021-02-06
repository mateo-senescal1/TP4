package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private LocalDate date;
    private LocalTime heure;
    private double prixEnCours;
    private double prixMax;
    private Produit produit;
    private boolean estGagnante;

    public OffreEnchere(double prixEnCours, double prixMax, Produit produit) {
        this.prixEnCours = prixEnCours;
        this.prixMax = prixMax;
        this.produit = produit;
        date = LocalDate.now();
        heure = LocalTime.now();
        estGagnante = false;
    }

    public double getPrixEnCours() {
        return prixEnCours;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setEstGagnante(boolean estGagnante) {
        this.estGagnante = estGagnante;
    }

    @Override
    public String toString() {
        return "OffreEnchere{" +
                "date=" + date +
                ", heure=" + heure +
                ", prixEnCours=" + prixEnCours +
                ", prixMax=" + prixMax +
                ", produit=" + produit.getNumProduit() +
                ", estGagnante  ? -> " + estGagnante +
                '}';
    }
}
