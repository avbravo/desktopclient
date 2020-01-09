/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.services;

import com.avbravo.desktopclient.entity.Jsdfactura;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author avbravo
 */
public class JsdFacturaServices {

    private static final String PASS = "pass";
    private static final String FAIL = "fail";
    private static final String SUCCESS_RESULT = "<result>success</result>";
    String url = "192.168.0.5:8080";

    public List<Jsdfactura> noImpresas() {
        List<Jsdfactura> jsdfacturaList = new ArrayList<>();
        try {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://192.168.0.5:8080/fiscalserver/resources/jsdfactura/%7Bnoimpresas%7D");

            GenericType<List<Jsdfactura>> data = new GenericType<List<Jsdfactura>>() {
            };

            jsdfacturaList = target.request(MediaType.APPLICATION_JSON).get(data);

        } catch (Exception e) {
            System.out.println("noImpresas() " + e.getLocalizedMessage());
        }
        return jsdfacturaList;
    }

    public Boolean add(Jsdfactura jsdfactura) {
        try {
            Client client = ClientBuilder.newClient();
            WebTarget webTarget
                    = client.target("http://192.168.0.5:8080/fiscalserver/resources/jsdfactura/jsdfactura/add");

            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
            Response response = invocationBuilder.post(Entity.entity(jsdfactura, MediaType.APPLICATION_JSON));

            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));

        } catch (Exception e) {
            System.out.println("errort" + e.getLocalizedMessage());
        }
        return false;
    }

    /**
     * consulta por codigo_pedido
     *
     * @param codigo_
     * @return
     */
    public Jsdfactura findByCodigo(String codigo_pedido) {
        Jsdfactura jsdfactura = new Jsdfactura();
        try {
            Client client = ClientBuilder.newClient();
            jsdfactura = client
                    .target("http://192.168.0.5:8080/fiscalserver/resources/jsdfactura/jsdfactura/")
                    .path("/{codigo_pedido}")
                    .resolveTemplate("codigo_pedido", codigo_pedido)
                    .request(MediaType.APPLICATION_JSON)
                    .get(Jsdfactura.class);

            //String result = FAIL;
        } catch (Exception e) {
            System.out.println("findByCodigo() " + e.getLocalizedMessage());
        }
        return jsdfactura;
    }

    /**
     * consulta por codigo_pedido
     *
     * @param createformparam envia los parametros en un form aqui se colocan
     * todos los parametros
     * @return
     */
    public Jsdfactura createFormParam(Integer idfactura, String codigo_pedido, Date fecha) {
        Jsdfactura jsdfactura = new Jsdfactura();
        try {
            Form form = new Form();
            form.param("idfactura", idfactura.toString());
            form.param("codigo_pedido", codigo_pedido);
            form.param("fecha", fecha.toString());

            Client client = ClientBuilder.newClient();

            String callResult = client
                    .target("http://192.168.0.5:8080/fiscalserver/resources/jsdfactura/jsdfactura/createformparam/")
                    .request(MediaType.APPLICATION_JSON)
                    .post(Entity.entity(form,
                            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                            String.class);

            String result = PASS;
            if (!SUCCESS_RESULT.equals(callResult)) {
                result = FAIL;
                System.out.println("no lo creo");
            }else{  
                System.out.println(" lo creo");
            }

            //String result = FAIL;
        } catch (Exception e) {
            System.out.println("createFormParam() " + e.getLocalizedMessage());
        }
        return jsdfactura;
    }
    
    
    
  
public void testNewOwner(Integer idfactura, String codigo_pedido, Date fecha) {
//    final Response r1 = target("/owners/new").request().get();
//    assertEquals(200, r1.getStatus());
//    assertEquals("newowner", ((View) r1.getEntity()).getTemplateName());

    Form form = new Form();
            form.param("idfactura", idfactura.toString());
            form.param("codigo_pedido", codigo_pedido);
            form.param("fecha", fecha.toString());
 Client client = ClientBuilder.newClient();
  WebTarget webTarget
                    = client.target("http://192.168.0.5:8080/fiscalserver/resources/jsdfactura/");
    final Response r2 = client.target("/jsdfactura/createformparam").request().post(Entity.form(form));
    System.out.println(" -->r2"+r2);
    
    System.out.println(" -->estatus"+ r2.getStatus());
   System.out.println(" r2.getHeaderString(\"Location\")"+ r2.getHeaderString("Location"));
//
//    final Response r3 = target(r2.getHeaderString("Location")).request().get();
//    assertNotNull(r3);
//    assertEquals(200, r3.getStatus());
//
//    final View view = (View) r3.getEntity();
//    final Owner owner = (Owner) view.getModel().get("owner");
//    assertEquals("Barack Obama", owner.getName());
}
 
}
