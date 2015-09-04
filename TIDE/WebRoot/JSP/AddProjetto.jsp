<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddProjetto.jsp' starting page</title>
    
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
                        <h3 class="panel-title text-center">Nuovo Progetto</h3>
                    </div>
                    <div class="panel-body">
                        <form action ="http://localhost:8080/TIDE/JSP/ADDp.jsp" method="post">
                           <div class="form-group">
                                <input  type="text" name="id_progetti" id="id_progetti"  value="Progetto ID" class="form-control input-sm">
                            </div>
                            <div class="form-group">
                                <input  type="text" name="id_cliente" id="id_cliente"  value="Cliente ID" class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input type="text" name="nome_progetto" id="nome_progetto" value="Progetto Nome"  class="form-control input-sm">
                            </div>
                            
                            <div class="form-group">
                                <input type="text" name="data_iniz_pianif" id="data_iniz_pianif" value="Data Iniz Pianif"  class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input  type="text" name="data_cons_pianif" id="data_cons_pianif"  value="Data Cons Pianif" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="ore_pianf_tot" id="ore_pianf_tot" value="DOre Pianf Totale" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="data_iniz_effettiva" id="data_iniz_effettiva"  value="Data Iniz Effettiva" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="data_cons_effettiva" id="data_cons_effettiva" value="Data Cons Effettiva" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="ore_scosta_tot" id="ore_scosta_tot" value="Ore Scosta Totale" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="indice_compl_prog" id="indice_compl_prog" value="Complexity di Progetto"  class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="technologia" id="technologia" value="Technologia" class="form-control input-sm">
                            </div>
              
                             <input type="submit" name="action"  value="Add" class="btn btn-info btn-block"> 
                             <br></br>
                             <a class="panel-title text-left" href="http://localhost:8080/TIDE/AllProgetti.jsp"> Tutti Progetti</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  </body>
</html>
