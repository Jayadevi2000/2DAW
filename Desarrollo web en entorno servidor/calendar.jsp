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
public static int[] sacaCalen(Calendar f){
	int []fechaHora=new int[6];
	fechaHora[0]=f.get(Calendar.YEAR);
	fechaHora[1]=f.get(Calendar.MONTH)+1;
	fechaHora[2]=f.get(Calendar.DAY_OF_MONTH);
	fechaHora[3]=f.get(Calendar.HOUR_OF_DAY);
	fechaHora[4]=f.get(Calendar.MINUTE);
	fechaHora[5]=f.get(Calendar.SECOND);
	return fechaHora;
}
%>
<%
Calendar f1=Calendar.getInstance();
int[] actual=sacaCalen(f1);
%>
<p>FECHA ACTUAL</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}
//obtener una nueva fecha a partir de f1
f1.add(Calendar.YEAR, -1);
f1.add(Calendar.MINUTE, 40);
f1.add(Calendar.DAY_OF_MONTH, 10);
Calendar f2=f1;
actual=sacaCalen(f2);
%>
</tr>
</table>
<p>FECHA ACTUAL modificada en -1 año 40 minutos y 10 dias</p>
<table border="1">
<tr><td>año</td><td>mes</td><td>dia</td><td>hora</td><td>minutos</td><td>segundos</td></tr>
<tr>
<%
for (int i=0;i<actual.length;i++){%>
<td><%=actual[i]%></td>
<%}
//obtener una nueva fecha usando el metodo set
f1.set(2019,9,20,10,70,54);
actual=sacaCalen(f1);
%>
</tr>
</table>
<p>fecha seteando f1 f1.set(2019,9,20,10,70,54);</p>
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