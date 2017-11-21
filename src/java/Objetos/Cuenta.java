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
public class Cuenta {
private String codigo;
    private String numid;
    private String moned;
    private String categoriacred;
    private String estadocuent;
    private String nombre;
    private String coddegmento;
    private String tipocod;
    private String diasdespues;
    private String fechaefectivain;
    private String fechaefectivafi;
    private String fechaultimaact;
    private String ultimafecharea;
    private String facturamul;
    private String fecharea;
    private String ultimafechasus;
    private String fechacierreter;
    
      /*
    todos los parametros
    */
    public Cuenta(String codigo, String numid, String moned, String categoriacred, String estadocuent, String nombre, String coddegmento, String tipocod, String diasdespues, String fechaefectivain, String fechaefectivafi, String fechaultimaact, String ultimafecharea, String facturamul, String fecharea, String ultimafechasus, String fechacierreter) {
        this.codigo = codigo;
        this.numid = numid;
        this.moned = moned;
        this.categoriacred = categoriacred;
        this.estadocuent = estadocuent;
        this.nombre = nombre;
        this.coddegmento = coddegmento;
        this.tipocod = tipocod;
        this.diasdespues = diasdespues;
        this.fechaefectivain = fechaefectivain;
        this.fechaefectivafi = fechaefectivafi;
        this.fechaultimaact = fechaultimaact;
        this.ultimafecharea = ultimafecharea;
        this.facturamul = facturamul;
        this.fecharea = fecharea;
        this.ultimafechasus = ultimafechasus;
        this.fechacierreter = fechacierreter;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumid() {
        return numid;
    }

    public void setNumid(String numid) {
        this.numid = numid;
    }

    public String getMoned() {
        return moned;
    }

    public void setMoned(String moned) {
        this.moned = moned;
    }

    public String getCategoriacred() {
        return categoriacred;
    }

    public void setCategoriacred(String categoriacred) {
        this.categoriacred = categoriacred;
    }

    public String getEstadocuent() {
        return estadocuent;
    }

    public void setEstadocuent(String estadocuent) {
        this.estadocuent = estadocuent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCoddegmento() {
        return coddegmento;
    }

    public void setCoddegmento(String coddegmento) {
        this.coddegmento = coddegmento;
    }

    public String getTipocod() {
        return tipocod;
    }

    public void setTipocod(String tipocod) {
        this.tipocod = tipocod;
    }

    public String getDiasdespues() {
        return diasdespues;
    }

    public void setDiasdespues(String diasdespues) {
        this.diasdespues = diasdespues;
    }

    public String getFechaefectivain() {
        return fechaefectivain;
    }

    public void setFechaefectivain(String fechaefectivain) {
        this.fechaefectivain = fechaefectivain;
    }

    public String getFechaefectivafi() {
        return fechaefectivafi;
    }

    public void setFechaefectivafi(String fechaefectivafi) {
        this.fechaefectivafi = fechaefectivafi;
    }

    public String getFechaultimaact() {
        return fechaultimaact;
    }

    public void setFechaultimaact(String fechaultimaact) {
        this.fechaultimaact = fechaultimaact;
    }

    public String getUltimafecharea() {
        return ultimafecharea;
    }

    public void setUltimafecharea(String ultimafecharea) {
        this.ultimafecharea = ultimafecharea;
    }

    public String getFacturamul() {
        return facturamul;
    }

    public void setFacturamul(String facturamul) {
        this.facturamul = facturamul;
    }

    public String getFecharea() {
        return fecharea;
    }

    public void setFecharea(String fecharea) {
        this.fecharea = fecharea;
    }

    public String getUltimafechasus() {
        return ultimafechasus;
    }

    public void setUltimafechasus(String ultimafechasus) {
        this.ultimafechasus = ultimafechasus;
    }

    public String getFechacierreter() {
        return fechacierreter;
    }

    public void setFechacierreter(String fechacierreter) {
        this.fechacierreter = fechacierreter;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", numid=" + numid + ", moned=" + moned + ", categoriacred=" + categoriacred + ", estadocuent=" + estadocuent + ", nombre=" + nombre + ", coddegmento=" + coddegmento + ", tipocod=" + tipocod + ", diasdespues=" + diasdespues + ", fechaefectivain=" + fechaefectivain + ", fechaefectivafi=" + fechaefectivafi + ", fechaultimaact=" + fechaultimaact + ", ultimafecharea=" + ultimafecharea + ", facturamul=" + facturamul + ", fecharea=" + fecharea + ", ultimafechasus=" + ultimafechasus + ", fechacierreter=" + fechacierreter + '}';
    }

}
