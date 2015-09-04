<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AssegnaResources.jsp' starting page</title>
    
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
      String ore_totali = request.getParameter("ore_totali");
      String data_inizio = request.getParameter("data_inizio");
      String data_consegna = request.getParameter("data_consegna");
      String ore_giornaliere = request.getParameter("ore_giornaliere");
      String descrizione = request.getParameter("descrizione");
      String tipo_attivita = request.getParameter("tipo_attivita");
       
      HttpSession mySession = request.getSession();
      mySession.setAttribute("ore_totali", ore_totali);
      mySession.setAttribute("data_inizio", data_inizio);
      mySession.setAttribute("data_consegna", data_consegna);
      mySession.setAttribute("ore_giornaliere", ore_giornaliere);
      mySession.setAttribute("descrizione", descrizione);
      mySession.setAttribute("tipo_attivita", tipo_attivita);
      
      
      
    %>
    <hr>
    <%
         HttpSession mySession2 = request.getSession();
         out.print(mySession2.getAttribute("cliente")+"<br>");
         out.print(mySession2.getAttribute("progetto")+"<br>");
         out.print(mySession2.getAttribute("ore_totali")+"<br>");
         out.print(mySession2.getAttribute("data_inizio")+"<br>");
         out.print(mySession2.getAttribute("data_consegna")+"<br>");
         out.print(mySession2.getAttribute("ore_giornaliere")+"<br>");
         out.print(mySession2.getAttribute("descrizione")+"<br>");
         out.print(mySession2.getAttribute("tipo_attivita")+"<br>");
         
         
         
    
     %>
  </body>
</html>
