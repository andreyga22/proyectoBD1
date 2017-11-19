<%-- 
    Document   : venta
    Created on : 18/11/2017, 07:10:10 PM
    Author     : josue vargas
--%>

<%@page import="Base.BaseDatosC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("identificador");
            BaseDatosC base = new BaseDatosC();
            String Datos = "";
            Datos = base.verProductos(id);
           
        %>
        <a href="index.html"><IMG SRC="imagenes/tituloempresa.png" id="tituempre"></a>
       <h1 id="titulo">Venta de articulo</h1><BR><BR>
        
       
       <p>Vender a</p>
        <form action="ventaFinal.jsp"> 
        <input type = "hidden" name="identificador" value = "<%=id%>"/> 
        <input type="text" name="idventa"><br><br>
        <input type="submit" value="vender"id="boton"></h1> 
         </form>
    </body>
</html>
