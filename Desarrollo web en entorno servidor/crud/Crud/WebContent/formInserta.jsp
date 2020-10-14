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
int action=Integer.parseInt(request.getParameter("action"));
%>
<form action="controladorEstudiante?action=<%=action%>" method="post">
pon dni:<input type="text" name="dni" required/></br>
pon nombre:<input type="text" name="nombre" required/></br>
pon apellido1:<input type="text" name="ape1" required/></br>
pon apellido2:<input type="text" name="ape2" /></br>
pon carrera:<input type="text" name="carrera" required/></br>
pon nota:<input type="number" name="nota" min="0" max="10" required/></br>

<input type="submit" name="insertar"  value="insertar"/></br>
</form>
</body>
</html>