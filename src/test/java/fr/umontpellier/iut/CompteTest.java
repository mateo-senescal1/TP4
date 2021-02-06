package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    private Compte compte;
    private Produit produit;

    @BeforeEach
    public void init(){
        compte = new Compte("toto","toto@gmail.com","99 av. occitanie", 100);
        produit = new Produit(0, "", 0, 152);
    }

    @Disabled
    @Test
    public void test_creer_offre_prix_superieur_au_prix_max(){
        OffreEnchere o = compte.creerOffre(produit,50,40);
        assertNull(o);
    }

    @Disabled
    @Test
    public void test_creer_offre_prix_trop_grand_par_rapport_au_solde(){
        OffreEnchere o = compte.creerOffre(produit,500,500);
        assertNull(o);
    }

    @Disabled
    @Test
    public void test_creer_offre_solde_insuffisant(){
        OffreEnchere o = compte.creerOffre(produit,50,100);
        assertNull(o);
    }

    // complétez ici avec vos tests

}