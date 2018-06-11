<%-- 
    Document   : cont_modificar
    Created on : Mar 4, 2018, 2:44:12 PM
    Author     : lalof
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import = "java.io.*" %> 
         <%@page import="java.sql.*" %>
         <%@page  import ="com.microsoft.sqlserver.jdbc.*" %>  
         
         <%@page import = "java.util.regex.*" %> 

          <%@page import = "beans.*" %> 
          <%@page session='true'%>
       
       <%@page import="java.util.Vector"%>
         <%@page import = "javax.servlet.http.HttpServlet" %> 
         <%@page import = "javax.servlet.http.HttpServletRequest" %> 
         <%@page import = "javax.servlet.http.HttpServletResponse" %> 
         <%@page import = "javax.servlet.http.HttpSession" %> 
         <%@page import = "javax.servlet.ServletException" %> 

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="SB Admin 2/bootstrapE.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="SB Admin 2/metisMenu2.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="SB Admin 2/sb-admin-22.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="SB Admin 2/font-awesome2.min.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            
           HttpSession respuesta = request.getSession(true);
           HttpSession sesion=request.getSession(true); 

int id_usuario =(int)sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
sesion.setAttribute("id_usuario", id_usuario );

//int Modif = (int)sesion.getAttribute("Modif");
//sesion.setAttribute("Modif", Modif );
int Modif = Integer.parseInt(request.s);




 Dao d = new Dao();
   
         

                 d.conectar();
//request.setCharacterEncoding("UTF-8");
        String nombre = request.getParameter("nombre");
        String origen = request.getParameter("origen");
        String lugar = request.getParameter("lugar");
        String fecha = request.getParameter("fecha");
        String horaIni = request.getParameter("horaIni");
        String horaFin = request.getParameter("horaFin");
        String horaMon = request.getParameter("horaMon");
        String[] id_m = request.getParameterValues("id_m");
        String[] cantidad = request.getParameterValues("cantidad");
       
                   
                 

String spac="";
String espacio[]=request.getParameterValues("espacio");
try{
for(int i=0;i<espacio.length;i++){
    spac+=espacio[i]+" ";
                            }
} catch (Exception e) {
                 out.println("" );
             }
//------------------------------------------------------------------------------
    


                    long telefono = Long.parseLong(request.getParameter("telefono"));
//                       int teslefono = Integer.parseInt(request.getParameter("telefono"));
                       String org = request.getParameter("org");

  String coments = "";
          try {
              coments = request.getParameter("coments");
          } catch (Exception e) {
              coments = "";
          }
                      
