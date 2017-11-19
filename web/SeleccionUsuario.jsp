<%
 
    String usuario = request.getParameter("parametro");
    

if(usuario.equals("1")){
    response.sendRedirect("UsuarioComunMenu.jsp"); 
}
if(usuario.equals("2")){
   response.sendRedirect("Menu.jsp"); 
}
if(usuario.equals("3")){
    response.sendRedirect("Usuario3Menu.jsp"); 
}

%>

