/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient;

import com.avbravo.desktopclient.entity.Factura;
import com.avbravo.desktopclient.services.FacturaServices;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientResponse;

/**
 *
 * @author avbravo
 */
public class Micro {

    FacturaServices facturaServices = new FacturaServices();

    public void findAll() {
        try {
            List<Factura> list = facturaServices.findAll();
            for (Factura n : list) {
                System.out.println(n.getIdfactura() + "Estado" + n.getEstado());
            }
        } catch (Exception e) {
            System.out.println("findAll()");
        }
    }

    public Boolean query() {
        try {
            System.out.println("==================INSERT===============");
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://localhost:8080/microservicesfiscalsqlserver-0.2/resources/add");

            Factura factura = new Factura(23, 134);

            Factura requestResult
                    = target.request(MediaType.APPLICATION_JSON_TYPE)
                            .post(Entity.entity(factura, MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                                    Factura.class);
            System.out.println("creo que lo inserto");

        } catch (Exception e) {
            System.out.println("Error " + e.getLocalizedMessage());
        }
        return false;
    }

    public Boolean add() {
        try {
              BufferedReader reader
                    = new BufferedReader(new InputStreamReader(System.in));
            
            Factura factura = new Factura();
            System.out.println("Crear factura ");
            System.out.println("ingrese idfactura ");
          String text  = reader.readLine();
          factura.setIdfactura(Integer.parseInt(text));
          
           System.out.println("ingrese numero de estado ");
         text  = reader.readLine();
              factura.setEstado(Integer.parseInt(text));
          
            facturaServices.add(factura);

        } catch (Exception e) {
            System.out.println("errort" + e.getLocalizedMessage());
        }
        return false;
    }
}
