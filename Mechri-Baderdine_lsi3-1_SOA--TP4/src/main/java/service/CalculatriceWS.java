package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CalculatriceWS {
    @WebMethod
    public double somme(@WebParam double a, @WebParam double b){
        return a+b;
    }
}
