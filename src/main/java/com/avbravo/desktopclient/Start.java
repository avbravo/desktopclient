/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient;

import com.avbravo.desktopclient.controller.Colores;
import com.avbravo.desktopclient.controller.TClientesController;
import com.avbravo.desktopclient.controller.FacturaController;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
