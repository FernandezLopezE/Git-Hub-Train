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
       
    
        <title>JSP Page</title>
    </head>
    <body>
      
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

int id_usuario =(int)sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
sesion.setAttribute("id_usuario", id_usuario );
//out.println("Poniendo usuario en sesion ...");
}else{
   response.sendRedirect("view_login.jsp");
//    out.print("<script> location.replace('view_login.jsp'); </script>");
}
   
    %>
  

    <%
        
        
//        if (request.getParameter("agregar")!=null){
 Dao d = new Dao();
        
if (request.getParameter("agregarA") != null) {

     String nombreArea = request.getParameter("nombreArea");
//         int cantidad =Integer.parseInt(request.getParameter("cantidad")) ;

     try {
         d.conectar();
         d.agregarArea(nombreArea);
//             d.agregarInventario(nombre, cantidad);
//             d.agregarCantInventario(nombre,cantidad);
    %>
          <script type="text/javascript">
window.location="../view_catalogos.jsp";
alert('Área agregada ');
</script>           
    <%
    } catch (Exception e) {
//         out.print("Error " + "<a href='cont_solic.jsp'>Regresar</a>");
    %>
          <script type="text/javascript">
window.back();
alert('Error al agregar área');
</script>           
    <%
                          out.println(e);
                      }
                  }


if (request.getParameter("agregarD") != null) {

     String nombreDepto = request.getParameter("nombreDepto");
     int selectArea =Integer.parseInt(request.getParameter("selectArea")) ;
//         int cantidad =Integer.parseInt(request.getParameter("cantidad")) ;

     try {
         d.conectar();
         d.agregarDepto(nombreDepto, selectArea);
//             d.agregarInventario(nombre, cantidad);
//             d.agregarCantInventario(nombre,cantidad);
    %>
          <script type="text/javascript">
window.location="../view_catalogos.jsp";
alert('Departamento agregado ');
</script>           
    <%
    } catch (Exception e) {
//         out.print("Error " + "<a href='cont_solic.jsp'>Regresar</a>");
    %>
          <script type="text/javascript">
window.back();
alert('Error al agregar departamento');
</script>           
    <%
                          out.println(e);
                      }
                  }

if (request.getParameter("agregarP") != null) {

     String nombrePuesto = request.getParameter("nombrePuesto");
     int selectDepto =Integer.parseInt(request.getParameter("selectDepto")) ;
//         int cantidad =Integer.parseInt(request.getParameter("cantidad")) ;

     try {
         d.conectar();
         d.agregarPuesto(nombrePuesto, selectDepto);
//             d.agregarInventario(nombre, cantidad);
//             d.agregarCantInventario(nombre,cantidad);
    %>
          <script type="text/javascript">
window.location="../view_catalogos.jsp";
alert('Puesto agregado ');
</script>           
    <%
    } catch (Exception e) {
//         out.print("Error " + "<a href='cont_solic.jsp'>Regresar</a>");
    %>
          <script type="text/javascript">
window.back();
alert('Error al agregar puesto');
</script>           
    <%
                          out.println(e);
                      }
                  }


//else{
//  
//                   String Del = request.getParameter("Del");
//                   String Modif = request.getParameter("Modif");
//                   String Habi = request.getParameter("Habi");
//
////   int Del = Integer.parseInt(request.getParameter("Del"));
//
// if (Del != null){
// Dao d1 = new Dao();
//   
//         try {
//
//                 d1.conectar();
//                 
//                   d1.EliminarInventario(Del);
//                    
//%>
//          <script type="text/javascript">
//window.location="view_inventario.jsp";
//alert('Equipo o mobiliario deshabilitado ');
//</script>           
//              <%                  
//                 
//} catch (Exception e) {
//                 out.println("gff" );
//             }
//
//}else{ //----MODIFICAR CANTIDAD DE INVENTARIO
//
//
//
//
//
//
//
// if (Habi != null){
// Dao d1 = new Dao();
//   
//         try {
//
//                 d1.conectar();
//                 
//                   d1.HabilitarInventario(Habi);
//                    
//%>
//          <script type="text/javascript">
//alert('Equipo o mobiliario habilitado ');
//window.location="view_inventario.jsp";
//</script>           
//              <%                  
//                 
//} catch (Exception e) {
//                 out.println("gff" );
//             }
//
//}
//
//else{
//
//
//
//
//
//
//
//
//
//
//
//
//if (Modif != ""){
//
//         int cantidadN =Integer.parseInt(request.getParameter("cantidadN")) ;
// Dao d1 = new Dao();
//   
//         try {
//
//                 d1.conectar();
//                 
//                   d1.modificarCantInventario(Modif,cantidadN);
//                    
//%>
//          <script type="text/javascript">
//window.location="view_inventario.jsp";
//alert('Cantidad modificada ');
//</script>           
//              <%                  
//                 
//} catch (Exception e) {
//                 out.println("gff" );
//             }
//} // END IF MODIF
//
//}
//
//} //END IF ELSE DEL
//} //END IF ELSE AGREGAR
    %>
   
    </body>
</html>
