<%-- 
    Document   : autorizarVB
    Created on : Apr 22, 2018, 11:21:49 PM
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


st.executeUpdate("UPDATE solicitud_evento SET estatus='Autorizado', vistoBueno =1 WHERE id_s='"+Aut+"' ");
d.enviarMailAutorizar(Aut);

        %>
          <script type="text/javascript">
              alert('Solicitud autorizada');
window.location="view_consulta_super.jsp";
</script>           
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
