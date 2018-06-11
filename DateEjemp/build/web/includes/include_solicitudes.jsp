<%-- 
    Document   : include_solicitudes
    Created on : Apr 22, 2018, 5:46:24 PM
    Author     : lalof
--%>

<%@page import="java.util.LinkedList"%>

<%@page session="true"%>
<%@page import="beans.*"%>
<%@page import="beans.Sql"%>
<%@page import="java.util.Vector"%>
<%@ page import = "beans.Consulta"%> 
<%@ page import = "beans.ConsultaBD"%> 
<%@ page import = "java.util.LinkedList"%> 

<div class="row">
    <div class="col-lg-8 " id="home">
        <h3 class="page-header">SOLICITUD DE EVENTOS UNIVERSITARIOS Y RESPONSIVA</h3>
        <div class="panel pnl2 panel-default">
            <div class="panel-heading">
                DATOS DEL EVENTO
            </div>
            <div class="panel-body">
                            <div class="row"> 
                     
                             <div id="general" class="col-lg-5">
                                <label>Nombre del evento</label>
                                <input class="form-control" name ="nombre" type="text" placeholder="" size="17px" required >

                                <label>Fecha del evento</label>
                                <input class="form-control" name="fecha" type="date" required>

                                <label>Hora de montaje</label>
                                <input class="form-control" name="horaMon" type="time" required>
                                <div class="row">
                                    
                                <div class="col-lg-6">
                                <label>Hora de inicio</label>
                                <input class="form-control" name="horaIni" type="time" size="35" required> 
                                </div>
                                <div class="col-lg-6">
                                <label>Hora de finalización</label>
                                <input class="form-control" name="horaFin" type="time" required>
                                </div>
                                </div>

                                <div class="form-group">
                                    <label>Teléfono celular del responsable</label>
                                    <input class="form-control" name="telefono" onkeypress="return valida(event)" required>
                                </div>
                                <script>
                                    function valida(e) {
                                        tecla = (document.all) ? e.keyCode : e.which;

                                        //Tecla de retroceso para borrar, siempre la permite
                                        if (tecla == 8) {
                                            return true;
                                        }

                                        // Patron de entrada, en este caso solo acepta numeros
                                        patron = /[0-9]/;
                                        tecla_final = String.fromCharCode(tecla);
                                        return patron.test(tecla_final);
                                    }
                                </script>

                            </div>
                            <div class="col-lg-3">
                                <label>Origen del evento:</label>
                                <p></p>
                                <label class="radio-inline radio-inlineB">
                                    <input type="radio" name="origen" id="origen" value="ux" checked="">UX
                                </label>
                                <label class="radio-inline radio-inlineB">
                                    <input type="radio" name="origen" id="origen" value="externo">Externo
                                </label>  <br><br>


                                <label>Lugar:</label>
                                <p></p>
                                <label class="radio-inline radio-inlineB">
                                    <input type="radio" name="lugar" id="lugarI" value="interno" onchange="mostrarOcultar()" checked="">Interno
                                </label>
                                <label class="radio-inline radio-inlineB ">
                                    <input type="radio" name="lugar" id="lugarE" value="externo" onchange="mostrarOcultar2()" >Externo
                                </label> <br><br>
                                <input class="form-control2" type="text" id="DesLugarE"  name="espacio" placeholder="Define el lugar" style="display:none" > 
                            </div>

                            <script language="javascript">
                                function mostrarOcultar() {
                                    if (document.getElementById('lugarI').checked == true) {
                                        document.getElementById('DesLugarE').style.display = 'none';
                                        document.getElementById('divEspacios').style.display = 'block';
                                        $('#general').removeClass( "col-lg-9" ).addClass( "col-lg-5");
                                        
                                       
                                    } else {
                                        document.getElementById('DesLugarE').style.display = 'block';
                                        $('#general').removeClass( "col-lg-5" ).addClass( "col-lg-8");
                                        $("#DesLugarE").focus();
                                    }
                                }
                                function mostrarOcultar2() {
                                    if (document.getElementById('lugarE').checked == false) {
                                        document.getElementById('DesLugarE').style.display = 'none';
                                        $('#general').removeClass( "col-lg-9" ).addClass( "col-lg-5");
                                    } else {
                                        document.getElementById('DesLugarE').style.display = 'block';
                                        document.getElementById('divEspacios').style.display = 'none';
                                         $('#general').removeClass( "col-lg-5" ).addClass( "col-lg-8");
                                         $("#DesLugarE").focus();
                                    }
                                }

                            </script>  


                            <div id="divEspacios" class="col-lg-4" >


                                <label >Selección de espacios</label>

                                <%//                                     Vector tipotelef = Sql.consulta("select TelefCodigo,TelefDescripcion from telef");
                                    Vector tipotelef = Sql.consulta("select id_espacio,Enombre from espacio");
                                    for (int fils = 1; fils < tipotelef.size(); ++fils) {
                                        String[] unaFila = (String[]) tipotelef.get(fils);
                                %>

                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" name="espacio" value = "<%=unaFila[1]%>" > <%=unaFila[1]%>
                                    </label>
                                </div>
                                <%}%>

                            </div>

                        </div>

            </div>
            <!-- /.col-lg-6 (nested) -->

            <!-- /.col-lg-6 (nested) -->
        </div>
        <!-- /.row (nested) -->




        <div class="panel pnl2 panel-default">
            <div class="panel-heading">
                ELEGIR DISPOSICIÓN DE LAS SILLAS Y MESAS:
            </div>

            <div class="panel-body">
                <div class="col-lg-12 col-lg-12b">

                    <div class="container2">
                        <div class="col-lg-12 pst">
                            <div class="form cf">
                                <section class="plan cf">

                                    <input type="radio" name="org" id="russo" value="russo" checked><label class="free-label four  colB russo" for="russo">Russo</label>
                                    <input type="radio" name="org" id="aula" value="aula" ><label class="basic-label four colB aula" for="aula">Aula</label>
                                    <input type="radio" name="org" id="imperial" value="imperial"><label class="premium-label four colB imperial" for="imperial">Imperial</label>
                                    <input type="radio" name="org" id="auditorio" value="auditorio" ><label class="basic-label four colB auditorio" for="auditorio">Auditorio</label>
                                    <input type="radio" name="org" id="herradura" value="herradura"><label class="premium-label four colB herradura" for="herradura">Herradura</label>
                                </section>   
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.panel -->
        </div>

        <div class="panel pnl2 panel-default">
            <div class="panel-heading">
                SELECCIÓN DE MOBILIARIO, EQUIPO E INFRAESTRUCTURA Y SERVICIO
            </div>
            <div class="panel-body">
                <div class="row">
                    <div>

                        <div class="form-group ">
                            <div class="col-md-12 ">
                                <label>Favor de indicar su pedido en el N°, la cantidad requerida:</label>
                            </div>

                            <div class=" col-lg-4 borderR">

                                <%
                                    //                                   
                                    //Vector tipotelef = Sql.consulta("select TelefCodigo,TelefDescripcion from telef");
                                    Vector vMobiliario = Sql.consulta("select id_inv,nombreI from inventario1 where estatus = 'true'");

                                    for (int fils = 1; fils < vMobiliario.size(); ++fils) {
                                        String[] unaFila = (String[]) vMobiliario.get(fils);
                                %>
                                <div class="checkbox2">
                                    <label class="fw">
                                        <input type="checkbox" id="<%=unaFila[0]%>" name="id_m" value = "<%=unaFila[0]%>" > <%=unaFila[1]%>
<!--                                        </label> <label class="float-right">N° <input id="n<%//=c%>" name="inv<%//=c%>"  type="number"></label>-->
                                    </label> <label class="float-right">N° <input id="n<%=unaFila[0]%>" name="cantidad"  type="number" min="0" max="1000"  >  </label>

                                    <script src="js/jquery-1.11.2.min.js"></script><script src="js/jquery-migrate-1.2.1.min.js"></script>


                                    <script language="javascript">


                                document.getElementById("<%=unaFila[0]%>").addEventListener('change', function () {
                                    if (document.getElementById('<%=unaFila[0]%>').checked == true) {
                                        //                alert('true');
                                        //document.getElementById("n<%//=unaFila[0]%>").required =  this.checked;
                                        //document.getElementById('n<%//=unaFila[0]%>').enabled = this.checked;
                                        jQuery("#n<%=unaFila[0]%>").prop("disabled", false);
                                        jQuery("#n<%=unaFila[0]%>").prop("required", true);
                                    } else {
                                        //                        alert('false');
                                        //document.getElementById('n<%//=unaFila[0]%>').disabled = !this.checked;
                                        jQuery("#n<%=unaFila[0]%>").prop("disabled", true);
                                        jQuery("#n<%=unaFila[0]%>").prop("required", false);

                                    }

                                });

                                document.getElementById("n<%=unaFila[0]%>").addEventListener('change', function () {
                                    if ($('#<%=unaFila[0]%>').val() != '') {
                                        $("#<%=unaFila[0]%>").prop("checked", true);
                                    }
                                })



                                document.getElementById("n<%=unaFila[0]%>").addEventListener('change', function () {
                                    if ($('#n<%=unaFila[0]%>').val() == '0') {
                                        $("#<%=unaFila[0]%>").prop("checked", false);
                                        jQuery("#n<%=unaFila[0]%>").prop("disabled", true);
                                    }
                                })
                                    </script>  
                                </div>
                            </div>
                            <!-- 1ra columna -->
                            <div class=" col-lg-4 borderR">

                                <%}%>
                            </div>

                        </div>


                    </div>

                </div>

            </div>
             <label style="font-weight: lighter; font-size: smaller;">* Número de lugares</label>
        <br><label>Comentarios:</label>
        <textarea maxlength="499" class="form-control" name="coments">
                                
        </textarea> 
                     
        </div>
                <button class="float-right btn btn-danger" type="submit"  >Enviar solicitud</button> <br>             
        <!-- /.panel-body -->
        

    </div>


    <div class="col-lg-4">
        <div class="table-wrapper">
            <div class="table-title">

                <div ><h3>Listado de los eventos próximos a realizarse</h3></div>


            </div>
            <table class="table table-striped table-bordered table-hover dataTable no-footer dtr-inline">

                <tr>

                    <th>
                        Nombre de evento
                    </th>
                    <th>
                        Fecha del evento
                    </th>
                    <th>
                        Hora del evento
                    </th>
                    <th>
                        Lugar del evento
                    </th>
                </tr>

                <%                               
                    LinkedList<Consulta> lista = ConsultaBD.getEventosProx();
                    for (int i = 0; i < lista.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>" + lista.get(i).getNombre() + "</td>");
                        out.println("<td>" + lista.get(i).getFecha() + "</td>");
                        out.println("<td>" + lista.get(i).getHoraIni() + "</td>");
                        out.println("<td>" + lista.get(i).getEspacio() + "</td>");
                        out.println("</tr>");
                    }
                %>

            </table>
        </div>
    </div>  
</div>   


</form> 