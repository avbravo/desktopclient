/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

import java.util.Date;

/**
 *
 * @author avbravo
 */
public class Jsdformapago {

    private Integer idformapago;
    private String formapago;
    private Date fecha;
    private String username;

    public Jsdformapago() {
    }

    public Jsdformapago(Integer idformapago, String formapago, Date fecha, String username) {
        this.idformapago = idformapago;
        this.formapago = formapago;
        this.fecha = fecha;
        this.username = username;
    }

    
    
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIdformapago() {
        return idformapago;
    }

    public void setIdformapago(Integer idformapago) {
        this.idformapago = idformapago;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
