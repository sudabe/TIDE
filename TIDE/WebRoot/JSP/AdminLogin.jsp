<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
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
   
    <body>
     <div class="container" id="container1">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title text-center">Admin Login</h3>
                    </div>
                    <div class="panel-body">
                        <form action ="http://localhost:8080/TIDE/JSP/Admin.jsp" method="post">
                           <div class="form-group">
                                <input  type="text" name="username" id="username"  value="Username" class="form-control input-sm">
                            </div>
                            <div class="form-group">
                                <input  type="password" name="password" id="password"  value="Password" class="form-control input-sm">
                            </div>
    						 <input type="submit" name="action"  value="Login" class="btn btn-info btn-block"> 
    						 <input type="submit" name="action"  value="Signup" class="btn btn-info btn-block"> 
    					</form>
    				</div>
                </div>
    	    </div>
         </div>
      </div>
    				
  </body>
</html>
