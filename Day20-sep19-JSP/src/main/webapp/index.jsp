<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ page  import="com.jsp.Guest,java.util.Date,java.util.ArrayList,java.util.List"%>
<%@ include file="header.jsp"  %>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<script type="text/javascript" src="./index.jsp">


 console.log("hello world")

</script>
<body>

<h1 id="name">Hello World</h1>

<%!  
      String name = "pooven";
      Guest guest = new Guest();
      int x =10;
      int y =20;
      Date d1 = new Date();
      List<Integer> list = new ArrayList<Integer>();
      
      public int add(int x,int y){
    	  return x+y;
      }


%>


<%   
     
        out.println("hello world from java code");
        guest.setGuestId(101);
        
%>




<h3>Welcome!  <%=name  %></h3>
<h3>Welcome!  <%=guest.getGuestId() %></h3>
<h3>  Add 10 + 20  = <%=add(10, 20) %></h3>
<h3>Date  <%=d1  %></h3>

<ul>
<% for(int i=0; i<5; i++){ %>


<li> Number <%=i %></li>

<%

list.add(i);

} %>

</ul>


<ul>
<% for(int i=0; i<5; i++){ 
	
   out.print("<li>"+i+"</li>");
   out.println(list.get(i));
}

%>
</ul>






<%@ include file="footer.jsp"  %>




</body>
</html>