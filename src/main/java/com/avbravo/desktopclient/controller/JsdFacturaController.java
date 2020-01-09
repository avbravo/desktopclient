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
import java.util.Date;
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

    JsdFacturaServices  jsdfacturaServices = new JsdFacturaServices();

    public void noImpreas() {
        try {
            List<Jsdfactura> list =  jsdfacturaServices.noImpresas();
            for (Jsdfactura f : list) {
                System.out.println(f.getCodigo_pedido() + " fecha: "+f.getFecha() + " nombre"+ f.getNombre()+ "Estado" + f.getEstado());
                f.setIdfactura(1);
                
            jsdfacturaServices.add(f);
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
//            Jsdfactura  jsdfactura = new Jsdfactura(23, 134);
//
//            jsdfactura requestResult
//                    = target.request(MediaType.APPLICATION_JSON_TYPE)
//                            .post(Entity.entity( jsdfactura, MediaType.APPLICATION_FORM_URLENCODED_TYPE),
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

            Jsdfactura  jsdfactura = new Jsdfactura();
            System.out.println("Crear  jsdfactura ");
            System.out.println("ingrese id jsdfactura ");
            String text = reader.readLine();
             jsdfactura.setIdfactura(Integer.parseInt(text));

            System.out.println("ingrese numero de estado ");
            text = reader.readLine();
             jsdfactura.setEstado(Integer.parseInt(text));

             jsdfacturaServices.add( jsdfactura);

        } catch (Exception e) {
            System.out.println("errort" + e.getLocalizedMessage());
        }
        return false;
    }
    
    public void findByCodigo_pedido(){
        try {
            Jsdfactura jsdfactura = new Jsdfactura();
            jsdfactura = jsdfacturaServices.findByCodigo("1/21-0001");
            if(jsdfactura == null){
                System.out.println("no encontrado");
            }else{
                System.out.println("encontrado.................................");
                System.out.println(jsdfactura.getCodigo_pedido() +" fecha: "+jsdfactura.getFecha());
            }
        } catch (Exception e) {
            System.out.println("findByCodigo_pedido() "+e.getLocalizedMessage());
        }
    }
    public void createFormParam(){
        try {
            jsdfacturaServices.createFormParam(1, "Codi", new Date());
           
        } catch (Exception e) {
            System.out.println("createFormParam() "+e.getLocalizedMessage());
        }
    }
    
    
    public void testNewOwner(){
        try {
            jsdfacturaServices.testNewOwner(1, "Codi", new Date());
           
        } catch (Exception e) {
            System.out.println("testNewOwner()() "+e.getLocalizedMessage());
        }
    }
}
