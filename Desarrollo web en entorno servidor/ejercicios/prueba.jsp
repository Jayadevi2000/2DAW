<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
Connection conn = null;
try {
    conn =
       DriverManager.getConnection("jdbc:mysql://localhost/censo?" +
                                   "user=root&password=rootmysql");

    Statement s = conn.createStatement();
    ResultSet rs = s.executeQuery ("select * from  ciudadano where DNI like '%3%'");

    // Se recorre el ResultSet, mostrando por pantalla los resultados.
    while (rs.next())
    {
       out.println ("<p>"+rs.getString ("DNI") + " " + rs.getString ("CLAVE")+" "+rs.getString (2) +
            "</p>");
    }
   conn.close();

  
} catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}
%>
</body>
</html>