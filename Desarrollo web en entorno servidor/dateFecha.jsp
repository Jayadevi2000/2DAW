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
<%! 
public static int[] sacaCalen(Date f){
	int []fechaHora=new int[6];
	fechaHora[0]=f.getYear()+1900;
	fechaHora[1]=f.getMonth()+1;
	fechaHora[2]=f.getDate();// el dia
	fechaHora[3]=f.getHours();
	fechaHora[4]=f.getMinutes();
	fechaHora[5]=f.getSeconds();
	return fechaHora;
}
%>
<%
Date f1=new Date();
int[] actual=sacaCalen(f1);
%>
<p>FECHA ACTUAL del sistema</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}
//obtener una nueva fecha instanciandola

Date f2=new Date(119,5,3,23,12,14);
actual=sacaCalen(f2);
%>
</tr>
</table>
<p>nueva FECHA instanciada Date(119,5,3,23,12,14)</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}
//obtener una nueva fecha usando el metodo set desde f2
f2.setYear(120);
f2.setSeconds(69);
actual=sacaCalen(f2);
%>
</tr>
</table>
<p> f2 modificada 120,y 69 segundos</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}%>
</tr>
</table>
</body>
</html>