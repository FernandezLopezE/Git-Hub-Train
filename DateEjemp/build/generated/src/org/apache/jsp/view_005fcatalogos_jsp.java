package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Dao;
import java.util.Vector;
import beans.Sql;
import java.text.SimpleDateFormat;
import beans.Consulta;
import beans.ConsultaBD;
import java.util.LinkedList;

public final class view_005fcatalogos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
//@page contentType="text/html" pageEncoding="UTF-8"
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        \n");
      out.write("         <link href=\"SB Admin 2/tablaStyle.css\" rel=\"stylesheet\">\n");
      out.write("         \n");
      out.write("           <link href=\"SB Admin 2/bootstrapE.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"SB Admin 2/metisMenu2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"SB Admin 2/sb-admin-22.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"SB Admin 2/font-awesome2.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <link href=\"SB Admin 2/blog2.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("            <li><a  href=\"view_register.jsp\">Registro</a></li>   \n");
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
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("<div style=\"padding-top: 110px\" class=\"col-lg-4\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <b>Agregar áreas</b> \n");
      out.write("        </div>\n");
      out.write("        <br>    <br>     \n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"controllers/cont_catalogos.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"nombreArea\">Nombre</label>\n");
      out.write("                        <div style=\"padding-left: 0px\" class=\"col-sm-12\">\n");
      out.write("                            <input type=\"text\" name=\"nombreArea\" class=\"form-control\" id=\"nombre\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  <br>\n");
      out.write("                \n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <div class=\"col-sm-offset-4 col-sm-12\">\n");
      out.write("                            <button name=\"agregarA\" type=\"submit\" class=\"btn btn-default\">Agregar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div> <br>\n");
      out.write("        <!-- /.panel-body -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.panel -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("<div style=\"padding-top: 110px\" class=\"col-lg-4\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <b>Agregar departamentos</b> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"controllers/cont_catalogos.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"nombreDepto\">Nombre</label>\n");
      out.write("                        <div style=\"padding-left: 0px\" class=\"col-sm-12\">\n");
      out.write("                            <input type=\"text\" name=\"nombreDepto\" class=\"form-control\" id=\"nombre\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                                     <label>Área a la que pertenece</label>\n");
      out.write("                                     <div style=\"padding-left: 0px\" class=\"col-sm-12\">\n");
      out.write("                                     <select class=\"form-control\" name=\"selectArea\"  >\n");
      out.write("                                    ");

//                                            Dao d = new Dao();
//
//                                         ResulSet rs = d.listarArea();
                                    Vector selctArea = Sql.consulta("select * from Area");
                                    for (int fils = 1; fils < selctArea.size(); ++fils) {
                                        String[] unaFila = (String[]) selctArea.get(fils);
                                
      out.write("\n");
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
      out.write("                                        </div>\n");
      out.write("                                </div>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <div class=\"col-sm-offset-4 col-sm-12\">\n");
      out.write("                            <button name=\"agregarD\" type=\"submit\" class=\"btn btn-default\">Agregar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.panel-body -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.panel -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"padding-top: 110px\" class=\"col-lg-4\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <b>Agregar puestos</b> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"controllers/cont_catalogos.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"nombrePuesto\">Nombre</label>\n");
      out.write("                        <div style=\"padding-left: 0px\" class=\"col-sm-12\">\n");
      out.write("                            <input type=\"text\" name=\"nombrePuesto\" class=\"form-control\" id=\"nombre\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                                     <label>Departamento al que pertenece</label>\n");
      out.write("                                     <div style=\"padding-left: 0px\" class=\"col-sm-12\">\n");
      out.write("                                     <select class=\"form-control\" name=\"selectDepto\"  >\n");
      out.write("                                    ");

//                                            Dao d = new Dao();
//
//                                         ResulSet rs = d.listarArea();
                                    Vector selctDepto = Sql.consulta("select * from Depto");
                                    for (int fils = 1; fils < selctDepto.size(); ++fils) {
                                        String[] unaFila1 = (String[]) selctDepto.get(fils);
                                
      out.write("\n");
      out.write("                                    \n");
      out.write("                                <option value=\"");
      out.print(unaFila1[0]);
      out.write("\"> ");
      out.print(unaFila1[1]);
      out.write("</option>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                     </div>   \n");
      out.write("                                </div>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <div class=\"col-sm-offset-4 col-sm-12\">\n");
      out.write("                            <button name=\"agregarP\" type=\"submit\" class=\"btn btn-default\">Agregar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.panel-body -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.panel -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("<footer class=\"sticky-footer\">\n");
      out.write("      <div style=\"background-color: #e9e7e7; padding: 10px 15px; width: 100%;\"class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <small>2018 Universidad de Xalapa | Derechos Reservados </small>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
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
      out.write("<script src=\"./SB Admin 2/sb-admin-2.js.descarga\"></script>\n");
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
