<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>TUTTE LE UTENZE</title>
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
      UtenzeDaoImp m = new UtenzeDaoImp();
      List<Object[]> lst1= m.findAllUtenzes();
      out.print("<table class='table table-striped'>");
      out.print("<tr bgcolor='gray'><th>ID</th><th>Nome</th><th>cognome</th><th>Sede di Lavoro</th><th>Contratto</th><th>Telefono</th><th>Cellulare</th><th>Email</th><th>Skype</th></tr>");
      if (lst1 != null){
      
        for(Object[] row : lst1){
           Utenze u = new Utenze();
           u.setId(row[0].toString());
           u.setNome(row[1].toString());     
           u.setCognome(row[2].toString());   
           u.setSede_di_lavoro(row[3].toString());
           u.setContratto(row[4].toString());
           u.setTelefono(row[5].toString());
           u.setCellulare(row[6].toString());
           u.setEmail(row[7].toString());
           u.setSkype(row[8].toString());
           
           out.println("<tr><td>"+u.getId()+"</td><td> " +u.getNome()+"</td><td> " +u.getCognome()+"</td><td> " +u.getSede_di_lavoro()+"</td><td> " +u.getContratto()+"<td> " +u.getTelefono()+"</td><td> " +u.getCellulare()+"</td><td> " +u.getEmail()+"</td><td> " +u.getSkype()+"</td></tr>");
           
         }
         out.print("</table>"); 
      }
      else{
        out.print("not found");
      }
     %>
    
  </body>
</html>
