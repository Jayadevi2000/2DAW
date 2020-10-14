<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Añade un cambio de divisas</p>
<form method="get" action="anexaDatos">

	Origen <input type="text" name="origen" value="euro" required/> <br/> 
	Destino <input type="text" name="destino" required/> <br/> 
	Factor de conversion <input type="number" name="factor" min="0.001" step="0.001"/> <br/> 
	
	<input type="submit" name="enviar" value="confirmar" />
	<input type="reset" name="borrar" value="borrar" />
</form>
</body>
</html>