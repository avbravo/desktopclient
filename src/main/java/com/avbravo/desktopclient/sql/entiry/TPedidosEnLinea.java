/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.sql.entiry;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author avbravo
 */

public class TPedidosEnLinea implements Serializable {

    private static final long serialVersionUID = 1L;

    
    // @Column(name = "referencia")
    private String referencia;
    
    // @Column(name = "familia")
    private String familia;
    // @Column(name = "lineaFacturacion")
    private Short lineaFacturacion;
    
    // @Column(name = "articulo")
    private String articulo;
    // @Column(name = "diseno")
    private Integer diseno;
    
    // @Column(name = "serie")
    private String serie;
        
    // @Column(name = "descripcion")
    private String descripcion;
    
    // @Column(name = "color")
    private String color;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Column(name = "precio")
    private Double precio;
    // @Column(name = "cantidad")
    private Double cantidad;
    // @Column(name = "dto")
    private Double dto;
    // @Column(name = "IVA")
    private Double iva;
    // @Column(name = "RE")
    private Double re;
    
    // @Column(name = "nombreDisenoPresupuestado")
    private String nombreDisenoPresupuestado;
    // @Column(name = "siSerieImportada")
    private Short siSerieImportada;
    // @Column(name = "siDisenoImportado")
    private Short siDisenoImportado;
    // @Column(name = "coste")
    private Double coste;
    // @Column(name = "baseImponible")
    private Double baseImponible;
    // @Column(name = "codigoPersiana")
    private Integer codigoPersiana;

    // @Column(name = "tipoFactura")
    private String tipoFactura;
    // @Column(name = "anchuraFigura")
    private Double anchuraFigura;
    // @Column(name = "alturaFigura")
    private Double alturaFigura;
    // @Column(name = "fondoFigura")
    private Double fondoFigura;
    // @Column(name = "codigoPremarco")
    private Integer codigoPremarco;
    // @Column(name = "codigoCuarteron")
    private Integer codigoCuarteron;
    // @Column(name = "tipoCuarteron")
    private Integer tipoCuarteron;
    
    // @Column(name = "codigoPresupuesto")
    private String codigoPresupuesto;
    
    // @Column(name = "codigoAlbaran")
    private String codigoAlbaran;
      
    // @Column(name = "codigoFactura")
    private String codigoFactura;
    // @Column(name = "dto2")
    private Double dto2;
    // @Column(name = "comision")
    private Double comision;
    // @Column(name = "fechaservir")

    private Date fechaservir;
    // @Column(name = "fechaservido")

    private Date fechaservido;
    // @Column(name = "unidadprecio")
    private Short unidadprecio;
    // @Column(name = "monedaVenta")
    private Integer monedaVenta;
    
    // @Column(name = "codigoModelo")
    private String codigoModelo;
    // @Column(name = "puntos")
    private Double puntos;
    // @Column(name = "kg")
    private Double kg;
    // @Column(name = "numeroBultos")
    private Double numeroBultos;
    // @Column(name = "volumen")
    private Double volumen;
    // @Column(name = "impPorte")
    private Double impPorte;
    // @Column(name = "factorUnidad")
    private Double factorUnidad;
    // @Column(name = "tipoLinea")
    private Short tipoLinea;
    // @Column(name = "m2Multiplos")
    private Double m2Multiplos;
    // @Column(name = "siPrecioVisible")
    private Boolean siPrecioVisible;
    // @Column(name = "siSumaPrecio")
    private Boolean siSumaPrecio;
    // @Column(name = "siDescripcionVisible")
    private Boolean siDescripcionVisible;
    // @Column(name = "idCertificacion")
    private Integer idCertificacion;
    // @Column(name = "precioUnitario")
    private Double precioUnitario;
    // @Column(name = "idLineaPresupuesto")
    private Integer idLineaPresupuesto;
    // @Column(name = "ordenLinea")
    private Integer ordenLinea;
    // @Column(name = "pesoNeto")
    private Double pesoNeto;
    // @Column(name = "pesoBruto")
    private Double pesoBruto;
    // @Column(name = "volumenPuntos")
    private Double volumenPuntos;
    // @Column(name = "medidaBarra")
    private Double medidaBarra;
        
