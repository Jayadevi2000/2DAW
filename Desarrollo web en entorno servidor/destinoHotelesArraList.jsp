<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*"  %>
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
int factura=0;
hotel ht;
String extras="";
int NumHotel = Integer.parseInt(request.getParameter("hotel"));
int NumDias = Integer.parseInt(request.getParameter("dias"));
	String regimen = request.getParameter("Regimen");
	String nombre = request.getParameter("nombre");
	String DNI = request.getParameter("DNI");
	String parking = request.getParameter("parking");
	String jacuzzi = request.getParameter("jacuzzi");
	String gym = request.getParameter("gym");
	ht=listaHoteles.get(NumHotel);
	
	if (regimen.equals("AD")) {
		factura += ht.getRegimenAD();
	} else {
		factura += ht.getRegimenA() ;
	}
	
	if (parking != null) {
		factura += ht.getExtras()[0];
		extras+=" parking por valor de "+ht.getExtras()[0];
	}
	
	if (jacuzzi != null) {
		factura += ht.getExtras()[1];
		extras+=" jacuzzi por valor de "+ht.getExtras()[1];
	}
	
	if (gym != null) {
		factura += ht.getExtras()[2];
		extras+="gym por valor de "+ht.getExtras()[2];
	}
	
	
	/*factura por un dia*/
	out.println("<p> factura para el cliente "+nombre+" con dni "+DNI+"</p>");
	out.println("<p> hotel "+ht.getNombre()+" nº de dias "+NumDias+"</p>");
	out.println("<p> tipo de alojamineto "+regimen+"</p>");
	out.println("<p> "+extras+ "</p>");
	out.println("<p> el importe por un dia es "+factura+ "</p>");
	out.println("<p> el importe por "+NumDias+" es s "+(factura)*NumDias+"</p>");
%>
<p><a href="hotelesArrayList.jsp">otra reserva</a></p>
</body>
</html>