package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.LinkedList;
import beans.*;
import beans.Sql;
import java.util.Vector;
import beans.Consulta;
import beans.ConsultaBD;
import java.util.LinkedList;

public final class view_005fsolicitudes_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0077)https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/forms.html -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");

//response.setHeader( "Pragma", "no-cache" ); 
//response.addHeader( "Cache-Control", "must-revalidate" ); 
//response.addHeader( "Cache-Control", "no-cache" ); 
//response.addHeader( "Cache-Control", "no-store" ); 
//response.setDateHeader("Expires", 0); 

      out.write(" \n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Solicitud de eventos</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"SB Admin 2/bootstrapE.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"SB Admin 2/metisMenu2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"SB Admin 2/sb-admin-22.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"SB Admin 2/font-awesome2.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <link href=\"SB Admin 2/blog2.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"SB Admin 2/tablaStyle.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-light static-top sb-navbar\" role=\"navigation\">\n");
      out.write("            <div class=\"container nav-contain\">\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img style=\"padding-left:10px\" src=\"images/UXBanner.png\" alt=\"Universidad de Xalapa logo logo\" width=\"270\" >\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"view_solicitudes_admin.jsp\">Solicitud de espacios</a></li>\n");
      out.write("                        <li><a  href=\"view_consulta_admin.jsp\">Consulta de solicitudes</a></li>\n");
      out.write("                        <li><a  href=\"view_reportes.jsp\">Reportes</a></li>\n");
      out.write("                        <li><a  href=\"view_espacios.jsp\">Espacios</a></li>\n");
      out.write("                        <li><a href=\"view_inventario.jsp\">Inventario</a></li>\n");
      out.write("                        <li><a  href=\"view_register.jsp\">Registro</a></li>\n");
      out.write("                        <li><a  href=\"view_catalogos.jsp\">Catalogos</a></li> \n");
      out.write("                        <!--            </ul>\n");
      out.write("                                    <ul class=\"nav navbar-nav \">-->\n");
      out.write("\n");
      out.write("                        <!--                .mx-auto{margin-right:auto!important}.mb-auto,.my-auto{margin-bottom:auto!important}.ml-auto,.mx-auto{margin-left:auto!important;}-->\n");
      out.write("                        ");

                            HttpSession sesion = request.getSession(true);

                            //    String nombre;
                            String nombre_usuario;

                            String privilegio;
                            if (sesion.getAttribute("privilegio") == "normal") {

                                response.sendRedirect("view_solicitudes_cliente.jsp");
                            }
                            if (sesion.getAttribute("privilegio") == "super") {

                                response.sendRedirect("view_solicitudes_super.jsp");
                            }
                            if (sesion.getAttribute("nombre_usuario") != null && sesion.getAttribute("privilegio") != null) {
                                nombre_usuario = sesion.getAttribute("nombre_usuario").toString();
                                //    String nombre=(String)sesion.getAttribute("nombre"); out.println("Contenido de nombre: "+nombre);
                                privilegio = sesion.getAttribute("privilegio").toString();
                                out.print("<li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-delay='1000' data-close-others='false'>" + nombre_usuario + " <b class='caret'></b></a>");
                                out.print("<ul class='dropdown-menu'><li><a href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión </a></li></ul></li>");
                                //    out.print("<li class='dropdown'>"+nombre_usuario+"<a href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión </a></li>");
                                //     out.print("<a class='nav-link' href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión "+ nombre_usuario +"</a>");
                                //    out.print("<a href = 'view_loguin.jsp?cerrar = true'> "+ correo +"</a>");

                                int id_usuario = (int) sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
                                sesion.setAttribute("id_usuario", id_usuario);
                                //out.println("Poniendo usuario en sesion ...");
                            } else {
                                response.sendRedirect("view_login.jsp");
                                //    out.print("<script> location.replace('view_login.jsp'); </script>");
                            }

                        
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--/.nav-collapse --> \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\" style=\"min-height: 537px;\">\n");
      out.write("\n");
      out.write("            <form role=\"form\" action=\"controllers/cont_solic_admin.jsp\" method=\"post\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/include_solicitudes.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"sticky-footer\">\n");
      out.write("    <div style=\"background-color: #e9e7e7; padding: 10px 15px; width: 100%;\"class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            <small>2018 Universidad de Xalapa | Derechos Reservados </small>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer> \n");
      out.write("\n");
      out.write("</body></html><!-- jQuery -->\n");
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
