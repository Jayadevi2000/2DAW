<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.time.*" %>
	<%
		LocalTime t = LocalTime.now();
		out.println(t);
	%>
	<ul>
		<li><a href="listarArchivo">Listar archivo de cambio</a></li>
		<li><a href="trataForm">Añadir datos al archivo</a></li>
	</ul>
</body>
</html>