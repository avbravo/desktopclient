/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author avbravo
 */
public class Jsdnotascredito {
 private static final Logger LOG = Logger.getLogger(Jsdnotascredito.class.getName());
    private Integer idnotacredito;   //autoincrementable
    private Integer numfiscalnc; //genera la impresora DEBE ESTAR ENCRIPTADO..
    private Integer idfactura; //
    private String impreso; // inicialmente no
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date fecha;
    private String hora;
    private String username;
    
    private String codigo_factura;//TFACTURA.codigo_factura
    private String lc; //TFACTURA.LC
    private String tipo; //TFACTURA.tipo F factura A = notacredito
    private Integer empresa;//TFACTURA.empresa
    

    public Jsdnotascredito() {
    }

    public Jsdnotascredito(Integer idnotacredito, Integer numfiscalnc, Integer idfactura, String impreso, Date fecha, String hora, String username, String codigo_factura, String lc, String tipo, Integer empresa) {
        this.idnotacredito = idnotacredito;
        this.numfiscalnc = numfiscalnc;
        this.idfactura = idfactura;
        this.impreso = impreso;
        this.fecha = fecha;
        this.hora = hora;
        this.username = username;
        this.codigo_factura = codigo_factura;
        this.lc = lc;
        this.tipo = tipo;
        this.empresa = empresa;
    }

    public Integer getIdnotacredito() {
        return idnotacredito;
    }

    public void setIdnotacredito(Integer idnotacredito) {
        this.idnotacredito = idnotacredito;
    }

    public Integer getNumfiscalnc() {
        return numfiscalnc;
    }

    public void setNumfiscalnc(Integer numfiscalnc) {
        this.numfiscalnc = numfiscalnc;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public String getImpreso() {
        return impreso;
    }

    public void setImpreso(String impreso) {
        this.impreso = impreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(String codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }
   

   

  

}
