<%-- 
    Document   : Ver
    Created on : 25/10/2017, 07:27:17 PM
    Author     : josue vargas
--%>

<%@page import="Base.BaseDatosC"%>
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
            String parametro = request.getParameter("parametro");
            String id = request.getParameter("identificador");
            BaseDatosC base = new BaseDatosC();
            String Datos = "";
            if (parametro.equals("Clientes")) {
               Datos = base.verClientes(id);
            }
            if (parametro.equals("Cuentas")) {
                Datos = base.verCuentas(id);
            }
            if (parametro.equals("Planes")) {
                Datos = base.verPlanes(id);
            }
            if (parametro.equals("Servicios")) {
                Datos = base.verServicios(id);
            }
            if (parametro.equals("Productos")) {
                Datos = base.verProductos(id);
            }
            if (parametro.equals("Campanas")) {
                Datos = base.verCampanas(id);
            }
            if (parametro.equals("Promociones")) {
                Datos = base.verPromociones(id);
            }
            if (parametro.equals("Contratos")) {
                Datos = base.verContratos(id);
            }
        %>
        <a href="index.html"><IMG SRC="imagenes/tituloempresa.png" id="tituempre"></a>
        <p><%=Datos%></p>
        
    </body>
</html>
