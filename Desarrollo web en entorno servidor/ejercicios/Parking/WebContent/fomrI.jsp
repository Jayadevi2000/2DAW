<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession sesion = request.getSession();
if (!sesion.getAttribute("tipo").equals("A")) {
	
	out.println("<p> no tiene permiso para hacer insert</p>");

}else{
	out.println("<p> eres "+sesion.getAttribute("login")+"</p>");
%>
<form action="controladorAplicacion?action=3" method="post">
pon planta:<input type="number" name="planta" min="1" max="4" required/></br>
pon plaza:<input type="number" name="plaza" min="1" max="10" required/></br>
pon descripcion:<input type="text" name="descripcion" required/></br>
<input type="submit" name="insertar"  value="insertar"/></br>
</form>
<%} %>
</body>
</html>