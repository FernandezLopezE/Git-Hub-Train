<%-- 
    Document   : acciones_admin
    Created on : Jan 2, 2018, 4:22:14 PM
    Author     : lalof
--%>

<%@page import="beans.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
//            if (request.getParameter("autorizar")!=null){
////    request.getSession().invalidate();
//  session.invalidate();
//  response.sendRedirect("../view_login.jsp");
//}
       
//            session.setAttribute("id_s", Integer.parseInt(request.getParameter("id_s")));
    HttpSession respuesta = request.getSession(true);
  int cancel = Integer.parseInt(request.getParameter("cancel"));
  
  
 
 if (Integer.parseInt(request.getParameter("cancel"))!=0){
   
 Dao d = new Dao();
   
         try {

                 d.conectar();
                 } catch (Exception e) {
                 out.println("" );
             }
                   d.eliminarSolicitud(cancel);
   respuesta.setAttribute("error", null);

                   %>
          <script type="text/javascript">
window.location="view_consulta_cliente.jsp";
alert('Solicitud cancelada ');
</script>           
              <%
                 

 }
            %>
    </body>
</html>

