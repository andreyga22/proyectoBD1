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
public class CicloBilling {

    private String CodigoCi;
    private String DescripcionCi;
    private String NombreCi;
    private String TiempoCi;
    private String CodigoEstatusCi;
    private String DescripcionEsta;

    /*
    todos los parametros
    */
    public CicloBilling(String CodigoCi, String DescripcionCi, String NombreCi, String TiempoCi, String CodigoEstatusCi, String DescripcionEsta) {
        this.CodigoCi = CodigoCi;
        this.DescripcionCi = DescripcionCi;
        this.NombreCi = NombreCi;
        this.TiempoCi = TiempoCi;
        this.CodigoEstatusCi = CodigoEstatusCi;
        this.DescripcionEsta = DescripcionEsta;
    }

    public String getCodigoCi() {
        return CodigoCi;
    }

    public void setCodigoCi(String CodigoCi) {
        this.CodigoCi = CodigoCi;
    }

    public String getDescripcionCi() {
        return DescripcionCi;
    }

    public void setDescripcionCi(String DescripcionCi) {
        this.DescripcionCi = DescripcionCi;
    }

    public String getNombreCi() {
        return NombreCi;
    }

    public void setNombreCi(String NombreCi) {
        this.NombreCi = NombreCi;
    }

    public String getTiempoCi() {
        return TiempoCi;
    }

    public void setTiempoCi(String TiempoCi) {
        this.TiempoCi = TiempoCi;
    }

    public String getCodigoEstatusCi() {
        return CodigoEstatusCi;
    }

    public void setCodigoEstatusCi(String CodigoEstatusCi) {
        this.CodigoEstatusCi = CodigoEstatusCi;
    }

    public String getDescripcionEsta() {
        return DescripcionEsta;
    }

    public void setDescripcionEsta(String DescripcionEsta) {
        this.DescripcionEsta = DescripcionEsta;
    }

    @Override
    public String toString() {
        return "CicloBilling{" + "CodigoCi=" + CodigoCi + ", DescripcionCi=" + DescripcionCi + ", NombreCi=" + NombreCi + ", TiempoCi=" + TiempoCi + ", CodigoEstatusCi=" + CodigoEstatusCi + ", DescripcionEsta=" + DescripcionEsta + '}';
    }
}
