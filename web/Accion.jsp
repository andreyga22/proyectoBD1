<%-- 
    Document   : Accion
    Created on : 10/10/2017, 05:25:25 PM
    Author     : josue vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="cssInicio.css">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String seleccion = request.getParameter("seleccion");
        %>
        <a href="index.html"><IMG SRC="imagenes/tituloempresa.png" id="tituempre"></a>
        <h1 id="titulo"><%= seleccion%></h1>

        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "<%=seleccion%>" id="boton"/> <BR><BR>
            <input type = "submit" name="seleccion" value = "Crear" id="boton"/><BR><BR>
            <input type = "submit" name="seleccion" value = "Editar" id="boton"/><BR><BR>
            <input type = "submit" name="seleccion" value = "Eliminar" id="boton"/><BR><BR>
            <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/><BR><BR>
        </form>
        <IMG SRC="imagenes/copy.png" id="copy">
        <IMG SRC="imagenes/direct.png" id="dire">
    </body>
</html>
