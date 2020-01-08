/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.controller;

import com.avbravo.desktopclient.entity.Jsdfactura;
import com.avbravo.desktopclient.services.JsdFacturaServices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author avbravo
 */
public class JsdFacturaController {

    JsdFacturaServices jsdjsdfacturaServices = new JsdFacturaServices();

    public void noImpreas() {
        try {
            List<Jsdfactura> list = jsdjsdfacturaServices.noImpresas();
            for (Jsdfactura f : list) {
                System.out.println(f.getCodigo_pedido()+ " nombre"+ f.getNombre()+ "Estado" + f.getEstado());
            }
        } catch (Exception e) {
            System.out.println("noImpreas()"+e.getLocalizedMessage());
        }
    }

    public Boolean query() {
        try {
//            System.out.println("==================INSERT===============");
//            Client client = ClientBuilder.newClient();
//            WebTarget target = client.target("http://192.168.0.5:8080:8080/microservicesfiscalsqlserver/resources/add");
//
//            Jsdfactura jsdjsdfactura = new Jsdfactura(23, 134);
//
//            jsdfactura requestResult
//                    = target.request(MediaType.APPLICATION_JSON_TYPE)
//                            .post(Entity.entity(jsdjsdfactura, MediaType.APPLICATION_FORM_URLENCODED_TYPE),
//                                    jsdfactura.class);
//            System.out.println("creo que lo inserto");

        } catch (Exception e) {
            System.out.println("Error " + e.getLocalizedMessage());
        }
        return false;
    }

    public Boolean add() {
        try {
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(System.in));

            Jsdfactura jsdjsdfactura = new Jsdfactura();
            System.out.println("Crear jsdjsdfactura ");
            System.out.println("ingrese idjsdjsdfactura ");
            String text = reader.readLine();
            jsdjsdfactura.setIdfactura(Integer.parseInt(text));

            System.out.println("ingrese numero de estado ");
            text = reader.readLine();
            jsdjsdfactura.setEstado(Integer.parseInt(text));

            jsdjsdfacturaServices.add(jsdjsdfactura);

        } catch (Exception e) {
            System.out.println("errort" + e.getLocalizedMessage());
        }
        return false;
    }
}
