<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDr.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
       String wb=request.getParameter("action");
      if(wb.equalsIgnoreCase("Add")){
      
      		Referenti_clientiDaoImp r = new Referenti_clientiDaoImp();
      		boolean b=false;
      		
      	    String id_referente = request.getParameter("id_referente");
      		String id_cliente = request.getParameter("id_cliente");
      		String nome = request.getParameter("nome");
      		String cognome= request.getParameter("cognome");
      		String recapito= request.getParameter("recapito");
      		String email = request.getParameter("email");
      		
      	    b= r.addReferente(id_cliente, nome, cognome, recapito, email);
      		
      		System.out.println(b);
      		
      }
      else if(wb.equalsIgnoreCase("More Referente")){
      }
     %>
  </body>
</html>
