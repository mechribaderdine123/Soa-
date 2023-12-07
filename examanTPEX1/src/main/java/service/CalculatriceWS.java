package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


public class CalculatriceWS {
    public CalculatriceWS() {
    }


    public double somme( double a,  double b) {
        return a + b;
    }
}
