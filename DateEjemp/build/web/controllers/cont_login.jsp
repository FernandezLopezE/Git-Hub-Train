<%@page import="beans.*"%>

<%@page import="java.io.IOException"%>
<%@ page import ="java.sql.*" %>
<%!
  
   
//   //metodo encargado de la gestión del método POST
//    protected void processRequestPOST(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        

//        String correo, contrasena;
//        correo = request.getParameter("correo");
//        contrasena = request.getParameter("contrasena");
//        //deberíamos buscar el usuario en la base de datos, pero dado que se escapa de este tema, ponemos un ejemplo en el mismo código
//        if(correo.equals("admin") && contrasena.equals("admin") && sesion.getAttribute("correo") == null){
//            //si coincide usuario y password y además no hay sesión iniciada
//            sesion.setAttribute("usuario", correo);
//            //redirijo a página con información de login exitoso
//            response.sendRedirect("loginExito.jsp");
//        }else{
//            //lógica para login inválido
//        }
//    }
//    
//   //método encargado de la gestión del método GET
//    protected void processRequestGET(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        //me llega la url "proyecto/login/out"
//        String action=(request.getPathInfo()!=null?request.getPathInfo():"");

//        if(action.equals("/out")){
//            sesion.invalidate();
//            response.sendRedirect("/home.jsp");
//        }else{
//           
//        }
//    }
//
// 
    %>

<%

//        
//      
//    
//    
//    String privilegio = request.getParameter("privilegio"); 
//     String correo = request.getParameter("correo");    
//    String contrasena = request.getParameter("contrasena");
//    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//    Connection con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;"  
//                    + "database=Solicitudes2;"  
//                    + "user=sa;"  
//                    + "password=root;") ; 
//    Statement st = con.createStatement();
//    ResultSet rs;
//    
//    
//        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String url = "jdbc:sqlserver://127.0.0.1:1433;";
//        String us = "sa";
//        String contra = "root";
//  
//    rs = st.executeQuery("select privilegio from Usuario where correo = '" + correo + "' and contrasena = '" + contrasena + "'");
//   try{
//    Class.forName(this.driver);
//   }catch{
//       
//   }
//    
//    if (rs.next()) {
//        
//        session.setAttribute("correo", correo);
//        //out.println("welcome " + userid);
//        //out.println("<a href='logout.jsp'>Log out</a>");
//        
//        rs = st.executeQuery("select * from Usuario where  correo = '" + correo + "' and privilegio = '" +"admin" + "' ");
//    if (rs.next()) {
//        response.sendRedirect("../view_solicitudes_admin.jsp");
//    } else{
//        response.sendRedirect("../view_solicitudes_cliente.jsp");
//    }
//    
//    }
//    else {
//        out.println("Invalid password <a href='index.jsp'>try again</a>");
//    }
//    
//    
//     
//    
//   

Operations op = new Operations();

if(request.getParameter ("iniciar")!=null){
    
 String nombre_usuario = request.getParameter("nombre_usuario");
//    int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
//  String id_usuario = request.getParameter("id_usuario");
 String f_passwe = request.getParameter("f_passwe");
 int id_usuario = op.obtenID(nombre_usuario, f_passwe);
 

  HttpSession sesion = request.getSession();
  sesion.setAttribute("id_usuario", id_usuario);
 switch(op.loguear(nombre_usuario, f_passwe)){
     
    case "admin": 
    sesion.setAttribute("nombre_usuario", nombre_usuario);
    sesion.setAttribute("privilegio", "admin");
    response.sendRedirect("../view_solicitudes_admin.jsp");
    
    break;
    
    case "normal": 
        sesion.setAttribute("nombre_usuario", nombre_usuario);
        sesion.setAttribute("privilegio", "normal");
        response.sendRedirect("../view_solicitudes_cliente.jsp");
     break;   
    case "super": 
        sesion.setAttribute("nombre_usuario", nombre_usuario);
        sesion.setAttribute("privilegio", "super");
        response.sendRedirect("../view_consulta_super.jsp");
    break;
          
    default:
        
  %>
          <script type="text/javascript">
window.location="../view_login.jsp";
alert('Usuario no registrado o contraseña incorrecta');
</script>           
              <%
        break;  
}
}
if (request.getParameter("cerrar")!=null){
//    request.getSession().invalidate();
  session.invalidate();
  response.sendRedirect("../view_login.jsp");
}
%>