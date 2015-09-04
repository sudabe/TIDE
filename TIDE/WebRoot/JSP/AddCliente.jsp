<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddCliente.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="bootstrap/bootstrap.min.css"       rel="stylesheet" type="text/css">
	<link href="bootstrap/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
  </head>
  <body>
     <div class="container" id="container1">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title text-center">Nuovo Cliente</h3>
                    </div>
                    <div class="panel-body">
                        <form action ="http://localhost:8080/TIDE/JSP/ADDc.jsp" method="post">
                           <div class="form-group">
                                <input  type="text" name="id_cliente" id="id_cliente"  value="Client ID" class="form-control input-sm">
                            </div>
                            <div class="form-group">
                                <input  type="text" name="ragione_soc" id="ragione_soc"  value="Ragione Sosciale" class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input type="text" name="piva" id="piva" value="Partita Iva"  class="form-control input-sm">
                            </div>
                            
                            <div class="form-group">
                                <input type="text" name="recapito" id="recapito" value="Indirizzo"  class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input  type="text" name="cf" id="cf"  value="Codice Fiscale" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="telefono" id="telefono" value="Telefono" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="id_referente" id="id_referente"  value="Refrence Id" class="form-control input-sm">
                            </div>
                            
                             <input type="submit" name="action"  value="Add" class="btn btn-info btn-block"> 
                             <br></br>
                           
                             <br></br>
                             <!--<a class="panel-title text-left" href="http://localhost:8080/TIDE/AllClienti.jsp"> Tutti Clienti</a> -->
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  </body>
</html>
