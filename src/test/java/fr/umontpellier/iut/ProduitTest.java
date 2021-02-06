package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {
    private Produit produit;
    private Compte compte;

    @BeforeEach
    public void initialisation() {
        produit = new Produit(0, "", 0, 152);
        compte = new Compte("toto", "lolo@fifi.com", "1 av. champs elysees",59);
    }

    @Disabled
    @Test
    void ajouterOffre_quand_pas_d_offre() {
        OffreEnchere o = new OffreEnchere(15, 20, produit,compte);
        produit.ajouterOffre(o);
        assertSame(produit.getGagnant(), o);
    }

}