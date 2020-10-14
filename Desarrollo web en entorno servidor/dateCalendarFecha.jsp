<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*,java.text.SimpleDateFormat" %>
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
SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String fechaconHora="2019-10-16 11:40:15";
Date f1=formato.parse(fechaconHora);
int[] actual=sacaCalen(f1);
%>
<p>FECHA creada con un texto con formato 2019-10-16 11:40:15</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}
//obtener una nueva Calendar y la paso a Date
Calendar f2=Calendar.getInstance();
Date f3=f2.getTime();
actual=sacaCalen(f3);
%>
</tr>
</table>
<p>pasando de Calendar a date</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}
//obtener una nueva fecha usando el metodo set desde f2
f3.setMinutes(120);
f3.setSeconds(69);
actual=sacaCalen(f3);
%>
</tr>
</table>
<p> f3 modificada 120 minutos,y 69 segundos</p>
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