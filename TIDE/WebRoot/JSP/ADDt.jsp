<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDt.jsp' starting page</title>
    
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
      if(wb.equalsIgnoreCase("Avanti")){
      	TasksDaoImp c = new TasksDaoImp();
      		boolean b=false;
      		String id_cliente = "idc1";
      		String id_progetto = "idp1";
      		int id_attiv_pianif = 109;
      		String data_inizio=request.getParameter("data_inizio");
      		String data_consegna=request.getParameter("data_consegna");
      		int ore_totali=Integer.parseInt(request.getParameter("ore_totali"));
      		String tipo_attivita=request.getParameter("tipo_attivita");
      		String descrizione =request.getParameter("descrizione");
      		
      		b=c.addTask1(id_cliente, id_progetto, id_attiv_pianif, data_inizio, data_consegna, descrizione);
      		System.out.println(b);
      		
      }
     else if(wb.equalsIgnoreCase("Cancel")){
        
     }
     else if(wb.equalsIgnoreCase("Indietro")){
     }
     %>
  </body>
</html>
