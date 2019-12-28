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

public class TEfectosCobro implements Serializable {

    private static final long serialVersionUID = 1L;
  

    private String factura;
    
    // @Column(name = "zona")
    private String zona;
    // @Column(name = "codigo_cliente")
    private Integer codigoCliente;
    
    // @Column(name = "cta_cliente")
    private String ctaCliente;
    // @Column(name = "aceptado")
    private Short aceptado;
    // @Column(name = "banco_cliente")
    private Integer bancoCliente;
    // @Column(name = "banco")
    private Integer banco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Column(name = "importe")
    private Double importe;
    // @Column(name = "a_cuenta")
    private Double aCuenta;
    // @Column(name = "Fvto")
      
    private Date fvto;
    // @Column(name = "Fcancel")
      
    private Date fcancel;
    // @Column(name = "gtos_devolucion")
    private Double gtosDevolucion;
  
    // @Column(name = "remesa")
    private String remesa;
    // @Column(name = "status")
    private Short status;
    // @Column(name = "Femision")
      
    private Date femision;
    // @Column(name = "tipo_negociacion")
    private Short tipoNegociacion;
    // @Column(name = "moneda")
    private Integer moneda;
    // @Column(name = "Fcobro")
      
    private Date fcobro;
    
    // @Column(name = "importeTexto")
    private String importeTexto;
  
    // @Column(name = "tipo")
    private String tipo;
    // @Column(name = "cambio")
    private Double cambio;

    // @Column(name = "nombreClienteVarios")
    private String nombreClienteVarios;
    // @Column(name = "siImprimir")
    private Boolean siImprimir;
    
    // @Column(name = "zonaAgente")
    private String zonaAgente;
    // @Column(name = "codigoAgente")
    private Integer codigoAgente;

    // @Column(name = "codigoEfecto")
    private String codigoEfecto;
    
    // @Column(name = "conceptoVarios")
    private String conceptoVarios;
    // @Column(name = "importeVarios")
    private Double importeVarios;
    
    // @Column(name = "entidad")
    private String entidad;
    
    // @Column(name = "agencia")
    private String agencia;
  
    // @Column(name = "digitoControl")
    private String digitoControl;
    
    // @Column(name = "cuentaCorriente")
    private String cuentaCorriente;
    // @Column(name = "siPuedoRemesar")
    private Boolean siPuedoRemesar;
    
    // @Column(name = "codigoPedido")
    private String codigoPedido;
    // @Column(name = "numCopiasRecibo")
    private Short numCopiasRecibo;
    
    // @Column(name = "upsize_ts")
    private String upsizeTs;
    // @Column(name = "importeRemesado")
    private Double importeRemesado;
    // @Column(name = "contabilizado")
    private Short contabilizado;
    // @Column(name = "idAsiento")
    private Integer idAsiento;
    
    // @Column(name = "ABI")
    private String abi;
    
    // @Column(name = "CAB")
    private String cab;

    // @Column(name = "CIN")
    private String cin;

    // @Column(name = "CC")
    private String cc;
    // @Column(name = "idTalon")
    private Integer idTalon;
    // @Column(name = "fechaDisposicion")
      
    private Date fechaDisposicion;
    
    // @Column(name = "cuentaNegociacion")
    private String cuentaNegociacion;
    
    // @Column(name = "importeTextoMenosACuenta")
    private String importeTextoMenosACuenta;

    // @Column(name = "sucursal")
    private String sucursal;
        
    // @Column(name = "comentario")
    private String comentario;
    // @Column(name = "siRetencion")
    private Boolean siRetencion;
    // @Column(name = "siImporteEstimado")
    private Boolean siImporteEstimado;
    // @Column(name = "idCuentaPeriodica")
    private Integer idCuentaPeriodica;
    // @Column(name = "bancoDepositario")
    private Integer bancoDepositario;
    
    // @Column(name = "numeroBoleto")
    private String numeroBoleto;
    
    // @Column(name = "codigoGrupo")
    private String codigoGrupo;
  
    // @Column(name = "codigoEfectoAgrupado")
    private String codigoEfectoAgrupado;
   
    // @Column(name = "facturaAgrupacion")
    private String facturaAgrupacion;
    // @Column(name = "idEfectoAgrupado")
    private Integer idEfectoAgrupado;
    // @Column(name = "siNegociado")
    private Short siNegociado;
    
    // @Column(name = "numeroTalonFlujoCaja")
    private String numeroTalonFlujoCaja;
    // @Column(name = "idObra")
    private Integer idObra;
    // @Column(name = "importePrevisto")
    private Double importePrevisto;
    
    // @Column(name = "IBAN")
    private String iban;
    
