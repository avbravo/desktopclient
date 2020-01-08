/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Jsdparametro implements Serializable {

    private String iparametro;
    private String descripcion;
    private Integer valor;

    public Jsdparametro() {
    }

    public Jsdparametro(String iparametro, String descripcion, Integer valor) {
        this.iparametro = iparametro;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getIparametro() {
        return iparametro;
    }

    public void setIparametro(String iparametro) {
        this.iparametro = iparametro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

}
