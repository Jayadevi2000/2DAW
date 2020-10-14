<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
HttpSession sesion=request.getSession();
String ses=(String)sesion.getAttribute("login");
String tipo=(String)sesion.getAttribute("tipo");
if (ses.equals("anonimo") && tipo.equals("invitado")){
	out.println("<p> eres anonimo</p>");
}else {
	out.println("<p> eres "+ses+" con permisos" +tipo+"</p>");
	
}
if (tipo.equals("A")){
%>
<p><a href="fomrI.jsp"> insertar</a></p>
<%} %>
<p><a href="adminAplicacion?action=1">ver datos</a></p>
<p><a href="index.jsp"> ir a index</a></p>
</body>
</html>