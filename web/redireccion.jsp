       <%
   
String tipo = request.getParameter("parametro");
String accion = request.getParameter("seleccion");

if(accion.equals("Crear")){
  response.sendRedirect("Crear.jsp?parametro="+tipo);  
}
if(accion.equals("Eliminar")){
  response.sendRedirect("Eliminar.jsp?parametro="+tipo);  
}
if(accion.equals("Visualizar")){
  response.sendRedirect("SeleccionarVer.jsp?parametro="+tipo);  
}

//?parametro="+tipo

%>




