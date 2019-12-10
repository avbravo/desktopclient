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

public class TFactura implements Serializable {

    private static final long serialVersionUID = 1L;

    
    // @Column(name = "zona_cliente")
    private String zonaCliente;
    // @Column(name = "codigo_cliente")
    private Integer codigoCliente;
    // @Column(name = "fecha_factura")

    private Date fechaFactura;
    
    // @Column(name = "forma_pago")
    private String formaPago;
    // @Column(name = "numCopiasFra")
    private Short numCopiasFra;
    // @Column(name = "estado")
    private Short estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Column(name = "total")
    private Double total;
    // @Column(name = "anticipo")
    private Double anticipo;
       
      
    // @Column(name = "empresa")
    private int empresa;
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
    
    // @Column(name = "codigoSerie")
    private String codigoSerie;
    // @Column(name = "totalBruto2")
    private Double totalBruto2;
    // @Column(name = "totalBruto3")
    private Double totalBruto3;
    // @Column(name = "totalBruto4")
    private Double totalBruto4;
    // @Column(name = "porcenIVAPortes")
    private Double porcenIVAPortes;
    // @Column(name = "idClienteVarios")
    private Integer idClienteVarios;
    // @Column(name = "idDireccionEnvio")
    private Integer idDireccionEnvio;
    // @Column(name = "idDireccionEnvioFra")
    private Integer idDireccionEnvioFra;
    // @Column(name = "idDireccionEnvioCobro")
    private Integer idDireccionEnvioCobro;
    // @Column(name = "numCopiasRecibo")
    private Short numCopiasRecibo;
    
    // @Column(name = "upsize_ts")
    private String upsizeTs;
    // @Column(name = "tipoObra")
    private Short tipoObra;
    // @Column(name = "recubel")
    private Double recubel;
    // @Column(name = "siTimbre")
    private Boolean siTimbre;
    // @Column(name = "esAnticipo")
    private Boolean esAnticipo;
    
    // @Column(name = "cuentaCobro")
    private String cuentaCobro;
    
    // @Column(name = "sucursal")
    private String sucursal;
    // @Column(name = "fechaCobro")

    private Date fechaCobro;
      
    // @Column(name = "facturaRectificada")
    private String facturaRectificada;
    
    // @Column(name = "codigoCausal")
    private String codigoCausal;
    // @Column(name = "siIVAPrimerPago")
    private Boolean siIVAPrimerPago;
    // @Column(name = "porcenDtoPP")
    private Double porcenDtoPP;
    // @Column(name = "porcenRetencionIRPF")
    private Double porcenRetencionIRPF;
    // @Column(name = "siReciboIVA")
    private Boolean siReciboIVA;
    // @Column(name = "baseImponibleRectificada")
    private Double baseImponibleRectificada;
    // @Column(name = "cuotaIVARectificada")
    private Double cuotaIVARectificada;
    // @Column(name = "fechaFacturaRectificada")

    private Date fechaFacturaRectificada;
    // @Column(name = "siImpresa")
    private Boolean siImpresa;
    // @Column(name = "siExportado")
    private Boolean siExportado;
    
    // @Column(name = "pieAdjunto")
    private String pieAdjunto;
    // @Column(name = "codigoBancoTransferencia")
    private Integer codigoBancoTransferencia;
    // @Column(name = "totalRetencionObra")
    private Double totalRetencionObra;
    // @Column(name = "siFacturaRetencion")
    private Boolean siFacturaRetencion;
    
    // @Column(name = "firmaFactura")
    private String firmaFactura;
    // @Column(name = "pendienteCobro")
    private Double pendienteCobro;
    // @Column(name = "esAnticipoObra")
    private Boolean esAnticipoObra;
    // @Column(name = "idDireccionCarga")
    private Integer idDireccionCarga;
    // @Column(name = "idDireccionDescarga")
    private Integer idDireccionDescarga;
    // @Column(name = "tipoArticulo")
    private Short tipoArticulo;
    // @Column(name = "importeUF")
    private Double importeUF;
    // @Column(name = "operador")
    private Integer operador;
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
    // @Column(name = "siEnviadoMail")
    private Boolean siEnviadoMail;
    // @Column(name = "anticipoCliente")
    private Double anticipoCliente;
    
    // @Column(name = "tipoClasificacion")
    private String tipoClasificacion;
    
    // @Column(name = "codeReglement")
    private String codeReglement;
    
    // @Column(name = "codeConditionPaiement")
    private String codeConditionPaiement;

