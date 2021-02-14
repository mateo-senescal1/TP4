package fr.umontpellier.iut;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IBaille {

    public static void main(String[] args) {

        Produit produit = new Produit(5,"montre en argent",200,30);
        Compte compte1 = new Compte("Jo la menace ","jolamenace@gmail.com","06560 valbonne",2500);
        Compte compte2 = new Compte("Michou","michouytb@gmail.com","75000 Paris",5000);
        Compte compte3 = new Compte("Abdel","abdelouhir@gmail.com","13000 Marseille",3500);

        produit.demarrerEnchere();
        System.out.println("Bienvenue à l'enchère du produit numéro : "+ produit.getNumProduit());
        System.out.println("Jo la menace veuillez proposer une offre");
        Scanner saisie = new Scanner(System.in);
        double offer = saisie.nextDouble();
        System.out.println("Jo la menace quel est votre prix maximal :");
        saisie = new Scanner(System.in);
        double prixMax = saisie.nextDouble();
        OffreEnchere offre1 = compte1.creerOffre(produit,offer,prixMax);


        System.out.println("michou veuillez proposer une offre");
        saisie = new Scanner(System.in);
        offer = saisie.nextDouble();
        System.out.println("Michou quel est votre prix maximal :");
        saisie = new Scanner(System.in);
        prixMax = saisie.nextDouble();
        compte2.creerOffre(produit,offer,prixMax);
        OffreEnchere offre2 = compte2.creerOffre(produit,offer,prixMax);

        System.out.println("Abdel veuillez proposer une offre");
        saisie = new Scanner(System.in);
        offer = saisie.nextDouble();
        System.out.println("Abdel quel est votre prix maximal :");
        saisie = new Scanner(System.in);
        prixMax = saisie.nextDouble();
        OffreEnchere offre3 = compte3.creerOffre(produit,offer,prixMax);



        while (produit.estDisponible()){
            int compteurDecision = 0;

             {

                 if(offre1 == null) {
                    System.out.println(produit.toString());
                    System.out.println("Jo le menace voulez-vous proposer une nouvelle offre tapez 1 pour oui, tapez 2 pour non ?");
                    saisie = new Scanner(System.in);
                    int decision = saisie.nextInt();
                    if (decision == 1) {
                        System.out.println("jo la menace veuillez proposer une nouvelle offre");
                        saisie = new Scanner(System.in);
                        offer = saisie.nextDouble();
                        System.out.println("Jo la menace quel est votre prix maximal :");
                        saisie = new Scanner(System.in);
                        prixMax = saisie.nextDouble();
                        compte1.creerOffre(produit, offer, prixMax);
                        offre1 = compte1.creerOffre(produit, offer, prixMax);
                    }
                    if (decision == 2) {
                        compteurDecision++;
                    }
                }else if (!offre1.isEtatGagnant()){
                     System.out.println(produit.toString());
                     System.out.println("Michou voulez-vous proposer une nouvelle offre tapez 1 pour oui, tapez 2 pour non ?");
                     saisie = new Scanner(System.in);
                     int decision = saisie.nextInt();
                     if(decision == 1){
                         System.out.println("Michou veuillez proposer une nouvelle offre");
                         saisie = new Scanner(System.in);
                         offer = saisie.nextDouble();
                         System.out.println("Michou quel est votre prix maximal :");
                         saisie = new Scanner(System.in);
                         prixMax = saisie.nextDouble();
                         compte1.creerOffre(produit,offer,prixMax);
                         offre1 = compte1.creerOffre(produit,offer,prixMax);
                     }
                     if (decision == 2){
                         compteurDecision ++;
                     }
                 }



                if(offre2 == null) {
                System.out.println(produit.toString());
                System.out.println("Michou voulez-vous proposer une nouvelle offre tapez 1 pour oui, tapez 2 pour non ?");
                saisie = new Scanner(System.in);
                int decision = saisie.nextInt();
                if(decision == 1){
                    System.out.println("Michou veuillez proposer une nouvelle offre");
                    saisie = new Scanner(System.in);
                    offer = saisie.nextDouble();
                    System.out.println("Michou quel est votre prix maximal :");
                    saisie = new Scanner(System.in);
                    prixMax = saisie.nextDouble();
                    compte2.creerOffre(produit,offer,prixMax);
                    offre2 = compte2.creerOffre(produit,offer,prixMax);
                }
                if (decision == 2){
                    compteurDecision ++;
                }
                }else if (!offre2.isEtatGagnant()){
                    System.out.println(produit.toString());
                    System.out.println("Michou voulez-vous proposer une nouvelle offre tapez 1 pour oui, tapez 2 pour non ?");
                    saisie = new Scanner(System.in);
                    int decision = saisie.nextInt();
                    if(decision == 1){
                        System.out.println("Michou veuillez proposer une nouvelle offre");
                        saisie = new Scanner(System.in);
                        offer = saisie.nextDouble();
                        System.out.println("Michou quel est votre prix maximal :");
                        saisie = new Scanner(System.in);
                        prixMax = saisie.nextDouble();
                        compte2.creerOffre(produit,offer,prixMax);
                        offre2 = compte2.creerOffre(produit,offer,prixMax);
                    }
                    if (decision == 2){
                        compteurDecision ++;
                    }
                }




                 if(offre3 == null){
                System.out.println(produit.toString());
                System.out.println("Abdel voulez-vous proposer une nouvelle offre tapez 1 pour oui, tapez 2 pour non ?");
                saisie = new Scanner(System.in);
                int decision = saisie.nextInt();
                if(decision == 1){
                    System.out.println("Abdel veuillez proposer une nouvelle offre");
                    saisie = new Scanner(System.in);
                    offer = saisie.nextDouble();
                    System.out.println("Abdel quel est votre prix maximal :");
                    saisie = new Scanner(System.in);
                    prixMax = saisie.nextDouble();
                    compte3.creerOffre(produit,offer,prixMax);
                    offre3 = compte3.creerOffre(produit,offer,prixMax);
                }
                if (decision == 2){
                    compteurDecision ++;
                }
            }else if (!offre3.isEtatGagnant()){
                     System.out.println(produit.toString());
                     System.out.println("Michou voulez-vous proposer une nouvelle offre tapez 1 pour oui, tapez 2 pour non ?");
                     saisie = new Scanner(System.in);
                     int decision = saisie.nextInt();
                     if(decision == 1){
                         System.out.println("Michou veuillez proposer une nouvelle offre");
                         saisie = new Scanner(System.in);
                         offer = saisie.nextDouble();
                         System.out.println("Michou quel est votre prix maximal :");
                         saisie = new Scanner(System.in);
                         prixMax = saisie.nextDouble();
                         compte3.creerOffre(produit,offer,prixMax);
                         offre3 = compte3.creerOffre(produit,offer,prixMax);
                     }
                     if (decision == 2){
                         compteurDecision ++;
                     }
                 }


            if (compteurDecision == 2){
                if(produit.getOffreGagnante().getPrixEnCours() < produit.getOffreGagnante().getPrixMax())
                    produit.getOffreGagnante().getMonCompte().crediter(produit.getOffreGagnante().getPrixMax()-produit.getOffreGagnante().getPrixEnCours());
                produit.arreterEnchere();
            }
            System.out.println("Fin des enchères notre grand gagant est :" +produit.getOffreGagnante().getMonCompte().getPseudo()+
                    "avec une magnifqiue somme de :" +produit.getOffreGagnante().getPrixEnCours());


        }
    }
        }
            }
