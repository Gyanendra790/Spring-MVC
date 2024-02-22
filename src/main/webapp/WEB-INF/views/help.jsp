<%@ page import="java.time.LocalDateTime" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" %>
<html>
<head>
<title>help page</title>
</head>
<body>
<h1>HELP PAGE</h1>
<%
String n=(String)request.getAttribute("name");
LocalDateTime t=(LocalDateTime)request.getAttribute("time");
%>
<h2>Helper name=<%=n %></h2>
<h2>Time=<%=t %></h2>
</body>
</html>
