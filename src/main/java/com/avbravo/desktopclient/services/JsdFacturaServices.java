/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.services;

import com.avbravo.desktopclient.entity.Factura;
import com.avbravo.desktopclient.entity.Jsdfactura;
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
public class JsdFacturaServices {

    String url="192.168.0.5:8080";
     public List<Jsdfactura> noImpresas() {
         List<Jsdfactura> jsdfacturaList = new ArrayList<>();
        try {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://192.168.115.4:8080/fiscalserver/resources/jsdfactura/%7Bnoimpresas%7D");

            GenericType<List<Jsdfactura>> data = new GenericType<List<Jsdfactura>>() {
            };

          jsdfacturaList = target.request(MediaType.APPLICATION_JSON).get(data);
           
        } catch (Exception e) {
            System.out.println("noImpresas() "+e.getLocalizedMessage());
        }
        return jsdfacturaList;
    }

    
    public Boolean add(Jsdfactura jsdfactura) {
        try {
            Client client = ClientBuilder.newClient();
            WebTarget webTarget
                    = client.target("http://192.168.0.5:8080/microservicesfiscalsqlserver/resources/factura/factura/add");

            
            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
            Response response = invocationBuilder.post(Entity.entity(jsdfactura, MediaType.APPLICATION_JSON));

            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));

        } catch (Exception e) {
            System.out.println("errort" + e.getLocalizedMessage());
        }
        return false;
    }

}
