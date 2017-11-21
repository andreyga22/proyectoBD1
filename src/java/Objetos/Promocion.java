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
public class Promocion {

  private  String codPromocion;
 private   String tipo;
 private   String nombre;
 private   String fechainicio;
 private   String fechafin;
 private   String temaslogan;
  private  String descrip;

    public Promocion(String codPromocion, String tipo, String nombre, String fechainicio, String fechafin, String temaslogan, String descrip) {
        this.codPromocion = codPromocion;
        this.tipo = tipo;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.temaslogan = temaslogan;
        this.descrip = descrip;
    }

    public String getCodPromocion() {
        return codPromocion;
    }

    public void setCodPromocion(String codPromocion) {
        this.codPromocion = codPromocion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getTemaslogan() {
        return temaslogan;
    }

    public void setTemaslogan(String temaslogan) {
        this.temaslogan = temaslogan;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "Promocion{" + "codPromocion=" + codPromocion + ", tipo=" + tipo + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", temaslogan=" + temaslogan + ", descrip=" + descrip + '}';
    }
    
    
}
