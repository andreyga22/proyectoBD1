<%@page import="Base.BaseDatosC"%>
<%

String user = request.getParameter("user");
String pass = request.getParameter("pass");

String usuario = new BaseDatosC().regresarUsuarioRol(user, pass);

if(usuario.equals("vendedor")){
    response.sendRedirect("UsuarioComunMenu.jsp"); 
}
if(usuario.equals("admin")){
   response.sendRedirect("Menu.jsp"); 
}
if(usuario.equals("superusuario")){
    response.sendRedirect("Usuario3Menu.jsp"); 
}

%>
