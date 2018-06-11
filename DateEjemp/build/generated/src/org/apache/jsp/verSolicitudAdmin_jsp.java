package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.LinkedList;
import beans.ConsultaBD;
import beans.Consulta;

public final class verSolicitudAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("         <link href=\"SB Admin 2/bootstrapE.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <link href=\"SB Admin 2/tablaStyle.css\" rel=\"stylesheet\">\n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--        <h3 class=\"bordertop\">Eventos próximos</h3>\n");
      out.write("        <p>Listado de los eventos próximos a realizarse.</p>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-lg-5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--        <h3 class=\"bordertop\">Eventos próximos</h3>\n");
      out.write("        <p>Listado de los eventos próximos a realizarse.</p>-->\n");

     int ver = Integer.parseInt(request.getParameter("ver"));
                     if (Integer.parseInt(request.getParameter("ver"))!=0){
                        
                         

      out.write("\n");
      out.write("      \n");
      out.write("  <div class=\"table-wrapper\">\n");
      out.write("            <div class=\"table-title\">\n");
      out.write("                <h4><a href=\"view_consulta_admin.jsp\">Regresar</a></h4>\n");
      out.write("                <h3 style=\"text-align:center\">Datos de la solicitud</h3>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" <table class=\"table table-striped table-bordered table-hover dataTable no-footer dtr-inline\">\n");
      out.write("                ");
LinkedList<Consulta> lista = ConsultaBD.getConsultaVerAdmin(ver);
                for (int i=0;i<lista.size();i++){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Nombre de evento\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getNombre() + "</td>"); 
      out.write("\n");
      out.write("                    </th>       \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Origen\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getOrigen() + "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Lugar\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getLugar()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Nombre del solicitante\n");
      out.write("<!--                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getSolicitante() + " " + lista.get(i).getPaterno() + " " + lista.get(i).getMaterno() + "  </td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Puesto\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getPnombre() + " </td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Fecha\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getFecha()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Hora de Montaje\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getHoraMon()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Hora de inicio\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getHoraIni()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Hora de término\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getHoraFin()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                       Telefono\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getTelefono()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                       Tipo de organización\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getOrg()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                      Espacio\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getEspacio()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                      Estatus\n");
      out.write("                        ");
   out.println("<td>" + lista.get(i).getEstatus()+ "</td>"); 
      out.write("\n");
      out.write("                    </th>                 \n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                               \n");
      out.write("             \n");
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        <th>\n");
      out.write("                      Inventario solicitado\n");
      out.write("        <td> \n");
      out.write("  ");
LinkedList<Consulta> lista2 = ConsultaBD.getConsultaVerInvAdmin(ver);
                for (int j=0;j<lista2.size();j++){
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--    <td>Sillas \" + lista.get(i).getInv1()+ \",<br> Mesa chica \" + lista.get(i).getInv2()+ \" , \"-->\n");
      out.write("                    \n");
      out.write("                        ");
   out.println( lista2.get(j).getNombreI()+ ", "+lista2.get(j).getCantidad_s()+"<br>"); 
      out.write("\n");
      out.write("                        ");
 //   out.println("<td>" + lista2.get(j).getCantidad_s()+ "</td>"); 
      out.write("\n");
      out.write("                  \n");
      out.write("\n");
}
      out.write("\n");
      out.write("</td>\n");
      out.write("  </th>                 \n");
      out.write("                </tr>\n");
      out.write("     ");
}
      out.write("   \n");
      out.write("    </table>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- /.col-lg-3 -->\n");
      out.write("</div>\n");
      out.write("<!-- /.col-lg-3 -->\n");
      out.write("\n");
      out.write("                \n");
      out.write("<div id=\"response\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
