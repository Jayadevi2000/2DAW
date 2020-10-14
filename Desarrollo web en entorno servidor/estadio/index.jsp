<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page  import="modelo.Compara,command.*,java.util.concurrent.TimeUnit"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Luces de Estadio</title>

<link rel="stylesheet" type="text/css" href="estilo.css">

</head>
<body>
<%

	<div class="contenedorPadre">
		<h1>LUCES ESTADIO</h1>
		<div class="contenedor">
			<div class="divForma">
				<svg id="<%=demo%>">
<g>
<%
	//num filas y columnas
	int fil = 9, col = 9;
	//distancia entre filas y columnas
	int salto = 25;
	//separacion entre figuras
	int px = 25, py = 25;

	for (int y = 0; y < fil; y++, py += salto) {
		px = 25;
		for (int x = 0; x < col; x++, px += salto) {
			if (Compara.focosX(x, y)) {
%>
		<rect x="<%=px - 9%>" y="<%=py - 4.5%>" class="focosX" name="focos" />
									<%
										}
												if (Compara.focosY(x, y)) {
									%>
		<rect x="<%=px - 4.5%>" y="<%=py - 9%>" class="focosY" name="focos" />
									<%
										}
												if (Compara.circulos(x, y)) {
									%>
		<circle cx="<%=px%>" cy="<%=py%>" name="asientos"  />
									<%
										}
												if (Compara.rectangulosX(x, y) && !(x == 4 && y == 4)) {
									%>
		<ellipse  cx="<%=px%>" cy="<%=py%>" class="salidasX" name="salidas" />
		
		<%
					}
							if (Compara.rectangulosY(x, y) && !(x == 4 && y == 4)) {
				%>
		<ellipse  cx="<%=px%>" cy="<%=py%>" class="salidasY" name="salidas" />
		
		
		<%
							}
								}
							}
						%>
</g>
</svg>
			</div>
			<div class="divTabla">
			<form action="index.jsp" method="post">
				<table>
					<tr>
						<td><input type="submit" name="accion" value="1">encender luces perimetrales</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="2">apagar luces perimetrales</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="3">regular luces perimetrales</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="4">encender luces emergencia</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="5">apagar luces emergencia</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="6">parpadeo luces emergencia</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="7">encender luces salida</td>
					</tr>
					<tr>
						<td><input type="submit" name="accion" value="8">apagar luces salida</td>
					</tr>
				</table>
				</form>
			</div>
		</div>
	</div>

</body>
</html>