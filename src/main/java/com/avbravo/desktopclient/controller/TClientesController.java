/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.controller;

import com.avbravo.desktopclient.services.TClientesServices;
import com.avbravo.desktopclient.sql.entiry.TClientes;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class TClientesController {

   TClientesServices tClientesServices = new TClientesServices();

    public void findAll() {
        try {
            List<TClientes> list = tClientesServices.findAll();
            for (TClientes c : list) {
                System.out.println("zona: "+c.getZona()+ " nombre comercial" + c.getNombreComercial());
            }
        } catch (Exception e) {
            System.out.println("findAll()"+e.getLocalizedMessage());
        }
    }

   
}
