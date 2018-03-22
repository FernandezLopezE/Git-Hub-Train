<%-- 
    Document   : index
    Created on : Dec 6, 2017, 11:37:58 AM
    Author     : eddard
--%>
<%@page import="beans.*"%>

<%@page import="java.io.IOException"%>
<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        
        <script type="text/javascript">
//if(history.forward()){
//location.replace(view_login.jsp);
//}
</script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="SB Admin 2/bootstrapE.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="SB Admin 2/metisMenu2.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="SB Admin 2/sb-admin-22.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="SB Admin 2/font-awesome2.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/md5.js"></script>
    

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
 
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Iniciar sesión MODIFICADO</h3>
                    </div>
                    <div class="panel-body">
                         <form method="post" action="controllers/cont_login.jsp">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nombre de usuario" name="nombre_usuario" type="text" autofocus="">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Contraseña" name="contrasena" type="password" onkeyup="this.form.f_passwe.value=md5(this.form.contrasena.value)">
                                    <input type="password" name="f_passwe" size="50" style="display:none">
                                </div>
                                <div class="checkbox">
                                   
                                </div>
                                
                                <!-- Change this to a button or input when using this as a form -->
                                <input type="submit" class="btn btn-lg btn-success btn-block" name="iniciar" value="Iniciar sesión">

                              
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<!--<footer class="sticky-footer">
      <div style="background-color: #e9e7e7; padding: 10px 15px; width: 100%;"class="container">
        <div class="text-center">
          <small>2018 Universidad de Xalapa | Derechos Reservados </small>
        </div>
      </div>
    </footer>-->
    



</body></html>
