<%@page import="com.sun.mail.iap.Response"%>
<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDc.jsp' starting page</title>
    
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
      
      		ClientiDaoImp c = new ClientiDaoImp();
      		boolean b=false;
      		boolean r=false;
      		String id_cliente = request.getParameter("id_cliente");
      		String ragione_soc = request.getParameter("ragione_soc");
      		String piva= request.getParameter("piva");
      		String recapito= request.getParameter("recapito");
      		String cf = request.getParameter("cf");
      		String telefono =request.getParameter("telefono");
      		String id_referente = request.getParameter("id_referente");
      		
      		b=c.addClienti1(id_cliente, ragione_soc, piva, recapito, cf, telefono);
      		System.out.println(b);
      		if(b==true){
      		  response.sendRedirect("http://localhost:8080/TIDE/JSP/AddReferenteCliente.jsp?id_cliente="+id_cliente);
      		} 		
      }
      else if(wb.equalsIgnoreCase("More Referente")){
      
      		
      		
      }
    %>
  </body>
</html>
