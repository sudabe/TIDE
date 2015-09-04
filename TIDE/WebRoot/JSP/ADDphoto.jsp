<%@page import="javax.swing.plaf.FileChooserUI"%>
<%@ page language="java" import="java.util.*,java.io.*,model.*,javax.servlet.http.Part;" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ADDphoto.jsp' starting page</title>
    
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
     out.println("start");
     String name = request.getParameter("name");
    
     javax.servlet.http.Part photo_name = request.getPart("photo_name");
     InputStream input = null;
     //out.println(name+"<br>"+pname);
     try{
     if(photo_name!=null){
        out.println(photo_name.getName());
     	input = photo_name.getInputStream();
     	out.println(name+"<br>"+input.available());
     	byte[] b = new byte[input.available()];
     	input.read(b);
     	PhotoEXDao photo = new PhotoEXDao();
     	photo.addPhoto(name, b);
     	out.println("Successfully Saved");
     }
   }
   catch(Exception e){
   	out.print(e.getMessage());
   } 
   
    %>
  </body>
</html>
