package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {  
	    public List<Compte> comptes = new ArrayList<>(); 
	    // Méthode pour effectuer la conversion de devises
	    public double conversion(double montant) 
	
	    {
	    
	        // Remplacez ces valeurs par les taux de change réels
	        double tauxDeChangeUSDToEUR = 0.85;
	        double tauxDeChangeEURToUSD = 1.18;

	        // Exemple de conversion de dollars en euros
	        double montantConvertiEnEUR = montant * tauxDeChangeUSDToEUR;
	        return montantConvertiEnEUR;
	    }
	    
	            public Compte getCompte(int code) {
	                for (Compte compte : comptes) {
	                    if (compte.getCode() == code) {
	                        return compte;
	                    }
	                }
	                return null; // Le compte n'a pas été trouvé
	            }

	            public List<Compte> getComptes() {
	                return comptes;
	            }
	    }

