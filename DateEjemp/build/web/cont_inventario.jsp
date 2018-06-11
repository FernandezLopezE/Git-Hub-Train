<%-- 
    Document   : newjspcont_espacio
    Created on : Jan 7, 2018, 1:53:41 PM
    Author     : lalof
--%>

<%@page import="beans.DaoUser"%>
<%@page import="beans.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="SB Admin 2/tablaStyle.css" rel="stylesheet">
           <link href="SB Admin 2/bootstrapE.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="SB Admin 2/metisMenu2.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="SB Admin 2/sb-admin-22.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="SB Admin 2/font-awesome2.min.css" rel="stylesheet" type="text/css">

    <link href="SB Admin 2/blog2.css" rel="stylesheet">
    
        <title>JSP Page</title>
    </head>
    <body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container nav-contain">
        <div class="navbar-header">
            <img style="padding-left:10px; border-radius" src="images/UXBanner.png" alt="Universidad de Xalapa logo logo" width="270" >
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>

        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
          <li><a href="view_solicitudes_admin.jsp">Solicitud de espacios</a></li>
            <li><a  href="view_consulta_admin.jsp">Consulta de solicitudes</a></li>
            <li><a  href="view_reportes.jsp">Reportes</a></li>
            <li><a  href="view_espacios.jsp">Espacios</a></li>
            <li><a href="view_inventario.jsp">Inventario</a></li>
            <li><a  href="view_register.jsp">Registro</a></li>        
   <% 
       
       //                     correo = sesion.getAttribute("correo").toString();
//                    out.print("<a class='nav-link' href='view_login.jsp?cerrar=true'>Cerrar sesión "+ correo +"</a>");

    HttpSession sesion = request.getSession(true);

//    String nombre;
    String nombre_usuario;
   
    String privilegio;
   if (sesion.getAttribute("privilegio")=="normal"){
   
   response.sendRedirect("view_solicitudes_cliente.jsp");
   }
if(sesion.getAttribute("nombre_usuario")!= null && sesion.getAttribute("privilegio")!=null){
    nombre_usuario = sesion.getAttribute("nombre_usuario").toString();
//    String nombre=(String)sesion.getAttribute("nombre"); out.println("Contenido de nombre: "+nombre);
    privilegio = sesion.getAttribute("privilegio").toString();
        out.print("<li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-delay='1000' data-close-others='false'>"+nombre_usuario+" <b class='caret'></b></a>");
out.print("<ul class='dropdown-menu'><li><a href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión </a></li></ul></li>");
//    out.print("<li class='dropdown'>"+nombre_usuario+"<a href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión </a></li>");
//     out.print("<a class='nav-link' href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión "+ nombre_usuario +"</a>");
//    out.print("<a href = 'view_loguin.jsp?cerrar = true'> "+ correo +"</a>");


int id_usuario =(int)sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
sesion.setAttribute("id_usuario", id_usuario );
//out.println("Poniendo usuario en sesion ...");
}else{
   response.sendRedirect("view_login.jsp");
//    out.print("<script> location.replace('view_login.jsp'); </script>");
}
   
    %>
          </ul>
        </div>
        <!--/.nav-collapse --> 
      </div>
    </nav>
                              <div style="padding-top: 60px" class="col-sm-8">

    <%
        
        
//        if (request.getParameter("agregar")!=null){

    if(sesion.getAttribute("id_usuario")!= null){    
 if (request.getParameter("agregar") != null) {

         String nombre = request.getParameter("nombre");
         int cantidad =Integer.parseInt(request.getParameter("cantidad")) ;

         Dao d = new Dao();
         try {
             d.conectar();

             d.agregarInventario(nombre, cantidad);
//             d.agregarCantInventario(nombre,cantidad);
    %>
          <script type="text/javascript">
window.location="view_inventario.jsp";
alert('Equipo o mobiliario agregado ');
</script>           
              <%
}catch (Exception e) {
//         out.print("Error " + "<a href='cont_solic.jsp'>Regresar</a>");
%>
          <script type="text/javascript">
window.location="view_inventario.jsp";
alert('Error al agregar equipo o mobiliario');
</script>           
              <%
                     out.println(e);

             }
}else{
  
                   String Del = request.getParameter("Del");
                   String Modif = request.getParameter("Modif");
                   String Habi = request.getParameter("Habi");

//   int Del = Integer.parseInt(request.getParameter("Del"));

 if (Del != null){
 Dao d1 = new Dao();
   
         try {

                 d1.conectar();
                 
                   d1.EliminarInventario(Del);
                    
%>
          <script type="text/javascript">
window.location="view_inventario.jsp";
alert('Equipo o mobiliario deshabilitado ');
</script>           
              <%                  
                 
} catch (Exception e) {
                 out.println("gff" );
             }

}else{ //----MODIFICAR CANTIDAD DE INVENTARIO







 if (Habi != null){
 Dao d1 = new Dao();
   
         try {

                 d1.conectar();
                 
                   d1.HabilitarInventario(Habi);
                    
%>
          <script type="text/javascript">
alert('Equipo o mobiliario habilitado ');
window.location="view_inventario.jsp";
</script>           
              <%                  
                 
} catch (Exception e) {
                 out.println("gff" );
             }

}

else{

if (Modif != ""){

         int cantidadN =Integer.parseInt(request.getParameter("cantidadN")) ;
 Dao d1 = new Dao();
   
         try {

                 d1.conectar();
                 
                   d1.modificarCantInventario(Modif,cantidadN);
                    
%>
          <script type="text/javascript">
window.location="view_inventario.jsp";
alert('Cantidad modificada ');
</script>           
              <%                  
                 
} catch (Exception e) {
                 out.println("gff" );
             }
} // END IF MODIF

}

} //END IF ELSE DEL
} //END IF ELSE AGREGAR

}else{
  %>
        <script type="text/javascript">
            alert('La sesión ha finalizado, inicie sesión para continuar');
            window.location = "../view_login.jsp";
        </script>             
        <%
}
    %>
    </div>
    <footer class="sticky-footer">
      <div style="background-color: #e9e7e7; padding: 10px 15px; "class="container">
        <div class="text-center">
          <small>2018 Universidad de Xalapa | Derechos Reservados </small>
        </div>
      </div>
    </footer>
    </body>
</html>
