<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String dato1=request.getParameter("v");
String dato2=request.getParameter("n");
Date f=new Date();

%>
<h1>estas en la pág3 y son <%=f %></h1>
<h2>de la pagina anterior pasa por get <%=dato1 %> y <%=dato2 %></h2>
<p><img src="imagenes/3.jpg" alt="foto" width="100"/></p>
<p><a href="index.jsp">inicio</a></p>
</body>
</html>