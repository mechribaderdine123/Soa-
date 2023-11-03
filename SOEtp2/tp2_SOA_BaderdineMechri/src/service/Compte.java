package service;

import java.util.Date;

public class Compte {
	    private int code;
	    private double solde;
	    private Date dateCreation;

	    public Compte(int code, double solde, Date dateCreation) {
	        this.code = code;
	        this.solde = solde;
	        this.dateCreation = dateCreation;
	    }

	    public int getCode() {
	        return code;
	    }

	    public double getSolde() {
	        return solde;
	    }

	    public Date getDateCreation() {
	        return dateCreation;
	    }
}