    public TFactura() {
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

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Short getNumCopiasFra() {
        return numCopiasFra;
    }

    public void setNumCopiasFra(Short numCopiasFra) {
        this.numCopiasFra = numCopiasFra;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(Double anticipo) {
        this.anticipo = anticipo;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
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

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public Double getTotalBruto2() {
        return totalBruto2;
    }

    public void setTotalBruto2(Double totalBruto2) {
        this.totalBruto2 = totalBruto2;
    }

    public Double getTotalBruto3() {
        return totalBruto3;
    }

    public void setTotalBruto3(Double totalBruto3) {
        this.totalBruto3 = totalBruto3;
    }

    public Double getTotalBruto4() {
        return totalBruto4;
    }

    public void setTotalBruto4(Double totalBruto4) {
        this.totalBruto4 = totalBruto4;
    }

    public Double getPorcenIVAPortes() {
        return porcenIVAPortes;
    }

    public void setPorcenIVAPortes(Double porcenIVAPortes) {
        this.porcenIVAPortes = porcenIVAPortes;
    }

    public Integer getIdClienteVarios() {
        return idClienteVarios;
    }

    public void setIdClienteVarios(Integer idClienteVarios) {
        this.idClienteVarios = idClienteVarios;
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

    public Integer getIdDireccionEnvioCobro() {
        return idDireccionEnvioCobro;
    }

    public void setIdDireccionEnvioCobro(Integer idDireccionEnvioCobro) {
        this.idDireccionEnvioCobro = idDireccionEnvioCobro;
    }

    public Short getNumCopiasRecibo() {
        return numCopiasRecibo;
    }

    public void setNumCopiasRecibo(Short numCopiasRecibo) {
        this.numCopiasRecibo = numCopiasRecibo;
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

    public Boolean getEsAnticipo() {
        return esAnticipo;
    }

    public void setEsAnticipo(Boolean esAnticipo) {
        this.esAnticipo = esAnticipo;
    }

    public String getCuentaCobro() {
        return cuentaCobro;
    }

    public void setCuentaCobro(String cuentaCobro) {
        this.cuentaCobro = cuentaCobro;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public String getFacturaRectificada() {
        return facturaRectificada;
    }

    public void setFacturaRectificada(String facturaRectificada) {
        this.facturaRectificada = facturaRectificada;
    }

    public String getCodigoCausal() {
        return codigoCausal;
    }

    public void setCodigoCausal(String codigoCausal) {
        this.codigoCausal = codigoCausal;
    }

    public Boolean getSiIVAPrimerPago() {
        return siIVAPrimerPago;
    }

    public void setSiIVAPrimerPago(Boolean siIVAPrimerPago) {
        this.siIVAPrimerPago = siIVAPrimerPago;
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

    public Boolean getSiReciboIVA() {
        return siReciboIVA;
    }

    public void setSiReciboIVA(Boolean siReciboIVA) {
        this.siReciboIVA = siReciboIVA;
    }

    public Double getBaseImponibleRectificada() {
        return baseImponibleRectificada;
    }

    public void setBaseImponibleRectificada(Double baseImponibleRectificada) {
        this.baseImponibleRectificada = baseImponibleRectificada;
    }

    public Double getCuotaIVARectificada() {
        return cuotaIVARectificada;
    }

    public void setCuotaIVARectificada(Double cuotaIVARectificada) {
        this.cuotaIVARectificada = cuotaIVARectificada;
    }

    public Date getFechaFacturaRectificada() {
        return fechaFacturaRectificada;
    }

    public void setFechaFacturaRectificada(Date fechaFacturaRectificada) {
        this.fechaFacturaRectificada = fechaFacturaRectificada;
    }

    public Boolean getSiImpresa() {
        return siImpresa;
    }

    public void setSiImpresa(Boolean siImpresa) {
        this.siImpresa = siImpresa;
    }

    public Boolean getSiExportado() {
        return siExportado;
    }

    public void setSiExportado(Boolean siExportado) {
        this.siExportado = siExportado;
    }

    public String getPieAdjunto() {
        return pieAdjunto;
    }

    public void setPieAdjunto(String pieAdjunto) {
        this.pieAdjunto = pieAdjunto;
    }

    public Integer getCodigoBancoTransferencia() {
        return codigoBancoTransferencia;
    }

    public void setCodigoBancoTransferencia(Integer codigoBancoTransferencia) {
        this.codigoBancoTransferencia = codigoBancoTransferencia;
    }

    public Double getTotalRetencionObra() {
        return totalRetencionObra;
    }

    public void setTotalRetencionObra(Double totalRetencionObra) {
        this.totalRetencionObra = totalRetencionObra;
    }

    public Boolean getSiFacturaRetencion() {
        return siFacturaRetencion;
    }

    public void setSiFacturaRetencion(Boolean siFacturaRetencion) {
        this.siFacturaRetencion = siFacturaRetencion;
    }

    public String getFirmaFactura() {
        return firmaFactura;
    }

    public void setFirmaFactura(String firmaFactura) {
        this.firmaFactura = firmaFactura;
    }

    public Double getPendienteCobro() {
        return pendienteCobro;
    }

    public void setPendienteCobro(Double pendienteCobro) {
        this.pendienteCobro = pendienteCobro;
    }

    public Boolean getEsAnticipoObra() {
        return esAnticipoObra;
    }

    public void setEsAnticipoObra(Boolean esAnticipoObra) {
        this.esAnticipoObra = esAnticipoObra;
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

    public Short getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(Short tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public Double getImporteUF() {
        return importeUF;
    }

    public void setImporteUF(Double importeUF) {
        this.importeUF = importeUF;
    }

    public Integer getOperador() {
        return operador;
    }

    public void setOperador(Integer operador) {
        this.operador = operador;
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

    public Boolean getSiEnviadoMail() {
        return siEnviadoMail;
    }

    public void setSiEnviadoMail(Boolean siEnviadoMail) {
        this.siEnviadoMail = siEnviadoMail;
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
