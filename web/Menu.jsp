<%-- 
    Document   : Menu
    Created on : 10/10/2017, 05:06:33 PM
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
        <h1 id="titulo">Menú</h1><BR><BR>
        
        <form action = "Accion.jsp" id="formbarra">
            <input type = "submit" name="seleccion" value = "Clientes" id="boton"/>
            <input type = "submit" name="seleccion" value = "Cuentas" id="boton"/><BR><BR>
             <input type = "submit" name="seleccion" value = "Planes" id="boton"/>
              <input type = "submit" name="seleccion" value = "Servicios" id="boton"/><BR><BR>
               <input type = "submit" name="seleccion" value = "Productos" id="boton"/>
                <input type = "submit" name="seleccion" value = "Campanas" id="boton"/><BR><BR>
                 <input type = "submit" name="seleccion" value = "Promociones" id="boton"/>
                  <input type = "submit" name="seleccion" value = "Contratos" id="boton"/><BR><BR>
      
        </form>
         <IMG SRC="imagenes/copy.png" id="copy">
            <IMG SRC="imagenes/direct.png" id="dire">
      
    </body>
</html>
