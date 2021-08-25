<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!

int a=10;
int b=20;
int add(int a,int b){
	return a+b;
}

%>


<%
String username=request.getParameter("u");
String password=request.getParameter("p");

out.print("username "+username+"<br>");
out.print("password "+password);
out.print("Value of a "+a);
out.print(add(2,3)+"<br>");

%>
<%= a %>
<%= add(4,5) %>

<%= "Result of add:"+add(4,5)+"Value of a:"+a+"value of b"+b %>

</body>
</html>