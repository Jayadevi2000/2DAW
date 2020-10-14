<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
LocalDateTime lT1 = LocalDateTime.now();
out.println(lT1+"<br/>");

LocalDateTime l2 = LocalDateTime.of(2019, Month.AUGUST, 20, 8, 30,59);
out.println(l2+"<br/>"); // 2017-08-20T08:30

LocalDateTime l3 = l2.plusDays(5);
out.println(l3+" l3 <br/>"); // 2017-08-25T08:30

LocalDateTime l4 = l3.minusMinutes(10);
out.println(l4+" l4= l3 menos 10 minutos<br/>"); 
LocalDateTime l5=l4.plusYears(1);
out.println(l5+" l5=l4 m+as 1 año<br/>"); 
long dif=Duration.between(l3, l5).toDays();
out.println(dif+" entre l3 y l5 <br/>"); 
%>
</body>
</html>