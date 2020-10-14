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
HttpSession sesion = request.getSession(true);
sesion.setAttribute("login","anonimo");
sesion.setAttribute("tipo","invitado");
%>
<form action="adminUsuarios" method="post">

login:<input type="text" name="login" required/></br>
clave:<input type="password" name="clave" required/></br>

<input type="submit" name="enviar"  value="enviar"/></br>
</form>
<p><a href="adminAplicacion?action=1">ver datos</a></p>
</body>
</html>