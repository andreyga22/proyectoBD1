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
public class Servicio {

    private String CodigoServi;
    private String PrecioTotalServi;
    private String NombreServi;

    public Servicio(String CodigoServi, String PrecioTotalServi, String NombreServi) {
        this.CodigoServi = CodigoServi;
        this.PrecioTotalServi = PrecioTotalServi;
        this.NombreServi = NombreServi;
    }

    public String getCodigoServi() {
        return CodigoServi;
    }

    public void setCodigoServi(String CodigoServi) {
        this.CodigoServi = CodigoServi;
    }

    public String getPrecioTotalServi() {
        return PrecioTotalServi;
    }

    public void setPrecioTotalServi(String PrecioTotalServi) {
        this.PrecioTotalServi = PrecioTotalServi;
    }

    public String getNombreServi() {
        return NombreServi;
    }

    public void setNombreServi(String NombreServi) {
        this.NombreServi = NombreServi;
    }

    @Override
    public String toString() {
        return "Servicio{" + "CodigoServi=" + CodigoServi + ", PrecioTotalServi=" + PrecioTotalServi + ", NombreServi=" + NombreServi + '}';
    }
    
    

}
