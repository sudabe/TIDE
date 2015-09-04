<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDp.jsp' starting page</title>
    
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
      		ProgettiDaoImp p = new ProgettiDaoImp();
      		boolean res=false;
      		String id_progetti = request.getParameter("id_progetti");
      		String id_cliente = request.getParameter("id_cliente");
      		String nome_progetto= request.getParameter("nome_progetto");
      		String data_iniz_pianif= request.getParameter("data_iniz_pianif");
      		String data_cons_pianif = request.getParameter("data_cons_pianif");
      		int ore_pianf_tot =Integer.parseInt(request.getParameter("ore_pianf_tot"));
      		String data_iniz_effettiva = request.getParameter("data_iniz_effettiva");
      		String data_cons_effettiva = request.getParameter("data_cons_effettiva");
      		int ore_scosta_tot = Integer.parseInt(request.getParameter("ore_scosta_tot"));
      		int indice_compl_prog= Integer.parseInt(request.getParameter("indice_compl_prog"));
      		String technologia = request.getParameter("technologia");
      		
      		res=p.addProgetto(id_progetti, id_cliente, nome_progetto, data_iniz_pianif, data_cons_pianif, ore_pianf_tot, data_iniz_effettiva, data_cons_effettiva, ore_scosta_tot, indice_compl_prog, technologia);
      		System.out.println(res);  		
      }
    %>
  </body>
</html>
