/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient;

import com.avbravo.desktopclient.controller.Colores;
import com.avbravo.desktopclient.controller.TClientesController;
import com.avbravo.desktopclient.controller.FacturaController;
import com.avbravo.desktopclient.controller.JsdFacturaController;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author avbravo
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            


            
            JsdFacturaController jsdFacturaController = new JsdFacturaController();
            FacturaController facturaController = new FacturaController();
            TClientesController tClientesController = new TClientesController();
            String tecla = "";
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(System.in));
            String menu = "x";
            while (!menu.equals("s")) {
                System.out.println(Colores.azul()+"------------------------------------");
                System.out.println(Colores.azul()+"         Menu");
                System.out.println(Colores.azul()+"(1)Factura findAll");
                System.out.println(Colores.azul()+"(2)Factura add");
                System.out.println(Colores.azul()+"(3)Clientes findAll");
                System.out.println("-------------------------------------");
                System.out.println(Colores.azul()+"(4)jsdfactura.no Impresas");
                System.out.println(Colores.azul()+"(5) jsdfacturafindByCodigo_Pedido(1/21-0001)");
                System.out.println(Colores.azul()+"(6) jsdfactura createFormParam");
                System.out.println(Colores.azul()+"(7) jsdfactura testNewOwner");
                

                System.out.println(Colores.azul()+"(s)alir");
                System.out.println(Colores.azul()+"\n Ingrese opcion?");
                // Reading data using readLine 
                menu = reader.readLine();
                menu = menu.toLowerCase().trim();
                switch (menu) {
                    case "1":
                        facturaController.findAll();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;
                    case "2":
                        facturaController.add();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;
                    case "3":
                        tClientesController.findAll();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;
                    case "4":
                        jsdFacturaController.noImpreas();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;
                    case "5":
                        jsdFacturaController.findByCodigo_pedido();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;
                    case "6":
                        jsdFacturaController.createFormParam();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;
                    case "7":
                        jsdFacturaController.testNewOwner();
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();
                        break;

                    case "s":
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("Opcion errada");
                        System.out.println("...Presione una tecla");
                        tecla = reader.readLine();

                }
            }

        } catch (Exception e) {
            System.out.println("main() " + e.getLocalizedMessage());
        }
    }

}
