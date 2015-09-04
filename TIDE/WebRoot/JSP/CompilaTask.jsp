<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDTaskRisorse.jsp' starting page</title>
    
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
      String cliente = request.getParameter("s1");
      String progetto = request.getParameter("s2");
      
      HttpSession mySession = request.getSession(true);
      mySession.setAttribute("cliente", cliente);
      mySession.setAttribute("progetto", progetto);
      
    %>
     <div class="container" id="container1">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title text-center">Compila Task</h3>
                     </div>
                     <div class="panel-body">
                        <form action ="http://localhost:8080/TIDE/JSP/AssegnaResources.jsp" method="post">
                        
                           <div class="form-group">
                                <input  type="text" name="ore_totali" id="ore_totali"  value="Ore Totali Del Task" class="form-control input-sm">
                            </div>
                            <div class="form-group">
                                <input  type="text" name="data_inizio" id="data_inizio"  value="Data inizio attivita" class="form-control input-sm">
                            </div>

                            <div class="form-group">
                                <input type="text" name="data_consegna" id="data_consegna" value="Data consegna"  class="form-control input-sm">
                            </div>
                            
                            <div class="form-group">
                                <input type="text" name="ore_giornaliere" id="ore_giornaliere" value="Ore giornaliere"  class="form-control input-sm">
                            </div>
                            
                            <label class="label label-info">Tipo attivita</label>
                            <br></br>
                            <div class="form-group">
                                <select name=tipo_attivita id="tipo_attivita">
                                	<option>Prevendita/Organizzazione Preliminare</option>
                                	<option>Marketing</option>
                                	<option>Analisi Funzionale</option>
                                	<option>Sviluppo</option>
                                	<option>Test</option>
                                	<option>Projet Management</option>
                                	<option>Redazione Casi di Test</option>
                                	<option>Collaudo</option>
                                	<option>Manualistica</option>
                                	<option>Post Produzione</option>
                                	<option>TMA</option>
                                </select>
                            </div>
                            
                            <%
                            	 boolean b=false;
                            	 String myprogetto= request.getParameter("s2");
                            	 out.println(myprogetto);
							     TasksDaoImp pre_tasks = new TasksDaoImp();
							     List<Object[]>plst = pre_tasks.findAllTasksByProgetto(myprogetto);
							      //if(plst.isEmpty()){
						      	  	   //out.println("errore");
      							  //}
      							  //else{
			                             %>
			                             <div class="form-group">
			                             <select name="tasks_pre" id="tasks_pre"  multiple style='width: 245px;'>
			                            <% 
                            			 if (plst!= null){
			        					    for(Object[] row : plst){
											     Tasks task = new Tasks();
											     task.setDescrizione(row[6].toString());
								                 out.println("<option selected >"+task.getDescrizione()+"</option>");
			      						}  
			      					}    			  	 	 
		       %></select></div><%
		      					 //}
		      					 //else{
		      					   // out.println("not found");
		      					 //}
		     				  //}
		        %>
		                    <label class="label label-info">Task Descrizione</label>
                            <br></br>
                            <div class="form-group">
                                <textarea name="descrizione" id="descrizione"  class="form-control input-sm">
                                </textarea>
                            </div>
                             <br></br>
                             <input type="submit" name="action"  value="Avanti" class="btn btn-info btn-block"> 
                             <input name="action" name="Indietro"  value="Indietro" onclick="window.location='http://localhost:8080/TIDE/JSP/TaskSelezionaProgetto.jsp'"class="btn btn-info btn-block"> 
                             <input type="submit" name="action"  value="Cancel" class="btn btn btn-block"> 
                            
                        </form>       
                    </div>
                </div>
            </div>
        </div>
    </div>
  </body>
</html>
