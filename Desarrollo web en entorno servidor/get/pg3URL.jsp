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
<%
String dato=request.getParameter("valor");
out.println("<p>"+dato+"</p>");
int fi=Integer.parseInt(dato);
Date f=new Date();
String ruta="imagenes/"+fi+".jpg";

%>
<h1>estas en la pág3 y son <%=f %></h1>

<p><img src="<%=ruta %>" alt="foto" width="100"/></p>
<p><a href="index.jsp">inicio</a></p>
</body>
</html>