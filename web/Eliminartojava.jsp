<%@page import="Base.BaseDatosC"%>

 
<%

    String parametro = request.getParameter("parametro");
    String id = request.getParameter("identificador");
    BaseDatosC base = new BaseDatosC(); 
    
    if (parametro.equals("Clientes")) {
base.EliminarClientes(id);
    }
    if (parametro.equals("Cuentas")) {
base.EliminarCuentas(id);
    }
    if (parametro.equals("Planes")) {
base.EliminarPlanes(id);
    }
    if (parametro.equals("Servicios")) {
base.EliminarServicios(id);
    }
    if (parametro.equals("Productos")) {
base.EliminarProductos(id);
    }
    if (parametro.equals("Campanas")) {
base.EliminarCampanas(id);
    }
    if (parametro.equals("Promociones")) {
base.EliminarPromociones(id);
    }
    if (parametro.equals("Contratos")) {
base.EliminarContratos(id);
    }

    response.sendRedirect("Exito.jsp"); 


%>

