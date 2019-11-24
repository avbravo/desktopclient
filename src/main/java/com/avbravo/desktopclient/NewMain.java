/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
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
        try {
            Micro micro = new Micro();
            String tecla="";
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(System.in));
            String menu = "x";
            while (!menu.equals("s")) {
                System.out.println("==================================");
                System.out.println("         Menu");
                System.out.println("(1)findAll");
             
                System.out.println("(2)add");
               
                System.out.println("(s)alir");
                System.out.println("\n Ingrese opcion?");
                // Reading data using readLine 
                menu = reader.readLine();
                menu = menu.toLowerCase().trim();
                switch (menu) {
                    case "1":
                        micro.findAll();
                        System.out.println("...Presione una tecla");
                      tecla= reader.readLine();
                        break;
                    case "2":
                        micro.add();
                          System.out.println("...Presione una tecla");
                      tecla= reader.readLine();
                        break;
                  
                   
                 
                    case "s":
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("Opcion errada");
                         System.out.println("...Presione una tecla");
                      tecla= reader.readLine();

                }
            }

        } catch (Exception e) {
            System.out.println("main() " + e.getLocalizedMessage());
        }
    }

}
