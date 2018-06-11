package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import beans.Consulta;
import beans.ConsultaBD;
import java.util.LinkedList;

public final class view_005fespacios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"SB Admin 2/tablaStyle.css\" rel=\"stylesheet\">\n");
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
      out.write("            <li><a  href=\"view_register.jsp\">Registro</a></li> \n");
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
      out.write("    <div class=\"col-lg-9\">\n");
      out.write("        <div class=\"table-wrapper\">\n");
      out.write("            <div class=\"table-title\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div style=\"padding-top: 60px\" class=\"col-sm-8\"><h2>Espacios</h2></div>\n");
      out.write("<!--                    <div class=\"col-sm-4\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info add-new\"><i class=\"fa fa-plus\"></i> Add New</button>\n");
      out.write("                    </div>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <table class=\"table table-striped table-bordered table-hover dataTable no-footer dtr-inline\">\n");
      out.write("<tr>\n");
      out.write("<!--<th>id</th>-->\n");
      out.write("<th>Id espacio</th>\n");
      out.write("<th>Nombre</th>\n");
      out.write("<th>Descripción</th>\n");
      out.write("<th>Acciones</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<th>Acciones</th>-->\n");
      out.write("</tr>\n");
      out.write("</tr>\n");


int id_usuario =(int)sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
sesion.setAttribute("id_usuario", id_usuario );
    
LinkedList<Consulta> lista = ConsultaBD.getConsultasEspacios();
for (int i=0;i<lista.size();i++)
{
 out.println("</tr>");


      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("    <td>");
      out.print( lista.get(i).getId_espacio()  );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( lista.get(i).getEnombre()  );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( lista.get(i).getEdescripcion()  );
      out.write("</td>\n");
      out.write("    <td> <a title=\"Eliminar\" href=\"cont_espacio.jsp?Del=");
      out.print(lista.get(i).getId_espacio());
      out.write("\"><span class=\"glyphicon glyphicon-remove\"></span></a></td>\n");
      out.write("\n");
      out.write("</tr>\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("<div style=\"padding-top: 110px\" class=\"col-lg-3\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <b>Agregar nuevo espacio</b> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"cont_espacio.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"nombre\">Nombre</label>\n");
      out.write("                        <div style=\"padding-left: 0px\" class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" name=\"Enombre\" class=\"form-control\" id=\"nombre\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"descripcion\">Descripcion</label>\n");
      out.write("                        <div style=\"padding-left: 0px\" class=\"col-sm-10\">\n");
      out.write("                            <textarea name=\"Edescripcion\" class=\"form-control\" id=\"descripcion\" required ></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                            <button name=\"agregar\" type=\"submit\" class=\"btn btn-default\">Agregar</button>\n");
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
