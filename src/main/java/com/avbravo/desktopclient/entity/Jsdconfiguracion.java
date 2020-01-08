/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author avbravo Guarda la configuracion de la fecha inicial a partir de la
 * cual se omitiran las facturas se obtiene y se muestra en los filtros
 */
public class Jsdconfiguracion implements Serializable {

    private String idconfiguracion;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date fechainicio;

   
    public Jsdconfiguracion() {
    }

    public Jsdconfiguracion(String idconfiguracion, Date fechainicio) {
        this.idconfiguracion = idconfiguracion;
        this.fechainicio = fechainicio;
    }

    public String getIdconfiguracion() {
        return idconfiguracion;
    }

    public void setIdconfiguracion(String idconfiguracion) {
        this.idconfiguracion = idconfiguracion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
}
