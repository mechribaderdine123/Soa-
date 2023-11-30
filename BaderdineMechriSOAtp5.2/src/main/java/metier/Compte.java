// Classe Compte dans le package "metier"
package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private String code;
    private double solde;

    @XmlTransient
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