//   if (Integer.parseInt(request.getParameter("Modif"))!=0){

       
        try {

     if (spac.equals(" ")) {

        %>                                                      
<script type="text/javascript">
alert('Seleccione o defina el lugar del evento');
//window.history.back();
</script>           
        <%                      } else {

            if (d.validarEspacioBC(spac) || d.validarEspacioABD(spac) || d.validarEspacioACD(spac)) {
        %>                                                      
<script type="text/javascript">
alert('No es posible seleccionar la combinación de los siguientes espacios: \n *Sum3A, Sum3B y Sum3D \n *Sum3A, Sum3C y Sum3D o \n *Sum3B y Sum3C');
//window.history.back();
</script>           
        <%
        } else {
            if (d.consultarFecha(fecha)) {
        if (d.validarHorasEspacio(fecha, horaIni, horaFin, spac)) {
        %>
                                                      
<script type="text/javascript">
alert('No es posible realizar el evento en el lugar o la hora seleccionada');
//window.history.back();
</script>           
        <%
        } else {
            if (d.validarHoras(fecha, horaIni, horaFin)) {

                if (id_m == null || id_m.length == 0) {
                    d.ModificarAdmin(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, Modif, coments) ;
        %>
                                                  <script type="text/javascript">
                                      alert('Solicitud enviada con éxito');
//                                        window.location="../view_solicitudes_admin.jsp";
                                        </script>             
        <%
        } else {

// VALIDAR INVENTARIO MISMAS HORAS
            int contador = 0;
            int suma = 0;
            for (int i = 0; i < id_m.length; i++) {

                contador = d.validarInv(id_m[i], cantidad[i], fecha, horaIni, horaFin);
                suma = suma + contador;
            }
            if (suma >= 100) {
        %>
                                                      <script type="text/javascript">

                                                          alert('No hay suficiente inventario');
//                                                          window.history.back();
                                                      </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        } else {
            try {
                int k = 0;
                 d.ModificarAdmin(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, Modif, coments) ;
                for (int j = 0; j < cantidad.length; j++) {

                    if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                        //                            out.print("vacio <br>");
                    } else {
                        d.ModificarAdminInv(id_m[k], cantidad[j], Modif) ;
//                        d.envigarSolInv(id_m[k], cantidad);
                        k++;
                    }//if else cantidad[] esta vacio
                } // end for
        %>
                                                      <script type="text/javascript">
                                          alert('Solicitud enviada con éxito');
//                                            window.location="../view_solicitudes_admin.jsp";
                                                      </script>             
        <%
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.print(e);

                    }
                } // END ELSE IF SUMA >= 100
            }// ELSE VALIDAR SI NO SE SOLICITA INVENTARIO
//------------------------------------------------------------------
        } else {
            if (id_m == null || id_m.length == 0) {
 d.ModificarAdmin(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, Modif, coments) ;
%>
                                                  <script type="text/javascript">
                                      alert('Solicitud enviada con éxito');
//                                        window.location="../view_solicitudes_admin.jsp";
                                        </script>             
        <%
        } else {
            // VALIDAR INVENTARIO FECHA NUEVA
            int contador = 0;
            int suma = 0;
            for (int i = 0; i < id_m.length; i++) {

                contador = d.validarFN(id_m[i], cantidad[i]);
                suma = suma + contador;
            }
            if (suma >= 100) {
        %>
        <script type="text/javascript">

            alert('No hay suficiente inventario');
//            window.history.back();
        </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        } else {
            try {
                int k = 0;
                 d.ModificarAdmin(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, Modif, coments) ;
                for (int j = 0; j < cantidad.length; j++) {

                    if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
//                        out.print("vacio <br>");
                    } else {
                        d.ModificarAdminInv(id_m[k], cantidad[j], Modif) ;
                        k++;
                    }//if else cantidad[] esta vacio
                } // end for
        %>
                                                  <script type="text/javascript">
                                       alert('Solicitud enviada con éxito');
//                                        window.location="../view_solicitudes_admin.jsp";
                                        </script>           
        <%
                                                                          } catch (Exception e) {
                                                                              e.printStackTrace();
                                                                              out.print(e);

                                                                          }
                                                                      } // END ELSE IF SUMA >= 100
//------------------------------------------------------------------
                                                                  } //ELSE VALIDAR SI NO SE SOLICITA INVENTARIO  
                                                              }  // END ELSE VALIDAR HORAS
                                                          }// validar horas y espacio
} else {
if (id_m == null || id_m.length == 0) {
 d.ModificarAdmin(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, Modif, coments) ;
%>
                                                  <script type="text/javascript">
                                      alert('Solicitud enviada con éxito');
//                                        window.location="../view_solicitudes_admin.jsp";
                                        </script>             
                                                      <%
                                                      } else {     // ......VALIDAR INVENTARIO EN UNA FECHA NUEVA....

                                                          int contador = 0;
                                                          int suma = 0;
                                                          for (int i = 0; i < id_m.length; i++) {

                                                              contador = d.validarFN(id_m[i], cantidad[i]);
                                                              suma = suma + contador;
                                                          }
                                                          if (suma >= 100) {
                                                      %>
        <script type="text/javascript">

            alert('No hay suficiente inventario');
//            window.history.back();
        </script>           
                                                      <%//      
                                                      } else {
                                                          try {
                                                              int k = 0;
                                                                 d.ModificarAdmin(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, Modif, coments);
                                                              for (int j = 0; j < cantidad.length; j++) {

                                                                  if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                                              //                                            out.print("vacio <br>");
                                                                  } else {
                                                                      //for (int j = 0; j < id_m.length; j++){
                                                                      //out.print("id= "+id_m);
                                                                      //            out.print("id= "+id_m[k]+" cantidad="+cantidad[i]+"<br>");
                                                                         d.ModificarAdminInv(id_m[k], cantidad[j], 13) ;
                                                                      k++;
                                                                  }//if else cantidad[] esta vacio
                                                              } // end for
                                                      %>
                                                  <script type="text/javascript">
                                      alert('Solicitud enviada con éxito');
//                                        window.location="../view_solicitudes_admin.jsp";
                                        </script>             
                                                      <%
                                                                                  } catch (Exception e) {
                                                                                      e.printStackTrace();
                                                                                      out.print(e); out.print("ERROOOOOR");

                                                                                  }
                                                                              } // END ELSE IF SUMA >= 100
                                                                          } //ELSE VALIDAR SI NO SE SOLICITA INVENTARIO  
                                                                      }//END ELSE CONSULTAR FECHA
                                                                  }  //end consultar espacios AB_D
                                                              }// end if (spac.equals(" "))

                                                          } catch (Exception e) {
                                                              e.printStackTrace();
                                                              out.print(e);

                                                          } //end try catch solicitud


   %>

     </body>
</html>
<script src="./SB Admin 2/jquery.min.js.descarga"></script>

<!-- Bootstrap Core JavaScript -->
<script src="./SB Admin 2/bootstrap.min.js.descarga"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="./SB Admin 2/metisMenu.min.js.descarga"></script>

<!-- Custom Theme JavaScript -->
<script src="./SB Admin 2/sb-admin-2.js.descarga"></script>
