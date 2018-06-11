package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.util.Vector;
import beans.Sql;
import beans.*;

public final class view_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\"> \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>SB Admin 2 - Bootstrap Admin Theme</title>\n");
      out.write("\n");
      out.write("     <link href=\"SB Admin 2/bootstrapE.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"SB Admin 2/metisMenu2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"SB Admin 2/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"SB Admin 2/font-awesome2.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"js/md5.js\"></script>\n");
      out.write("    <link href=\"SB Admin 2/blog2.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\" ></script>\n");
      out.write("          \n");
      out.write("          <script type=\"text/javascript\" >\n");
      out.write("    \n");
      out.write("    function select_depto(){\n");
      out.write("        \n");
      out.write("//        alert(\"Cambiar\");\n");
      out.write("        \n");
      out.write("        $(\"#f_opc\").val(\"1\")\n");
      out.write("        $.post(\"selectD.jsp\",$(\"#reg\").serialize(),function(data){$(\"#i_depto\").html(data);});\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function select_puesto(){\n");
      out.write("        \n");
      out.write("//        alert(\"Cambiar\");\n");
      out.write("        \n");
      out.write("        $(\"#f_opc\").val(\"1\")\n");
      out.write("        $.post(\"selectP.jsp\",$(\"#reg\").serialize(),function(data){$(\"#i_puesto\").html(data);});\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("          </script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("      <div class=\"container nav-contain\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <img style=\"padding-left:10px\" src=\"images/UXBanner.png\" alt=\"Universidad de Xalapa logo logo\" width=\"270\" >\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"view_solicitudes_admin.jsp\">Solicitud de espacios</a></li>\n");
      out.write("            <li><a  href=\"view_consulta_admin.jsp\">Consulta de solicitudes</a></li>\n");
      out.write("            <li><a  href=\"view_reportes.jsp\">Reportes</a></li>\n");
      out.write("            <li><a  href=\"view_espacios.jsp\">Espacios</a></li>\n");
      out.write("            <li><a href=\"view_inventario.jsp\">Inventario</a></li>\n");
      out.write("            <li><a  href=\"view_register.jsp\">Registro</a></li>  \n");
      out.write("            <li><a  href=\"view_catalogos.jsp\">Catalogos</a></li> \n");
      out.write("   ");
 
       
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
   
    
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--/.nav-collapse --> \n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div style=\"padding-top: 70px\" class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                <div class=\"login-panel panel panel-default\">\n");
      out.write("                    <div  class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Regístro de usuarios</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form role=\"form\" action=\"controllers/cont_register.jsp\" method=\"post\" id=\"reg\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Nombre\" name=\"nombre\" type=\"text\" autofocus required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Apellido paterno\" name=\"paterno\" type=\"text\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Apellido materno\" name=\"materno\" type=\"text\" required>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Correo electrónico\" name=\"correo\" type=\"email\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Nombre de usuario\" name=\"nombre_usuario\" type=\"text\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Contraseña\" name=\"contrasena\" type=\"password\" required onkeyup=\"this.form.f_passwe.value=md5(this.form.contrasena.value)\">\n");
      out.write("                                    <input id=\"pass1\" type=\"hidden\" name=\"f_passwe\" size=\"50\">\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Confirmar contraseña\" name=\"cContrasena\" onblur=\"myFunction()\" type=\"password\" required onkeyup=\"this.form.f_passwe2.value=md5(this.form.cContrasena.value)\">\n");
      out.write("                                    <input id=\"pass2\" type=\"hidden\" name=\"f_passwe2\" size=\"50\">\n");
      out.write("                                </div>\n");
      out.write("                                <script>\n");
      out.write("                                function myFunction() {\n");
      out.write("                                    var pass1 = document.getElementById(\"pass1\");\n");
      out.write("                                    var pass2 = document.getElementById(\"pass2\");\n");
      out.write("\n");
      out.write("                                    if(pass1.value !== pass2.value)\n");
      out.write("                                        alert(\"Las contraseñas no coinciden\");\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
      out.write("                                <input type=\"hidden\" name=\"i_opc\" id=\"i_opc\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label>Área</label>\n");
      out.write("                                     <select class=\"form-control\" name=\"area\" onclick=\"select_depto()\" >\n");
      out.write("                                    ");

//                                            Dao d = new Dao();
//
//                                         ResulSet rs = d.listarArea();
                                    Vector selctArea = Sql.consulta("select * from Area");
                                    for (int fils = 1; fils < selctArea.size(); ++fils) {
                                        String[] unaFila = (String[]) selctArea.get(fils);
                                
      out.write("\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                <option value=\"");
      out.print(unaFila[0]);
      out.write("\"> ");
      out.print(unaFila[1]);
      out.write("</option>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label>Departamento</label>\n");
      out.write("                                     <select class=\"form-control\" name=\"departamento\" id=\"i_depto\" onclick=\"select_puesto()\">\n");
      out.write("                                    ");

//                                    Vector selctDepto = Sql.consulta("select * from Depto");
//                                    for (int fils = 1; fils < selctDepto.size(); ++fils) {
//                                        String[] unaFila = (String[]) selctDepto.get(fils);
                                
      out.write("\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                        <option value=\"\">--Seleccione el área --");
//=unaFila[1]
      out.write("</option>\n");
      out.write("                                        ");
//}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                     <label>Puesto</label>\n");
      out.write("                                     <select class=\"form-control\" name=\"puesto\" id=\"i_puesto\">\n");
      out.write("                                    <option> --Seleccione el departamento --</option>     \n");
      out.write("                                    </select>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"col-md-4b\">\n");
      out.write("                                        <label>Privilegios de usuario:</label>\n");
      out.write("                                        <p></p>\n");
      out.write("                                        <label class=\"radio-inline radio-inlineB\">\n");
      out.write("                                            <input type=\"radio\" name=\"privilegio\" id=\"optionsRadiosInline1\" value=\"normal\" checked=\"\">Sin privilegios\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline radio-inlineB\">\n");
      out.write("                                            <input type=\"radio\" name=\"privilegio\" id=\"optionsRadiosInline2\" value=\"admin\">Administrador\n");
      out.write("                                        </label>  \n");
      out.write("                                        <label class=\"radio-inline radio-inlineB\">\n");
      out.write("                                            <input type=\"radio\" name=\"privilegio\" id=\"optionsRadiosInline3\" value=\"super\">Supervisor\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <p></p>   \n");
      out.write("                                \n");
      out.write("                                <!-- Change this to a button or input when using this as a form -->\n");
      out.write("                                <input class=\"float-right\" type=\"submit\" name=\"button\" id=\"button\" value=\"Registrar\">                                \n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<footer class=\"sticky-footer\">\n");
      out.write("      <div style=\"background-color: #e9e7e7; padding: 10px 15px; width: 100%;\"class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <small>2018 Universidad de Xalapa | Derechos Reservados </small>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"../vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"../vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"../vendor/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"../dist/js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<script src=\"./SB Admin 2/jquery.min.js.descarga\"></script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"./SB Admin 2/bootstrap.min.js.descarga\"></script>\n");
      out.write("\n");
      out.write("<!-- Metis Menu Plugin JavaScript -->\n");
      out.write("<script src=\"./SB Admin 2/metisMenu.min.js.descarga\"></script>\n");
      out.write("\n");
      out.write("<!-- Custom Theme JavaScript -->\n");
      out.write("<script src=\"./SB Admin 2/sb-admin-2.js.descarga\"></script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
