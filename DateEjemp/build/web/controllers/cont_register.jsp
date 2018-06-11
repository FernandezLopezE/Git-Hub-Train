<%-- 
    Document   : Recoge_datos
    Created on : Sep 20, 2017, 10:41:19 PM
    Author     : Eddard
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <%@page import = "java.io.*" %> 
         <%@page import="java.sql.*" %>
         <%@page  import ="com.microsoft.sqlserver.jdbc.*" %>  
         
         <%@page import = "java.util.regex.*" %> 
          <%@page import = "clases.*" %> 
          <%@page import = "beans.*" %> 
          
       
       
         <%@page import = "javax.servlet.http.HttpServlet" %> 
         <%@page import = "javax.servlet.http.HttpServletRequest" %> 
         <%@page import = "javax.servlet.http.HttpServletResponse" %> 
         <%@page import = "javax.servlet.http.HttpSession" %> 
         <%@page import = "javax.servlet.ServletException" %> 
         
            <% 
       
       //                     correo = sesion.getAttribute("correo").toString();
//                    out.print("<a class='nav-link' href='view_login.jsp?cerrar=true'>Cerrar sesión "+ correo +"</a>");

    HttpSession sesion = request.getSession(true);


    %>
        
        <%
            
           HttpSession respuesta = request.getSession(true);

               request.setCharacterEncoding("UTF-8");
               String nombre = request.getParameter("nombre");
               String paterno = request.getParameter("paterno");
               String materno = request.getParameter("materno");
               String nombre_usuario = request.getParameter("nombre_usuario");
//               String contrasena = request.getParameter("contrasena");   
               String f_passwe = request.getParameter("f_passwe"); 
               String correo = request.getParameter("correo");
               String privilegio = request.getParameter("privilegio"); 
               
               int area = Integer.parseInt(request.getParameter("area"));
               int departamento = Integer.parseInt(request.getParameter("departamento"));
               int puesto = Integer.parseInt(request.getParameter("puesto"));
    
//    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//    Connection con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;"  
//                    + "database=Solicitudes;"  
//                    + "user=sa;"  
//                    + "password=root;") ;
//    Statement st = con.createStatement();
//    ResultSet rs;
 if(sesion.getAttribute("id_usuario")!= null){   
    DaoUser d = new DaoUser();
    
//    if(nombre.isEmpty() || paterno.isEmpty() || materno.isEmpty() || nombre_usuario.isEmpty() || contrasena.isEmpty() || correo.isEmpty()){
////            respuesta.setAttribute("error", "Hay campos vacios");
//            out.println("Hay campos vacios");
//        } else {
         try{
       
      d.conectar();
       
       if(d.isEmailRegistered(correo)|| d.isUsernameRegistered(nombre_usuario)){
                                   respuesta.setAttribute("error", "Esta direccion de correo ya fue registrada");
%>
          <script type="text/javascript">
window.location="../view_register.jsp";
alert('El nombre de usuario o correo ya está registrado');
</script>           
              <%
       
       } else {
//       int i = st.executeUpdate("INSERT INTO Usuario (nombre, paterno, materno, nombre_usuario, contrasena, depto, correo) VALUES"
//                            + "('"+nombre+"','"+paterno+"','"+materno+"','"+nombre_usuario+"','"+contrasena+"','"+departamento+"','"+correo+"') ");
               d.registerUser(nombre, paterno, materno,nombre_usuario,f_passwe,correo,privilegio,area,departamento,puesto);
                                   respuesta.setAttribute("error", null);
%>
          <script type="text/javascript">
window.location="../view_register.jsp";
alert('Usuario registrado');
</script>           
              <%


//                                            if (i > 0) {
//                                                //session.setAttribute("userid", user);
//                                                //response.sendRedirect("welcome.jsp");
//                                                out.print("Registration Successfull!"+"<a href='index_1.jsp'>Go to Login</a>");
//                                            } else {
//                                                response.sendRedirect("index_1.jsp");
//                                            }

           
              d.desconectar();
       }
         }catch (Exception e) { out.println("Ocurrio la sig exception: " +e); }
    
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



 <%-- 
    
 
  String connectionString =  
                    "jdbc:sqlserver://127.0.0.1:1433;"  
                    + "database=Solicitudes;"  
                    + "user=sa;"  
                    + "password=root;"  
                    
                    + "loginTimeout=10;";  

                 // Declare the JDBC objects.  
                Connection connection = null;  
                Statement statement = null;   
                ResultSet resultSet = null;  
                PreparedStatement prepsInsertProduct = null;  

                try {  
                    connection = DriverManager.getConnection(connectionString);  
                    out.println("Conectado");
                // Create and execute an INSERT SQL prepared statement.  
                    String insertSql = "INSERT INTO Usuario (nombre, paterno, materno, nombre_usuario, contrasena, depto, correo) VALUES"
                            + "('"+nombre+"','"+paterno+"','"+materno+"','"+nombre_usuario+"','"+contrasena+"','"+departamento+"','"+correo+"') ";

                    prepsInsertProduct = connection.prepareStatement(  
                        insertSql,  
                        Statement.RETURN_GENERATED_KEYS);  
                    prepsInsertProduct.execute();  

                    // Retrieve the generated key from the insert.  
                    resultSet = prepsInsertProduct.getGeneratedKeys();  

                    // Print the ID of the inserted row.  
                    while (resultSet.next()) {  
                        System.out.println("Generated: " + resultSet.getString(1));  
                    }  
                    
                    out.print("Registrado con exito");
                }  
                catch (Exception e) {  
                    e.printStackTrace();
                    out.print(" Error ");
                }  
                finally {  
                    // Close the connections after the data has been handled.  
                    if (prepsInsertProduct != null) try { prepsInsertProduct.close(); } catch(Exception e) {}  
                    if (resultSet != null) try { resultSet.close(); } catch(Exception e) {}  
                    if (statement != null) try { statement.close(); } catch(Exception e) {}  
                    if (connection != null) try { connection.close(); } catch(Exception e) {}  
                }
            
            
            
            
            
           
            //try{
            //java.sql.Connection miConexion= java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost/Solicitudes","sa","root");
           // java.sql.Statement miStatement = miConexion.createStatement();
                    //String instruccionSql="INSERT INTO 'usuarios'('nombre','paterno','materno','nombre_usuario','contrasena','depto','correo') VALUES ('"+nombre+"','"+paterno+"','"+materno+"','"+usuario+"','"+contrasena+"','"+departamento+"','"+correo+"') ";
   // miStatement.execute(instruccionSql);
    //out.print("Registrado con exito");
          //  }catch (Exception e)  {
               // out.print("Ha habido un error");
            //}
 
 
 
--%>