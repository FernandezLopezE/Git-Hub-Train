<%-- 
    Document   : acciones_admin
    Created on : Jan 2, 2018, 4:22:14 PM
    Author     : lalof
--%>

<%@page import="beans.Dao"%>
<%@page import="beans.DaoUser"%>
<%@page import="beans.Consulta"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%
   
  int Aut = Integer.parseInt(request.getParameter("Aut"));
  
  
  Connection cn = null;
Statement st = null;
ResultSet rs = null;
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
cn= DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=dataEjemp", "sa", "root");

  
 if (Integer.parseInt(request.getParameter("Aut"))!=0){
   
//int codA=Integer.parseInt(request.getParameter("id_s"));
//int codA=request.getParameter("id_s");

try{
         st = cn.createStatement();
         rs = st.executeQuery("select * from solicitud_evento where id_s = '"+Aut+"'  ");
         
         while (rs.next()){
         }
}catch(Exception e ){
    
}

 Dao d = new Dao();
   
         try {

                 d.conectar();

     if (d.consultarFechaAut(Aut)) {
//if (d.consultarHoraFinl(horaIni,horaFin) || d.consultarHoraIntermedia(horaIni,horaFin) || d.consultarHoraInic(horaIni,horaFin) || d.consultarHoraIgual(horaIni,horaFin) || d.consultarEspacio(spac) ) {
                     if (d.validarHorasEspacioAutorizar(Aut)  ) {
//                         respuesta.setAttribute("error", "Esta hora ya está ocupada");
//                         out.println("Esta hora y fecha ya está ocupada");
%>
                                                      
<script type="text/javascript">
    alert('El lugar o la hora seleccionada ya están ocupados, modifique la solicitud para autorizarla');
window.location="view_consulta_admin.jsp";
</script>           
              <%

                         
                     }else{ 
if(d.validarHorasAutorizar(Aut)){
//if (d.validarInvAut(Aut)){


if (d.seSolicitoInventario(Aut)){
int contador = 0;
contador = d.validarInvAut(Aut);

if (contador >= 100) {
        %>
                                                      <script type="text/javascript">

                                                          alert('No hay suficiente inventario para autorizar el evento');
                                                          window.history.back();
                                                      </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        }else {
st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado' WHERE id_s='"+Aut+"' ");
%>
          <script type="text/javascript">
  alert('Solicitud autorizada');
window.location="view_consulta_admin.jsp";
</script>           
              <%
} // END IF ELSE validarInvAut

}else{
st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado' WHERE id_s='"+Aut+"' ");
%>
          <script type="text/javascript">
  alert('Solicitud autorizada');
window.location="view_consulta_admin.jsp";
</script>           
              <%
} // IF ELSE seSolicitoInventario



}else{
//}else

if (d.seSolicitoInventario(Aut)){

int contador = 0;
contador = d.validarInvAutFN(Aut);

if (contador >= 100) {
        %>
                                                      <script type="text/javascript">

                                                          alert('No hay suficiente inventario para autorizar el evento');
                                                          window.history.back();
                                                      </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        }else {
st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado' WHERE id_s='"+Aut+"' ");
%>
          <script type="text/javascript">
              alert('Solicitud autorizada');
window.location="view_consulta_admin.jsp";
</script>           
              <%
} // END IF ELSE validarInvAut

}else{
st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado' WHERE id_s='"+Aut+"' ");
%>
          <script type="text/javascript">
              alert('Solicitud autorizada');
window.location="view_consulta_admin.jsp";
</script>           
              <%

}
}

//                     respuesta.setAttribute("error", null);
//                     out.print("Registrado con éxito " + "<a href='cont_solic.jsp'>Regresar</a>");
//                              String mensaje="<script language='javascript'>alert('Solicitud enviada');</script>"; 
//out.println(mensaje);
                     }
                 } else {

if (d.seSolicitoInventario(Aut)){

int contador = 0;
contador = d.validarInvAutFN(Aut);

if (contador >= 100) {
        %>
                                                      <script type="text/javascript">

                                                          alert('No hay suficiente inventario para autorizar el evento');
                                                          window.history.back();
                                                      </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        }else {
st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado' WHERE id_s='"+Aut+"' ");
%>
          <script type="text/javascript">
              alert('Solicitud autorizada');
window.location="view_consulta_admin.jsp";
</script>           
              <%
} // END IF ELSE validarInvAut

}else{
st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado' WHERE id_s='"+Aut+"' ");
%>
          <script type="text/javascript">
              alert('Solicitud autorizada');
window.location="view_consulta_admin.jsp";
</script>           
              <%

}
                 }
%>
<!--          <script type="text/javascript">
              alert('DOS');
window.location="view_consulta_admin.jsp";

</script>           -->
              <%

             } catch (Exception e) {

%>
<!--                       <div class="alert">
  <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
 Especifíque el lugar donde se llevará a cabo el evento.
</div>-->
                     <%

                 out.println(e);
             }
 }
 
            %>
    </body>
</html>
