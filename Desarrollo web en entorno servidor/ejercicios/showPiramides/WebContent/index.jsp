<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Modelo.Archivo" %>
<%Archivo a=new Archivo("C:\\Users\\jayad\\Google Drive\\Segundo curso\\Desarrollo web en entorno servidor\\ejercicios\\showPiramides\\Imagenes");
ArrayList<String> miLista=a.dameFicherosImg();
%>
	<h1>Piramide de fotografias</h1>
	<form action="trataDatos" method="post">
	<h2>Selecciona el tamaño de la base</h2>
	<input type="number" name="base" step="1" min="1" required/>
	<h2>Selecciona de que imagen quieres la piramide</h2>
	<%for (int i =0 ; i<miLista.size();i++){
		%>
	<button type="submit" name="imagen" value="<%=miLista.get(i)%>" >
	<img src="Imagenes/<%=miLista.get(i)%>" width="30"/></button>
	<%} %>
	</form>
</body>
</html>