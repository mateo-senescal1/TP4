package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private LocalDate date;
    private LocalTime heure;
    private double prixEnCours;
    private double prixMax;
    private Produit produit;

    public OffreEnchere(double prixEnCours, double prixMax, Produit produit) {
        this.prixEnCours = prixEnCours;
        this.prixMax = prixMax;
        this.produit = produit;
        date = LocalDate.now();
        heure = LocalTime.now();
    }

    public double getPrixEnCours() {
        return prixEnCours;
    }

    public double getPrixMax() {
        return prixMax;
    }

}
