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
Random rd=new Random();
int num=rd.nextInt(7)+1;
%>
<h1>estas en la pág2 y son <%=f %></h1>
<h2>de la pagina anterior pasa por get <%=dato %></h2>
<p><img src="<%=ruta %>" alt="foto" width="100"/></p>
<p><a href="pg3URL.jsp?valor=<%=num%>">paso a la pag3</a></p>
</body>
</html>