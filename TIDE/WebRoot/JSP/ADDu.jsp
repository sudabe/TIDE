<%@page import="java.io.InputStream"%>
<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDu.jsp' starting page</title>
    
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
       UtenzeDaoImp u = new UtenzeDaoImp();
     	boolean b= false;
     	String id=request.getParameter("id");
     	String nome=request.getParameter("nome");
     	String cognome=request.getParameter("cognome");
     	String sede_di_lavoro= request.getParameter("sede_di_lavoro");
	    String data_nascita = request.getParameter("data_nascita");			
		String luogo_nascita= request.getParameter("luogo_nascita");
		String residenza= request.getParameter("residenza");
		String indirizzo=request.getParameter("indirizzo");
		//int cap=Integer.parseInt(request.getParameter("cap"));
		String cf=request.getParameter("cf");
		String iban= request.getParameter("iban");
		String contratto= request.getParameter("contratto");
		String tipo_cont= request.getParameter("tipo_cont");
		//int ore_giorno=Integer.parseInt(request.getParameter("ore_giorno"));
		String data_iniz_contr = request.getParameter("data_iniz_contr");
		//int durata_cont=Integer.parseInt(request.getParameter("durata_cont"));
		//int costo_mensile= Integer.parseInt(request.getParameter("costo_mensile")); 
		//int periodo_perm_az= Integer.parseInt(request.getParameter("periodo_perm_az"));	
		//int attivo=Integer.parseInt(request.getParameter("attivo"));
		String telefono= request.getParameter("telefono");
		String cellulare= request.getParameter("cellulare");
		String email= request.getParameter("email");
		String skype= request.getParameter("skype");
		String password= request.getParameter("password");	
		Part photo = request.getPart("photo");
			if(photo!=null){
				InputStream input =photo.getInputStream();
				if(input!=null){
					byte[] photoByte = new byte[input.available()];
					input.read(photoByte);
					UtenzeDaoImp ut = new UtenzeDaoImp();
					boolean res= ut.addUtenze2(id, nome, cognome, sede_di_lavoro, data_nascita, luogo_nascita, residenza, indirizzo, cf, iban, contratto, tipo_cont, data_iniz_contr, telefono, cellulare, email, skype, password, photoByte);
					if(res==true){
						out.print("successfully saved");
						out.print(res);
					}
					else{
						out.print("Error");
					}
					
				}
			
		
			}
	
	    //b= u.addUtenze1(id, nome, cognome, data_nascita, luogo_nascita, residenza, indirizzo, cf, iban, contratto, tipo_cont, data_iniz_contr, telefono, cellulare, email, skype, password, photo, sede_di_lavoro);
	    //System.out.print(b);  
	   //System.out.print(id+nome+cognome+ data_nascita+ luogo_nascita+ residenza+ indirizzo+ cf+ iban+ contratto+ tipo_cont+ data_iniz_contr+ telefono+ cellulare+ email+ skype+ password+ photo+ sede_di_lavoro);
      }
      
     %>
  </body>
</html>
