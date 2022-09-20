
    
<%@ page import="com.jsp.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="s1" class="com.jsp.Student" />
<jsp:setProperty property="*" name="s1"/>

<jsp:getProperty property="studentId" name="s1"/>

<%

request.setAttribute("s1", s1);
%>

<jsp:forward page="/AddStudentServlet"/>

</body>
</html>