/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.sql.entiry;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author avbravo
 */

public class TClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cuenta;
    private String proveedor;
    private String tipo;
    private String zona;
    private Date fechaAlta;
    private Date fechaModificacion;
    private Date fechaUltimaVenta;
    private String nombreComercial;
    private String nombreFiscal;
    private String nif;
    private String actividad;
    private String zonaAgente;
    private Integer agente;
      private Double comision;

    private String persona1;


    private String persona2;
    private String observaciones;
    private String aviso1;
    private String aviso2;

    private Short numCopiasFra;

    private Short numCopiasAlbaran;

    private Short factura;

    private Short albaran;

    private Short tarifa;

    private Short siTotal;

    private Short siDetalleFamilia;

    private Short siAgrupaPedido;

    private Short siAgrupaAlbaran;

    private Short siEntrega;

    private Short siRecargoEqui;

    private Short tipoFra;

    private Short dias;

    private String condTipo;

    private Double credito;

    private Double empleado;

    private Double dtoTipo;
  
    private Short seAplica;
   
    private String fpHabitual;
 
    private Short diaPago1;
 
    private Short diaPago2;
 
    private Double importeAutoFra;
  
    private String fpMinima;
  
    private Double importe;
   @JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date vacacionesDe;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date vacacionesA;

    private Short venceMes;

    private Double iva;

    private Integer monedaVenta;

    private String domFiscal;

    private String pobFiscal;

    private String telfsFiscal;

    private Integer entidad;

    private String agencia;

    private String cuentaCobro;
   

    private String domCobro;
  
    private String pobCobro;

    private String domEnvio;
 
    private String pobEnvio;
  
    private String telfsEnvio;
  
    private String domEnvioFra;
  
    private String pobEnvioFra;
    
  
    private String telfsEnvioFra;
    
  
    private String faxDirecciones;
  
    private Short medioTransporte;
    
  
    private String transportista;

    private Double valorPuntoPublico;

    private String digitoControlCobro;

    private String cpCobro;

    private String cpEnvio;


    private String cpEnvioFra;

    private String cpFiscal;

    private Double valorPuntoDistribuidor;

    private Double valorPuntoMayorista;
   
    private String email;

    private Double descuentoPortes;

    private Boolean siTratamiento;
    

    private String zonaAlmacenOrigen;

    private Integer codigoAlmacenOrigen;
    
   // @Column(name = "zonaAlmacenDestino")
    private String zonaAlmacenDestino;
   // @Column(name = "codigoAlmacenDestino")
    private Integer codigoAlmacenDestino;
    
   // @Column(name = "colorBruto")
    private String colorBruto;
   // @Column(name = "empleadoC")
    private Double empleadoC;
   // @Column(name = "monedaInformes")
    private Integer monedaInformes;
   // @Column(name = "tratamientoContable")
    private Short tratamientoContable;
   // @Column(name = "diaPago3")
    private Short diaPago3;
   // @Column(name = "siRappel")
    private Short siRappel;
   // @Column(name = "fechaUltimaVisita")
    // @Temporal(TemporalType.TIMESTAMP)
     @JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaUltimaVisita;

     @JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaProximaVisita;
   // @Size(max = 40)
   // @Column(name = "comentario")
    private String comentario;
   // @Column(name = "previsionAno")
    private Double previsionAno;
   // @Column(name = "SemanaEntrega")
    private Integer semanaEntrega;
    
   // @Column(name = "idioma")
    private String idioma;
   // @Column(name = "siRetencion")
    private Short siRetencion;
   // @Column(name = "porcenRetencion")
    private Double porcenRetencion;
   // @Column(name = "numCopiasPedido")
    private Short numCopiasPedido;
   // @Column(name = "numCopiasRecibo")
    private Short numCopiasRecibo;
   // @Column(name = "dtoTipo2")
    private Double dtoTipo2;
   // @Column(name = "operador")
    private Integer operador;
   // 
   // @Column(name = "idTienda")
    private String idTienda;
   // 
   // @Column(name = "upsize_ts")
    private String upsizeTs;
   // @Column(name = "tipoCliente")
    private Short tipoCliente;
   // @Column(name = "tipoConfirmacion")
    private Short tipoConfirmacion;
   // @Column(name = "siEntregaPedido")
    private Boolean siEntregaPedido;
   // @Size(max = 3)
   // @Column(name = "sucursal")
    private String sucursal;
   // @Column(name = "maxFacturacionMesC")
    private Double maxFacturacionMesC;
    
   // @Column(name = "cFiscale")
    private String cFiscale;
    
   // @Column(name = "ABI")
    private String abi;
    
   // @Column(name = "CAB")
    private String cab;
    
   // @Column(name = "CIN")
    private String cin;
   // @Size(max = 12)
   // @Column(name = "CC")
    private String cc;
   // @Column(name = "codigoIVA")
    private Integer codigoIVA;
    
   // @Column(name = "FAXFiscal")
    private String fAXFiscal;
    
   // @Column(name = "emailFiscal")
    private String emailFiscal;
    
   // @Column(name = "FAXEnvio")
    private String fAXEnvio;
    
   // @Column(name = "emailEnvio")
    private String emailEnvio;
    
   // @Column(name = "PIVAEnvio")
    private String pIVAEnvio;
    
   // @Column(name = "PIVAEnvioFra")
    private String pIVAEnvioFra;
    
   // @Column(name = "codigoVentasExt")
    private String codigoVentasExt;
   // @Size(max = 100)
   // @Column(name = "regioneSocialeEnvio")
    private String regioneSocialeEnvio;
   // @Size(max = 100)
   // @Column(name = "regioneSocialeEnvioFra")
    private String regioneSocialeEnvioFra;
   // @Column(name = "diaPagoVacaciones1")
    private Short diaPagoVacaciones1;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date vacacionesDe2;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date vacacionesA2;
   // @Column(name = "diaPagoVacaciones2")
    private Short diaPagoVacaciones2;
   // @Column(name = "porcenRetencionIRPF")
    private Double porcenRetencionIRPF;
   // @Column(name = "porcenExplotacion")
    private Double porcenExplotacion;
   // @Column(name = "porcenPublicidad")
    private Double porcenPublicidad;
   // @Column(name = "porcenFormacion")
    private Double porcenFormacion;
   // @Column(name = "porcenFranquicia")
    private Double porcenFranquicia;
    
   // @Column(name = "nombreDireccionEnvio")
    private String nombreDireccionEnvio;
   // @Column(name = "estado")
    private Short estado;
   // @Column(name = "siBloqueado")
    private Boolean siBloqueado;
 
   // @Column(name = "notas")
    private String notas;
   // @Column(name = "potencial")
    private Short potencial;
   // @Column(name = "tipoNIF")
    private Short tipoNIF;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaModificacionCobro;
   // 
   // @Column(name = "comentarioEnvio")
    private String comentarioEnvio;
   // 
   // @Column(name = "comentarioPedido")
    private String comentarioPedido;
   // 
   // @Column(name = "comentarioAlbaran")
    private String comentarioAlbaran;
   // 
   // @Column(name = "comentarioAlbaranFactura")
    private String comentarioAlbaranFactura;
   // @Column(name = "siComentarioEnAlbaran")
    private Boolean siComentarioEnAlbaran;
   // @Column(name = "siComentarioEnFactura")
    private Boolean siComentarioEnFactura;
    
   // @Column(name = "nombreDireccionEnvioFra")
    private String nombreDireccionEnvioFra;
   // @Size(max = 100)
   // @Column(name = "paginaWeb")
    private String paginaWeb;
    
   // @Column(name = "emailPrincipal")
    private String emailPrincipal;
    
   // @Column(name = "IBAN")
    private String iban;
    
   // @Column(name = "BIC")
    private String bic;
    
   // @Column(name = "incoterms")
    private String incoterms;
    
   // @Column(name = "domTienda")
    private String domTienda;
   // 
   // @Column(name = "pobTienda")
    private String pobTienda;
   // 
   // @Column(name = "CPTienda")
    private String cPTienda;
    
   // @Column(name = "telefonoTienda")
    private String telefonoTienda;
    
   // @Column(name = "faxTienda")
    private String faxTienda;
    
   // @Column(name = "emailTienda")
    private String emailTienda;
   // 
   // @Column(name = "informatica")
    private String informatica;
    
   // @Column(name = "origenMercancia")
    private String origenMercancia;
    
   // @Column(name = "cuentaNegociacion")
    private String cuentaNegociacion;
    
   // @Column(name = "codigoSerie")
    private String codigoSerie;
    
   // @Column(name = "areaTerritorial")
    private String areaTerritorial;
    
   // @Column(name = "tipoGrupoCliente")
    private String tipoGrupoCliente;
    
   // @Column(name = "tipoCentro")
    private String tipoCentro;
    
   // @Column(name = "grupoCliente")
    private String grupoCliente;
    
   // @Column(name = "tipoPortes")
    private String tipoPortes;
   
    private Boolean siActivo;
       private Integer montaje;
    
   // @Column(name = "grupo")
    private String grupo;
   // @Column(name = "porcenCargoMontaje")
    private Double porcenCargoMontaje;
   // @Column(name = "cargoMinimoMontaje")
    private Double cargoMinimoMontaje;
    
   // @Column(name = "nombreDireccionMontaje")
    private String nombreDireccionMontaje;
    
   // @Column(name = "domMontaje")
    private String domMontaje;
   // 
   // @Column(name = "pobMontaje")
    private String pobMontaje;
   // 
   // @Column(name = "CPMontaje")
    private String cPMontaje;
    
   // @Column(name = "telefonoMontaje")
    private String telefonoMontaje;
    
   // @Column(name = "faxMontaje")
    private String faxMontaje;
    
   // @Column(name = "emailMontaje")
    private String emailMontaje;
   // 
   // @Column(name = "codigoProveedorCESCE")
    private String codigoProveedorCESCE;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaAdmisionCESCE;
   // @Column(name = "riesgoPropioCESCE")
    private Boolean riesgoPropioCESCE;
    
   // @Column(name = "pathDocRecibida")
    private String pathDocRecibida;
    
   // @Column(name = "pathDocEnviada")
    private String pathDocEnviada;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaVencimientoCESCE;
  
    private String delegacion;
   // @Column(name = "diaFacturacion")
    private Short diaFacturacion;
   // @Column(name = "tipoFacturaOriginal")
    private Short tipoFacturaOriginal;
   // @Column(name = "tipoFotocopia")
    private Short tipoFotocopia;
    
   // @Column(name = "formaPagoB")
    private String formaPagoB;
   // @Column(name = "siDtoPorTramo")
    private Boolean siDtoPorTramo;
   // 
   // @Column(name = "codigoTramoFacturacion")
    private String codigoTramoFacturacion;
   // @Column(name = "rutaCobro")
    private Integer rutaCobro;
    
   // @Column(name = "agrupacionCliente")
    private String agrupacionCliente;
    
   // @Column(name = "codigoRangosPuntos")
    private String codigoRangosPuntos;
   // @Column(name = "idTeoWeb")
    private Integer idTeoWeb;
   // @Column(name = "importeMinimoPortes")
    private Double importeMinimoPortes;
   // @Column(name = "importePortes")
    private Double importePortes;
   // @Column(name = "importeFijoCliente")
    private Double importeFijoCliente;
    
   // @Column(name = "centroAdministrativo1")
    private String centroAdministrativo1;
    
   // @Column(name = "centroAdministrativo2")
    private String centroAdministrativo2;
    
   // @Column(name = "centroAdministrativo3")
    private String centroAdministrativo3;
    
   // @Column(name = "emailConfirmacion")
    private String emailConfirmacion;

    private boolean ecoMobilierSometido;
 
    private boolean ecoParticipationSometido;
   
    private boolean tFASometido;
   
    private boolean tVASometido;
  
    private String codigoPorte;

    private Double importeMinimoFranco;
   
    private String ensena;
  
    private String clienteEstatus;
    
   // @Column(name = "clienteEstado")
    private String clienteEstado;
   // @Column(name = "siAgrupaFactura")
    private Short siAgrupaFactura;
   // @Column(name = "periodicidad")
    private Short periodicidad;
   // @Column(name = "clienteNoName")
    private Boolean clienteNoName;
   // 
   // @Column(name = "numMiembro")
    private String numMiembro;
    
   // @Column(name = "NIFIntracomunitario")
    private String nIFIntracomunitario;
    
   // @Column(name = "codigoAccesoExtranet")
    private String codigoAccesoExtranet;
    
   // @Column(name = "contrasenaExtranet")
    private String contrasenaExtranet;
   // @Column(name = "siAltitud")
    private Boolean siAltitud;
   // @Column(name = "siCentoCiudad")
    private Boolean siCentoCiudad;
   // @Column(name = "siPasajeBarco")
    private Boolean siPasajeBarco;
   // @Column(name = "siEntregaParticular")
    private Boolean siEntregaParticular;
    
   // @Column(name = "zonaClienteGrupo")
    private String zonaClienteGrupo;
   // @Column(name = "codigoClienteGrupo")
    private Integer codigoClienteGrupo;
    
   // @Column(name = "zonaClientePagador")
    private String zonaClientePagador;
   // @Column(name = "codigoClientePagador")
    private Integer codigoClientePagador;
   // @Column(name = "siAperturaTiendaLunes")
    private Boolean siAperturaTiendaLunes;
   // @Column(name = "siAperturaTiendaMartes")
    private Boolean siAperturaTiendaMartes;
   // @Column(name = "siAperturaTiendaMiercoles")
    private Boolean siAperturaTiendaMiercoles;
   // @Column(name = "siAperturaTiendaJueves")
    private Boolean siAperturaTiendaJueves;
   // @Column(name = "siAperturaTiendaViernes")
    private Boolean siAperturaTiendaViernes;
   // @Column(name = "siTaller")
    private Boolean siTaller;
   // @Column(name = "siInstalacionIntegrada")
    private Boolean siInstalacionIntegrada;
   // @Column(name = "superficieShowroom")
    private Integer superficieShowroom;
   // @Column(name = "cantidadExpoShowroom")
    private Integer cantidadExpoShowroom;
@JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaCreacionTienda;
    
   
    private String aplicacionDisVal;
   
    private Integer cestaMedia;

    private Integer ventasPotenciales;
     @JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaVencimientoFrancia;
        @JsonFormat(pattern="yyyy-MM-dd’T’HH:mm:ss.SSSZ")
    private Date fechaAdmisionFrancia;

    private Double creditoExterno;
    private String cPGeolocalTienda;

    private Integer tratamientoContableYou;
    private String observacionesEnvio;
    private String reglementHabitual;
    private String reglementMinima;
    private String condicionesPagoHabitual;
    private String condicionesPagoMinima;
    private String codigoCotaExterna;
    private String telefonoMovilEnvio;
    private String codDescripcionDTO1;
    private String codDescripcionDTO2;

    private String exclusividad;

    public TClientes() {
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    
    
    
    
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Date getFechaUltimaVenta() {
        return fechaUltimaVenta;
    }

    public void setFechaUltimaVenta(Date fechaUltimaVenta) {
        this.fechaUltimaVenta = fechaUltimaVenta;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreFiscal() {
        return nombreFiscal;
    }

    public void setNombreFiscal(String nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getZonaAgente() {
        return zonaAgente;
    }

    public void setZonaAgente(String zonaAgente) {
        this.zonaAgente = zonaAgente;
    }

    public Integer getAgente() {
        return agente;
    }

    public void setAgente(Integer agente) {
        this.agente = agente;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public String getPersona1() {
        return persona1;
    }

    public void setPersona1(String persona1) {
        this.persona1 = persona1;
    }

    public String getPersona2() {
        return persona2;
    }

    public void setPersona2(String persona2) {
        this.persona2 = persona2;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAviso1() {
        return aviso1;
    }

    public void setAviso1(String aviso1) {
        this.aviso1 = aviso1;
    }

    public String getAviso2() {
        return aviso2;
    }

    public void setAviso2(String aviso2) {
        this.aviso2 = aviso2;
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

    public Short getFactura() {
        return factura;
    }

    public void setFactura(Short factura) {
        this.factura = factura;
    }

    public Short getAlbaran() {
        return albaran;
    }

    public void setAlbaran(Short albaran) {
        this.albaran = albaran;
    }

    public Short getTarifa() {
        return tarifa;
    }

    public void setTarifa(Short tarifa) {
        this.tarifa = tarifa;
    }

    public Short getSiTotal() {
        return siTotal;
    }

    public void setSiTotal(Short siTotal) {
        this.siTotal = siTotal;
    }

    public Short getSiDetalleFamilia() {
        return siDetalleFamilia;
    }

    public void setSiDetalleFamilia(Short siDetalleFamilia) {
        this.siDetalleFamilia = siDetalleFamilia;
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

    public Short getTipoFra() {
        return tipoFra;
    }

    public void setTipoFra(Short tipoFra) {
        this.tipoFra = tipoFra;
    }

    public Short getDias() {
        return dias;
    }

    public void setDias(Short dias) {
        this.dias = dias;
    }

    public String getCondTipo() {
        return condTipo;
    }

    public void setCondTipo(String condTipo) {
        this.condTipo = condTipo;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Double getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Double empleado) {
        this.empleado = empleado;
    }

    public Double getDtoTipo() {
        return dtoTipo;
    }

    public void setDtoTipo(Double dtoTipo) {
        this.dtoTipo = dtoTipo;
    }

    public Short getSeAplica() {
        return seAplica;
    }

    public void setSeAplica(Short seAplica) {
        this.seAplica = seAplica;
    }

    public String getFpHabitual() {
        return fpHabitual;
    }

    public void setFpHabitual(String fpHabitual) {
        this.fpHabitual = fpHabitual;
    }

    public Short getDiaPago1() {
        return diaPago1;
    }

    public void setDiaPago1(Short diaPago1) {
        this.diaPago1 = diaPago1;
    }

    public Short getDiaPago2() {
        return diaPago2;
    }

    public void setDiaPago2(Short diaPago2) {
        this.diaPago2 = diaPago2;
    }

    public Double getImporteAutoFra() {
        return importeAutoFra;
    }

    public void setImporteAutoFra(Double importeAutoFra) {
        this.importeAutoFra = importeAutoFra;
    }

    public String getFpMinima() {
        return fpMinima;
    }

    public void setFpMinima(String fpMinima) {
        this.fpMinima = fpMinima;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Date getVacacionesDe() {
        return vacacionesDe;
    }

    public void setVacacionesDe(Date vacacionesDe) {
        this.vacacionesDe = vacacionesDe;
    }

    public Date getVacacionesA() {
        return vacacionesA;
    }

    public void setVacacionesA(Date vacacionesA) {
        this.vacacionesA = vacacionesA;
    }

    public Short getVenceMes() {
        return venceMes;
    }

    public void setVenceMes(Short venceMes) {
        this.venceMes = venceMes;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Integer getMonedaVenta() {
        return monedaVenta;
    }

    public void setMonedaVenta(Integer monedaVenta) {
        this.monedaVenta = monedaVenta;
    }

    public String getDomFiscal() {
        return domFiscal;
    }

    public void setDomFiscal(String domFiscal) {
        this.domFiscal = domFiscal;
    }

    public String getPobFiscal() {
        return pobFiscal;
    }

    public void setPobFiscal(String pobFiscal) {
        this.pobFiscal = pobFiscal;
    }

    public String getTelfsFiscal() {
        return telfsFiscal;
    }

    public void setTelfsFiscal(String telfsFiscal) {
        this.telfsFiscal = telfsFiscal;
    }

    public Integer getEntidad() {
        return entidad;
    }

    public void setEntidad(Integer entidad) {
        this.entidad = entidad;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCuentaCobro() {
        return cuentaCobro;
    }

    public void setCuentaCobro(String cuentaCobro) {
        this.cuentaCobro = cuentaCobro;
    }

    public String getDomCobro() {
        return domCobro;
    }

    public void setDomCobro(String domCobro) {
        this.domCobro = domCobro;
    }

    public String getPobCobro() {
        return pobCobro;
    }

    public void setPobCobro(String pobCobro) {
        this.pobCobro = pobCobro;
    }

    public String getDomEnvio() {
        return domEnvio;
    }

    public void setDomEnvio(String domEnvio) {
        this.domEnvio = domEnvio;
    }

    public String getPobEnvio() {
        return pobEnvio;
    }

    public void setPobEnvio(String pobEnvio) {
        this.pobEnvio = pobEnvio;
    }

    public String getTelfsEnvio() {
        return telfsEnvio;
    }

    public void setTelfsEnvio(String telfsEnvio) {
        this.telfsEnvio = telfsEnvio;
    }

    public String getDomEnvioFra() {
        return domEnvioFra;
    }

    public void setDomEnvioFra(String domEnvioFra) {
        this.domEnvioFra = domEnvioFra;
    }

    public String getPobEnvioFra() {
        return pobEnvioFra;
    }

    public void setPobEnvioFra(String pobEnvioFra) {
        this.pobEnvioFra = pobEnvioFra;
    }

    public String getTelfsEnvioFra() {
        return telfsEnvioFra;
    }

    public void setTelfsEnvioFra(String telfsEnvioFra) {
        this.telfsEnvioFra = telfsEnvioFra;
    }

    public String getFaxDirecciones() {
        return faxDirecciones;
    }

    public void setFaxDirecciones(String faxDirecciones) {
        this.faxDirecciones = faxDirecciones;
    }

    public Short getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(Short medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public Double getValorPuntoPublico() {
        return valorPuntoPublico;
    }

    public void setValorPuntoPublico(Double valorPuntoPublico) {
        this.valorPuntoPublico = valorPuntoPublico;
    }

    public String getDigitoControlCobro() {
        return digitoControlCobro;
    }

    public void setDigitoControlCobro(String digitoControlCobro) {
        this.digitoControlCobro = digitoControlCobro;
    }

    public String getCpCobro() {
        return cpCobro;
    }

    public void setCpCobro(String cpCobro) {
        this.cpCobro = cpCobro;
    }

    public String getCpEnvio() {
        return cpEnvio;
    }

    public void setCpEnvio(String cpEnvio) {
        this.cpEnvio = cpEnvio;
    }

    public String getCpEnvioFra() {
        return cpEnvioFra;
    }

    public void setCpEnvioFra(String cpEnvioFra) {
        this.cpEnvioFra = cpEnvioFra;
    }

    public String getCpFiscal() {
        return cpFiscal;
    }

    public void setCpFiscal(String cpFiscal) {
        this.cpFiscal = cpFiscal;
    }

    public Double getValorPuntoDistribuidor() {
        return valorPuntoDistribuidor;
    }

    public void setValorPuntoDistribuidor(Double valorPuntoDistribuidor) {
        this.valorPuntoDistribuidor = valorPuntoDistribuidor;
    }

    public Double getValorPuntoMayorista() {
        return valorPuntoMayorista;
    }

    public void setValorPuntoMayorista(Double valorPuntoMayorista) {
        this.valorPuntoMayorista = valorPuntoMayorista;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getDescuentoPortes() {
        return descuentoPortes;
    }

    public void setDescuentoPortes(Double descuentoPortes) {
        this.descuentoPortes = descuentoPortes;
    }

    public Boolean getSiTratamiento() {
        return siTratamiento;
    }

    public void setSiTratamiento(Boolean siTratamiento) {
        this.siTratamiento = siTratamiento;
    }

    public String getZonaAlmacenOrigen() {
        return zonaAlmacenOrigen;
    }

    public void setZonaAlmacenOrigen(String zonaAlmacenOrigen) {
        this.zonaAlmacenOrigen = zonaAlmacenOrigen;
    }

    public Integer getCodigoAlmacenOrigen() {
        return codigoAlmacenOrigen;
    }

    public void setCodigoAlmacenOrigen(Integer codigoAlmacenOrigen) {
        this.codigoAlmacenOrigen = codigoAlmacenOrigen;
    }

    public String getZonaAlmacenDestino() {
        return zonaAlmacenDestino;
    }

    public void setZonaAlmacenDestino(String zonaAlmacenDestino) {
        this.zonaAlmacenDestino = zonaAlmacenDestino;
    }

    public Integer getCodigoAlmacenDestino() {
        return codigoAlmacenDestino;
    }

    public void setCodigoAlmacenDestino(Integer codigoAlmacenDestino) {
        this.codigoAlmacenDestino = codigoAlmacenDestino;
    }

    public String getColorBruto() {
        return colorBruto;
    }

    public void setColorBruto(String colorBruto) {
        this.colorBruto = colorBruto;
    }

    public Double getEmpleadoC() {
        return empleadoC;
    }

    public void setEmpleadoC(Double empleadoC) {
        this.empleadoC = empleadoC;
    }

    public Integer getMonedaInformes() {
        return monedaInformes;
    }

    public void setMonedaInformes(Integer monedaInformes) {
        this.monedaInformes = monedaInformes;
    }

    public Short getTratamientoContable() {
        return tratamientoContable;
    }

    public void setTratamientoContable(Short tratamientoContable) {
        this.tratamientoContable = tratamientoContable;
    }

    public Short getDiaPago3() {
        return diaPago3;
    }

    public void setDiaPago3(Short diaPago3) {
        this.diaPago3 = diaPago3;
    }

    public Short getSiRappel() {
        return siRappel;
    }

    public void setSiRappel(Short siRappel) {
        this.siRappel = siRappel;
    }

    public Date getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(Date fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    public Date getFechaProximaVisita() {
        return fechaProximaVisita;
    }

    public void setFechaProximaVisita(Date fechaProximaVisita) {
        this.fechaProximaVisita = fechaProximaVisita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Double getPrevisionAno() {
        return previsionAno;
    }

    public void setPrevisionAno(Double previsionAno) {
        this.previsionAno = previsionAno;
    }

    public Integer getSemanaEntrega() {
        return semanaEntrega;
    }

    public void setSemanaEntrega(Integer semanaEntrega) {
        this.semanaEntrega = semanaEntrega;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Short getSiRetencion() {
        return siRetencion;
    }

    public void setSiRetencion(Short siRetencion) {
        this.siRetencion = siRetencion;
    }

    public Double getPorcenRetencion() {
        return porcenRetencion;
    }

    public void setPorcenRetencion(Double porcenRetencion) {
        this.porcenRetencion = porcenRetencion;
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

    public Double getDtoTipo2() {
        return dtoTipo2;
    }

    public void setDtoTipo2(Double dtoTipo2) {
        this.dtoTipo2 = dtoTipo2;
    }

    public Integer getOperador() {
        return operador;
    }

    public void setOperador(Integer operador) {
        this.operador = operador;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getUpsizeTs() {
        return upsizeTs;
    }

    public void setUpsizeTs(String upsizeTs) {
        this.upsizeTs = upsizeTs;
    }

    public Short getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Short tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Short getTipoConfirmacion() {
        return tipoConfirmacion;
    }

    public void setTipoConfirmacion(Short tipoConfirmacion) {
        this.tipoConfirmacion = tipoConfirmacion;
    }

    public Boolean getSiEntregaPedido() {
        return siEntregaPedido;
    }

    public void setSiEntregaPedido(Boolean siEntregaPedido) {
        this.siEntregaPedido = siEntregaPedido;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Double getMaxFacturacionMesC() {
        return maxFacturacionMesC;
    }

    public void setMaxFacturacionMesC(Double maxFacturacionMesC) {
        this.maxFacturacionMesC = maxFacturacionMesC;
    }

    public String getcFiscale() {
        return cFiscale;
    }

    public void setcFiscale(String cFiscale) {
        this.cFiscale = cFiscale;
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

    public Integer getCodigoIVA() {
        return codigoIVA;
    }

    public void setCodigoIVA(Integer codigoIVA) {
        this.codigoIVA = codigoIVA;
    }

    public String getfAXFiscal() {
        return fAXFiscal;
    }

    public void setfAXFiscal(String fAXFiscal) {
        this.fAXFiscal = fAXFiscal;
    }

    public String getEmailFiscal() {
        return emailFiscal;
    }

    public void setEmailFiscal(String emailFiscal) {
        this.emailFiscal = emailFiscal;
    }

    public String getfAXEnvio() {
        return fAXEnvio;
    }

    public void setfAXEnvio(String fAXEnvio) {
        this.fAXEnvio = fAXEnvio;
    }

    public String getEmailEnvio() {
        return emailEnvio;
    }

    public void setEmailEnvio(String emailEnvio) {
        this.emailEnvio = emailEnvio;
    }

    public String getpIVAEnvio() {
        return pIVAEnvio;
    }

    public void setpIVAEnvio(String pIVAEnvio) {
        this.pIVAEnvio = pIVAEnvio;
    }

    public String getpIVAEnvioFra() {
        return pIVAEnvioFra;
    }

    public void setpIVAEnvioFra(String pIVAEnvioFra) {
        this.pIVAEnvioFra = pIVAEnvioFra;
    }

    public String getCodigoVentasExt() {
        return codigoVentasExt;
    }

    public void setCodigoVentasExt(String codigoVentasExt) {
        this.codigoVentasExt = codigoVentasExt;
    }

    public String getRegioneSocialeEnvio() {
        return regioneSocialeEnvio;
    }

    public void setRegioneSocialeEnvio(String regioneSocialeEnvio) {
        this.regioneSocialeEnvio = regioneSocialeEnvio;
    }

    public String getRegioneSocialeEnvioFra() {
        return regioneSocialeEnvioFra;
    }

    public void setRegioneSocialeEnvioFra(String regioneSocialeEnvioFra) {
        this.regioneSocialeEnvioFra = regioneSocialeEnvioFra;
    }

    public Short getDiaPagoVacaciones1() {
        return diaPagoVacaciones1;
    }

    public void setDiaPagoVacaciones1(Short diaPagoVacaciones1) {
        this.diaPagoVacaciones1 = diaPagoVacaciones1;
    }

    public Date getVacacionesDe2() {
        return vacacionesDe2;
    }

    public void setVacacionesDe2(Date vacacionesDe2) {
        this.vacacionesDe2 = vacacionesDe2;
    }

    public Date getVacacionesA2() {
        return vacacionesA2;
    }

    public void setVacacionesA2(Date vacacionesA2) {
        this.vacacionesA2 = vacacionesA2;
    }

    public Short getDiaPagoVacaciones2() {
        return diaPagoVacaciones2;
    }

    public void setDiaPagoVacaciones2(Short diaPagoVacaciones2) {
        this.diaPagoVacaciones2 = diaPagoVacaciones2;
    }

    public Double getPorcenRetencionIRPF() {
        return porcenRetencionIRPF;
    }

    public void setPorcenRetencionIRPF(Double porcenRetencionIRPF) {
        this.porcenRetencionIRPF = porcenRetencionIRPF;
    }

    public Double getPorcenExplotacion() {
        return porcenExplotacion;
    }

    public void setPorcenExplotacion(Double porcenExplotacion) {
        this.porcenExplotacion = porcenExplotacion;
    }

    public Double getPorcenPublicidad() {
        return porcenPublicidad;
    }

    public void setPorcenPublicidad(Double porcenPublicidad) {
        this.porcenPublicidad = porcenPublicidad;
    }

    public Double getPorcenFormacion() {
        return porcenFormacion;
    }

    public void setPorcenFormacion(Double porcenFormacion) {
        this.porcenFormacion = porcenFormacion;
    }

    public Double getPorcenFranquicia() {
        return porcenFranquicia;
    }

    public void setPorcenFranquicia(Double porcenFranquicia) {
        this.porcenFranquicia = porcenFranquicia;
    }

    public String getNombreDireccionEnvio() {
        return nombreDireccionEnvio;
    }

    public void setNombreDireccionEnvio(String nombreDireccionEnvio) {
        this.nombreDireccionEnvio = nombreDireccionEnvio;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Boolean getSiBloqueado() {
        return siBloqueado;
    }

    public void setSiBloqueado(Boolean siBloqueado) {
        this.siBloqueado = siBloqueado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Short getPotencial() {
        return potencial;
    }

    public void setPotencial(Short potencial) {
        this.potencial = potencial;
    }

    public Short getTipoNIF() {
        return tipoNIF;
    }

    public void setTipoNIF(Short tipoNIF) {
        this.tipoNIF = tipoNIF;
    }

    public Date getFechaModificacionCobro() {
        return fechaModificacionCobro;
    }

    public void setFechaModificacionCobro(Date fechaModificacionCobro) {
        this.fechaModificacionCobro = fechaModificacionCobro;
    }

    public String getComentarioEnvio() {
        return comentarioEnvio;
    }

    public void setComentarioEnvio(String comentarioEnvio) {
        this.comentarioEnvio = comentarioEnvio;
    }

    public String getComentarioPedido() {
        return comentarioPedido;
    }

    public void setComentarioPedido(String comentarioPedido) {
        this.comentarioPedido = comentarioPedido;
    }

    public String getComentarioAlbaran() {
        return comentarioAlbaran;
    }

    public void setComentarioAlbaran(String comentarioAlbaran) {
        this.comentarioAlbaran = comentarioAlbaran;
    }

    public String getComentarioAlbaranFactura() {
        return comentarioAlbaranFactura;
    }

    public void setComentarioAlbaranFactura(String comentarioAlbaranFactura) {
        this.comentarioAlbaranFactura = comentarioAlbaranFactura;
    }

    public Boolean getSiComentarioEnAlbaran() {
        return siComentarioEnAlbaran;
    }

    public void setSiComentarioEnAlbaran(Boolean siComentarioEnAlbaran) {
        this.siComentarioEnAlbaran = siComentarioEnAlbaran;
    }

    public Boolean getSiComentarioEnFactura() {
        return siComentarioEnFactura;
    }

    public void setSiComentarioEnFactura(Boolean siComentarioEnFactura) {
        this.siComentarioEnFactura = siComentarioEnFactura;
    }

    public String getNombreDireccionEnvioFra() {
        return nombreDireccionEnvioFra;
    }

    public void setNombreDireccionEnvioFra(String nombreDireccionEnvioFra) {
        this.nombreDireccionEnvioFra = nombreDireccionEnvioFra;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getEmailPrincipal() {
        return emailPrincipal;
    }

    public void setEmailPrincipal(String emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
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

    public String getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(String incoterms) {
        this.incoterms = incoterms;
    }

    public String getDomTienda() {
        return domTienda;
    }

    public void setDomTienda(String domTienda) {
        this.domTienda = domTienda;
    }

    public String getPobTienda() {
        return pobTienda;
    }

    public void setPobTienda(String pobTienda) {
        this.pobTienda = pobTienda;
    }

    public String getcPTienda() {
        return cPTienda;
    }

    public void setcPTienda(String cPTienda) {
        this.cPTienda = cPTienda;
    }

    public String getTelefonoTienda() {
        return telefonoTienda;
    }

    public void setTelefonoTienda(String telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }

    public String getFaxTienda() {
        return faxTienda;
    }

    public void setFaxTienda(String faxTienda) {
        this.faxTienda = faxTienda;
    }

    public String getEmailTienda() {
        return emailTienda;
    }

    public void setEmailTienda(String emailTienda) {
        this.emailTienda = emailTienda;
    }

    public String getInformatica() {
        return informatica;
    }

    public void setInformatica(String informatica) {
        this.informatica = informatica;
    }

    public String getOrigenMercancia() {
        return origenMercancia;
    }

    public void setOrigenMercancia(String origenMercancia) {
        this.origenMercancia = origenMercancia;
    }

    public String getCuentaNegociacion() {
        return cuentaNegociacion;
    }

    public void setCuentaNegociacion(String cuentaNegociacion) {
        this.cuentaNegociacion = cuentaNegociacion;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public String getAreaTerritorial() {
        return areaTerritorial;
    }

    public void setAreaTerritorial(String areaTerritorial) {
        this.areaTerritorial = areaTerritorial;
    }

    public String getTipoGrupoCliente() {
        return tipoGrupoCliente;
    }

    public void setTipoGrupoCliente(String tipoGrupoCliente) {
        this.tipoGrupoCliente = tipoGrupoCliente;
    }

    public String getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(String tipoCentro) {
        this.tipoCentro = tipoCentro;
    }

    public String getGrupoCliente() {
        return grupoCliente;
    }

    public void setGrupoCliente(String grupoCliente) {
        this.grupoCliente = grupoCliente;
    }

    public String getTipoPortes() {
        return tipoPortes;
    }

    public void setTipoPortes(String tipoPortes) {
        this.tipoPortes = tipoPortes;
    }

    public Boolean getSiActivo() {
        return siActivo;
    }

    public void setSiActivo(Boolean siActivo) {
        this.siActivo = siActivo;
    }

    public Integer getMontaje() {
        return montaje;
    }

    public void setMontaje(Integer montaje) {
        this.montaje = montaje;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Double getPorcenCargoMontaje() {
        return porcenCargoMontaje;
    }

    public void setPorcenCargoMontaje(Double porcenCargoMontaje) {
        this.porcenCargoMontaje = porcenCargoMontaje;
    }

    public Double getCargoMinimoMontaje() {
        return cargoMinimoMontaje;
    }

    public void setCargoMinimoMontaje(Double cargoMinimoMontaje) {
        this.cargoMinimoMontaje = cargoMinimoMontaje;
    }

    public String getNombreDireccionMontaje() {
        return nombreDireccionMontaje;
    }

    public void setNombreDireccionMontaje(String nombreDireccionMontaje) {
        this.nombreDireccionMontaje = nombreDireccionMontaje;
    }

    public String getDomMontaje() {
        return domMontaje;
    }

    public void setDomMontaje(String domMontaje) {
        this.domMontaje = domMontaje;
    }

    public String getPobMontaje() {
        return pobMontaje;
    }

    public void setPobMontaje(String pobMontaje) {
        this.pobMontaje = pobMontaje;
    }

    public String getcPMontaje() {
        return cPMontaje;
    }

    public void setcPMontaje(String cPMontaje) {
        this.cPMontaje = cPMontaje;
    }

    public String getTelefonoMontaje() {
        return telefonoMontaje;
    }

    public void setTelefonoMontaje(String telefonoMontaje) {
        this.telefonoMontaje = telefonoMontaje;
    }

    public String getFaxMontaje() {
        return faxMontaje;
    }

    public void setFaxMontaje(String faxMontaje) {
        this.faxMontaje = faxMontaje;
    }

    public String getEmailMontaje() {
        return emailMontaje;
    }

    public void setEmailMontaje(String emailMontaje) {
        this.emailMontaje = emailMontaje;
    }

    public String getCodigoProveedorCESCE() {
        return codigoProveedorCESCE;
    }

    public void setCodigoProveedorCESCE(String codigoProveedorCESCE) {
        this.codigoProveedorCESCE = codigoProveedorCESCE;
    }

    public Date getFechaAdmisionCESCE() {
        return fechaAdmisionCESCE;
    }

    public void setFechaAdmisionCESCE(Date fechaAdmisionCESCE) {
        this.fechaAdmisionCESCE = fechaAdmisionCESCE;
    }

    public Boolean getRiesgoPropioCESCE() {
        return riesgoPropioCESCE;
    }

    public void setRiesgoPropioCESCE(Boolean riesgoPropioCESCE) {
        this.riesgoPropioCESCE = riesgoPropioCESCE;
    }

    public String getPathDocRecibida() {
        return pathDocRecibida;
    }

    public void setPathDocRecibida(String pathDocRecibida) {
        this.pathDocRecibida = pathDocRecibida;
    }

    public String getPathDocEnviada() {
        return pathDocEnviada;
    }

    public void setPathDocEnviada(String pathDocEnviada) {
        this.pathDocEnviada = pathDocEnviada;
    }

    public Date getFechaVencimientoCESCE() {
        return fechaVencimientoCESCE;
    }

    public void setFechaVencimientoCESCE(Date fechaVencimientoCESCE) {
        this.fechaVencimientoCESCE = fechaVencimientoCESCE;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public Short getDiaFacturacion() {
        return diaFacturacion;
    }

    public void setDiaFacturacion(Short diaFacturacion) {
        this.diaFacturacion = diaFacturacion;
    }

    public Short getTipoFacturaOriginal() {
        return tipoFacturaOriginal;
    }

    public void setTipoFacturaOriginal(Short tipoFacturaOriginal) {
        this.tipoFacturaOriginal = tipoFacturaOriginal;
    }

    public Short getTipoFotocopia() {
        return tipoFotocopia;
    }

    public void setTipoFotocopia(Short tipoFotocopia) {
        this.tipoFotocopia = tipoFotocopia;
    }

    public String getFormaPagoB() {
        return formaPagoB;
    }

    public void setFormaPagoB(String formaPagoB) {
        this.formaPagoB = formaPagoB;
    }

    public Boolean getSiDtoPorTramo() {
        return siDtoPorTramo;
    }

    public void setSiDtoPorTramo(Boolean siDtoPorTramo) {
        this.siDtoPorTramo = siDtoPorTramo;
    }

    public String getCodigoTramoFacturacion() {
        return codigoTramoFacturacion;
    }

    public void setCodigoTramoFacturacion(String codigoTramoFacturacion) {
        this.codigoTramoFacturacion = codigoTramoFacturacion;
    }

    public Integer getRutaCobro() {
        return rutaCobro;
    }

    public void setRutaCobro(Integer rutaCobro) {
        this.rutaCobro = rutaCobro;
    }

    public String getAgrupacionCliente() {
        return agrupacionCliente;
    }

    public void setAgrupacionCliente(String agrupacionCliente) {
        this.agrupacionCliente = agrupacionCliente;
    }

    public String getCodigoRangosPuntos() {
        return codigoRangosPuntos;
    }

    public void setCodigoRangosPuntos(String codigoRangosPuntos) {
        this.codigoRangosPuntos = codigoRangosPuntos;
    }

    public Integer getIdTeoWeb() {
        return idTeoWeb;
    }

    public void setIdTeoWeb(Integer idTeoWeb) {
        this.idTeoWeb = idTeoWeb;
    }

    public Double getImporteMinimoPortes() {
        return importeMinimoPortes;
    }

    public void setImporteMinimoPortes(Double importeMinimoPortes) {
        this.importeMinimoPortes = importeMinimoPortes;
    }

    public Double getImportePortes() {
        return importePortes;
    }

    public void setImportePortes(Double importePortes) {
        this.importePortes = importePortes;
    }

    public Double getImporteFijoCliente() {
        return importeFijoCliente;
    }

    public void setImporteFijoCliente(Double importeFijoCliente) {
        this.importeFijoCliente = importeFijoCliente;
    }

    public String getCentroAdministrativo1() {
        return centroAdministrativo1;
    }

    public void setCentroAdministrativo1(String centroAdministrativo1) {
        this.centroAdministrativo1 = centroAdministrativo1;
    }

    public String getCentroAdministrativo2() {
        return centroAdministrativo2;
    }

    public void setCentroAdministrativo2(String centroAdministrativo2) {
        this.centroAdministrativo2 = centroAdministrativo2;
    }

    public String getCentroAdministrativo3() {
        return centroAdministrativo3;
    }

    public void setCentroAdministrativo3(String centroAdministrativo3) {
        this.centroAdministrativo3 = centroAdministrativo3;
    }

    public String getEmailConfirmacion() {
        return emailConfirmacion;
    }

    public void setEmailConfirmacion(String emailConfirmacion) {
        this.emailConfirmacion = emailConfirmacion;
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

    public String getEnsena() {
        return ensena;
    }

    public void setEnsena(String ensena) {
        this.ensena = ensena;
    }

    public String getClienteEstatus() {
        return clienteEstatus;
    }

    public void setClienteEstatus(String clienteEstatus) {
        this.clienteEstatus = clienteEstatus;
    }

    public String getClienteEstado() {
        return clienteEstado;
    }

    public void setClienteEstado(String clienteEstado) {
        this.clienteEstado = clienteEstado;
    }

    public Short getSiAgrupaFactura() {
        return siAgrupaFactura;
    }

    public void setSiAgrupaFactura(Short siAgrupaFactura) {
        this.siAgrupaFactura = siAgrupaFactura;
    }

    public Short getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Short periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Boolean getClienteNoName() {
        return clienteNoName;
    }

    public void setClienteNoName(Boolean clienteNoName) {
        this.clienteNoName = clienteNoName;
    }

    public String getNumMiembro() {
        return numMiembro;
    }

    public void setNumMiembro(String numMiembro) {
        this.numMiembro = numMiembro;
    }

    public String getnIFIntracomunitario() {
        return nIFIntracomunitario;
    }

    public void setnIFIntracomunitario(String nIFIntracomunitario) {
        this.nIFIntracomunitario = nIFIntracomunitario;
    }

    public String getCodigoAccesoExtranet() {
        return codigoAccesoExtranet;
    }

    public void setCodigoAccesoExtranet(String codigoAccesoExtranet) {
        this.codigoAccesoExtranet = codigoAccesoExtranet;
    }

    public String getContrasenaExtranet() {
        return contrasenaExtranet;
    }

    public void setContrasenaExtranet(String contrasenaExtranet) {
        this.contrasenaExtranet = contrasenaExtranet;
    }

    public Boolean getSiAltitud() {
        return siAltitud;
    }

    public void setSiAltitud(Boolean siAltitud) {
        this.siAltitud = siAltitud;
    }

    public Boolean getSiCentoCiudad() {
        return siCentoCiudad;
    }

    public void setSiCentoCiudad(Boolean siCentoCiudad) {
        this.siCentoCiudad = siCentoCiudad;
    }

    public Boolean getSiPasajeBarco() {
        return siPasajeBarco;
    }

    public void setSiPasajeBarco(Boolean siPasajeBarco) {
        this.siPasajeBarco = siPasajeBarco;
    }

    public Boolean getSiEntregaParticular() {
        return siEntregaParticular;
    }

    public void setSiEntregaParticular(Boolean siEntregaParticular) {
        this.siEntregaParticular = siEntregaParticular;
    }

    public String getZonaClienteGrupo() {
        return zonaClienteGrupo;
    }

    public void setZonaClienteGrupo(String zonaClienteGrupo) {
        this.zonaClienteGrupo = zonaClienteGrupo;
    }

    public Integer getCodigoClienteGrupo() {
        return codigoClienteGrupo;
    }

    public void setCodigoClienteGrupo(Integer codigoClienteGrupo) {
        this.codigoClienteGrupo = codigoClienteGrupo;
    }

    public String getZonaClientePagador() {
        return zonaClientePagador;
    }

    public void setZonaClientePagador(String zonaClientePagador) {
        this.zonaClientePagador = zonaClientePagador;
    }

    public Integer getCodigoClientePagador() {
        return codigoClientePagador;
    }

    public void setCodigoClientePagador(Integer codigoClientePagador) {
        this.codigoClientePagador = codigoClientePagador;
    }

    public Boolean getSiAperturaTiendaLunes() {
        return siAperturaTiendaLunes;
    }

    public void setSiAperturaTiendaLunes(Boolean siAperturaTiendaLunes) {
        this.siAperturaTiendaLunes = siAperturaTiendaLunes;
    }

    public Boolean getSiAperturaTiendaMartes() {
        return siAperturaTiendaMartes;
    }

    public void setSiAperturaTiendaMartes(Boolean siAperturaTiendaMartes) {
        this.siAperturaTiendaMartes = siAperturaTiendaMartes;
    }

    public Boolean getSiAperturaTiendaMiercoles() {
        return siAperturaTiendaMiercoles;
    }

    public void setSiAperturaTiendaMiercoles(Boolean siAperturaTiendaMiercoles) {
        this.siAperturaTiendaMiercoles = siAperturaTiendaMiercoles;
    }

    public Boolean getSiAperturaTiendaJueves() {
        return siAperturaTiendaJueves;
    }

    public void setSiAperturaTiendaJueves(Boolean siAperturaTiendaJueves) {
        this.siAperturaTiendaJueves = siAperturaTiendaJueves;
    }

    public Boolean getSiAperturaTiendaViernes() {
        return siAperturaTiendaViernes;
    }

    public void setSiAperturaTiendaViernes(Boolean siAperturaTiendaViernes) {
        this.siAperturaTiendaViernes = siAperturaTiendaViernes;
    }

    public Boolean getSiTaller() {
        return siTaller;
    }

    public void setSiTaller(Boolean siTaller) {
        this.siTaller = siTaller;
    }

    public Boolean getSiInstalacionIntegrada() {
        return siInstalacionIntegrada;
    }

    public void setSiInstalacionIntegrada(Boolean siInstalacionIntegrada) {
        this.siInstalacionIntegrada = siInstalacionIntegrada;
    }

    public Integer getSuperficieShowroom() {
        return superficieShowroom;
    }

    public void setSuperficieShowroom(Integer superficieShowroom) {
        this.superficieShowroom = superficieShowroom;
    }

    public Integer getCantidadExpoShowroom() {
        return cantidadExpoShowroom;
    }

    public void setCantidadExpoShowroom(Integer cantidadExpoShowroom) {
        this.cantidadExpoShowroom = cantidadExpoShowroom;
    }

    public Date getFechaCreacionTienda() {
        return fechaCreacionTienda;
    }

    public void setFechaCreacionTienda(Date fechaCreacionTienda) {
        this.fechaCreacionTienda = fechaCreacionTienda;
    }

    public String getAplicacionDisVal() {
        return aplicacionDisVal;
    }

    public void setAplicacionDisVal(String aplicacionDisVal) {
        this.aplicacionDisVal = aplicacionDisVal;
    }

    public Integer getCestaMedia() {
        return cestaMedia;
    }

    public void setCestaMedia(Integer cestaMedia) {
        this.cestaMedia = cestaMedia;
    }

    public Integer getVentasPotenciales() {
        return ventasPotenciales;
    }

    public void setVentasPotenciales(Integer ventasPotenciales) {
        this.ventasPotenciales = ventasPotenciales;
    }

    public Date getFechaVencimientoFrancia() {
        return fechaVencimientoFrancia;
    }

    public void setFechaVencimientoFrancia(Date fechaVencimientoFrancia) {
        this.fechaVencimientoFrancia = fechaVencimientoFrancia;
    }

    public Date getFechaAdmisionFrancia() {
        return fechaAdmisionFrancia;
    }

    public void setFechaAdmisionFrancia(Date fechaAdmisionFrancia) {
        this.fechaAdmisionFrancia = fechaAdmisionFrancia;
    }

    public Double getCreditoExterno() {
        return creditoExterno;
    }

    public void setCreditoExterno(Double creditoExterno) {
        this.creditoExterno = creditoExterno;
    }

    public String getcPGeolocalTienda() {
        return cPGeolocalTienda;
    }

    public void setcPGeolocalTienda(String cPGeolocalTienda) {
        this.cPGeolocalTienda = cPGeolocalTienda;
    }

    public Integer getTratamientoContableYou() {
        return tratamientoContableYou;
    }

    public void setTratamientoContableYou(Integer tratamientoContableYou) {
        this.tratamientoContableYou = tratamientoContableYou;
    }

    public String getObservacionesEnvio() {
        return observacionesEnvio;
    }

    public void setObservacionesEnvio(String observacionesEnvio) {
        this.observacionesEnvio = observacionesEnvio;
    }

    public String getReglementHabitual() {
        return reglementHabitual;
    }

    public void setReglementHabitual(String reglementHabitual) {
        this.reglementHabitual = reglementHabitual;
    }

    public String getReglementMinima() {
        return reglementMinima;
    }

    public void setReglementMinima(String reglementMinima) {
        this.reglementMinima = reglementMinima;
    }

    public String getCondicionesPagoHabitual() {
        return condicionesPagoHabitual;
    }

    public void setCondicionesPagoHabitual(String condicionesPagoHabitual) {
        this.condicionesPagoHabitual = condicionesPagoHabitual;
    }

    public String getCondicionesPagoMinima() {
        return condicionesPagoMinima;
    }

    public void setCondicionesPagoMinima(String condicionesPagoMinima) {
        this.condicionesPagoMinima = condicionesPagoMinima;
    }

    public String getCodigoCotaExterna() {
        return codigoCotaExterna;
    }

    public void setCodigoCotaExterna(String codigoCotaExterna) {
        this.codigoCotaExterna = codigoCotaExterna;
    }

    public String getTelefonoMovilEnvio() {
        return telefonoMovilEnvio;
    }

    public void setTelefonoMovilEnvio(String telefonoMovilEnvio) {
        this.telefonoMovilEnvio = telefonoMovilEnvio;
    }

    public String getCodDescripcionDTO1() {
        return codDescripcionDTO1;
    }

    public void setCodDescripcionDTO1(String codDescripcionDTO1) {
        this.codDescripcionDTO1 = codDescripcionDTO1;
    }

    public String getCodDescripcionDTO2() {
        return codDescripcionDTO2;
    }

    public void setCodDescripcionDTO2(String codDescripcionDTO2) {
        this.codDescripcionDTO2 = codDescripcionDTO2;
    }

    public String getExclusividad() {
        return exclusividad;
    }

    public void setExclusividad(String exclusividad) {
        this.exclusividad = exclusividad;
    }

    
}
