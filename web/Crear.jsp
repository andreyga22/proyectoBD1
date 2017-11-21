<%-- 
    Document   : accionCrear
    Created on : 13/10/2017, 12:17:59 PM
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
            <%
                String parametro = (String) request.getParameter("parametro");

                if (parametro.equals("Cuentas")) {
            %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Cuentas"/>

            codigo:<br>
            <input type="text" name="codigo" value="">
            <br><br>
            numid:<br>
            <input type="text" name="numid" value="">
            <br><br>
            moned:<br>
            <input type="text" name="moned" value="">
            <br><br>
            categoriacred:<br>
            <input type="text" name="categoriacred" value="">
            <br><br>
            estadocuent:<br>
            <input type="text" name="estadocuent" value="">
            <br><br>
            nombre:<br>
            <input type="text" name="nombre" value="">
            <br><br>
            coddegmento:<br>
            <input type="text" name="coddegmento" value="">
            <br><br>
            tipocod:<br>
            <input type="text" name="tipocod" value="">
            <br><br>
            diasdespues:<br>
            <input type="text" name="diasdespues" value="">
            <br><br>
            fechaefectivain:<br>
            <input type="text" name="fechaefectivain" value="">
            <br><br>
            fechaefectivafi:<br>
            <input type="text" name="fechaefectivafi" value="">
            <br><br>
            fechaultimaact:<br>
            <input type="text" name="fechaultimaact" value="">
            <br><br>
            ultimafecharea:<br>
            <input type="text" name="ultimafecharea" value="">
            <br><br>
            facturamul:<br>
            <input type="text" name="facturamul" value="">
            <br><br>
            fecharea:<br>
            <input type="text" name="fecharea" value="">
            <br><br>
            ultimafechasus:<br>
            <input type="text" name="ultimafechasus" value="">
            <br><br>
            fechacierreter:<br>
            <input type="text" name="fechacierreter" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }
            if (parametro.equals("Planes")) {
        %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Planes"/>

            CodigoPla:<br>
            <input type="text" name="CodigoPla" value="">
            <br><br>
            DepositoInicia:<br>
            <input type="text" name="DepositoInicia" value="">
            <br><br>
            TipoPla:<br>
            <input type="text" name="TipoPla" value="">
            <br><br>
            FreeTim:<br>
            <input type="text" name="FreeTim" value="">
            <br><br>
            NombrePla:<br>
            <input type="text" name="NombrePla" value="">
            <br><br>
            PrecioPla:<br>
            <input type="text" name="PrecioPla" value="">
            <br><br>
            CodigoEstatusPla:<br>
            <input type="text" name="CodigoEstatusPla" value="">
            <br><br>
            TiempoLibrePenalCambi:<br>
            <input type="text" name="TiempoLibrePenalCambi" value="">
            <br><br>
            MontoCastig:<br>
            <input type="text" name="MontoCastig" value="">
            <br><br>
            FechaEfectivaInici:<br>
            <input type="text" name="FechaEfectivaInici" value="">
            <br><br>
            FechaEfectivaFi:<br>
            <input type="text" name="FechaEfectivaFi" value="">
            <br><br>
            FechaInici:<br>
            <input type="text" name="FechaInici" value="">
            <br><br>
            FechaFi:<br>
            <input type="text" name="FechaFi" value="">
            <br><br>
            TiempoTotalPermanenci:<br>
            <input type="text" name="TiempoTotalPermanenci" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }
            if (parametro.equals("Servicios")) {
        %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Servicios"/>


            CodigoServi:<br>
            <input type="text" name="CodigoServi" value="">
            <br><br>
            PrecioTotalServi:<br>
            <input type="text" name="PrecioTotalServi" value="">
            <br><br>
            NombreServi:<br>
            <input type="text" name="NombreServi" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "CicloBilling"/>

            CodigoCi:<br>
            <input type="text" name="CodigoCi" value="">
            <br><br>
            DescripcionCi:<br>
            <input type="text" name="DescripcionCi" value="">
            <br><br>
            NombreCi:<br>
            <input type="text" name="NombreCi" value="">
            <br><br>
            TiempoCi:<br>
            <input type="text" name="TiempoCi" value="">
            <br><br>
            CodigoEstatusCi:<br>
            <input type="text" name="CodigoEstatusCi" value="">
            <br><br>
            DescripcionEsta:<br>
            <input type="text" name="DescripcionEsta" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }
            if (parametro.equals("Productos")) {
        %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Productos"/>

            codProducto:<br>
            <input type="text" name="codProducto" value="">
            <br><br>
            codPlan:<br>
            <input type="text" name="codPlan" value="">
            <br><br>
            descripcionProd:<br>
            <input type="text" name="descripcionProd" value="">
            <br><br>
            programaLeal:<br>
            <input type="text" name="programaLeal" value="">
            <br><br>
            precioUn:<br>
            <input type="text" name="precioUn" value="">
            <br><br>
            nombre:<br>
            <input type="text" name="nombre" value="">
            <br><br>
            tipo:<br>
            <input type="text" name="tipo" value="">
            <br><br>
            descuentoProd:<br>
            <input type="text" name="descuentoProd" value="">
            <br><br>
            fechaefectivain:<br>
            <input type="text" name="fechaefectivain" value="">
            <br><br>
            fechaefectivafi:<br>
            <input type="text" name="fechaefectivafi" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }
            if (parametro.equals("Campanas")) {
        %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Campanas"/>

            CodigoCampaña:<br>
            <input type="text" name="CodigoCampaña" value="">
            <br><br>
            FechaEfectivoInicioCampaña:<br>
            <input type="text" name="FechaEfectivoInicioCampaña" value="">
            <br><br>
            FechaEfectivaFinCampaña:<br>
            <input type="text" name="FechaEfectivaFinCampaña" value="">
            <br><br>
            TipoCampaña:<br>
            <input type="text" name="TipoCampaña" value="">
            <br><br>
            DescripcionCampaña:<br>
            <input type="text" name="DescripcionCampaña" value="">
            <br><br>
            PropositoCampaña:<br>
            <input type="text" name="PropositoCampaña" value="">
            <br><br>
            EstadoCampaña:<br>
            <input type="text" name="EstadoCampaña" value="">
            <br><br>
            NombreCampaña:<br>
            <input type="text" name="NombreCampaña" value="">
            <br><br>
            nombrePart:<br>
            <input type="text" name="nombrePart" value="">
            <br><br>
            codPart:<br>
            <input type="text" name="codPart" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }
            if (parametro.equals("Promociones")) {
        %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Promociones"/>

            codPromocion:<br>
            <input type="text" name="codPromocion" value="">
            <br><br>
            tipo:<br>
            <input type="text" name="tipo" value="">
            <br><br>
            nombre:<br>
            <input type="text" name="nombre" value="">
            <br><br>
            fechainicio:<br>
            <input type="text" name="fechainicio" value="">
            <br><br>
            fechafin:<br>
            <input type="text" name="fechafin" value="">
            <br><br>
            temaslogan:<br>
            <input type="text" name="temaslogan" value="">
            <br><br>
            descrip:<br>
            <input type="text" name="descrip" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }
            if (parametro.equals("Contratos")) {
        %>

        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "Contratos"/>

            numcontrato:<br>
            <input type="text" name="numcontrato" value="">
            <br><br>
            codcuenta:<br>
            <input type="text" name="codcuenta" value="">
            <br><br>
            indicadorren:<br>
            <input type="text" name="indicadorren" value="">
            <br><br>
            documentodig:<br>
            <input type="text" name="documentodig" value="">
            <br><br>
            razoncanc:<br>
            <input type="text" name="razoncanc" value="">
            <br><br>
            fechainicioc:<br>
            <input type="text" name="fechainicioc" value="">
            <br><br>
            canalv:<br>
            <input type="text" name="canalv" value="">
            <br><br>
            codigoestatus:<br>
            <input type="text" name="codigoestatus" value="">
            <br><br>
            datospromocion:<br>
            <input type="text" name="datospromocion" value="">
            <br><br>
            fechafin:<br>
            <input type="text" name="fechafin" value="">
            <br><br>
            nombre:<br>
            <input type="text" name="nombre" value="">
            <br><br>
            fechacancelacion:<br>
            <input type="text" name="fechacancelacion" value="">
            <br><br>
            terminospag:<br>
            <input type="text" name="terminospag" value="">
            <br><br>
            numorden:<br>
            <input type="text" name="numorden" value="">
            <br><br>
            tipocont:<br>
            <input type="text" name="tipocont" value="">
            <br><br>
            planmerc:<br>
            <input type="text" name="planmerc" value="">
            <br><br>
             canalcom:<br>
            <input type="text" name="canalcom" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>

        <%
            }

            if (parametro.equals("Clientes")) {
        %>


        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "ClienteRegular"/>

            numid:<br>
            <input type="text" name="numid" value="">
            <br><br>
            dirId:<br>
            <input type="text" name="dirId" value="">
            <br><br>
            codPostal:<br>
            <input type="text" name="codPostal" value="">
            <br><br>
            tipoCl:<br>
            <input type="text" name="tipoCl" value="">
            <br><br>
            nacional:<br>
            <input type="text" name="nacional" value="">
            <br><br>
            vencimiento:<br>
            <input type="text" name="vencimiento" value="">
            <br><br>
            otras:<br>
            <input type="text" name="otras" value="">
            <br><br>
            prov:<br>
            <input type="text" name="prov" value="">
            <br><br>
            dist:<br>
            <input type="text" name="dist" value="">
            <br><br>
            cant:<br>
            <input type="text" name="cant" value="">
            <br><br>
            telefono:<br>
            <input type="text" name="telefono" value="">
            <br><br>
            tipoTel:<br>
            <input type="text" name="tipoTel" value="">
            <br><br>
            ext:<br>
            <input type="text" name="ext" value="">
            <br><br>
            email:<br>
            <input type="text" name="email" value="">
            <br><br>
            nombreempresa:<br>
            <input type="text" name="nombreempresa" value="">
            <br><br>
            puesto:<br>
            <input type="text" name="puesto" value="">
            <br><br>
            patron:<br>
            <input type="text" name="patron" value="">
            <br><br>
            fechaing:<br>
            <input type="text" name="fechaing" value="">
            <br><br>
            puestoact:<br>
            <input type="text" name="puestoact" value="">
            <br><br>
            patronact:<br>
            <input type="text" name="patronact" value="">
            <br><br>
            salarion:<br>
            <input type="text" name="salarion" value="">
            <br><br>
            salariob:<br>
            <input type="text" name="salariob" value="">
            <br><br>
            otros:<br>
            <input type="text" name="otros" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>


        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "ClienteEmpresa"/>

            Identificacion:<br>
            <input type="text" name="numid" value="">
            <br>
            Tipo Cliente:<br><!-- mae estos no deberian pedirse sino mandarle automaticamente si es empresa el tipo emp-->
            <input type="text" name="tipoCl" value="">
            <br><br>
            Nacionalidad:<br>
            <input type="text" name="nacional" value="">
            <br><br>
            Fecha Vencimiento:
            <input type="text" name="vencimiento" value="">
            <br><br>
            Nombre de la empresa:<br>
            <input type="text" name="nombreEmp" value="">
            <br><br>
            Direccion Id:<br>
            <input type="text" name="dirId" value="">
            <br><br>
            Codigo Postal:<br>
            <input type="text" name="codPostal" value="">
            <br><br>
            Otras Señas de direccion:<br>
            <input type="text" name="otras" value="">
            <br><br>
            Provincia:<br>
            <input type="text" name="prov" value="">
            <br><br>
            Distrito:<br>
            <input type="text" name="dist" value="">
            <br><br>
            Telefono:<br>
            <input type="text" name="telefono" value="">
            <br><br>
            tipoTel:<br>
            <input type="text" name="tipoTel" value="">
            <br><br>
            Extension:<br>
            <input type="text" name="ext" value="">
            <br><br>
            email:<br>
            <input type="text" name="email" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>



        <form action="Creartojava.jsp" id="formbarra">
            <input type = "hidden" name="parametro" value = "ClienteExtranjer"/>

            numid:<br>
            <input type="text" name="numid" value="">
            <br><br>
            dirId:<br>
            <input type="text" name="dirId" value="">
            <br><br>
            codPostal:<br>
            <input type="text" name="codPostal" value="">
            <br><br>
            tipoCl:<br>
            <input type="text" name="tipoCl" value="">
            <br><br>
            nacional:<br>
            <input type="text" name="nacional" value="">
            <br><br>
            vencimiento:<br>
            <input type="text" name="vencimiento" value="">
            <br><br>
            otras:<br>
            <input type="text" name="otras" value="">
            <br><br>
            prov:<br>
            <input type="text" name="prov" value="">
            <br><br>
            dist:<br>
            <input type="text" name="dist" value="">
            <br><br>
            cant:<br>
            <input type="text" name="cant" value="">
            <br><br>
            telefono:<br>
            <input type="text" name="telefono" value="">
            <br><br>
            tipoTel:<br>
            <input type="text" name="tipoTel" value="">
            <br><br>
            ext:<br>
            <input type="text" name="ext" value="">
            <br><br>
            email:<br>
            <input type="text" name="email" value="">
            <br><br>

            <input type="submit" value="Crear" id="boton">
        </form>


        <%
            }


        %>
       
    </body>
</html>
