<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.ArrayList,modelo.*,controlador.*" %>
<%
	boolean poderes = false;
	HttpSession sesion = request.getSession();
	String ses = (String) sesion.getAttribute("login");
	String tipo = (String) sesion.getAttribute("tipo");
	if (!ses.equals("anonimo") && !tipo.equals("invitado")) {
		poderes = true;
	}
	
	
	String m, b;//modificar y borrar
	ArrayList<Plaza> le = null;
	le = (ArrayList<Plaza>) request.getAttribute("miLista");
	for (Plaza e : le) {
		int ident = e.getId();
		String estado=e.getEstado();
		b = "<a href=\"adminAplicacion?id=" + ident + "&estado="+estado+"&action=3\">eliminar </a>";
		m = "<a href=\"adminAplicacion?id=" + ident + "&estado="+estado+"&action=4\">modificar</a>";
		if (poderes){
			if (tipo.equals("A")){
				out.println("<p> "+e+" " +b+" " +m+"</p>");	
			}else {
				out.println("<p> "+e+" " +m+"</p>");		
			}
		}else {
			out.println("<p> "+e+"</p>");
		}
		
	}
	out.println(" ");
	
	
%>
<p><a href="index.jsp">regresar a index</a>
</body>
</html>