package Base;

import Objetos.ClienteExtranjero;
import Objetos.Cuenta;
import Objetos.Usuario;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josue vargas
 */
public class BaseDatosC {

    private Connection con;

    public void baseDeDatos() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            con = DriverManager.getConnection(BaseDeDatos, "proyecto", "123queso");
            if (con != null) {
                System.out.println("Conexion exitosa a esquema HR");
            } else {
                System.out.println("Conexion fallida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BaseDatosC() {
        System.out.println("");
    }

    public void añadirClienteRegular() {
        
    }
    

    public void añadirClienteEmpresa() {

    }
    
//    public void añadirClienteExtranjero(ClienteExtranjero cliente) {
//        Statement stmt = con.createStatement();
//            CallableStatement cStmt = con.prepareCall("{call INSERTARCLIENTEEXTRANJERO(?,?,?,?,?,?,?,?,?,?,?,?,?,?}");
//
//            cStmt.setString(1, numid);
//            cStmt.setInt(2, dirId);
//            cStmt.setInt(3, codPostal);
//            cStmt.setString(4, tipoCl);
//            cStmt.setString(5, nacional);
//            cStmt.setString(6, vencimiento);
//            cStmt.setString(7, otras);
//            cStmt.setString(8, prov);
//            cStmt.setString(9, dist);
//            cStmt.setString(10, cant);
//            cStmt.setInt(11, telefono);
//            cStmt.setString(12, tipoTel);
//            cStmt.setString(13, ext);
//            cStmt.setString(14, email);
//            
//            cStmt.execute();
//            System.out.println("Se insertó la cuenta");
//
//            con.close();
//    }

    public void añadirInformacionLaboral() {

    }

//    public void añadirCuentas(Cuenta cuenta) {
//        
//            Statement stmt = con.createStatement();
//            CallableStatement cStmt = con.prepareCall("{call INSERTARCUENTA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
//
//            cStmt.setString(1, codigo);
//            cStmt.setString(2, numid);
//            cStmt.setString(3, moned);
//            cStmt.setString(4, categoriacred);
//            cStmt.setString(5, estadocuent);
//            cStmt.setString(6, nombre);
//            cStmt.setString(7, coddegmento);
//            cStmt.setString(8, tipocod);
//            cStmt.setString(9, diasdespues);
//            cStmt.setString(10, fechaefectivain);
//            cStmt.setString(11, fechaefectivafi);
//            cStmt.setString(12, fechaultimaact);
//            cStmt.setString(13, ultimafecharea);
//            cStmt.setString(14, facturamul);
//            cStmt.setString(15, fecharea);
//            cStmt.setString(16, ultimafechasus);
//            cStmt.setString(17, fechacierreter);
//            
//            cStmt.execute();
//            System.out.println("Se insertó la cuenta");
//
//            con.close();
//    }

    public void añadirUsuario(Usuario user) {

    }
    
    public String regresarUsuarioRol(String User,String Pass){
        return "";
    }
    
    public void añadirCicloBilling() {

    }

    public void añadirPlanes() {

    }

    public void añadirServicios() {

    }

    public void añadirProductos() {

    }

    public void añadirCampanas() {

    }

    public void añadirPromociones() {

    }

    public void añadirContratos() {

    }

    public String verClientes(String id) {
        String objeto = "";
        return objeto;
    }

    public String verCuentas(String id) {
        String objeto = "";
        return objeto;
    }

    public String verPlanes(String id) {
        String objeto = "";
        return objeto;
    }

    public String verServicios(String id) {
        String objeto = "";
        return objeto;
    }

    public String verProductos(String id) {
        String objeto = "";
        return objeto;
    }

    public String verCampanas(String id) {
        String objeto = "";
        return objeto;
    }

    public String verPromociones(String id) {
        String objeto = "";
        return objeto;
    }

    public String verContratos(String id) {
        String objeto = "";
        return objeto;
    }

    public ArrayList<ListaObje> getListCLientes() {
        ArrayList<ListaObje> lista = new ArrayList<>();
        return lista;
    }

    public ArrayList<ListaObje> getListCuentas() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<ListaObje> getListPlanes() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<ListaObje> getListServicios() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<ListaObje> getListProductos() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<ListaObje> getListCampanas() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<ListaObje> getListPromociones() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public ArrayList<ListaObje> getListContratos() {
        ArrayList<ListaObje> lista = new ArrayList<>();

        return lista;
    }

    public void EliminarClientes(String clave) {

    }

    public void EliminarCuentas(String clave) {

    }

    public void EliminarPlanes(String clave) {

    }

    public void EliminarServicios(String clave) {

    }

    public void EliminarProductos(String clave) {

    }

    public void EliminarCampanas(String clave) {

    }

    public void EliminarPromociones(String clave) {

    }

    public void EliminarContratos(String clave) {

    }

}
