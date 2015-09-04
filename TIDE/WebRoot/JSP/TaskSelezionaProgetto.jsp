<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Admin.jsp' starting page</title>
    
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
  <script type="text/javascript">
  		function f1(){
  		var x = document.getElementById("s1").selectedIndex;
  		var y = document.getElementById("s1").options;
  		//alert("hello  "+y[x].text );
  		window.location="JSP/TaskSelezionaProgetto.jsp?cid="+y[x].text;
  		
  		}
  </script>
  
  <style type="text/css">
  		.styled-select  {
		   width: 268px;
		   height:100px;
		   background-color: #FAFAFA;
		   
        }
	
	</style>
  <body>
  <div class="container" id="container1">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title text-center">Seleziona Progetto</h3>
                    </div>
                    <div class="panel-body">
                    <form action ="http://localhost:8080/TIDE/JSP/CompilaTask.jsp" method="post">
   <%
   	      boolean b=false;
	      Referenti_clientiDaoImp rclienti = new Referenti_clientiDaoImp();
	      List<Object[]>plst= rclienti.findAllReferenti();
	      if(plst.isEmpty()){
      	  		out.println("errore");
      	  }
      	  else{
      	  String cid=request.getParameter("cid");
      	  
      	         %>
      	  		 <div >
        		 <select name='s1' id='s1' style='width: 150px;' onchange='f1()' >
   				 <%
		        if (plst!= null){
		        	for(Object[] row : plst){
				           Referenti_clienti rc = new Referenti_clienti(); 
				           //rc.setId_cliente(row[0].toString());
				           rc.setNome(row[2].toString());  
				           
				            if(cid!=null){
		     					  if(cid.trim().length() > 0){
		     					  		if(cid.trim().equals(rc.getNome())){
		      							 		out.println("<option selected >"+rc.getNome()+"</option>");
		      							 		}
		      								else{
		      								 		out.println("<option>"+rc.getNome()+"</option>");
		      								    }
		      								}
		      					else{
		      						     out.println("<option >"+rc.getNome()+"</option>");
		      						}
		      					}
		      				else{
		      						out.println("<option >"+rc.getNome()+"</option>");
		      					}					
				      }
		        }
		        	 	 
		       %></select><%
		   if(cid!=null){
		       if(cid.trim().length() > 0){
		      
		            %><br/><br/><br/> <select name="s2" id='s2' style='width: 150px;' ><%
		       		ProgettiDaoImp progetti = new ProgettiDaoImp();
			        List<Object[]>plst1 = progetti.findProgettoByClienteName(cid);
			        
			        if (plst1!= null){
		        	for(Object[] row : plst1){
				           Progetti p1 = new Progetti();
				           p1.setNome_progetto(row[2].toString());
				           out.println("<option>"+p1.getNome_progetto()+"</option>");
		        	       }
		       %></select></div><% 
			       } 
		       //out.print(request.getParameter("cid"));
		        
		       else{
		        out.print("not found");
		        }
  			 }
 	  	  }
   	  } 
  %>
  <br></br>
  <br></br>
  
  <input type="submit" name="action"  value="Avanti" class="btn btn-info btn-block">
  <input type="submit" name="action"  value="Annula" class="btn btn-block">
 </form>
  </div>
  </div>
  </div>
  </div>
  </div>
  
  </body>
</html>
