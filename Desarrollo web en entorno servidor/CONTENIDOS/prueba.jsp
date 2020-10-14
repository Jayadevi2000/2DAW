<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.text.*,java.sql.*,java.io.IOException,java.time.*,java.util.Map" %>
	<%
	//import util.Map
	
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/articulos", "root", "");
			if (conn != null) {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select * from  articulos");

				// Se recorre el ResultSet, mostrando por pantalla los resultados.
				while (rs.next()) {
					
					out.println("<p>"+ rs.getString("nombre")+"</p>");
				}
				conn.close();
			}
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	%>
</body>
</html>