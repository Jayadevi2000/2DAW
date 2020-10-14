<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.ArrayList,modelo.Estudiante" %>
<%
String m,b;//modificar y borrar
ArrayList<Estudiante> le=null;
le=(ArrayList<Estudiante>)request.getAttribute("miLista");
for (Estudiante e:le){
	int ident=e.getId();
m="<a href=\"controladorEstudiante?id="+ident+"&action=3\">modificar</a>";
b="<a href=\"controladorEstudiante?id="+ident+"&action=5\">eliminar</a>";
out.println("<p>"+e.toString()+m+"  "+b+"</p>");
}
%>
<p><a href="index.jsp">regresar a index</a>
</body>
</html>