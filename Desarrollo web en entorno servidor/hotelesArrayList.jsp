<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Dao.hotel,Dao.datos" %>
<%
datos d=new datos();
ArrayList <hotel> listaHoteles=d.devolverDatos();
%>
<p>Reserva de hotel</p>
	<form action="destinoHotelesArraList.jsp" method="post">
	<select name="hotel" required>
	<%
	for (int i=0;i<listaHoteles.size();i++){
	%>	
		<option value="<%=i%>" selected>
		<%=listaHoteles.get(i).getNombre()%></option>
	<%}
	%>
	</select>
		<p>Nombre: <input type="text" name="nombre" required /></p>
		<p>DNI: <input type="text" name="DNI" required/></p>
		
		<p>Selecciona el numero de dias</p>
		<select name="dias" required>
			<%
	for (int i=1;i<7;i++){
	%>	
		<option value="<%=i%>" selected><%=i%></option>
	<%} %>
		</select>
		<select name="Regimen" required>
			<option value="A">Solo Alojamiento</option>
			<option value="AD" Selected >Alojamiento y desayuno</option>
		</select>
		<p>EXTRAS</p>
		<p>Parking interior: <input type="checkbox" name="parking" value="parking"/></p>
		<p>Jacuzzi: <input type="checkbox" name="jacuzzi" value="jacuzzi" /></p>
		<p>Gimnasio: <input type="checkbox" name="gym" value="gym" /></p>
	<input type="submit" name="enviar" value="enviar"/>
	</form>
	
</body>
</html>