    // @Column(name = "descripcionTraducida")
    private String descripcionTraducida;
    
    // @Column(name = "upsize_ts")
    private String upsizeTs;
    // @Column(name = "recubel")
    private Double recubel;
    // @Column(name = "estadoLinea")
    private Integer estadoLinea;
    
    // @Column(name = "zonaAlmacen")
    private String zonaAlmacen;
    // @Column(name = "codigoAlmacen")
    private Integer codigoAlmacen;
    
    // @Column(name = "dtoTipo")
    private String dtoTipo;
    
    // @Column(name = "codigoTono")
    private String codigoTono;
    
    // @Column(name = "codigoPedidoProveedor")
    private String codigoPedidoProveedor;
    // @Column(name = "codigoLineaProveedor")
    private Integer codigoLineaProveedor;
       
      
    // @Column(name = "idCatalogo")
    private int idCatalogo;
    
    // @Column(name = "codigoUbicacion")
    private String codigoUbicacion;
    // @Column(name = "importeDescuento")
    private Double importeDescuento;
    // @Column(name = "siBloqueado")
    private Boolean siBloqueado;
    
    // @Column(name = "motivoBloqueo")
    private String motivoBloqueo;
    // @Column(name = "siFabricado")
    private Short siFabricado;
    // @Column(name = "comisionDirector")
    private Double comisionDirector;
    // @Column(name = "noFabricar")
    private Boolean noFabricar;
    // @Column(name = "cantidadEntregable")
    private Double cantidadEntregable;
       
      
    // @Column(name = "EcoMobilierSometido")
    private boolean ecoMobilierSometido;
    
    // @Column(name = "EcoMobilierCodigo")
    private String ecoMobilierCodigo;
    // @Column(name = "EcoMobilierImporte")
    private Double ecoMobilierImporte;
       
      
    // @Column(name = "EcoParticipationSometido")
    private boolean ecoParticipationSometido;
    
    // @Column(name = "EcoParticipationCodigo")
    private String ecoParticipationCodigo;
    // @Column(name = "EcoParticipationImporte")
    private Double ecoParticipationImporte;
       
      
    // @Column(name = "TFASometido")
    private boolean tFASometido;
       
      
    // @Column(name = "TFA")
    private double tfa;
       
      
    // @Column(name = "taxaTVA")
    private double taxaTVA;
    
    // @Column(name = "familiaContableTVA")
    private String familiaContableTVA;
    // @Column(name = "Estados")
    private Integer estados;
    // @Column(name = "siTraspasado")
    private Boolean siTraspasado;
    
    // @Column(name = "codigoRechazo")
    private String codigoRechazo;
    // @Column(name = "tipo")
    private Integer tipo;
    // @Column(name = "dificultad")
    private Double dificultad;
    // @Column(name = "prioridad")
    private Short prioridad;
    // @Column(name = "siMontaje")
    private Boolean siMontaje;
    // @Column(name = "fechaMontaje")
    
    private Date fechaMontaje;
    
    // @Column(name = "horaMontaje")
    private String horaMontaje;
    // @Column(name = "siConfirmado")
    private Boolean siConfirmado;
    
    // @Column(name = "codigoPedidoMontaje")
    private String codigoPedidoMontaje;
    // @Column(name = "esPedidoMontaje")
    private Boolean esPedidoMontaje;
    // @Column(name = "totalRetencionObra")
    private Double totalRetencionObra;
    // @Column(name = "siPedidoRetencion")
    private Boolean siPedidoRetencion;
    // @Column(name = "siPortesPrimeraEntrega")
    private Boolean siPortesPrimeraEntrega;
    
    // @Column(name = "descripcionPedido")
    private String descripcionPedido;
    
    // @Column(name = "materialLabour")
    private String materialLabour;
    // @Column(name = "calidadCaja")
    private Short calidadCaja;
    // @Column(name = "siFinalizado")
    private Boolean siFinalizado;
    // @Column(name = "siPedidoAnticipoObra")
    private Boolean siPedidoAnticipoObra;
    
