<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is my first jsp</h1>
<%
int a=10;
int b=20;
int c=a+b;
out.print("Result: "+c);
for(int i=0;i<=5;i++){
	out.print("Value of i :"+i+"<br>");
}

%>
<form action="Login.jsp">

<input type="text" name="u" placeholder="username">
<input type="text" name="p" placeholder="password">
<input type="submit" value="Login">

</form>
</body>
</html>