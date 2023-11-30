package service;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        // Implémentation de la conversion
        return montant * 1.1; // Exemple simple
    }

    @WebMethod
    public List<Compte> getComptes() {
        // Implémentation de la récupération des comptes
        // Retourne une liste de comptes
        return null; // Exemple simple
    }
}