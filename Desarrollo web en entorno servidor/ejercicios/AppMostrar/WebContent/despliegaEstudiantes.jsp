<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.ArrayList,modelo.*" %>
<%
String mensaje=(String)request.getAttribute("mensaje");
if (mensaje!=null){
	out.println("<h2> "+mensaje+"</h2>");
}
ArrayList<Estudiante> le = null;
le = (ArrayList<Estudiante>) request.getAttribute("miLista");
if (le.size()==0){
	out.println("<p> lista vacia</p>");
}else {
%>
<table border="1">
<tr><td>estudiante</td></tr>
<% for (Estudiante e : le) {%>
	<tr>
<%
out.println("<td>" + e+ "</td>");
%>
</tr>
<%	
}
}
%>
</table>	
<p><a href="index.jsp">volver a consultar</a></p>
</body>
</html>