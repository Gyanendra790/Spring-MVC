<%@ page import="java.util.List" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" %>
<html>
<head>
<title>homepage</title>
</head>
<body>
<h2>Hello World! this is home page called by home controller</h2>

<%
String n=(String)request.getAttribute("name");
List<String> fr=(List<String>)request.getAttribute("friends");
%>
<h1>Name=<%=n %></h1>
<h2>
FRIENDS NAME:
<%
for(String f:fr)
{
out.println(f);
}
%>
</h2>

</body>
</html>
