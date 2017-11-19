<%-- 
    Document   : VentaArticulo
    Created on : 18/11/2017, 07:03:29 PM
    Author     : josue vargas
--%>

<%@page import="Base.BaseDatosC"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Base.ListaObje"%>
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
            ArrayList<ListaObje> lista = new ArrayList();
            BaseDatosC base = new BaseDatosC(); 
          
            
            lista = base.getListProductos();

           
            
        %>
      <a href="index.html"><IMG SRC="imagenes/tituloempresa.png" id="tituempre"></a>
           
        <h1 id="titulo">Vender un articulo</h1><BR>
       
         
        <%
            for(int i = 0;i < lista.size();i++){
        %>    
       <form action="venta.jsp"> 
        <input type = "hidden" name="identificador" value = "<%=lista.get(i).clave%>"/> 
        <h1 id="titulo">Dato: <%=lista.get(i).descripcion%> <input type="submit" value="vender"id="boton"></h1> 
         </form>
        <%
        }
        %>
    
    
    </body>
</html>
