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
public class ClienteRegular {

    private String numid;
    private String dirId;
    private String codPostal;
    private String tipoCl;
    private String nacional;
    private String vencimiento;
    private String otras;
    private String prov;
    private String dist;
    private String cant;
    private String telefono;
    private String tipoTel;
    private String ext;
    private String email;
    private String nombreempresa;
    private String puesto;
    private String patron;
    private String fechaing;
    private String puestoact;
    private String patronact;
    private String salarion;
    private String salariob;
    private String otros;

       /*
    todos los parametros
    */
    public ClienteRegular(String numid, String dirId, String codPostal, String tipoCl, String nacional, String vencimiento, String otras, String prov, String dist, String cant, String telefono, String tipoTel, String ext, String email, String nombreempresa, String puesto, String patron, String fechaing, String puestoact, String patronact, String salarion, String salariob, String otros) {
        this.numid = numid;
        this.dirId = dirId;
        this.codPostal = codPostal;
        this.tipoCl = tipoCl;
        this.nacional = nacional;
        this.vencimiento = vencimiento;
        this.otras = otras;
        this.prov = prov;
        this.dist = dist;
        this.cant = cant;
        this.telefono = telefono;
        this.tipoTel = tipoTel;
        this.ext = ext;
        this.email = email;
        this.nombreempresa = nombreempresa;
        this.puesto = puesto;
        this.patron = patron;
        this.fechaing = fechaing;
        this.puestoact = puestoact;
        this.patronact = patronact;
        this.salarion = salarion;
        this.salariob = salariob;
        this.otros = otros;
    }

   

    public String getNumid() {
        return numid;
    }

    public void setNumid(String numid) {
        this.numid = numid;
    }

    public String getDirId() {
        return dirId;
    }

    public void setDirId(String dirId) {
        this.dirId = dirId;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getTipoCl() {
        return tipoCl;
    }

    public void setTipoCl(String tipoCl) {
        this.tipoCl = tipoCl;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getOtras() {
        return otras;
    }

    public void setOtras(String otras) {
        this.otras = otras;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoTel() {
        return tipoTel;
    }

    public void setTipoTel(String tipoTel) {
        this.tipoTel = tipoTel;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getFechaing() {
        return fechaing;
    }

    public void setFechaing(String fechaing) {
        this.fechaing = fechaing;
    }

    public String getPuestoact() {
        return puestoact;
    }

    public void setPuestoact(String puestoact) {
        this.puestoact = puestoact;
    }

    public String getPatronact() {
        return patronact;
    }

    public void setPatronact(String patronact) {
        this.patronact = patronact;
    }

    public String getSalarion() {
        return salarion;
    }

    public void setSalarion(String salarion) {
        this.salarion = salarion;
    }

    public String getSalariob() {
        return salariob;
    }

    public void setSalariob(String salariob) {
        this.salariob = salariob;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
     @Override
    public String toString() {
        return "ClienteRegular{" + "numid=" + numid + ", dirId=" + dirId + ", codPostal=" + codPostal + ", tipoCl=" + tipoCl + ", nacional=" + nacional + ", vencimiento=" + vencimiento + ", otras=" + otras + ", prov=" + prov + ", dist=" + dist + ", cant=" + cant + ", telefono=" + telefono + ", tipoTel=" + tipoTel + ", ext=" + ext + ", email=" + email + ", nombreempresa=" + nombreempresa + ", puesto=" + puesto + ", patron=" + patron + ", fechaing=" + fechaing + ", puestoact=" + puestoact + ", patronact=" + patronact + ", salarion=" + salarion + ", salariob=" + salariob + ", otros=" + otros + '}';
    }
}
