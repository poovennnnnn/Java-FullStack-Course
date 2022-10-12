
<%@ page import="com.jsp.Student" isELIgnored="true" %>
<%@ taglib uri="http://java.sun.com/jstl/core"  prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student List</h1>


<c:forEach items="${ studentList}" var="student">

   <c:out value="${ student.studentId}"></c:out>
   <c:out value="${student.studentName }"></c:out>
   <br>
  <%--  <c:out value="${ student.studentName"></c:out> --%>
<br>


</c:forEach>


</body>
</html>