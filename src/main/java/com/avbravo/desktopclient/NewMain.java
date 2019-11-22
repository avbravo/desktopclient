/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author avbravo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/microservicesfiscalsqlserver-0.2/resources/factura");

        GenericType<List<Factura>> noticias = new GenericType<List<Factura>>() {
        };

        List<Factura> listaFactura = target.request(MediaType.APPLICATION_JSON).get(noticias);
        for (Factura n : listaFactura) {
            System.out.println(n.getIdfactura() + "Estado" + n.getEstado());
        }
    }

}
