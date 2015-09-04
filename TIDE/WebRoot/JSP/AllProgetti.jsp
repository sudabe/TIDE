<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AllProgetti.jsp' starting page</title>
    
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
    	ProgettiDaoImp progetti = new ProgettiDaoImp();
    	List<Object[]> plst = progetti.findAllProgetti();
    	
    	out.print("<table class='table table-striped'>");
        out.print("<tr bgcolor='gray'><th>Nome Progetto</th><th>Data Inizio</th><th>Data Consegno</th><th>Technologia</th></tr>");
        
         if (plst!= null){
         //out.println("hello");
        	for(Object[] row : plst){
		           Progetti p = new Progetti();
		           p.setNome_progetto(row[0].toString());
		           p.setData_iniz_pianif(row[1].toString());
		           p.setData_cons_pianif(row[2].toString());
		           p.setTechnologia(row[3].toString());	
		                     
		           out.println("<tr><td>"+p.getNome_progetto()+"</td><td>" +p.getData_iniz_pianif()+"</td><td>" +p.getData_cons_pianif()+"</td><td>" +p.getTechnologia()+"</td></tr>");
        	 }
        //out.print("</table>"); 
      }
      //else{
       // out.print("not found");
      //}
     %>
  </body>
</html>
