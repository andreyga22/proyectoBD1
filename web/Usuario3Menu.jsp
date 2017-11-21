<%-- 
    Document   : Usuario3Menu
    Created on : 18/11/2017, 05:33:27 PM
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
       <a href="index.html"><IMG SRC="imagenes/tituloempresa.png" id="tituempre"></a>
        <h1 id="titulo">Creacion de administradores</h1><BR>

        <form action="CrearUsuarios.jsp" id="formbarra">

            Usuario:<br>
            <input type="text" name="user"><br>
            Contraseña:<br>
            <input type="text" name="pass"><BR><BR>

            <input type="radio" name="gender" value="admin" checked> Administrador<br>
            <input type="radio" name="gender" value="vendedor"> Vendedor<br>
            <input type="radio" name="gender" value="superusuario"> Creador de usuarios<BR><BR>
            <input type="submit" value="Crear" id="boton">
        </form>
 <img src="imagenes/copy.png" alt="imagen" id="copy">
            <img src="imagenes/direct.png" alt="imagen" id="dire">
    </body>
</html>
