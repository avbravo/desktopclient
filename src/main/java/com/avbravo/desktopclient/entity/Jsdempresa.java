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
public class Jsdempresa {

    private String idempresa;
    private String ruc;
    private String empresa;
    private String nombrecorto;

    public Jsdempresa() {
    }

    public Jsdempresa(String idempresa, String ruc, String empresa, String nombrecorto) {
        this.idempresa = idempresa;
        this.ruc = ruc;
        this.empresa = empresa;
        this.nombrecorto = nombrecorto;
    }

    public String getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(String idempresa) {
        this.idempresa = idempresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNombrecorto() {
        return nombrecorto;
    }

    public void setNombrecorto(String nombrecorto) {
        this.nombrecorto = nombrecorto;
    }

   
}
