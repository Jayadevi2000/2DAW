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
String ok=(String)request.getAttribute("ok");
if (!ok.equals("0")){
	out.println("<h1>operacion con exito</h1>");
}else {
	out.println("<h1>operacion fallida</h1>");
}
%>
<p><a href="index.jsp">regresar a index</a>
</body>
</html>