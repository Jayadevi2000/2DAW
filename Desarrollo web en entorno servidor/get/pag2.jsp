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
String dato=request.getParameter("valor");
Date f=new Date();
%>
<h1>estas en la pág2 y son <%=f %></h1>
<h2>de la pagina anterior pasa por get <%=dato %></h2>
<p><img src="imagenes/2.jpg" alt="foto" width="100"/></p>
<p><a href="pag3.jsp?v=7&n=juan">paso a la pag3</a></p>
</body>
</html>