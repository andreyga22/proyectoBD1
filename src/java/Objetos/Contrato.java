/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Joshura
 */
public class Contrato {

    private String numcontrato;
    private String codcuenta;
    private String indicadorren;
    private String documentodig;
    private String razoncanc;
    private String fechainicioc;
    private String canalv;
    private String codigoestatus;
    private String datospromocion;
    private String fechafin;
    private String nombre;
    private String fechacancelacion;
    private String terminospag;
    private String numorden;
    private String tipocont;
    private String planmerc;
    private String canalcom;

    public Contrato(String numcontrato, String codcuenta, String indicadorren, String documentodig, String razoncanc, String fechainicioc, String canalv, String codigoestatus, String datospromocion, String fechafin, String nombre, String fechacancelacion, String terminospag, String numorden, String tipocont, String planmerc, String canalcom) {
        this.numcontrato = numcontrato;
        this.codcuenta = codcuenta;
        this.indicadorren = indicadorren;
        this.documentodig = documentodig;
        this.razoncanc = razoncanc;
        this.fechainicioc = fechainicioc;
        this.canalv = canalv;
        this.codigoestatus = codigoestatus;
        this.datospromocion = datospromocion;
        this.fechafin = fechafin;
        this.nombre = nombre;
        this.fechacancelacion = fechacancelacion;
        this.terminospag = terminospag;
        this.numorden = numorden;
        this.tipocont = tipocont;
        this.planmerc = planmerc;
        this.canalcom = canalcom;
    }

    public String getNumcontrato() {
        return numcontrato;
    }

    public void setNumcontrato(String numcontrato) {
        this.numcontrato = numcontrato;
    }

    public String getCodcuenta() {
        return codcuenta;
    }

    public void setCodcuenta(String codcuenta) {
        this.codcuenta = codcuenta;
    }

    public String getIndicadorren() {
        return indicadorren;
    }

    public void setIndicadorren(String indicadorren) {
        this.indicadorren = indicadorren;
    }

    public String getDocumentodig() {
        return documentodig;
    }

    public void setDocumentodig(String documentodig) {
        this.documentodig = documentodig;
    }

    public String getRazoncanc() {
        return razoncanc;
    }

    public void setRazoncanc(String razoncanc) {
        this.razoncanc = razoncanc;
    }

    public String getFechainicioc() {
        return fechainicioc;
    }

    public void setFechainicioc(String fechainicioc) {
        this.fechainicioc = fechainicioc;
    }

    public String getCanalv() {
        return canalv;
    }

    public void setCanalv(String canalv) {
        this.canalv = canalv;
    }

    public String getCodigoestatus() {
        return codigoestatus;
    }

    public void setCodigoestatus(String codigoestatus) {
        this.codigoestatus = codigoestatus;
    }

    public String getDatospromocion() {
        return datospromocion;
    }

    public void setDatospromocion(String datospromocion) {
        this.datospromocion = datospromocion;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechacancelacion() {
        return fechacancelacion;
    }

    public void setFechacancelacion(String fechacancelacion) {
        this.fechacancelacion = fechacancelacion;
    }

    public String getTerminospag() {
        return terminospag;
    }

    public void setTerminospag(String terminospag) {
        this.terminospag = terminospag;
    }

    public String getNumorden() {
        return numorden;
    }

    public void setNumorden(String numorden) {
        this.numorden = numorden;
    }

    public String getTipocont() {
        return tipocont;
    }

    public void setTipocont(String tipocont) {
        this.tipocont = tipocont;
    }

    public String getPlanmerc() {
        return planmerc;
    }

    public void setPlanmerc(String planmerc) {
        this.planmerc = planmerc;
    }

    public String getCanalcom() {
        return canalcom;
    }

    public void setCanalcom(String canalcom) {
        this.canalcom = canalcom;
    }

    @Override
    public String toString() {
        return "Contrato{" + "numcontrato=" + numcontrato + ", codcuenta=" + codcuenta + ", indicadorren=" + indicadorren + ", documentodig=" + documentodig + ", razoncanc=" + razoncanc + ", fechainicioc=" + fechainicioc + ", canalv=" + canalv + ", codigoestatus=" + codigoestatus + ", datospromocion=" + datospromocion + ", fechafin=" + fechafin + ", nombre=" + nombre + ", fechacancelacion=" + fechacancelacion + ", terminospag=" + terminospag + ", numorden=" + numorden + ", tipocont=" + tipocont + ", planmerc=" + planmerc + ", canalcom=" + canalcom + '}';
    }
    
    
}
