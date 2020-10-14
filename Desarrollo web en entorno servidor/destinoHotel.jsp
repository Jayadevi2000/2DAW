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
	int factura=0;
	String [] hoteles = {"Ritz","EuroStars","AC","Barceló","NH"};
	Integer [] RegimenA  = {100,120,140,200,300};
	Integer [] RegimenAD  = {110,140,175,250,350};
	Integer [] Parking  = {15,15,20,25,30};
	Integer [] Jacuzzi  = {10,15,20,25,40};
	Integer [] Gym  = {10,15,20,30,50};

	String enviar = request.getParameter("enviar");
		if (enviar != null) {
			int NumHotel = Integer.parseInt(request.getParameter("hotel"));
			int NumDias = Integer.parseInt(request.getParameter("dias"));
			String regimen = request.getParameter("Regimen");
			if(regimen == "AD"){
				factura+=RegimenAD[NumHotel]*NumDias;
			}
			else{
				factura+=RegimenA[NumHotel]*NumDias;
			}
			String parking= request.getParameter("parking");
			if(parking!=null){
				factura+=Parking[NumHotel];
			}
			String jacuzzi= request.getParameter("jacuzzi");
			if(jacuzzi!=null){
				factura+=Jacuzzi[NumHotel];
			}
			String gym= request.getParameter("gym");
			if(gym!=null){
				factura+=Gym[NumHotel];
			}
			String nombre=request.getParameter("nombre");
			String DNI=request.getParameter("DNI");
			String hotel = hoteles[NumHotel];
		}
%>
<h1>FACTURA</h1>
<ul>
<li>Coste de la estancia</li><li><%=factura %></li>
</ul>
</body>
</html>