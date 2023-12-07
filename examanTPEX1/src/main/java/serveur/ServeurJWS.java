package serveur;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {

        String url = "http://localhost:8084/calculatrice";
        service.CalculatriceWS calculatriceWS = new service.CalculatriceWS();
        Endpoint.publish(url, calculatriceWS);
        System.out.println("Service web publié à l'adresse : " + url);

    }
}
