<%-- 
    Document   : include_navbar
    Created on : Apr 22, 2018, 5:59:09 PM
    Author     : lalof
--%>


        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container nav-contain">

                <div class="navbar-header">
                    <img style="padding-left:10px" src="images/UXBanner.png" alt="Universidad de Xalapa logo logo" width="270" >
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>

                </div>
                <div class="collapse navbar-collapse">

                    <ul class="nav navbar-nav">
                        <li><a href="view_solicitudes_admin.jsp">Solicitud de espacios</a></li>
                        <li><a  href="view_consulta_admin.jsp">Consulta de solicitudes</a></li>
                        <li><a  href="view_reportes.jsp">Reportes</a></li>
                        <li><a  href="view_espacios.jsp">Espacios</a></li>
                        <li><a href="view_inventario.jsp">Inventario</a></li>
                        <li><a  href="view_register.jsp">Registro</a></li>
                        <li><a  href="view_catalogos.jsp">Catalogos</a></li> 
                        <!--            </ul>
                                    <ul class="nav navbar-nav ">-->

                        <!--                .mx-auto{margin-right:auto!important}.mb-auto,.my-auto{margin-bottom:auto!important}.ml-auto,.mx-auto{margin-left:auto!important;}-->
                        <%
                            HttpSession sesion = request.getSession(true);
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
                                privilegio = sesion.getAttribute("privilegio").toString();
                                out.print("<li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-delay='1000' data-close-others='false'>" + nombre_usuario + " <b class='caret'></b></a>");
                                out.print("<ul class='dropdown-menu'><li><a href='controllers/cont_login.jsp?cerrar=true'>Cerrar sesión </a></li></ul></li>");
                                int id_usuario = (int) sesion.getAttribute("id_usuario"); //aqui tu identificador de usuario
                                sesion.setAttribute("id_usuario", id_usuario);
                     //out.println("Poniendo usuario en sesion ...");
                            } else {
                                response.sendRedirect("view_login.jsp");
                            }

                        %>
                    </ul>
                </div>
                <!--/.nav-collapse --> 
            </div>
        </nav>
