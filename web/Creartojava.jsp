<%@page import="Base.BaseDatosC"%>
<%

    String parametro = request.getParameter("parametro");

    BaseDatosC base = new BaseDatosC();

    if (parametro.equals("Cuentas")) {

        String codigo = request.getParameter("codigo");
        String numid = request.getParameter("numid");
        String moned = request.getParameter("moned");
        String categoriacred = request.getParameter("categoriacred");
        String estadocuent = request.getParameter("estadocuent");
        String nombre = request.getParameter("nombre");
        String coddegmento = request.getParameter("coddegmento");
        String tipocod = request.getParameter("tipocod");
        String diasdespues = request.getParameter("diasdespues");
        String fechaefectivain = request.getParameter("fechaefectivain");
        String fechaefectivafi = request.getParameter("fechaefectivafi");
        String fechaultimaact = request.getParameter("fechaultimaact");
        String ultimafecharea = request.getParameter("ultimafecharea");
        String facturamul = request.getParameter("facturamul");
        String fecharea = request.getParameter("fecharea");
        String ultimafechasus = request.getParameter("ultimafechasus");
        String fechacierreter = request.getParameter("fechacierreter");

    }
    if (parametro.equals("CicloBilling")) {

        String CodigoCi = request.getParameter("CodigoCi");
        String DescripcionCi = request.getParameter("DescripcionCi");
        String NombreCi = request.getParameter("NombreCi");
        String TiempoCi = request.getParameter("TiempoCi");
        String CodigoEstatusCi = request.getParameter("CodigoEstatusCi");
        String DescripcionEsta = request.getParameter("DescripcionEsta");

    }

    if (parametro.equals("ClienteRegular")) {

        String numid = request.getParameter("numid");
        String dirId = request.getParameter("dirId");
        String codPostal = request.getParameter("codPostal");
        String tipoCl = request.getParameter("tipoCl");
        String nacional = request.getParameter("nacional");
        String vencimiento = request.getParameter("vencimiento");
        String otras = request.getParameter("otras");
        String prov = request.getParameter("prov");
        String dist = request.getParameter("dist");
        String cant = request.getParameter("cant");
        String telefono = request.getParameter("telefono");
        String tipoTel = request.getParameter("tipoTel");
        String ext = request.getParameter("ext");
        String email = request.getParameter("email");
        String nombreempresa = request.getParameter("nombreempresa");
        String puesto = request.getParameter("puesto");
        String patron = request.getParameter("patron");
        String fechaing = request.getParameter("fechaing");
        String puestoact = request.getParameter("puestoact");
        String patronact = request.getParameter("patronact");
        String salarion = request.getParameter("salarion");
        String salariob = request.getParameter("salariob");
        String otros = request.getParameter("otros");

    }
    if (parametro.equals("ClienteExtranjer")) {

        String numid = request.getParameter("numid");
        String dirId = request.getParameter("dirId");
        String codPostal = request.getParameter("codPostal");
        String tipoCl = request.getParameter("tipoCl");
        String nacional = request.getParameter("nacional");
        String vencimiento = request.getParameter("vencimiento");
        String otras = request.getParameter("otras");
        String prov = request.getParameter("prov");
        String dist = request.getParameter("dist");
        String cant = request.getParameter("cant");
        String telefono = request.getParameter("telefono");
        String tipoTel = request.getParameter("tipoTel");
        String ext = request.getParameter("ext");
        String email = request.getParameter("email");

    }
    if (parametro.equals("ClienteEmpresa")) {

        String numid = request.getParameter("numid");
        String dirId = request.getParameter("dirId");
        String codpostal = request.getParameter("codpostal");
        String tipoCl = request.getParameter("tipoCl");
        String nacional = request.getParameter("nacional");
        String vencimiento = request.getParameter("vencimiento");
        String nombreEmp = request.getParameter("nombreEmp");
        String otras = request.getParameter("otras");
        String prov = request.getParameter("prov");
        String dist = request.getParameter("dist");
        String cant = request.getParameter("cant");
        String telefono = request.getParameter("telefono");
        String tipoTel = request.getParameter("tipoTel");
        String ext = request.getParameter("ext");
        String email = request.getParameter("email");

    }
    if (parametro.equals("InformacionLaboral")) {

    }
    if (parametro.equals("Planes")) {

        String CodigoPla = request.getParameter("CodigoPla");
        String DepositoInicia = request.getParameter("DepositoInicia");
        String TipoPla = request.getParameter("TipoPla");
        String FreeTim = request.getParameter("FreeTim");
        String NombrePla = request.getParameter("NombrePla");
        String PrecioPla = request.getParameter("PrecioPla");
        String CodigoEstatusPla = request.getParameter("CodigoEstatusPla");
        String TiempoLibrePenalCambi = request.getParameter("TiempoLibrePenalCambi");
        String MontoCastig = request.getParameter("MontoCastig");
        String FechaEfectivaInici = request.getParameter("FechaEfectivaInici");
        String FechaEfectivaFi = request.getParameter("FechaEfectivaFi");
        String FechaInici = request.getParameter("FechaInici");
        String FechaFi = request.getParameter("FechaFi");
        String TiempoTotalPermanenci = request.getParameter("TiempoTotalPermanenci");

    }
    if (parametro.equals("Servicios")) {
        String CodigoServi = request.getParameter("CodigoServi");
        String PrecioTotalServi = request.getParameter("PrecioTotalServi");
        String NombreServi = request.getParameter("NombreServi");

    }
    if (parametro.equals("Productos")) {

        String codProducto = request.getParameter("codProducto");
        String codPlan = request.getParameter("codPlan");
        String descripcionProd = request.getParameter("descripcionProd");
        String programaLeal = request.getParameter("programaLeal");
        String precioUn = request.getParameter("precioUn");
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        String descuentoProd = request.getParameter("descuentoProd");
        String fechaefectivain = request.getParameter("fechaefectivain");
        String fechaefectivafi = request.getParameter("fechaefectivafi");

    }
    if (parametro.equals("Campanas")) {

        String CodigoCampaña = request.getParameter("CodigoCampaña");
        String FechaEfectivoInicioCampaña = request.getParameter("FechaEfectivoInicioCampaña");
        String FechaEfectivaFinCampaña = request.getParameter("FechaEfectivaFinCampaña");
        String TipoCampaña = request.getParameter("TipoCampaña");
        String DescripcionCampaña = request.getParameter("DescripcionCampaña");
        String PropositoCampaña = request.getParameter("PropositoCampaña");
        String EstadoCampaña = request.getParameter("EstadoCampaña");
        String NombreCampaña = request.getParameter("NombreCampaña");
        String nombrePart = request.getParameter("nombrePart");
        String codPart = request.getParameter("codPart");

    }
    if (parametro.equals("Promociones")) {

        String codPromocion = request.getParameter("codPromocion");
        String tipo = request.getParameter("tipo");
        String nombre = request.getParameter("nombre");
        String fechainicio = request.getParameter("fechainicio");
        String fechafin = request.getParameter("fechafin");
        String temaslogan = request.getParameter("temaslogan");
        String descrip = request.getParameter("descrip");

    }
    if (parametro.equals("Contratos")) {

        String numcontrato = request.getParameter("numcontrato");
        String codcuenta = request.getParameter("codcuenta");
        String indicadorren = request.getParameter("indicadorren");
        String documentodig = request.getParameter("documentodig");
        String razoncanc = request.getParameter("razoncanc");
        String fechainicioc = request.getParameter("fechainicioc");
        String canalv = request.getParameter("canalv");
        String codigoestatus = request.getParameter("codigoestatus");
        String datospromocion = request.getParameter("datospromocion");
        String fechafin = request.getParameter("fechafin");
        String nombre = request.getParameter("nombre");
        String fechacancelacion = request.getParameter("fechacancelacion");
        String terminospag = request.getParameter("terminospag");
        String numorden = request.getParameter("numorden");
        String tipocont = request.getParameter("tipocont");
        String planmerc = request.getParameter("planmerc");
        String canalcom = request.getParameter("canalcom");

    }


%>