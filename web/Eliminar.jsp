<%-- 
    Document   : Eliminar
    Created on : 15/10/2017, 01:40:14 PM
    Author     : josue vargas
--%>

<%@page import="Base.BaseDatosC"%>
<%@page import="Base.ListaObje"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="cssInicio.css">
    </head>
    <body>
        <%
            String parametro = (String) request.getParameter("parametro");
            ArrayList<ListaObje> lista = new ArrayList();
            BaseDatosC base = new BaseDatosC(); 
            
            if (parametro.equals("Clientes")) {
                lista = base.getListCLientes();

            }
            if (parametro.equals("Cuentas")) {
                lista = base.getListCuentas();
            }
            if (parametro.equals("Planes")) {
                lista = base.getListPlanes();

            }
            if (parametro.equals("Servicios")) {
                lista = base.getListServicios();

            }
            if (parametro.equals("Productos")) {
                lista = base.getListProductos();

            }
            if (parametro.equals("Campanas")) {
                lista = base.getListCampanas();

            }
            if (parametro.equals("Promociones")) {
                lista = base.getListPromociones();

            }
            if (parametro.equals("Contratos")) {
                lista = base.getListContratos();

            }
            
        %>
         <a href="index.html"><IMG SRC="imagenes/tituloempresa.png" id="tituempre"></a>
        <h1 id="titulo">Eliminar Datos</h1><BR><BR>
         
        <%
            for(int i = 0;i < lista.size();i++){
        %>    
       <form action="Eliminartojava.jsp">
        <input type = "hidden" name="parametro" value = "<%=parametro%>"/> 
        <input type = "hidden" name="identificador" value = "<%=lista.get(i).clave%>"/> 
        <h1 id="titulo">Dato: <%=lista.get(i).descripcion%> <input type="submit" value="Eliminar"id="boton"></h1> 
         </form>
        <%
        }
        %>
        <IMG SRC="imagenes/copy.png" id="copy">
            <IMG SRC="imagenes/direct.png" id="dire">
       

    </body>
</html>
