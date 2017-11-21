<%@page import="Base.BaseDatosC"%>
<%@page import="Objetos.Usuario"%>
<%
String user = request.getParameter("user");
String pass = request.getParameter("pass");
String gender = request.getParameter("gender");

Usuario usuario = new Usuario(user,pass,gender);

new BaseDatosC().añadirUsuario(usuario);

response.sendRedirect("Exito.jsp"); 

%>
