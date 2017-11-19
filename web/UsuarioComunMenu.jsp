<%-- 
    Document   : UsuarioComunMenu
    Created on : 18/11/2017, 05:52:36 PM
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
           
        <h1 id="titulo">Sistema de ventas y creación</h1><BR>
        
        <h2 id="titulo">Clientes</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Clientes" id="boton"/>
            <input type = "submit" name="seleccion" value = "Crear" id="boton"/>
            <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
        
         <h2 id="titulo">Cuentas</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Cuentas" id="boton"/>
            <input type = "submit" name="seleccion" value = "Crear" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
         
          <h2 id="titulo">Planes</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Planes" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
          
           <h2 id="titulo">Servicios</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Servicios" id="boton"/>
            <input type = "submit" name="seleccion" value = "Crear" id="boton"/>
             <input type = "submit" name="seleccion" value = "Editar" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
           
            <h2 id="titulo">Productos</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Productos" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
            
             <h2 id="titulo">Campanas</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Campanas" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
             
              <h2 id="titulo">Promociones</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Promociones" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
              
               <h2 id="titulo">Contratos</h2>
        <form action = "redireccion.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Contratos" id="boton"/>
            <input type = "submit" name="seleccion" value = "Crear" id="boton"/>
               <input type = "submit" name="seleccion" value = "Visualizar" id="boton"/>
          </form>
               
               
                <h2 id="titulo">Venta de articulos</h2>
        <form action = "VentaArticulo.jsp" id="formbarra">
               <input type = "submit" name="seleccion" value = "Vender" id="boton"/>
          </form>
              
    </body>
</html>
