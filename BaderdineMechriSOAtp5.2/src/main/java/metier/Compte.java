package metier;

import java.util.Date;

public class Compte {
    private String code;
    private double solde;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(String code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters
}