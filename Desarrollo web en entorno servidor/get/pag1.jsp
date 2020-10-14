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
<%Date f=new Date();

%>
<h1>estas en la pág1 y son <%=f %></h1>
<p><img src="imagenes/1.jpg" alt="foto" width="100"/></p>
<p><a href="pag2.jsp?valor=pepe">paso a la pag2</a></p>
</body>
</html>