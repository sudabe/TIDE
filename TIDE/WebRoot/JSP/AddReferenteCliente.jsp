<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddReferenteCliente.jsp' starting page</title>
    
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
  <%
     String id_cliente = request.getParameter("id_cliente");
     if(id_cliente.trim().length() > 0){
     
   %>
    <div class="container" id="container1">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title text-center">Nuovo Cliente</h3>
                    </div>
                    <div class="panel-body">
                        <form action ="http://localhost:8080/TIDE/JSP/ADDr.jsp" method="post">
                        
                           <div class="form-group">
                                <input type="text" name="id_cliente" id="id_cliente" value="<%=id_cliente%>" readonly="readonly" class="form-control input-sm">
                            </div>
                          
                            <div class="form-group">
                                <input type="text" name="nome" id="nome" value="Nome"  class="form-control input-sm">
                            </div>
                            
                            <div class="form-group">
                                <input type="text" name="cognome" id="cognome" value="Cognome"  class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input  type="text" name="referente_recapito" id="referente_recapito"  value="Indirizzo" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="email" id="email" value="Email" class="form-control input-sm">
                            </div>
                             <a class="panel-title text-left" href=" http://localhost:8080/TIDE/AddCliente.jsp ">Back</a>
                             <br></br>
                             <input type="submit" name="action"  value="Add" class="btn btn-info btn-block"> 
                             <input type="submit" name="action"  value="More Referente" class="btn btn-info btn-block"> 
                             
                          </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%
    	}
     %>
  </body>
</html>
