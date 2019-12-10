/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.services;


import com.avbravo.desktopclient.sql.entiry.TClientes;
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
public class TClientesServices {

     public List<TClientes> findAll() {
         List<TClientes> tClientesList = new ArrayList<>();
        try {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://localhost:8080/microservicesfiscalsqlserver-0.3/resources/tclientes");

            GenericType<List<TClientes>> noticias = new GenericType<List<TClientes>>() {
            };

           tClientesList = target.request(MediaType.APPLICATION_JSON).get(noticias);
           
        } catch (Exception e) {
            System.out.println("findAll()");
        }
        return tClientesList;
    }

    
    

}
