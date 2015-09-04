<%@page import="java.io.FileOutputStream"%>
<%@ page language="java" import="java.util.*,model.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ShowFoto.jsp' starting page</title>
    
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
   	    String name = "p1";
   	    PhotoEXDao p = new PhotoEXDao();
    	List<photoEX> plst =p.findByNome(name);
    	out.print(basePath);
    	out.print("<table class='table table-striped'>");
        out.print("<tr bgcolor='gray'><th>Nome</th><th>photo</th></tr>");
        
         if (plst!= null){
         //out.println("hello");
        	for(photoEX row : plst){
        	
		           photoEX photo = row;   
		           FileOutputStream output = new FileOutputStream(basePath+"/myfile.jpg");
		           output.write(photo.getImage());  
		           output.close(); 
		                
		           out.println("<tr><td>"+photo.getName()+"</td><td>" +"<img src='"+basePath+"/myfile.jpg'>"+"</td></tr>");
        	 }
        out.print("</table>"); 
      }
      //else{
       // out.print("not found");
      //}
    %>
  </body>
</html>
