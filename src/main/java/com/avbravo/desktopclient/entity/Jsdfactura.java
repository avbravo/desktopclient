/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/**
 *
 * @author avbravo
 */
public class Jsdfactura {

    private Integer idfactura; //AUTOINCREMENTABLE
    private String codigo_pedido;//TPEDIDOS.codigo_pedido  
    private String lc; //TPEDIDOS.LC
    private Integer empresa; //TPEDIDOS.empresa
    private Double subtotal;  //TPEDIDOS.totalBruto


//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd ", timezone = "UTC")
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date fecha; //TPEDIDOS.fecha_pedido
    private String observaciones; //TPEDIDOS.observaciones
    private Double anticipo; //TPEDIDOS.anticipo
    private Integer porcentaje; //TPEDIDOS.porcentajeIVA1   
    private Double descuento; //TPEDIDOS.descGlobal1  
    private Double total; //TPEDIDOS.total
    private Integer estado;//TPEDIDOS.estado
    private Integer idcliente;  //TPEDIDOS.codigo_cliente 
    private String nombre; //TCLIENTES.nombreFiscal
    private Integer numfiscal;//genera al imprimir desde JSDPARAMETRO
 

    private Double totalimpuestos; // calcualr al imprimir

    private Integer idformapago;//para guardar
    private String tipopago;//para guardar
    private String banco; //para guardar
    private String codigoimpresora; //para guardar  DEBE ESTAR ENCRIPTADO
    private String username;

    public Jsdfactura() {
    }

    public Jsdfactura(Integer idfactura, String codigo_pedido, String lc, Integer empresa, Double subtotal, Date fecha, String observaciones, Double anticipo, Integer porcentaje, Double descuento, Double total, Integer estado, Integer idcliente, String nombre, Integer numfiscal, Double totalimpuestos, Integer idformapago, String tipopago, String banco, String codigoimpresora, String username) {
        this.idfactura = idfactura;
        this.codigo_pedido = codigo_pedido;
        this.lc = lc;
        this.empresa = empresa;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.anticipo = anticipo;
        this.porcentaje = porcentaje;
        this.descuento = descuento;
        this.total = total;
        this.estado = estado;
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.numfiscal = numfiscal;
        this.totalimpuestos = totalimpuestos;
        this.idformapago = idformapago;
        this.tipopago = tipopago;
        this.banco = banco;
        this.codigoimpresora = codigoimpresora;
        this.username = username;
    }

    
    
    
    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(Double anticipo) {
        this.anticipo = anticipo;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumfiscal() {
        return numfiscal;
    }

    public void setNumfiscal(Integer numfiscal) {
        this.numfiscal = numfiscal;
    }

    public Double getTotalimpuestos() {
        return totalimpuestos;
    }

    public void setTotalimpuestos(Double totalimpuestos) {
        this.totalimpuestos = totalimpuestos;
    }

    public Integer getIdformapago() {
        return idformapago;
    }

    public void setIdformapago(Integer idformapago) {
        this.idformapago = idformapago;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCodigoimpresora() {
        return codigoimpresora;
    }

    public void setCodigoimpresora(String codigoimpresora) {
        this.codigoimpresora = codigoimpresora;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    
  
}
