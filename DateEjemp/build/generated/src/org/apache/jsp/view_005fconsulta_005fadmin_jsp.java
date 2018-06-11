package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Dao;
import java.text.SimpleDateFormat;
import beans.Consulta;
import beans.ConsultaBD;
import java.util.LinkedList;

public final class view_005fconsulta_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link href=\"SB Admin 2/tablaStyle.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"SB Admin 2/bootstrapE.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/dataTables.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"SB Admin 2/metisMenu2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"SB Admin 2/font-awesome2.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"SB Admin 2/blog2.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container nav-contain\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img style=\"padding-left:10px\" src=\"images/UXBanner.png\" alt=\"Universidad de Xalapa logo logo\" width=\"270\" >\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"view_solicitudes_admin.jsp\">Solicitud de espacios</a></li>\n");
      out.write("                        <li><a  href=\"view_consulta_admin.jsp\">Consulta de solicitudes</a></li>\n");
      out.write("                        <li><a  href=\"view_reportes.jsp\">Reportes</a></li>\n");
      out.write("                        <li><a  href=\"view_espacios.jsp\">Espacios</a></li>\n");
      out.write("                        <li><a href=\"view_inventario.jsp\">Inventario</a></li>\n");
      out.write("                        <li><a  href=\"view_register.jsp\">Registro</a></li>  \n");
      out.write("                        <li><a  href=\"view_catalogos.jsp\">Catalogos</a></li> \n");
      out.write("                            ");

                                HttpSession sesion = request.getSession(true);
                                String nombre_usuario;

                                String privilegio;
                                if (sesion.getAttribute("privilegio") == "normal") {

                                    response.sendRedirect("view_consulta_cliente.jsp");
                                }
                                if (sesion.getAttribute("privilegio") == "super") {

                                    response.sendRedirect("view_consulta_super.jsp");
                                }
                                if (sesion.getAttribute("nombre_usuario") != null && sesion.getAttribute("privilegio") != null) {
                                    nombre_usuario = sesion.getAttribute("nombre_usuario").toString();
                         //    String nombre=(String)sesion.getAttribute("nombre"); out.println("Contenido de nombre: "+nombre);
                                    privilegio = sesion.getAttribute("privilegio").toString();
                                    out.print("<li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-delay='1000' data-close-others='false'>" + nombre_usuario + " <b class='caret'></b></a>");
                                    out.print("<ul class='dropdown-menu'><li><a href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión </a></li></ul></li>");
                                    int id_usuario = (int) sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
                                    sesion.setAttribute("id_usuario", id_usuario);
                         //out.println("Poniendo usuario en sesion ...");
                                } else {
                                    response.sendRedirect("view_login.jsp");
                                }

                            
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div style=\"padding-top: 60px\" class=\"col-sm-8\"><h2>Solicitudes nuevas</h2></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <table class=\"table table-striped table-bordered table-hover dataTable no-footer dtr-inline\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Fecha</th>\n");
      out.write("                        <th>Hora de inicio</th>\n");
      out.write("                        <th>Hora de término</th>\n");
      out.write("                        <th>Solicitante</th>\n");
      out.write("                        <th>Lugar</th>\n");
      out.write("                    <th>Estatus</th>\n");
      out.write("                    <th>Visto bueno</th>\n");
      out.write("                    <th>Comentarios</th>\n");
      out.write("                    <th>Acciones</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
    LinkedList<Consulta> lista = ConsultaBD.getConsultasAdminNuevas();
                        for (int i = 0; i < lista.size(); i++) {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( lista.get(i).getNombre());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( lista.get(i).getFecha());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( lista.get(i).getHoraIni());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( lista.get(i).getHoraFin());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( lista.get(i).getSolicitante());
      out.write(' ');
      out.print( lista.get(i).getPaterno());
      out.write(' ');
      out.print( lista.get(i).getMaterno());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( lista.get(i).getEspacio());
      out.write("</td>\n");
      out.write("                        <td><b>");
      out.print( lista.get(i).getEstatus());
      out.write("</b></td> \n");
      out.write("                         <td align=\"center\">\n");
      out.write("\n");
      out.write("                        ");


                            Dao d = new Dao();
                            int vb = lista.get(i).getId_s();
                            try {
                                d.conectar();
                                if (d.comprobarVB(vb)) {
                                    out.print("<span class='glyphicon glyphicon-ok'></span>");

                                } else {
//out.print("<span class='glyphicon glyphicon-ok'></span>");
                                }
                            } catch (Exception e) {
                            }

                        
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <form action=\"rechazar.jsp?Rech=");
      out.print(lista.get(i).getId_s());
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <td><input maxlength=\"499\" type=\"text\" name=\"coments\" value=\"");
      out.print( lista.get(i).getComentario());
      out.write("\" style=\"outline: none;border: 0;\"> </td> \n");
      out.write("                        <td> <a title=\"Ver solicitud\" class=\"btn btn btn-info btn-xs\" href=\"verSolicitudAdmin.jsp?ver=");
      out.print(lista.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-th-list\"></span> </a> \n");
      out.write("                            <a title=\"Autorizar\" class=\"btn btn btn-info btn-xs\" href=\"autorizar.jsp?Aut=");
      out.print(lista.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-ok\"></span> </a>\n");
      out.write("                            <button title=\"Rechazar\" class=\"btn btn btn-info btn-xs\" ><span class=\"glyphicon glyphicon-remove\"></span></button>\n");
      out.write("                    </form>\n");
      out.write("                    <a title=\"Modificar\" class=\"btn btn btn-info btn-xs\" href=\"modificar.jsp?Modif=");
      out.print(lista.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-wrench\"></span></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8\"><h2>Solicitudes Anteriores</h2></div>\n");
      out.write("                    </div>   \n");
      out.write("                    <table id=\"eventsTable\"\n");
      out.write("                           data-toggle=\"table\"\n");
      out.write("                           data-height=\"\"\n");
      out.write("                           data-pagination=\"true\"\n");
      out.write("                           data-search=\"true\"\n");
      out.write("                           data-show-refresh=\"true\"\n");
      out.write("                           data-show-toggle=\"true\"\n");
      out.write("                           data-show-columns=\"true\"\n");
      out.write("                           data-card-visible=\"true\"\n");
      out.write("                           data-query-params=\"queryParams\"\n");
      out.write("                           data-page-list=\"[10, 25, 50, 100]\"\n");
      out.write("                           data-toolbar=\"#toolbar\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <!--        <th data-field=\"nombre\" data-checkbox=\"true\">nombre</th>-->\n");
      out.write("                                <th data-field=\"nombre\" data-sortable=\"true\">Nombre del evento</th>\n");
      out.write("                                <th data-field=\"fecha\" data-sortable=\"true\">Fecha</th>\n");
      out.write("                                <th data-field=\"horaIni\" data-sortable=\"true\">Hora de inicio</th>\n");
      out.write("                                <th data-field=\"horaFin\" data-sortable=\"true\">Hora de término</th>\n");
      out.write("                                <th data-field=\"solicitante\" data-sortable=\"true\">Solicitante</th>\n");
      out.write("                                <th data-field=\"lugar\" data-sortable=\"true\">Lugar</th>\n");
      out.write("                          <th data-field=\"estatus\" data-sortable=\"true\">Estatus</th>\n");
      out.write("                            <th  data-field=\"vistoBueno\" data-align=\"center\">Visto bueno</th>\n");
      out.write("                            <th data-field=\"comentario\" data-sortable=\"true\">Comentario</th>\n");
      out.write("                            <th data-field=\"acciones\">Acciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");

                            LinkedList<Consulta> lista4 = ConsultaBD.getConsultasAdminAnteriores();
                            for (int i = 0; i < lista4.size(); i++) {

                        
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( lista4.get(i).getNombre());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lista4.get(i).getFecha());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lista4.get(i).getHoraIni());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lista4.get(i).getHoraFin());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lista4.get(i).getSolicitante());
      out.write(' ');
      out.print( lista4.get(i).getPaterno());
      out.write(' ');
      out.print( lista4.get(i).getMaterno());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( lista4.get(i).getEspacio());
      out.write("</td>\n");
      out.write("                            <td><b>");
      out.print( lista4.get(i).getEstatus());
      out.write("</b></td> \n");
      out.write("                            <td align=\"center\">\n");
      out.write("\n");
      out.write("                        ");


                            Dao d = new Dao();
                            int vb = lista4.get(i).getId_s();
                            try {
                                d.conectar();
                                if (d.comprobarVB(vb)) {
                                    out.print("<span class='glyphicon glyphicon-ok'></span>");

                                } else {
//out.print("<span class='glyphicon glyphicon-ok'></span>");
                                }
                            } catch (Exception e) {
                            }

                        
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                            \n");
      out.write("                            <td> \n");
      out.write("                                <input maxlength=\"499\" type=\"text\" name=\"coments\" value=\"");
      out.print( lista4.get(i).getComentario());
      out.write("\" style=\"outline: none;border: 0;\"> \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a title=\"Ver solicitud\" class=\"btn btn btn-info btn-xs\" href=\"verSolicitudAdmin.jsp?ver=");
      out.print(lista4.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-th-list\"></span> </a> \n");
      out.write("                                <a title=\"Autorizar\" class=\"btn btn btn-info btn-xs\" href=\"autorizar.jsp?Aut=");
      out.print(lista4.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-ok\"></span> </a>\n");
      out.write("                                <a title=\"Rechazar\" class=\"btn btn btn-info btn-xs\"  href=\"rechazar.jsp?Rech=");
      out.print(lista4.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-remove\"></span></a>\n");
      out.write("                                <a title=\"Modificar\" class=\"btn btn btn-info btn-xs\" href=\"modificar.jsp?Modif=");
      out.print(lista4.get(i).getId_s());
      out.write("\"><span class=\"glyphicon glyphicon-wrench\"></span></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                    </table> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        <footer class=\"sticky-footer\">\n");
      out.write("            <div style=\"background-color: #e9e7e7; padding: 10px 15px; width: 100%;\"class=\"container\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <small>2018 Universidad de Xalapa | Derechos Reservados </small>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/bootstrap-table.js\"></script>\n");
      out.write("        <script  type=\"text/javascript\" src=\"js/bootstrap-table-es-ES.js\"></script>\n");
      out.write("            \n");
      out.write("        <p> <span id=\"nombre\"></span><span id=\"ap\"></span></p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