    // @Column(name = "firmaPedido")
    private String firmaPedido;
    // @Column(name = "idDireccionCarga")
    private Integer idDireccionCarga;
    // @Column(name = "idDireccionDescarga")
    private Integer idDireccionDescarga;
    // @Column(name = "fechaEntregaReal")

    private Date fechaEntregaReal;
    // @Column(name = "importeInstalacion")
    private Double importeInstalacion;
    // @Column(name = "importeFijoCliente")
    private Double importeFijoCliente;
    // @Column(name = "TVASometido")
    private Boolean tVASometido;
    
    // @Column(name = "tipoProyecto")
    private String tipoProyecto;
    
    // @Column(name = "codigoPorte")
    private String codigoPorte;
    // @Column(name = "importeMinimoFranco")
    private Double importeMinimoFranco;
    // @Column(name = "dtoPortes")
    private Double dtoPortes;
    // @Column(name = "anticipoCliente")
    private Double anticipoCliente;
    
    // @Column(name = "tipoClasificacion")
    private String tipoClasificacion;
    
    // @Column(name = "idExpedicion")
    private String idExpedicion;
    // @Column(name = "olExpedicion")
    private Integer olExpedicion;
    
    // @Column(name = "codeReglement")
    private String codeReglement;
    
    // @Column(name = "codeConditionPaiement")
    private String codeConditionPaiement;

    public TPedidosEnLinea() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public Short getLineaFacturacion() {
        return lineaFacturacion;
    }

