<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//int i=0;
	String[] tamanio = {"50","100","200"};
	String[] tamPalabras = {"pequeno","mediano","grande"};
	//un numero
	String recibido = request.getParameter("usuEscoge");
	String usuDebiaBuscar = request.getParameter("debiaBuscar");
	int indice=Integer.parseInt(recibido);
	if (tamPalabras[indice].equals(usuDebiaBuscar)){
		out.println("<p> has acertado</p>");
	}else{
		out.println("<p> no has acertado debia ser "+usuDebiaBuscar+
				" pero has elegido "+ tamPalabras[indice]+"</p>");
	}
	%>
	<a href="tamanioDisc.jsp">Volver</a>
	<p><a href="index.html">Volver al indice</a></p>
</body>
</html>