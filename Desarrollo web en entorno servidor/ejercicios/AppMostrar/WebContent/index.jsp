<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action ="controladorNota"  method = "get">
        <% for (int i=0;i<=9;i++){ %>
		<input type = "radio" name = "nota" value="<%=i%>"required/>mayor o igual <%=i%> </p>
		<%} %>
		<p><input type = "submit" name = "Enviar" value = "Enviar"/></p>
</form>
<ul>
<li><a href="mostrarTodo">mostrar todo</a></li>
</ul>
</body>
</html>