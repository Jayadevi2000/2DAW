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
	<%@ page import="modelo.Archivo" %>
	<%
	Archivo a = (Archivo)request.getAttribute("atribArchivo");
	ArrayList<String> misDatos = a.leerArchivo();
	%>
	<h1>Aqui se despliegan los datos que envió el servlet</h1>
	<table border="1">
	<%for(int i = 0; i < misDatos.size(); i++){%>
		<tr>
			<td><%= misDatos.get(i) %></td>
		</tr>
	<%}%>
	</table>
	<p><a href="index.jsp"></a></p>
</body>
</html>