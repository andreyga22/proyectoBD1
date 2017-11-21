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
public class Planes {

    private String CodigoPla;
    private String DepositoInicia;
    private String TipoPla;
    private String FreeTim;
    private String NombrePla;
    private String PrecioPla;
    private String CodigoEstatusPla;
    private String TiempoLibrePenalCambi;
    private String MontoCastig;
    private String FechaEfectivaInici;
    private String FechaEfectivaFi;
    private String FechaInici;
    private String FechaFi;
    private String TiempoTotalPermanenci;

    public Planes(String CodigoPla, String DepositoInicia, String TipoPla, String FreeTim, String NombrePla, String PrecioPla, String CodigoEstatusPla, String TiempoLibrePenalCambi, String MontoCastig, String FechaEfectivaInici, String FechaEfectivaFi, String FechaInici, String FechaFi, String TiempoTotalPermanenci) {
        this.CodigoPla = CodigoPla;
        this.DepositoInicia = DepositoInicia;
        this.TipoPla = TipoPla;
        this.FreeTim = FreeTim;
        this.NombrePla = NombrePla;
        this.PrecioPla = PrecioPla;
        this.CodigoEstatusPla = CodigoEstatusPla;
        this.TiempoLibrePenalCambi = TiempoLibrePenalCambi;
        this.MontoCastig = MontoCastig;
        this.FechaEfectivaInici = FechaEfectivaInici;
        this.FechaEfectivaFi = FechaEfectivaFi;
        this.FechaInici = FechaInici;
        this.FechaFi = FechaFi;
        this.TiempoTotalPermanenci = TiempoTotalPermanenci;
    }

    public String getCodigoPla() {
        return CodigoPla;
    }

    public void setCodigoPla(String CodigoPla) {
        this.CodigoPla = CodigoPla;
    }

    public String getDepositoInicia() {
        return DepositoInicia;
    }

    public void setDepositoInicia(String DepositoInicia) {
        this.DepositoInicia = DepositoInicia;
    }

    public String getTipoPla() {
        return TipoPla;
    }

    public void setTipoPla(String TipoPla) {
        this.TipoPla = TipoPla;
    }

    public String getFreeTim() {
        return FreeTim;
    }

    public void setFreeTim(String FreeTim) {
        this.FreeTim = FreeTim;
    }

    public String getNombrePla() {
        return NombrePla;
    }

    public void setNombrePla(String NombrePla) {
        this.NombrePla = NombrePla;
    }

    public String getPrecioPla() {
        return PrecioPla;
    }

    public void setPrecioPla(String PrecioPla) {
        this.PrecioPla = PrecioPla;
    }

    public String getCodigoEstatusPla() {
        return CodigoEstatusPla;
    }

    public void setCodigoEstatusPla(String CodigoEstatusPla) {
        this.CodigoEstatusPla = CodigoEstatusPla;
    }

    public String getTiempoLibrePenalCambi() {
        return TiempoLibrePenalCambi;
    }

    public void setTiempoLibrePenalCambi(String TiempoLibrePenalCambi) {
        this.TiempoLibrePenalCambi = TiempoLibrePenalCambi;
    }

    public String getMontoCastig() {
        return MontoCastig;
    }

    public void setMontoCastig(String MontoCastig) {
        this.MontoCastig = MontoCastig;
    }

    public String getFechaEfectivaInici() {
        return FechaEfectivaInici;
    }

    public void setFechaEfectivaInici(String FechaEfectivaInici) {
        this.FechaEfectivaInici = FechaEfectivaInici;
    }

    public String getFechaEfectivaFi() {
        return FechaEfectivaFi;
    }

    public void setFechaEfectivaFi(String FechaEfectivaFi) {
        this.FechaEfectivaFi = FechaEfectivaFi;
    }

    public String getFechaInici() {
        return FechaInici;
    }

    public void setFechaInici(String FechaInici) {
        this.FechaInici = FechaInici;
    }

    public String getFechaFi() {
        return FechaFi;
    }

    public void setFechaFi(String FechaFi) {
        this.FechaFi = FechaFi;
    }

    public String getTiempoTotalPermanenci() {
        return TiempoTotalPermanenci;
    }

    public void setTiempoTotalPermanenci(String TiempoTotalPermanenci) {
        this.TiempoTotalPermanenci = TiempoTotalPermanenci;
    }

    @Override
    public String toString() {
        return "Planes{" + "CodigoPla=" + CodigoPla + ", DepositoInicia=" + DepositoInicia + ", TipoPla=" + TipoPla + ", FreeTim=" + FreeTim + ", NombrePla=" + NombrePla + ", PrecioPla=" + PrecioPla + ", CodigoEstatusPla=" + CodigoEstatusPla + ", TiempoLibrePenalCambi=" + TiempoLibrePenalCambi + ", MontoCastig=" + MontoCastig + ", FechaEfectivaInici=" + FechaEfectivaInici + ", FechaEfectivaFi=" + FechaEfectivaFi + ", FechaInici=" + FechaInici + ", FechaFi=" + FechaFi + ", TiempoTotalPermanenci=" + TiempoTotalPermanenci + '}';
    }

    
}
