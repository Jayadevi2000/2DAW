<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="modelo.Actual,modelo.Usuario" %>
<%
Usuario us=(Usuario) request.getAttribute("atribUsuario");
Actual a=new Actual(us.getLg(),us.getClv());
String[] datoAct=a.obtenerLinea();
if (datoAct!=null){
	request.setAttribute("atribLogin",datoAct[0]);
	if (datoAct[2].equals("A")){
	
		request.setAttribute("atribTipo","A");
		
	}else {
		
		request.setAttribute("atribTipo","U");
		
	}
	request.getRequestDispatcher("entradaAdmin").forward(request,response);
}else {
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>