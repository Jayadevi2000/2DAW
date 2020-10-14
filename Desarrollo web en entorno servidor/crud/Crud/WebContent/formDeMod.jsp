<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="modelo.*" %>
<%
Estudiante e=(Estudiante)request.getAttribute("miEstudiante");
if (e!=null){
%>
<form action="controladorEstudiante?action=4" method="post">
 dni:<input type="text" name="dni" value="<%=e.getDni()%>"/></br>
 nombre:<input type="text" name="nombre" value="<%=e.getNombre()%>"/></br>
apellido1:<input type="text" name="ape1" value="<%=e.getAp1()%>"/></br>
apellido2:<input type="text" name="ape2" value="<%=e.getAp2()%>"/></br>
carrera:<input type="text" name="carrera" value="<%=e.getCarrera()%>"/></br>
nota:<input type="number" name="nota" min="0" max="10" value="<%=e.getNota()%>"/></br>
<input type="hidden" name="ident" value="<%=e.getId()%>" />
<input type="submit" name="enviar"  value="enviar"/></br>
</form>
<%
}else {
	out.println("<p> intentalo de nuevo</p>");
}
%>
<p><a href="index.jsp">regresar</a></p>
</body>
</html>