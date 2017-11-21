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
public class Producto {

    private String codProducto;
    private String codPlan;
    private String descripcionProd;
    private String programaLeal;
    private String precioUn;
    private String nombre;
    private String tipo;
    private String descuentoProd;
    private String fechaefectivain;
    private String fechaefectivafi;

    public Producto(String codProducto, String codPlan, String descripcionProd, String programaLeal, String precioUn, String nombre, String tipo, String descuentoProd, String fechaefectivain, String fechaefectivafi) {
        this.codProducto = codProducto;
        this.codPlan = codPlan;
        this.descripcionProd = descripcionProd;
        this.programaLeal = programaLeal;
        this.precioUn = precioUn;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descuentoProd = descuentoProd;
        this.fechaefectivain = fechaefectivain;
        this.fechaefectivafi = fechaefectivafi;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(String codPlan) {
        this.codPlan = codPlan;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public String getProgramaLeal() {
        return programaLeal;
    }

    public void setProgramaLeal(String programaLeal) {
        this.programaLeal = programaLeal;
    }

    public String getPrecioUn() {
        return precioUn;
    }

    public void setPrecioUn(String precioUn) {
        this.precioUn = precioUn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescuentoProd() {
        return descuentoProd;
    }

    public void setDescuentoProd(String descuentoProd) {
        this.descuentoProd = descuentoProd;
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

    @Override
    public String toString() {
        return "Producto{" + "codProducto=" + codProducto + ", codPlan=" + codPlan + ", descripcionProd=" + descripcionProd + ", programaLeal=" + programaLeal + ", precioUn=" + precioUn + ", nombre=" + nombre + ", tipo=" + tipo + ", descuentoProd=" + descuentoProd + ", fechaefectivain=" + fechaefectivain + ", fechaefectivafi=" + fechaefectivafi + '}';
    }
    
    
    
}
