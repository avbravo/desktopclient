/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.services;

import com.avbravo.desktopclient.entity.Factura;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author avbravo
 */
public class FacturaServices {

     public List<Factura> findAll() {
         List<Factura> facturaList = new ArrayList<>();
        try {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://localhost:8080/microservicesfiscalsqlserver/resources/factura");

            GenericType<List<Factura>> noticias = new GenericType<List<Factura>>() {
            };

           facturaList = target.request(MediaType.APPLICATION_JSON).get(noticias);
           
        } catch (Exception e) {
            System.out.println("findAll()");
        }
        return facturaList;
    }

    
    public Boolean add(Factura factura) {
        try {
            Client client = ClientBuilder.newClient();
            WebTarget webTarget
                    = client.target("http://localhost:8080/microservicesfiscalsqlserver/resources/factura/factura/add");

            
            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
            Response response = invocationBuilder.post(Entity.entity(factura, MediaType.APPLICATION_JSON));

            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));

        } catch (Exception e) {
            System.out.println("errort" + e.getLocalizedMessage());
        }
        return false;
    }

}
