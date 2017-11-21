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
public class ClienteEmpresa {

    private String numid;
    private String dirId;
    private String codpostal;
    private String tipoCl;
    private String nacional;
    private String vencimiento;
    private String nombreEmp;
    private String otras;
    private String prov;
    private String dist;
    private String cant;
    private String telefono;
    private String tipoTel;
    private String ext;
    private String email;

    /*
    todos los atributos
    */
    public ClienteEmpresa(String numid, String dirId, String codpostal, String tipoCl, String nacional, String vencimiento, String nombreEmp, String otras, String prov, String dist, String cant, String telefono, String tipoTel, String ext, String email) {
        this.numid = numid;
        this.dirId = dirId;
        this.codpostal = codpostal;
        this.tipoCl = tipoCl;
        this.nacional = nacional;
        this.vencimiento = vencimiento;
        this.nombreEmp = nombreEmp;
        this.otras = otras;
        this.prov = prov;
        this.dist = dist;
        this.cant = cant;
        this.telefono = telefono;
        this.tipoTel = tipoTel;
        this.ext = ext;
        this.email = email;
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

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
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

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
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

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "numid=" + numid + ", dirId=" + dirId + ", codpostal=" + codpostal + ", tipoCl=" + tipoCl + ", nacional=" + nacional + ", vencimiento=" + vencimiento + ", nombreEmp=" + nombreEmp + ", otras=" + otras + ", prov=" + prov + ", dist=" + dist + ", cant=" + cant + ", telefono=" + telefono + ", tipoTel=" + tipoTel + ", ext=" + ext + ", email=" + email + '}';
    }
    
    
}
