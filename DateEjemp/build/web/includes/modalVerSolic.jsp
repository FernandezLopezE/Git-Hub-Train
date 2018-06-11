
<%@page import="java.util.LinkedList"%>
<%@page import="beans.ConsultaBD"%>
<%@page import="beans.Consulta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>Remote file for Bootstrap Modal</title>  
</head>
<body>

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                 <h3 class="modal-title">Datos de la solicitud</h3>
            </div>			<!-- /modal-header -->
            <div class="modal-body">
                
                
        <div class="">
            <%
                int ver = Integer.parseInt(request.getParameter("ver"));
                if (Integer.parseInt(request.getParameter("ver")) != 0) {

                         
            %>
            <div class="table-wrapper">

                <table class="table table-striped table-bordered table-hover dataTable no-footer dtr-inline">
                    <%LinkedList<Consulta> lista = ConsultaBD.getConsultaVerAdmin(ver);
                        for (int i = 0; i < lista.size(); i++) {
                    %>
                    <tr>
                        <th>
                            Nombre de evento
                            <%   out.println("<td>" + lista.get(i).getNombre() + "</td>"); %>
                        </th>       
                    </tr>
                    <tr>
                        <th>
                            Origen
                            <%   out.println("<td>" + lista.get(i).getOrigen() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Lugar
                            <%   out.println("<td>" + lista.get(i).getLugar() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Nombre del solicitante
                            <!--                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                            <%   out.println("<td>" + lista.get(i).getSolicitante() + " " + lista.get(i).getPaterno() + " " + lista.get(i).getMaterno() + "  </td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Puesto
                            <%   out.println("<td>" + lista.get(i).getPnombre() + " </td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Fecha
                            <%   out.println("<td>" + lista.get(i).getFecha() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Hora de Montaje
                            <%   out.println("<td>" + lista.get(i).getHoraMon() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Hora de inicio
                            <%   out.println("<td>" + lista.get(i).getHoraIni() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Hora de término
                            <%   out.println("<td>" + lista.get(i).getHoraFin() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Telefono
                            <%   out.println("<td>" + lista.get(i).getTelefono() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Tipo de organización
                            <%   out.println("<td>" + lista.get(i).getOrg() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Espacio
                            <%   out.println("<td>" + lista.get(i).getEspacio() + "</td>"); %>
                        </th>                 
                    </tr>
                    <tr>
                        <th>
                            Estatus
                            <%   out.println("<td>" + lista.get(i).getEstatus() + "</td>"); %>
                        </th>                 
                    </tr>

                    <%}%>
                    <tr>
                        <th>
                            Inventario solicitado
                        <td> 
                            <%LinkedList<Consulta> lista2 = ConsultaBD.getConsultaVerInvAdmin(ver);
                                for (int j = 0; j < lista2.size(); j++) {
                            %>

                            <%   out.println(lista2.get(j).getNombreI() + ", " + lista2.get(j).getCantidad_s() + "<br>"); %>
                            <% //   out.println("<td>" + lista2.get(j).getCantidad_s()+ "</td>"); %>         

                            <%}%>
                        </td>
                        </th>                 
                    </tr>
                    <%}%>   
                </table>
            </div>

        </div>


            </div>			<!-- /modal-body -->
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
<!--                <button type="button" class="btn btn-primary">Save changes</button>-->
            </div>			<!-- /modal-footer -->
        </div>         <!-- /modal-content -->
     <!-- /modal-dialog -->
</body>
</html>