<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<% 

 session.getAttribute("user");
   if(session.getAttribute("user") == null || session.getAttribute("user").equals("")){
	   response.sendRedirect("/app/index.html");
   }
%>

<h1> Success hello</h1>

<a href="/app/LogoutServlet">Logout</a>

</body>
</html>