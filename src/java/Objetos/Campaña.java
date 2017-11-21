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
public class Campaña {

    private String CodigoCampaña;
    private String FechaEfectivoInicioCampaña;
    private String FechaEfectivaFinCampaña;
    private String TipoCampaña;
    private String DescripcionCampaña;
    private String PropositoCampaña;
    private String EstadoCampaña;
    private String NombreCampaña;
    private String nombrePart;
    private String codPart;

    public Campaña(String CodigoCampaña, String FechaEfectivoInicioCampaña, String FechaEfectivaFinCampaña, String TipoCampaña, String DescripcionCampaña, String PropositoCampaña, String EstadoCampaña, String NombreCampaña, String nombrePart, String codPart) {
        this.CodigoCampaña = CodigoCampaña;
        this.FechaEfectivoInicioCampaña = FechaEfectivoInicioCampaña;
        this.FechaEfectivaFinCampaña = FechaEfectivaFinCampaña;
        this.TipoCampaña = TipoCampaña;
        this.DescripcionCampaña = DescripcionCampaña;
        this.PropositoCampaña = PropositoCampaña;
        this.EstadoCampaña = EstadoCampaña;
        this.NombreCampaña = NombreCampaña;
        this.nombrePart = nombrePart;
        this.codPart = codPart;
    }

    public String getCodigoCampaña() {
        return CodigoCampaña;
    }

    public void setCodigoCampaña(String CodigoCampaña) {
        this.CodigoCampaña = CodigoCampaña;
    }

    public String getFechaEfectivoInicioCampaña() {
        return FechaEfectivoInicioCampaña;
    }

    public void setFechaEfectivoInicioCampaña(String FechaEfectivoInicioCampaña) {
        this.FechaEfectivoInicioCampaña = FechaEfectivoInicioCampaña;
    }

    public String getFechaEfectivaFinCampaña() {
        return FechaEfectivaFinCampaña;
    }

    public void setFechaEfectivaFinCampaña(String FechaEfectivaFinCampaña) {
        this.FechaEfectivaFinCampaña = FechaEfectivaFinCampaña;
    }

    public String getTipoCampaña() {
        return TipoCampaña;
    }

    public void setTipoCampaña(String TipoCampaña) {
        this.TipoCampaña = TipoCampaña;
    }

    public String getDescripcionCampaña() {
        return DescripcionCampaña;
    }

    public void setDescripcionCampaña(String DescripcionCampaña) {
        this.DescripcionCampaña = DescripcionCampaña;
    }

    public String getPropositoCampaña() {
        return PropositoCampaña;
    }

    public void setPropositoCampaña(String PropositoCampaña) {
        this.PropositoCampaña = PropositoCampaña;
    }

    public String getEstadoCampaña() {
        return EstadoCampaña;
    }

    public void setEstadoCampaña(String EstadoCampaña) {
        this.EstadoCampaña = EstadoCampaña;
    }

    public String getNombreCampaña() {
        return NombreCampaña;
    }

    public void setNombreCampaña(String NombreCampaña) {
        this.NombreCampaña = NombreCampaña;
    }

    public String getNombrePart() {
        return nombrePart;
    }

    public void setNombrePart(String nombrePart) {
        this.nombrePart = nombrePart;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    @Override
    public String toString() {
        return "Campa\u00f1a{" + "CodigoCampa\u00f1a=" + CodigoCampaña + ", FechaEfectivoInicioCampa\u00f1a=" + FechaEfectivoInicioCampaña + ", FechaEfectivaFinCampa\u00f1a=" + FechaEfectivaFinCampaña + ", TipoCampa\u00f1a=" + TipoCampaña + ", DescripcionCampa\u00f1a=" + DescripcionCampaña + ", PropositoCampa\u00f1a=" + PropositoCampaña + ", EstadoCampa\u00f1a=" + EstadoCampaña + ", NombreCampa\u00f1a=" + NombreCampaña + ", nombrePart=" + nombrePart + ", codPart=" + codPart + '}';
    }
    
    
}
