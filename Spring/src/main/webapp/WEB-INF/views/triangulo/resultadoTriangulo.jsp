<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING</title>
</head>
<body>
	<h1>DATOS DEL TRIANGULO INGRESADO</h1>
	<h3>${resultado}</h3>
	
	<br><br>
	<a href="<%=request.getContextPath() %>/triangulos/">Volver a ingresar un tri&aacute;ngulo</a>
	<br>
	<!-- <a href="<%=request.getContextPath() %>">Volver a MENU</a> -->
	
</body>
</html>