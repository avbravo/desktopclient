/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

/**
 *
 * @author avbravo
 */
public class Jsddetallefactura {
    private Integer iddetallefactura; //AUTOINCREMENTABLE
    private Integer idfactura; // PARA MANTENER LA RELACION CON LA FACTURA GENERADA
    private String codigo_pedido;//TPEDIDOSNELINEA.codigo_pedido  
    private String lc; //TPEDIDOSNELINEA.LC
    private Integer empresa; //TPEDIDOSNELINEA.empresa
    private Integer codigo;//TPEDIDOSNELINEA.codigo
    private String idproducto; //TPEDIDOSENLINEA.articulo
    private String producto; // TPEDIDOSENLINEA.descripcion
    private Double precio;// TPEDIDOSENLINEA.precio
    private Integer cantidad;// TPEDIDOSENLINEA.cantidad
    private Double descuento; // no se sabe en que campo este
    private Double impuesto; // TPEDIDOSENLINEA.iva
    private Double total;

    public Jsddetallefactura() {
    }

    public Jsddetallefactura(Integer iddetallefactura, Integer idfactura, String codigo_pedido, String lc, Integer empresa, Integer codigo, String idproducto, String producto, Double precio, Integer cantidad, Double descuento, Double impuesto, Double total) {
        this.iddetallefactura = iddetallefactura;
        this.idfactura = idfactura;
        this.codigo_pedido = codigo_pedido;
        this.lc = lc;
        this.empresa = empresa;
        this.codigo = codigo;
        this.idproducto = idproducto;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.impuesto = impuesto;
        this.total = total;
    }

    public Integer getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    

}