    // @Column(name = "BIC")
    private String bic;
    // @Column(name = "codigoCobroRecibidoBanco")
    private Integer codigoCobroRecibidoBanco;
    
    // @Column(name = "codigoIncidenciasImpago")
    private String codigoIncidenciasImpago;
    // @Column(name = "dtoComercial")
    private Double dtoComercial;
    // @Column(name = "diferencia")
    private Double diferencia;
    // @Column(name = "esAnticipo")
    private Short esAnticipo;
    // @Column(name = "fechaImpago")
      
    private Date fechaImpago;
    // @Column(name = "efectoImpagoAsociado")
    private Integer efectoImpagoAsociado;
    
    // @Column(name = "codeReglement")
    private String codeReglement;
    // @Column(name = "siRemesaBancaria")
    private Boolean siRemesaBancaria;

    public TEfectosCobro() {
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCtaCliente() {
        return ctaCliente;
    }

    public void setCtaCliente(String ctaCliente) {
        this.ctaCliente = ctaCliente;
    }

    public Short getAceptado() {
        return aceptado;
    }

    public void setAceptado(Short aceptado) {
        this.aceptado = aceptado;
    }

    public Integer getBancoCliente() {
        return bancoCliente;
    }

    public void setBancoCliente(Integer bancoCliente) {
        this.bancoCliente = bancoCliente;
    }

    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getaCuenta() {
        return aCuenta;
    }

    public void setaCuenta(Double aCuenta) {
        this.aCuenta = aCuenta;
    }

    public Date getFvto() {
        return fvto;
    }

    public void setFvto(Date fvto) {
        this.fvto = fvto;
    }

    public Date getFcancel() {
        return fcancel;
    }

    public void setFcancel(Date fcancel) {
        this.fcancel = fcancel;
    }

    public Double getGtosDevolucion() {
        return gtosDevolucion;
    }

    public void setGtosDevolucion(Double gtosDevolucion) {
        this.gtosDevolucion = gtosDevolucion;
    }

    public String getRemesa() {
        return remesa;
    }

    public void setRemesa(String remesa) {
        this.remesa = remesa;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getFemision() {
        return femision;
    }

    public void setFemision(Date femision) {
        this.femision = femision;
    }

    public Short getTipoNegociacion() {
        return tipoNegociacion;
    }

    public void setTipoNegociacion(Short tipoNegociacion) {
        this.tipoNegociacion = tipoNegociacion;
    }

    public Integer getMoneda() {
        return moneda;
    }

    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }

    public Date getFcobro() {
        return fcobro;
    }

    public void setFcobro(Date fcobro) {
        this.fcobro = fcobro;
    }

    public String getImporteTexto() {
        return importeTexto;
    }

    public void setImporteTexto(String importeTexto) {
        this.importeTexto = importeTexto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }

    public String getNombreClienteVarios() {
        return nombreClienteVarios;
    }

    public void setNombreClienteVarios(String nombreClienteVarios) {
        this.nombreClienteVarios = nombreClienteVarios;
    }

    public Boolean getSiImprimir() {
        return siImprimir;
    }

    public void setSiImprimir(Boolean siImprimir) {
        this.siImprimir = siImprimir;
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

    public String getCodigoEfecto() {
        return codigoEfecto;
    }

    public void setCodigoEfecto(String codigoEfecto) {
        this.codigoEfecto = codigoEfecto;
    }

    public String getConceptoVarios() {
        return conceptoVarios;
    }

    public void setConceptoVarios(String conceptoVarios) {
        this.conceptoVarios = conceptoVarios;
    }

    public Double getImporteVarios() {
        return importeVarios;
    }

    public void setImporteVarios(Double importeVarios) {
        this.importeVarios = importeVarios;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDigitoControl() {
        return digitoControl;
    }

    public void setDigitoControl(String digitoControl) {
        this.digitoControl = digitoControl;
    }

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public Boolean getSiPuedoRemesar() {
        return siPuedoRemesar;
    }

    public void setSiPuedoRemesar(Boolean siPuedoRemesar) {
        this.siPuedoRemesar = siPuedoRemesar;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
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

    public Double getImporteRemesado() {
        return importeRemesado;
    }

    public void setImporteRemesado(Double importeRemesado) {
        this.importeRemesado = importeRemesado;
    }

    public Short getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Short contabilizado) {
        this.contabilizado = contabilizado;
    }

    public Integer getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(Integer idAsiento) {
        this.idAsiento = idAsiento;
    }

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Integer getIdTalon() {
        return idTalon;
    }

    public void setIdTalon(Integer idTalon) {
        this.idTalon = idTalon;
    }

    public Date getFechaDisposicion() {
        return fechaDisposicion;
    }

    public void setFechaDisposicion(Date fechaDisposicion) {
        this.fechaDisposicion = fechaDisposicion;
    }

    public String getCuentaNegociacion() {
        return cuentaNegociacion;
    }

    public void setCuentaNegociacion(String cuentaNegociacion) {
        this.cuentaNegociacion = cuentaNegociacion;
    }

    public String getImporteTextoMenosACuenta() {
        return importeTextoMenosACuenta;
    }

    public void setImporteTextoMenosACuenta(String importeTextoMenosACuenta) {
        this.importeTextoMenosACuenta = importeTextoMenosACuenta;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getSiRetencion() {
        return siRetencion;
    }

    public void setSiRetencion(Boolean siRetencion) {
        this.siRetencion = siRetencion;
    }

    public Boolean getSiImporteEstimado() {
        return siImporteEstimado;
    }

    public void setSiImporteEstimado(Boolean siImporteEstimado) {
        this.siImporteEstimado = siImporteEstimado;
    }

    public Integer getIdCuentaPeriodica() {
        return idCuentaPeriodica;
    }

    public void setIdCuentaPeriodica(Integer idCuentaPeriodica) {
        this.idCuentaPeriodica = idCuentaPeriodica;
    }

    public Integer getBancoDepositario() {
        return bancoDepositario;
    }

    public void setBancoDepositario(Integer bancoDepositario) {
        this.bancoDepositario = bancoDepositario;
    }

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getCodigoEfectoAgrupado() {
        return codigoEfectoAgrupado;
    }

    public void setCodigoEfectoAgrupado(String codigoEfectoAgrupado) {
        this.codigoEfectoAgrupado = codigoEfectoAgrupado;
    }

    public String getFacturaAgrupacion() {
        return facturaAgrupacion;
    }

    public void setFacturaAgrupacion(String facturaAgrupacion) {
        this.facturaAgrupacion = facturaAgrupacion;
    }

    public Integer getIdEfectoAgrupado() {
        return idEfectoAgrupado;
    }

    public void setIdEfectoAgrupado(Integer idEfectoAgrupado) {
        this.idEfectoAgrupado = idEfectoAgrupado;
    }

    public Short getSiNegociado() {
        return siNegociado;
    }

    public void setSiNegociado(Short siNegociado) {
        this.siNegociado = siNegociado;
    }

    public String getNumeroTalonFlujoCaja() {
        return numeroTalonFlujoCaja;
    }

    public void setNumeroTalonFlujoCaja(String numeroTalonFlujoCaja) {
        this.numeroTalonFlujoCaja = numeroTalonFlujoCaja;
    }

    public Integer getIdObra() {
        return idObra;
    }

    public void setIdObra(Integer idObra) {
        this.idObra = idObra;
    }

    public Double getImportePrevisto() {
        return importePrevisto;
    }

    public void setImportePrevisto(Double importePrevisto) {
        this.importePrevisto = importePrevisto;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Integer getCodigoCobroRecibidoBanco() {
        return codigoCobroRecibidoBanco;
    }

    public void setCodigoCobroRecibidoBanco(Integer codigoCobroRecibidoBanco) {
        this.codigoCobroRecibidoBanco = codigoCobroRecibidoBanco;
    }

    public String getCodigoIncidenciasImpago() {
        return codigoIncidenciasImpago;
    }

    public void setCodigoIncidenciasImpago(String codigoIncidenciasImpago) {
        this.codigoIncidenciasImpago = codigoIncidenciasImpago;
    }

    public Double getDtoComercial() {
        return dtoComercial;
    }

    public void setDtoComercial(Double dtoComercial) {
        this.dtoComercial = dtoComercial;
    }

    public Double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Double diferencia) {
        this.diferencia = diferencia;
    }

    public Short getEsAnticipo() {
        return esAnticipo;
    }

    public void setEsAnticipo(Short esAnticipo) {
        this.esAnticipo = esAnticipo;
    }

    public Date getFechaImpago() {
        return fechaImpago;
    }

    public void setFechaImpago(Date fechaImpago) {
        this.fechaImpago = fechaImpago;
    }

    public Integer getEfectoImpagoAsociado() {
        return efectoImpagoAsociado;
    }

    public void setEfectoImpagoAsociado(Integer efectoImpagoAsociado) {
        this.efectoImpagoAsociado = efectoImpagoAsociado;
    }

    public String getCodeReglement() {
        return codeReglement;
    }

    public void setCodeReglement(String codeReglement) {
        this.codeReglement = codeReglement;
    }

    public Boolean getSiRemesaBancaria() {
        return siRemesaBancaria;
    }

    public void setSiRemesaBancaria(Boolean siRemesaBancaria) {
        this.siRemesaBancaria = siRemesaBancaria;
    }

    
    
    
    
}
