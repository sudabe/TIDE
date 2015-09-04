<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AllClienti.jsp' starting page</title>
    
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
    	ClientiDaoImp clienti = new ClientiDaoImp();
    	List<Object[]> clst = clienti.findAllClienti();
    	
    	out.print("<table class='table table-striped'>");
        out.print("<tr bgcolor='gray'><th>Ragione Sosciale</th><th>Numero di Telefono</th><th>Indirizzo</th></tr>");
        
        if(clst!=null){
        	for(Object[] row :clst){
		           Clienti c = new Clienti();
		           c.setRagione_soc(row[0].toString()); 
		           c.setRecapito(row[1].toString());  
		           c.setTelefono(row[2].toString());
		           
		           out.println("<tr><td>"+c.getRagione_soc()+"</td><td>"+c.getRecapito()+"</td><td> " +c.getTelefono()+"</td></tr>");
        	 }
        out.print("</table>"); 
      }
      else{
        out.print("not found");
      }
      
     %>
  </body>
</html>
