package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8084/",new CalculatriceWS());
        System.out.println("http://localhost:8084/");
    }
}
