<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String [] hoteles = {"Ritz","EuroStars","AC","Barceló","NH"};
	Integer [] RegimenA  = {100,120,140,200,300};
	Integer [] RegimenAD  = {110,140,175,250,350};
	Integer [] Parking  = {15,15,20,25,30};
	Integer [] Jacuzzi  = {10,15,20,25,40};
	Integer [] Gym  = {10,15,20,30,50};
%>
	<p>Reserva de hotel</p>
	<form action="destinoHotel.jsp" method="post">
		<select name="hotel" required>
			<option value="0" selected>Ritz</option>
			<option value="1">EuroStars</option>
			<option value="2">AC</option>
			<option value="3">Barceló</option>
			<option value="4">NH</option>
		</select>
		<p>Nombre: <input type="text" name="nombre" required /></p>
		<p>DNI: <input type="text" name="DNI" required/></p>
		
		<p>Selecciona el numero de dias</p>
		<select name="dias" required>
			<option value="1" selected>1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
		<select name="Regimen" required>
			<option value="A">Solo Alojamiento</option>
			<option value="AD" Selected >Alojamiento y desayuno</option>
		</select>
		<p>EXTRAS</p>
		<p>Parking interior: <input type="checkbox" name="parking" value="parking"/></p>
		<p>Jacuzzi: <input type="checkbox" name="jacuzzi" value="jacuzzi" /></p>
		<p>Gimnasio: <input type="checkbox" name="gym" value="gym" /></p>
	</form>
	<input type="submit" name="enviar" value="enviar"/>
</body>
</html>