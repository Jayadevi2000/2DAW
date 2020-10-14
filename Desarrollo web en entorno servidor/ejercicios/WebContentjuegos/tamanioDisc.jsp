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
		String[] tamanio = {"50","100","200"};
		String[] tamPalabras = {"pequeno","mediano","grande"};
		int posicionX = 10;
		Random rd = new Random();
		//nº aleatorio entre 0 y 2 (tamanio.length)
		int tamAleatorioPalabra = rd.nextInt(tamanio.length);
		String tamElegidoPalabra = tamPalabras[tamAleatorioPalabra];
		//tamElegidoPalabra tendremos pequeno mediano o grande
		int tamAleatorio = rd.nextInt(tamanio.length);
		// permutaciones de posicion
		%>
		<form action="destinoTamanioDisc.jsp" method="post">
		<%
		for(int i=0; i<tamanio.length ; i++,tamAleatorio++){
			if(tamAleatorio == tamanio.length) tamAleatorio=0; 
			String tamElegido = tamanio[tamAleatorio];
	%>
			
				<button type="submit" name="usuEscoge" value="<%=tamAleatorio%>">
				<svg xmlns="http://www.w3.org/2000/svg"  height="250px" width="250px">
				<rect x="30" y="30" width="<%=tamElegido%>" height="<%=tamElegido%>" stroke="green" stroke-width=2 fill="red"/>
				</svg>
				</button>
			
		<%
		} 
		%>
		<h2>Selecciona el de tamaño: <%=tamElegidoPalabra%></h2>
			<input type="hidden" name="debiaBuscar" value="<%=tamElegidoPalabra%>"/>
		</form>
</body>
</html>