    public void setLineaFacturacion(Short lineaFacturacion) {
        this.lineaFacturacion = lineaFacturacion;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Integer getDiseno() {
        return diseno;
    }

    public void setDiseno(Integer diseno) {
        this.diseno = diseno;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDto() {
        return dto;
    }

    public void setDto(Double dto) {
        this.dto = dto;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getRe() {
        return re;
    }

    public void setRe(Double re) {
        this.re = re;
    }

    public String getNombreDisenoPresupuestado() {
        return nombreDisenoPresupuestado;
    }

    public void setNombreDisenoPresupuestado(String nombreDisenoPresupuestado) {
        this.nombreDisenoPresupuestado = nombreDisenoPresupuestado;
    }

    public Short getSiSerieImportada() {
        return siSerieImportada;
    }

    public void setSiSerieImportada(Short siSerieImportada) {
        this.siSerieImportada = siSerieImportada;
    }

    public Short getSiDisenoImportado() {
        return siDisenoImportado;
    }

    public void setSiDisenoImportado(Short siDisenoImportado) {
        this.siDisenoImportado = siDisenoImportado;
    }

    public Double getCoste() {
        return coste;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Integer getCodigoPersiana() {
        return codigoPersiana;
    }

    public void setCodigoPersiana(Integer codigoPersiana) {
        this.codigoPersiana = codigoPersiana;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Double getAnchuraFigura() {
        return anchuraFigura;
    }

    public void setAnchuraFigura(Double anchuraFigura) {
        this.anchuraFigura = anchuraFigura;
    }

    public Double getAlturaFigura() {
        return alturaFigura;
    }

    public void setAlturaFigura(Double alturaFigura) {
        this.alturaFigura = alturaFigura;
    }

    public Double getFondoFigura() {
        return fondoFigura;
    }

    public void setFondoFigura(Double fondoFigura) {
        this.fondoFigura = fondoFigura;
    }

    public Integer getCodigoPremarco() {
        return codigoPremarco;
    }

    public void setCodigoPremarco(Integer codigoPremarco) {
        this.codigoPremarco = codigoPremarco;
    }

    public Integer getCodigoCuarteron() {
        return codigoCuarteron;
    }

    public void setCodigoCuarteron(Integer codigoCuarteron) {
        this.codigoCuarteron = codigoCuarteron;
    }

    public Integer getTipoCuarteron() {
        return tipoCuarteron;
    }

    public void setTipoCuarteron(Integer tipoCuarteron) {
        this.tipoCuarteron = tipoCuarteron;
    }

    public String getCodigoPresupuesto() {
        return codigoPresupuesto;
    }

    public void setCodigoPresupuesto(String codigoPresupuesto) {
        this.codigoPresupuesto = codigoPresupuesto;
    }

    public String getCodigoAlbaran() {
        return codigoAlbaran;
    }

    public void setCodigoAlbaran(String codigoAlbaran) {
        this.codigoAlbaran = codigoAlbaran;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Double getDto2() {
        return dto2;
    }

    public void setDto2(Double dto2) {
        this.dto2 = dto2;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Date getFechaservir() {
        return fechaservir;
    }

    public void setFechaservir(Date fechaservir) {
        this.fechaservir = fechaservir;
    }

    public Date getFechaservido() {
        return fechaservido;
    }

    public void setFechaservido(Date fechaservido) {
        this.fechaservido = fechaservido;
    }

    public Short getUnidadprecio() {
        return unidadprecio;
    }

    public void setUnidadprecio(Short unidadprecio) {
        this.unidadprecio = unidadprecio;
    }

    public Integer getMonedaVenta() {
        return monedaVenta;
    }

    public void setMonedaVenta(Integer monedaVenta) {
        this.monedaVenta = monedaVenta;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    public Double getKg() {
        return kg;
    }

    public void setKg(Double kg) {
        this.kg = kg;
    }

    public Double getNumeroBultos() {
        return numeroBultos;
    }

    public void setNumeroBultos(Double numeroBultos) {
        this.numeroBultos = numeroBultos;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Double getImpPorte() {
        return impPorte;
    }

    public void setImpPorte(Double impPorte) {
        this.impPorte = impPorte;
    }

    public Double getFactorUnidad() {
        return factorUnidad;
    }

    public void setFactorUnidad(Double factorUnidad) {
        this.factorUnidad = factorUnidad;
    }

    public Short getTipoLinea() {
        return tipoLinea;
    }

    public void setTipoLinea(Short tipoLinea) {
        this.tipoLinea = tipoLinea;
    }

    public Double getM2Multiplos() {
        return m2Multiplos;
    }

    public void setM2Multiplos(Double m2Multiplos) {
        this.m2Multiplos = m2Multiplos;
    }

    public Boolean getSiPrecioVisible() {
        return siPrecioVisible;
    }

    public void setSiPrecioVisible(Boolean siPrecioVisible) {
        this.siPrecioVisible = siPrecioVisible;
    }

    public Boolean getSiSumaPrecio() {
        return siSumaPrecio;
    }

    public void setSiSumaPrecio(Boolean siSumaPrecio) {
        this.siSumaPrecio = siSumaPrecio;
    }

    public Boolean getSiDescripcionVisible() {
        return siDescripcionVisible;
    }

    public void setSiDescripcionVisible(Boolean siDescripcionVisible) {
        this.siDescripcionVisible = siDescripcionVisible;
    }

    public Integer getIdCertificacion() {
        return idCertificacion;
    }

    public void setIdCertificacion(Integer idCertificacion) {
        this.idCertificacion = idCertificacion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getIdLineaPresupuesto() {
        return idLineaPresupuesto;
    }

    public void setIdLineaPresupuesto(Integer idLineaPresupuesto) {
        this.idLineaPresupuesto = idLineaPresupuesto;
    }

    public Integer getOrdenLinea() {
        return ordenLinea;
    }

    public void setOrdenLinea(Integer ordenLinea) {
        this.ordenLinea = ordenLinea;
    }

    public Double getPesoNeto() {
        return pesoNeto;
    }

    public void setPesoNeto(Double pesoNeto) {
        this.pesoNeto = pesoNeto;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Double getVolumenPuntos() {
        return volumenPuntos;
    }

    public void setVolumenPuntos(Double volumenPuntos) {
        this.volumenPuntos = volumenPuntos;
    }

    public Double getMedidaBarra() {
        return medidaBarra;
    }

    public void setMedidaBarra(Double medidaBarra) {
        this.medidaBarra = medidaBarra;
    }

    public String getDescripcionTraducida() {
        return descripcionTraducida;
    }

    public void setDescripcionTraducida(String descripcionTraducida) {
        this.descripcionTraducida = descripcionTraducida;
    }

    public String getUpsizeTs() {
        return upsizeTs;
    }

    public void setUpsizeTs(String upsizeTs) {
        this.upsizeTs = upsizeTs;
    }

    public Double getRecubel() {
        return recubel;
    }

    public void setRecubel(Double recubel) {
        this.recubel = recubel;
    }

    public Integer getEstadoLinea() {
        return estadoLinea;
    }

    public void setEstadoLinea(Integer estadoLinea) {
        this.estadoLinea = estadoLinea;
    }

    public String getZonaAlmacen() {
        return zonaAlmacen;
    }

    public void setZonaAlmacen(String zonaAlmacen) {
        this.zonaAlmacen = zonaAlmacen;
    }

    public Integer getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(Integer codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public String getDtoTipo() {
        return dtoTipo;
    }

    public void setDtoTipo(String dtoTipo) {
        this.dtoTipo = dtoTipo;
    }

    public String getCodigoTono() {
        return codigoTono;
    }

    public void setCodigoTono(String codigoTono) {
        this.codigoTono = codigoTono;
    }

    public String getCodigoPedidoProveedor() {
        return codigoPedidoProveedor;
    }

    public void setCodigoPedidoProveedor(String codigoPedidoProveedor) {
        this.codigoPedidoProveedor = codigoPedidoProveedor;
    }

    public Integer getCodigoLineaProveedor() {
        return codigoLineaProveedor;
    }

    public void setCodigoLineaProveedor(Integer codigoLineaProveedor) {
        this.codigoLineaProveedor = codigoLineaProveedor;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getCodigoUbicacion() {
        return codigoUbicacion;
    }

    public void setCodigoUbicacion(String codigoUbicacion) {
        this.codigoUbicacion = codigoUbicacion;
    }

    public Double getImporteDescuento() {
        return importeDescuento;
    }

    public void setImporteDescuento(Double importeDescuento) {
        this.importeDescuento = importeDescuento;
    }

    public Boolean getSiBloqueado() {
        return siBloqueado;
    }

    public void setSiBloqueado(Boolean siBloqueado) {
        this.siBloqueado = siBloqueado;
    }

    public String getMotivoBloqueo() {
        return motivoBloqueo;
    }

    public void setMotivoBloqueo(String motivoBloqueo) {
        this.motivoBloqueo = motivoBloqueo;
    }

    public Short getSiFabricado() {
        return siFabricado;
    }

    public void setSiFabricado(Short siFabricado) {
        this.siFabricado = siFabricado;
    }

    public Double getComisionDirector() {
        return comisionDirector;
    }

    public void setComisionDirector(Double comisionDirector) {
        this.comisionDirector = comisionDirector;
    }

    public Boolean getNoFabricar() {
        return noFabricar;
    }

    public void setNoFabricar(Boolean noFabricar) {
        this.noFabricar = noFabricar;
    }

    public Double getCantidadEntregable() {
        return cantidadEntregable;
    }

    public void setCantidadEntregable(Double cantidadEntregable) {
        this.cantidadEntregable = cantidadEntregable;
    }

    public boolean isEcoMobilierSometido() {
        return ecoMobilierSometido;
    }

    public void setEcoMobilierSometido(boolean ecoMobilierSometido) {
        this.ecoMobilierSometido = ecoMobilierSometido;
    }

    public String getEcoMobilierCodigo() {
        return ecoMobilierCodigo;
    }

    public void setEcoMobilierCodigo(String ecoMobilierCodigo) {
        this.ecoMobilierCodigo = ecoMobilierCodigo;
    }

    public Double getEcoMobilierImporte() {
        return ecoMobilierImporte;
    }

    public void setEcoMobilierImporte(Double ecoMobilierImporte) {
        this.ecoMobilierImporte = ecoMobilierImporte;
    }

    public boolean isEcoParticipationSometido() {
        return ecoParticipationSometido;
    }

    public void setEcoParticipationSometido(boolean ecoParticipationSometido) {
        this.ecoParticipationSometido = ecoParticipationSometido;
    }

    public String getEcoParticipationCodigo() {
        return ecoParticipationCodigo;
    }

    public void setEcoParticipationCodigo(String ecoParticipationCodigo) {
        this.ecoParticipationCodigo = ecoParticipationCodigo;
    }

    public Double getEcoParticipationImporte() {
        return ecoParticipationImporte;
    }

    public void setEcoParticipationImporte(Double ecoParticipationImporte) {
        this.ecoParticipationImporte = ecoParticipationImporte;
    }

    public boolean istFASometido() {
        return tFASometido;
    }

    public void settFASometido(boolean tFASometido) {
        this.tFASometido = tFASometido;
    }

    public double getTfa() {
        return tfa;
    }

    public void setTfa(double tfa) {
        this.tfa = tfa;
    }

    public double getTaxaTVA() {
        return taxaTVA;
    }

    public void setTaxaTVA(double taxaTVA) {
        this.taxaTVA = taxaTVA;
    }

    public String getFamiliaContableTVA() {
        return familiaContableTVA;
    }

    public void setFamiliaContableTVA(String familiaContableTVA) {
        this.familiaContableTVA = familiaContableTVA;
    }

    public Integer getEstados() {
        return estados;
    }

    public void setEstados(Integer estados) {
        this.estados = estados;
    }

    public Boolean getSiTraspasado() {
        return siTraspasado;
    }

    public void setSiTraspasado(Boolean siTraspasado) {
        this.siTraspasado = siTraspasado;
    }

    public String getCodigoRechazo() {
        return codigoRechazo;
    }

    public void setCodigoRechazo(String codigoRechazo) {
        this.codigoRechazo = codigoRechazo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getDificultad() {
        return dificultad;
    }

    public void setDificultad(Double dificultad) {
        this.dificultad = dificultad;
    }

    public Short getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Short prioridad) {
        this.prioridad = prioridad;
    }

    public Boolean getSiMontaje() {
        return siMontaje;
    }

    public void setSiMontaje(Boolean siMontaje) {
        this.siMontaje = siMontaje;
    }

    public Date getFechaMontaje() {
        return fechaMontaje;
    }

    public void setFechaMontaje(Date fechaMontaje) {
        this.fechaMontaje = fechaMontaje;
    }

    public String getHoraMontaje() {
        return horaMontaje;
    }

    public void setHoraMontaje(String horaMontaje) {
        this.horaMontaje = horaMontaje;
    }

    public Boolean getSiConfirmado() {
        return siConfirmado;
    }

    public void setSiConfirmado(Boolean siConfirmado) {
        this.siConfirmado = siConfirmado;
    }

    public String getCodigoPedidoMontaje() {
        return codigoPedidoMontaje;
    }

    public void setCodigoPedidoMontaje(String codigoPedidoMontaje) {
        this.codigoPedidoMontaje = codigoPedidoMontaje;
    }

    public Boolean getEsPedidoMontaje() {
        return esPedidoMontaje;
    }

    public void setEsPedidoMontaje(Boolean esPedidoMontaje) {
        this.esPedidoMontaje = esPedidoMontaje;
    }

    public Double getTotalRetencionObra() {
        return totalRetencionObra;
    }

    public void setTotalRetencionObra(Double totalRetencionObra) {
        this.totalRetencionObra = totalRetencionObra;
    }

    public Boolean getSiPedidoRetencion() {
        return siPedidoRetencion;
    }

    public void setSiPedidoRetencion(Boolean siPedidoRetencion) {
        this.siPedidoRetencion = siPedidoRetencion;
    }

    public Boolean getSiPortesPrimeraEntrega() {
        return siPortesPrimeraEntrega;
    }

    public void setSiPortesPrimeraEntrega(Boolean siPortesPrimeraEntrega) {
        this.siPortesPrimeraEntrega = siPortesPrimeraEntrega;
    }

    public String getDescripcionPedido() {
        return descripcionPedido;
    }

    public void setDescripcionPedido(String descripcionPedido) {
        this.descripcionPedido = descripcionPedido;
    }

    public String getMaterialLabour() {
        return materialLabour;
    }

    public void setMaterialLabour(String materialLabour) {
        this.materialLabour = materialLabour;
    }

    public Short getCalidadCaja() {
        return calidadCaja;
    }

    public void setCalidadCaja(Short calidadCaja) {
        this.calidadCaja = calidadCaja;
    }

    public Boolean getSiFinalizado() {
        return siFinalizado;
    }

    public void setSiFinalizado(Boolean siFinalizado) {
        this.siFinalizado = siFinalizado;
    }

    public Boolean getSiPedidoAnticipoObra() {
        return siPedidoAnticipoObra;
    }

    public void setSiPedidoAnticipoObra(Boolean siPedidoAnticipoObra) {
        this.siPedidoAnticipoObra = siPedidoAnticipoObra;
    }

    public String getFirmaPedido() {
        return firmaPedido;
    }

    public void setFirmaPedido(String firmaPedido) {
        this.firmaPedido = firmaPedido;
    }

    public Integer getIdDireccionCarga() {
        return idDireccionCarga;
    }

    public void setIdDireccionCarga(Integer idDireccionCarga) {
        this.idDireccionCarga = idDireccionCarga;
    }

    public Integer getIdDireccionDescarga() {
        return idDireccionDescarga;
    }

    public void setIdDireccionDescarga(Integer idDireccionDescarga) {
        this.idDireccionDescarga = idDireccionDescarga;
    }

    public Date getFechaEntregaReal() {
        return fechaEntregaReal;
    }

    public void setFechaEntregaReal(Date fechaEntregaReal) {
        this.fechaEntregaReal = fechaEntregaReal;
    }

    public Double getImporteInstalacion() {
        return importeInstalacion;
    }

    public void setImporteInstalacion(Double importeInstalacion) {
        this.importeInstalacion = importeInstalacion;
    }

    public Double getImporteFijoCliente() {
        return importeFijoCliente;
    }

    public void setImporteFijoCliente(Double importeFijoCliente) {
        this.importeFijoCliente = importeFijoCliente;
    }

    public Boolean gettVASometido() {
        return tVASometido;
    }

    public void settVASometido(Boolean tVASometido) {
        this.tVASometido = tVASometido;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public String getCodigoPorte() {
        return codigoPorte;
    }

    public void setCodigoPorte(String codigoPorte) {
        this.codigoPorte = codigoPorte;
    }

    public Double getImporteMinimoFranco() {
        return importeMinimoFranco;
    }

    public void setImporteMinimoFranco(Double importeMinimoFranco) {
        this.importeMinimoFranco = importeMinimoFranco;
    }

    public Double getDtoPortes() {
        return dtoPortes;
    }

    public void setDtoPortes(Double dtoPortes) {
        this.dtoPortes = dtoPortes;
    }

    public Double getAnticipoCliente() {
        return anticipoCliente;
    }

    public void setAnticipoCliente(Double anticipoCliente) {
        this.anticipoCliente = anticipoCliente;
    }

    public String getTipoClasificacion() {
        return tipoClasificacion;
    }

    public void setTipoClasificacion(String tipoClasificacion) {
        this.tipoClasificacion = tipoClasificacion;
    }

    public String getIdExpedicion() {
        return idExpedicion;
    }

    public void setIdExpedicion(String idExpedicion) {
        this.idExpedicion = idExpedicion;
    }

    public Integer getOlExpedicion() {
        return olExpedicion;
    }

    public void setOlExpedicion(Integer olExpedicion) {
        this.olExpedicion = olExpedicion;
    }

    public String getCodeReglement() {
        return codeReglement;
    }

    public void setCodeReglement(String codeReglement) {
        this.codeReglement = codeReglement;
    }

    public String getCodeConditionPaiement() {
        return codeConditionPaiement;
    }

    public void setCodeConditionPaiement(String codeConditionPaiement) {
        this.codeConditionPaiement = codeConditionPaiement;
    }

    
    
}
