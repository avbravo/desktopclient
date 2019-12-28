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

public class TPedidos implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String zonaCliente;
    // @Column(name = "codigo_cliente")
    private Integer codigoCliente;
    // @Column(name = "estado")
    private Short estado;
    
    // @Column(name = "referencia")
    private String referencia;
    // @Column(name = "fecha_pedido")

    private Date fechaPedido;
    // @Column(name = "fecha_max")

    private Date fechaMax;
    
    // @Column(name = "forma_pago")
    private String formaPago;
        
    // @Column(name = "observaciones")
    private String observaciones;
    
    // @Column(name = "transportista")
    private String transportista;
    // @Column(name = "tipoFactura")
    private Short tipoFactura;
    // @Column(name = "tipoAlbaran")
    private Short tipoAlbaran;
    // @Column(name = "tipo_tarifa")
    private Short tipoTarifa;
    // @Column(name = "siAgrupaPedido")
    private Short siAgrupaPedido;
    // @Column(name = "siAgrupaAlbaran")
    private Short siAgrupaAlbaran;
    // @Column(name = "siEntrega")
    private Short siEntrega;
    // @Column(name = "siRecargoEqui")
    private Short siRecargoEqui;
    // @Column(name = "numCopiasFra")
    private Short numCopiasFra;
    // @Column(name = "numCopiasAlbaran")
    private Short numCopiasAlbaran;
    
    // @Column(name = "zona_agente")
    private String zonaAgente;
    // @Column(name = "codigo_agente")
    private Integer codigoAgente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Column(name = "anticipo")
    private Double anticipo;
    // @Column(name = "retencion")
    private Short retencion;
    
    // @Column(name = "codigoPresupuesto")
    private String codigoPresupuesto;
    // @Column(name = "codigoAlmacen")
    private Integer codigoAlmacen;
    
    // @Column(name = "zonaAlmacen")
    private String zonaAlmacen;
    // @Column(name = "ordenEntrega")
    private Integer ordenEntrega;
    
    // @Column(name = "codigoModelo")
    private String codigoModelo;
   
    // @Column(name = "observacionesTrans")
    private String observacionesTrans;
    // @Column(name = "puntos")
    private Double puntos;
    // @Column(name = "valorPunto")
    private Double valorPunto;
    // @Column(name = "medioTransporte")
    private Short medioTransporte;
    // @Column(name = "kg")
    private Double kg;
    // @Column(name = "numeroBultos")
    private Double numeroBultos;
    // @Column(name = "volumen")
    private Double volumen;
    // @Column(name = "impPorte")
    private Double impPorte;
    // @Column(name = "totalBruto")
    private Double totalBruto;
    // @Column(name = "totalBaseImponible1")
    private Double totalBaseImponible1;
    // @Column(name = "totalBaseImponible2")
    private Double totalBaseImponible2;
    // @Column(name = "totalBaseImponible3")
    private Double totalBaseImponible3;
    // @Column(name = "totalBaseImponible4")
    private Double totalBaseImponible4;
    // @Column(name = "porcenIVA1")
    private Double porcenIVA1;
    // @Column(name = "porcenIVA2")
    private Double porcenIVA2;
    // @Column(name = "porcenIVA3")
    private Double porcenIVA3;
    // @Column(name = "porcenIVA4")
    private Double porcenIVA4;
    // @Column(name = "porcenRE1")
    private Double porcenRE1;
    // @Column(name = "porcenRE2")
    private Double porcenRE2;
    // @Column(name = "porcenRE3")
    private Double porcenRE3;
    // @Column(name = "porcenRE4")
    private Double porcenRE4;
    // @Column(name = "total")
    private Double total;
    // @Column(name = "descGlobal1")
    private Double descGlobal1;
    // @Column(name = "descGlobal2")
    private Double descGlobal2;
    // @Column(name = "porcenRetencion")
    private Double porcenRetencion;
    // @Column(name = "moneda")
    private Integer moneda;
    // @Column(name = "cambio")
    private Double cambio;
    // @Column(name = "operador")
    private Integer operador;
    // @Column(name = "idObra")
    private Integer idObra;
    
    // @Column(name = "codigoSerie")
    private String codigoSerie;
    // @Column(name = "idDireccionEnvio")
    private Integer idDireccionEnvio;
    // @Column(name = "idDireccionEnvioFra")
    private Integer idDireccionEnvioFra;
    // @Column(name = "idDireccionCobro")
    private Integer idDireccionCobro;
    
    // @Column(name = "vinculado")
    private String vinculado;
    
    // @Column(name = "observaciones_vinculo")
    private String observacionesVinculo;
    // @Column(name = "idClienteVarios")
    private Integer idClienteVarios;
    // @Column(name = "numCopiasPedido")
    private Short numCopiasPedido;
    // @Column(name = "numCopiasRecibo")
    private Short numCopiasRecibo;
    // @Column(name = "codPickIn")
    private Integer codPickIn;
    
    // @Column(name = "codContenedor")
    private String codContenedor;
    // @Column(name = "ubicacionEnPickIn")
    private Integer ubicacionEnPickIn;
    // @Column(name = "pesoBultos")
    private Double pesoBultos;
    
    // @Column(name = "upsize_ts")
    private String upsizeTs;
    // @Column(name = "tipoObra")
    private Short tipoObra;
    // @Column(name = "recubel")
    private Double recubel;
    // @Column(name = "siTimbre")
    private Boolean siTimbre;
    // @Column(name = "cambioMonedaPresup")
    private Double cambioMonedaPresup;
  
    // @Column(name = "sucursal")
    private String sucursal;
    // @Column(name = "ordenEmisionAlbaranes")
    private Integer ordenEmisionAlbaranes;
    // @Column(name = "fechaPedidoReal")
  
    private Date fechaPedidoReal;
    
    // @Column(name = "codigoCausal")
    private String codigoCausal;
    // @Column(name = "siPedidoColor")
    private Boolean siPedidoColor;
    
    // @Column(name = "zonaProveedor")
    private String zonaProveedor;
    // @Column(name = "codigoProveedor")
    private Integer codigoProveedor;
    // @Column(name = "siTransformarPedido")
    private Boolean siTransformarPedido;
    // @Column(name = "codigoIVA")
    private Integer codigoIVA;
    // @Column(name = "estadoOrden")
    private Short estadoOrden;
       
      
    // @Column(name = "idCatalogo")
    private int idCatalogo;
    // @Column(name = "porcenDtoPP")
    private Double porcenDtoPP;
    // @Column(name = "porcenRetencionIRPF")
    private Double porcenRetencionIRPF;
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
    // @Column(name = "siBloqueado")
    private Boolean siBloqueado;
    
    // @Column(name = "motivoBloqueo")
    private String motivoBloqueo;
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
    // @Column(name = "esPedidoMontaj")
    private Boolean esPedidoMontaj;
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
       
      
    // @Column(name = "EcoMobilierSometido")
    private boolean ecoMobilierSometido;
       
      
    // @Column(name = "EcoParticipationSometido")
    private boolean ecoParticipationSometido;
       
      
    // @Column(name = "TFASometido")
    private boolean tFASometido;
       
      
    // @Column(name = "TVASometido")
    private boolean tVASometido;
    
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

    public TPedidos() {
    }

    public String getZonaCliente() {
        return zonaCliente;
    }

    public void setZonaCliente(String zonaCliente) {
        this.zonaCliente = zonaCliente;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaMax() {
        return fechaMax;
    }

    public void setFechaMax(Date fechaMax) {
        this.fechaMax = fechaMax;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public Short getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(Short tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Short getTipoAlbaran() {
        return tipoAlbaran;
    }

    public void setTipoAlbaran(Short tipoAlbaran) {
        this.tipoAlbaran = tipoAlbaran;
    }

    public Short getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(Short tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public Short getSiAgrupaPedido() {
        return siAgrupaPedido;
    }

    public void setSiAgrupaPedido(Short siAgrupaPedido) {
        this.siAgrupaPedido = siAgrupaPedido;
    }

    public Short getSiAgrupaAlbaran() {
        return siAgrupaAlbaran;
    }

    public void setSiAgrupaAlbaran(Short siAgrupaAlbaran) {
        this.siAgrupaAlbaran = siAgrupaAlbaran;
    }

    public Short getSiEntrega() {
        return siEntrega;
    }

    public void setSiEntrega(Short siEntrega) {
        this.siEntrega = siEntrega;
    }

    public Short getSiRecargoEqui() {
        return siRecargoEqui;
    }

    public void setSiRecargoEqui(Short siRecargoEqui) {
        this.siRecargoEqui = siRecargoEqui;
    }

    public Short getNumCopiasFra() {
        return numCopiasFra;
    }

    public void setNumCopiasFra(Short numCopiasFra) {
        this.numCopiasFra = numCopiasFra;
    }

    public Short getNumCopiasAlbaran() {
        return numCopiasAlbaran;
    }

    public void setNumCopiasAlbaran(Short numCopiasAlbaran) {
        this.numCopiasAlbaran = numCopiasAlbaran;
    }

    public String getZonaAgente() {
        return zonaAgente;
    }

    public void setZonaAgente(String zonaAgente) {
        this.zonaAgente = zonaAgente;
    }

    public Integer getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(Integer codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public Double getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(Double anticipo) {
        this.anticipo = anticipo;
    }

    public Short getRetencion() {
        return retencion;
    }

    public void setRetencion(Short retencion) {
        this.retencion = retencion;
    }

    public String getCodigoPresupuesto() {
        return codigoPresupuesto;
    }

    public void setCodigoPresupuesto(String codigoPresupuesto) {
        this.codigoPresupuesto = codigoPresupuesto;
    }

    public Integer getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(Integer codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public String getZonaAlmacen() {
        return zonaAlmacen;
    }

    public void setZonaAlmacen(String zonaAlmacen) {
        this.zonaAlmacen = zonaAlmacen;
    }

    public Integer getOrdenEntrega() {
        return ordenEntrega;
    }

    public void setOrdenEntrega(Integer ordenEntrega) {
        this.ordenEntrega = ordenEntrega;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getObservacionesTrans() {
        return observacionesTrans;
    }

    public void setObservacionesTrans(String observacionesTrans) {
        this.observacionesTrans = observacionesTrans;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    public Double getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(Double valorPunto) {
        this.valorPunto = valorPunto;
    }

    public Short getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(Short medioTransporte) {
        this.medioTransporte = medioTransporte;
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

    public Double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(Double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public Double getTotalBaseImponible1() {
        return totalBaseImponible1;
    }

    public void setTotalBaseImponible1(Double totalBaseImponible1) {
        this.totalBaseImponible1 = totalBaseImponible1;
    }

    public Double getTotalBaseImponible2() {
        return totalBaseImponible2;
    }

    public void setTotalBaseImponible2(Double totalBaseImponible2) {
        this.totalBaseImponible2 = totalBaseImponible2;
    }

    public Double getTotalBaseImponible3() {
        return totalBaseImponible3;
    }

    public void setTotalBaseImponible3(Double totalBaseImponible3) {
        this.totalBaseImponible3 = totalBaseImponible3;
    }

    public Double getTotalBaseImponible4() {
        return totalBaseImponible4;
    }

    public void setTotalBaseImponible4(Double totalBaseImponible4) {
        this.totalBaseImponible4 = totalBaseImponible4;
    }

    public Double getPorcenIVA1() {
        return porcenIVA1;
    }

    public void setPorcenIVA1(Double porcenIVA1) {
        this.porcenIVA1 = porcenIVA1;
    }

    public Double getPorcenIVA2() {
        return porcenIVA2;
    }

    public void setPorcenIVA2(Double porcenIVA2) {
        this.porcenIVA2 = porcenIVA2;
    }

    public Double getPorcenIVA3() {
        return porcenIVA3;
    }

    public void setPorcenIVA3(Double porcenIVA3) {
        this.porcenIVA3 = porcenIVA3;
    }

    public Double getPorcenIVA4() {
        return porcenIVA4;
    }

    public void setPorcenIVA4(Double porcenIVA4) {
        this.porcenIVA4 = porcenIVA4;
    }

    public Double getPorcenRE1() {
        return porcenRE1;
    }

    public void setPorcenRE1(Double porcenRE1) {
        this.porcenRE1 = porcenRE1;
    }

    public Double getPorcenRE2() {
        return porcenRE2;
    }

    public void setPorcenRE2(Double porcenRE2) {
        this.porcenRE2 = porcenRE2;
    }

    public Double getPorcenRE3() {
        return porcenRE3;
    }

    public void setPorcenRE3(Double porcenRE3) {
        this.porcenRE3 = porcenRE3;
    }

    public Double getPorcenRE4() {
        return porcenRE4;
    }

    public void setPorcenRE4(Double porcenRE4) {
        this.porcenRE4 = porcenRE4;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDescGlobal1() {
        return descGlobal1;
    }

    public void setDescGlobal1(Double descGlobal1) {
        this.descGlobal1 = descGlobal1;
    }

    public Double getDescGlobal2() {
        return descGlobal2;
    }

    public void setDescGlobal2(Double descGlobal2) {
        this.descGlobal2 = descGlobal2;
    }

    public Double getPorcenRetencion() {
        return porcenRetencion;
    }

    public void setPorcenRetencion(Double porcenRetencion) {
        this.porcenRetencion = porcenRetencion;
    }

    public Integer getMoneda() {
        return moneda;
    }

    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }

    public Integer getOperador() {
        return operador;
    }

    public void setOperador(Integer operador) {
        this.operador = operador;
    }

    public Integer getIdObra() {
        return idObra;
    }

    public void setIdObra(Integer idObra) {
        this.idObra = idObra;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public Integer getIdDireccionEnvio() {
        return idDireccionEnvio;
    }

    public void setIdDireccionEnvio(Integer idDireccionEnvio) {
        this.idDireccionEnvio = idDireccionEnvio;
    }

    public Integer getIdDireccionEnvioFra() {
        return idDireccionEnvioFra;
    }

    public void setIdDireccionEnvioFra(Integer idDireccionEnvioFra) {
        this.idDireccionEnvioFra = idDireccionEnvioFra;
    }

    public Integer getIdDireccionCobro() {
        return idDireccionCobro;
    }

    public void setIdDireccionCobro(Integer idDireccionCobro) {
        this.idDireccionCobro = idDireccionCobro;
    }

    public String getVinculado() {
        return vinculado;
    }

    public void setVinculado(String vinculado) {
        this.vinculado = vinculado;
    }

    public String getObservacionesVinculo() {
        return observacionesVinculo;
    }

    public void setObservacionesVinculo(String observacionesVinculo) {
        this.observacionesVinculo = observacionesVinculo;
    }

    public Integer getIdClienteVarios() {
        return idClienteVarios;
    }

    public void setIdClienteVarios(Integer idClienteVarios) {
        this.idClienteVarios = idClienteVarios;
    }

    public Short getNumCopiasPedido() {
        return numCopiasPedido;
    }

    public void setNumCopiasPedido(Short numCopiasPedido) {
        this.numCopiasPedido = numCopiasPedido;
    }

    public Short getNumCopiasRecibo() {
        return numCopiasRecibo;
    }

    public void setNumCopiasRecibo(Short numCopiasRecibo) {
        this.numCopiasRecibo = numCopiasRecibo;
    }

    public Integer getCodPickIn() {
        return codPickIn;
    }

    public void setCodPickIn(Integer codPickIn) {
        this.codPickIn = codPickIn;
    }

    public String getCodContenedor() {
        return codContenedor;
    }

    public void setCodContenedor(String codContenedor) {
        this.codContenedor = codContenedor;
    }

    public Integer getUbicacionEnPickIn() {
        return ubicacionEnPickIn;
    }

    public void setUbicacionEnPickIn(Integer ubicacionEnPickIn) {
        this.ubicacionEnPickIn = ubicacionEnPickIn;
    }

    public Double getPesoBultos() {
        return pesoBultos;
    }

    public void setPesoBultos(Double pesoBultos) {
        this.pesoBultos = pesoBultos;
    }

    public String getUpsizeTs() {
        return upsizeTs;
    }

    public void setUpsizeTs(String upsizeTs) {
        this.upsizeTs = upsizeTs;
    }

    public Short getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(Short tipoObra) {
        this.tipoObra = tipoObra;
    }

    public Double getRecubel() {
        return recubel;
    }

    public void setRecubel(Double recubel) {
        this.recubel = recubel;
    }

    public Boolean getSiTimbre() {
        return siTimbre;
    }

    public void setSiTimbre(Boolean siTimbre) {
        this.siTimbre = siTimbre;
    }

    public Double getCambioMonedaPresup() {
        return cambioMonedaPresup;
    }

    public void setCambioMonedaPresup(Double cambioMonedaPresup) {
        this.cambioMonedaPresup = cambioMonedaPresup;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getOrdenEmisionAlbaranes() {
        return ordenEmisionAlbaranes;
    }

    public void setOrdenEmisionAlbaranes(Integer ordenEmisionAlbaranes) {
        this.ordenEmisionAlbaranes = ordenEmisionAlbaranes;
    }

    public Date getFechaPedidoReal() {
        return fechaPedidoReal;
    }

    public void setFechaPedidoReal(Date fechaPedidoReal) {
        this.fechaPedidoReal = fechaPedidoReal;
    }

    public String getCodigoCausal() {
        return codigoCausal;
    }

    public void setCodigoCausal(String codigoCausal) {
        this.codigoCausal = codigoCausal;
    }

    public Boolean getSiPedidoColor() {
        return siPedidoColor;
    }

    public void setSiPedidoColor(Boolean siPedidoColor) {
        this.siPedidoColor = siPedidoColor;
    }

    public String getZonaProveedor() {
        return zonaProveedor;
    }

    public void setZonaProveedor(String zonaProveedor) {
        this.zonaProveedor = zonaProveedor;
    }

    public Integer getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Integer codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Boolean getSiTransformarPedido() {
        return siTransformarPedido;
    }

    public void setSiTransformarPedido(Boolean siTransformarPedido) {
        this.siTransformarPedido = siTransformarPedido;
    }

    public Integer getCodigoIVA() {
        return codigoIVA;
    }

    public void setCodigoIVA(Integer codigoIVA) {
        this.codigoIVA = codigoIVA;
    }

    public Short getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(Short estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Double getPorcenDtoPP() {
        return porcenDtoPP;
    }

    public void setPorcenDtoPP(Double porcenDtoPP) {
        this.porcenDtoPP = porcenDtoPP;
    }

    public Double getPorcenRetencionIRPF() {
        return porcenRetencionIRPF;
    }

    public void setPorcenRetencionIRPF(Double porcenRetencionIRPF) {
        this.porcenRetencionIRPF = porcenRetencionIRPF;
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

    public Boolean getEsPedidoMontaj() {
        return esPedidoMontaj;
    }

    public void setEsPedidoMontaj(Boolean esPedidoMontaj) {
        this.esPedidoMontaj = esPedidoMontaj;
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

    public boolean isEcoMobilierSometido() {
        return ecoMobilierSometido;
    }

    public void setEcoMobilierSometido(boolean ecoMobilierSometido) {
        this.ecoMobilierSometido = ecoMobilierSometido;
    }

    public boolean isEcoParticipationSometido() {
        return ecoParticipationSometido;
    }

    public void setEcoParticipationSometido(boolean ecoParticipationSometido) {
        this.ecoParticipationSometido = ecoParticipationSometido;
    }

    public boolean istFASometido() {
        return tFASometido;
    }

    public void settFASometido(boolean tFASometido) {
        this.tFASometido = tFASometido;
    }

    public boolean istVASometido() {
        return tVASometido;
    }

    public void settVASometido(boolean tVASometido) {
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
