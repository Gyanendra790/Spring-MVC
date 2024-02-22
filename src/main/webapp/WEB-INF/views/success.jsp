<%@page isELIgnored="false" %>
<%@page import="springmvc.model.User" %>
<html>
<head>
<title>successpage</title>
</head>
<body>
<h1>SUCCESS</h1>
<h2>${Header}</h2>
<h2>${Desc}</h2>
<h2 style=color:green>${message}</h2>
<h3>Name=${user.email}</h3>
<h3>Email=${user.password}</h3>
<h3>Password=${user.userName}</h3>
</body>
</html>
