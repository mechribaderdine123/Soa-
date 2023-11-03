package service;

import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        BanqueService banqueService = new BanqueService();
        double montantUSD = 100.0;
        double montantEUR = banqueService.conversion(montantUSD);
        System.out.println(montantUSD + " USD équivaut à " + montantEUR + " EUR.");
        BanqueService banqueService1 = new BanqueService();

        // Exemple d'ajout de comptes
        Compte compte1 = new Compte(1, 1000.0, new Date());
        Compte compte2 = new Compte(2, 500.0, new Date());
        banqueService1.comptes.add(compte1);
        banqueService1.comptes.add(compte2);

        // Exemple d'utilisation de getCompte() et getComptes()
        Compte compteRecherche = banqueService1.getCompte(1);
        if (compteRecherche != null) {
            System.out.println("Compte trouvé : " + compteRecherche.getCode() + ", Solde : " + compteRecherche.getSolde());
        } else {
            System.out.println("Compte non trouvé.");
        }

        List<Compte> tousLesComptes = banqueService1.getComptes();
        System.out.println("Liste de tous les comptes :");
        for (Compte compte : tousLesComptes) {
            System.out.println("Code : " + compte.getCode() + ", Solde : " + compte.getSolde());
        }
    }

    }


