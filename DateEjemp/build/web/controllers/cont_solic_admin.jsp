<%-- 
    Document   : Recoge_datos
    Created on : Sep 20, 2017, 10:41:19 PM
    Author     : Eddard
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="beans.EnviarEmail"%>
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
                HttpSession sesion = request.getSession(true);

                if(sesion.getAttribute("id_usuario")!= null){
                
                int id_usuario = (int) sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
                sesion.setAttribute("id_usuario", id_usuario);

                String nombre = request.getParameter("nombre");
                String origen = request.getParameter("origen");
                String lugar = request.getParameter("lugar");
                String fecha = request.getParameter("fecha");
                String horaIni = request.getParameter("horaIni");
                String horaFin = request.getParameter("horaFin");
                String horaMon = request.getParameter("horaMon");

                String spac = "";
                String espacio[] = request.getParameterValues("espacio");
                try {
                    for (int i = 0; i < espacio.length; i++) {
                        spac += espacio[i] + " ";
                    }
                } catch (Exception e) {
                    out.println("");
                }
//------------------------------------------------------------------------------
                long telefono = Long.parseLong(request.getParameter("telefono"));
                String org = request.getParameter("org");

                Dao d = new Dao();
                d.conectar();

                String[] id_m = request.getParameterValues("id_m");
                String[] cantidad = request.getParameterValues("cantidad");

                String coments = "";
                try {
                    coments = request.getParameter("coments");
                } catch (Exception e) {
                    coments = "";
                }

                try {

                    d.conectar();

                    try {

                        if (spac.equals(" ")) {

        %>                                                      
        <script type="text/javascript">
        alert('Seleccione o defina el lugar del evento');
        window.history.back();
        </script>           
        <%                      } else {

            if (d.validarEspacioBC(spac) || d.validarEspacioABD(spac) || d.validarEspacioACD(spac)) {
        %>                                                      
        <script type="text/javascript">
        alert('No es posible seleccionar la combinación de los siguientes espacios: \n *Sum3A, Sum3B y Sum3D \n *Sum3A, Sum3C y Sum3D o \n *Sum3B y Sum3C');
        window.history.back();
        </script>           
        <%
        } else {
            if (d.consultarFecha(fecha)) {
                if (d.validarHorasEspacio(fecha, horaIni, horaFin, spac)) {
        %>

        <script type="text/javascript">
        alert('No es posible realizar el evento en el lugar o la hora seleccionada');
        window.history.back();
        </script>           
        <%
        } else {
            if (d.validarHoras(fecha, horaIni, horaFin)) {

                if (id_m == null || id_m.length == 0) {
                    d.enviarSolEve(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, id_usuario, coments);
                    d.enviarMail(nombre, fecha, horaIni, spac, coments, id_usuario);
        %>
        <script type="text/javascript">
alert('Solicitud enviada con éxito');
window.location="../view_solicitudes_admin.jsp";
        </script>             
        <%
        } else {

// VALIDAR INVENTARIO MISMAS HORAS
            int t = 0;
            int contador = 0;
            int suma = 0;
            for (int j = 0; j < cantidad.length; j++) {
                if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                    //                            out.print("vacio <br>");
                } else {
                    contador = d.validarInv(id_m[t], cantidad[j], fecha, horaIni, horaFin);
                    suma = suma + contador;
                    t++;
                }
            }
            if (suma >= 100) {
        %>
        <script type="text/javascript">

            alert('No hay suficiente inventario');
            window.history.back();
        </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        } else {
            try {
                int k = 0;
                d.enviarSolEve(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, id_usuario, coments);
                d.enviarMail(nombre, fecha, horaIni, spac, coments, id_usuario);
                    for (int j = 0; j < cantidad.length; j++) {

                    if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                        //                            out.print("vacio <br>");
                    } else {
                        d.enviarSolInv(id_m[k], cantidad[j]);
                        k++;
                    }//if else cantidad[] esta vacio
                } // end for
        %>
        <script type="text/javascript">
alert('Solicitud enviada con éxito');
window.location="../view_solicitudes_admin.jsp";
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
                d.enviarSolEve(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, id_usuario, coments);
                d.enviarMail(nombre, fecha, horaIni, spac, coments, id_usuario);
        %>
        <script type="text/javascript">
alert('Solicitud enviada con éxito');
window.location="../view_solicitudes_admin.jsp";
        </script>             
        <%
        } else {
            // VALIDAR INVENTARIO FECHA NUEVA
            int contador = 0;
            int suma = 0;
            int k = 0;
            for (int j = 0; j < cantidad.length; j++) {

                if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                    //                            out.print("vacio <br>");
                } else {

                    contador = d.validarFN(id_m[k], cantidad[j]);
                    suma = suma + contador;
                    k++;
                }
            }
            if (suma >= 100) {
        %>
        <script type="text/javascript">

            alert('No hay suficiente inventario');
            window.history.back();
        </script>           
        <%//      out.print("<h1> No hay suficiente inventario </h1>"+ cont);
        } else {
            try {
                int m = 0;
                d.enviarSolEve(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, id_usuario, coments);
                d.enviarMail(nombre, fecha, horaIni, spac, coments, id_usuario);
                    for (int j = 0; j < cantidad.length; j++) {

                    if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
//                        out.print("vacio <br>");
                    } else {
                        d.enviarSolInv(id_m[m], cantidad[j]);
                        m++;
                    }//if else cantidad[] esta vacio
                } // end for
        %>
        <script type="text/javascript">
alert('Solicitud enviada con éxito');
window.location="../view_solicitudes_admin.jsp";
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
                d.enviarSolEve(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, id_usuario, coments);

                    d.enviarMail(nombre, fecha, horaIni, spac, coments, id_usuario);
        %>
        <script type="text/javascript">
            alert('Solicitud enviada con éxito');
            window.location = "../view_solicitudes_admin.jsp";
        </script>             
        <%
        } else {     // ......VALIDAR INVENTARIO EN UNA FECHA NUEVA....

            int contador = 0;
            int suma = 0;
            int k = 0;
            for (int j = 0; j < cantidad.length; j++) {

                if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                    //                            out.print("vacio <br>");
                } else {

                    contador = d.validarFN(id_m[k], cantidad[j]);
                    suma = suma + contador;
                    k++;
                }
            }
            if (suma >= 100) {
        %>
        <script type="text/javascript">

            alert('No hay suficiente inventario');
            window.history.back();
        </script>           
        <%//      
        } else {
            try {
                int n = 0;
                d.enviarSolEve(nombre, origen, lugar, fecha, horaIni, horaFin, horaMon, telefono, org, spac, id_usuario, coments);
                    d.enviarMail(nombre, fecha, horaIni, spac, coments, id_usuario);
                for (int j = 0; j < cantidad.length; j++) {

                    if (cantidad[j] == null || cantidad[j] == "" || cantidad[j].isEmpty()) {
                        //                                            out.print("vacio <br>");
                    } else {
                        //for (int j = 0; j < id_m.length; j++){
                        //out.print("id= "+id_m);
                        //            out.print("id= "+id_m[k]+" cantidad="+cantidad[i]+"<br>");
                        d.enviarSolInv(id_m[n], cantidad[j]);
                        n++;
                    }//if else cantidad[] esta vacio
                } // end for
        %>
        <script type="text/javascript">
            alert('Solicitud enviada con éxito');
            window.location = "../view_solicitudes_admin.jsp";
        </script>             
        <%
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        out.print(e);

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
<!--          <script type="text/javascript">
//window.location="../view_solicitudes_admin.jsp";
alert('Solicitud enviada con éxito');
</script>           -->
              <%


 } catch (Exception e) { // try conectar()
//                 out.println(e);
             } 
}else{
  %>
        <script type="text/javascript">
            alert('La sesión ha finalizado, inicie sesión para continuar');
            window.location = "../view_login.jsp";
        </script>             
        <%
}
        %>
    </body>
</html>





