<%@ page language="java" import="java.util.*,java.lang.*,model.*,java.lang.Exception,java.text.ParseException" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddUtenze.jsp' starting page</title>
    
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
                        <h3 class="panel-title text-center">Nuova Utenze</h3>
                    </div>
                    <div class="panel-body">
                        <form  enctype="multipart/form-data" action ="http://localhost:8080/TIDE/PhotoServlet" method="post">
                           <div class="form-group">
                                <input  type="text" name="id" id="id"  value="Utente ID" class="form-control input-sm">
                            </div>
                            <div class="form-group">
                                <input  type="text" name="nome" id="nome"  value="Nome" class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input type="text" name="cognome" id="cognome" value="Cognome"  class="form-control input-sm">
                            </div>
                            
                            <div class="form-group">
                                <input type="text" name="sede_di_lavoro" id="sede_di_lavoro" value="Sede_di_lavoro"  class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input  type="text" name="email" id="email"  value="Email" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="data_nascita" id="data_nascita" value="Data Di Nascita" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="luogo_nascita" id="luogo_nascita"  value="Luogo Nascita" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="residenza" id="residenza" value="Residenza" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="indirizzo" id="indirizzo" value="Indirizzo" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="cap" id="cap" value="Cap"  class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="cf" id="cf" value="cf" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="iban" id="iban" value="Iban" class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input type="text" name="contratto" id="contratto" value="Contratto"  class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                                <input  type="text" name="tipo_cont" id="tipo_cont" value="Tipo Di Contratto"  class="form-control input-sm">
                            </div>
                            
                             <div class="form-group">
                               <input  type="text" name="ore_giorno" id="ore_giorno" value="Ore_giorno"  class="form-control input-sm">
                             </div>
                             
                              <div class="form-group">
                               <input  type="text" name="data_iniz_contr" id="data_iniz_contr" value="Data Iniz Contratto" class="form-control input-sm">
                              </div>
                              
                              <div class="form-group">
                               <input  type="text" name="durata_cont" id="durata_cont" value="Durata Contratto" class="form-control input-sm">
                              </div>
                              
                              <div class="form-group">
                               <input  type="text" name="costo_mensile" id="costo_mensile"  value="Costo Mensile" class="form-control input-sm">
                              </div>
                              
                               <div class="form-group">
                               <input  type="text" name="Periodo_perm_az" id="periodo_perm_az" value="Periodo Perm"  class="form-control input-sm">
                              </div>
                              
                              <div class= "checkbox checkbox-slider--b-flat" id="checkbox checkbox-slider--b-flat">
									<label>
									<input  type="checkbox" name="attivo"><span>Attivo</span>
									</label>
							  </div>
							  
							  <div class="form-group">
                               <input  type="text" name="telefono" id="telefono" value="Telefono"  class="form-control input-sm">
                              </div>
                                
                              <div class="form-group">
                               <input  type="text" name="cellulare" id="cellulare" value="Cellulare"  class="form-control input-sm">
                              </div>
                                  
                              <div class="form-group">
                               <input  type="text" name="skype" id="skype" value="Skype"  class="form-control input-sm">
                              </div>
                              
                              <div class="form-group">
                               <input type="text" name="password" id="password" value="Password" class="form-control input-sm">
                              </div>
                               <div class="form-group"><span>Photo</span>
                               <input type="file" name="photo" id="photo" value="Photo"  class="form-control input-sm">
                              </div>
                             <input type="submit" name="action"  value="Add" class="btn btn-info btn-block"> 
                             <br></br>
                             <a class="panel-title text-left" href="http://localhost:8080/TIDE/index.jsp"> Tutte Le Utenze</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  </body>
</html>
