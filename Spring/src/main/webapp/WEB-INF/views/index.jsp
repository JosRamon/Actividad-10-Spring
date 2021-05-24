<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING</title>
</head>
<body>

	<h1>Menu Principal</h1>
	<h3>Seleccione la operacion correspondiente al tema</h3>

	<ul>
		<li><a href="<%=request.getContextPath() %>/numeros/">Tema 8: Spring Framework MVC. Suma de Numeros</a></li>
		<li><a href="<%=request.getContextPath() %>/triangulos/">Tema 9: Spring MVC + CSR y conexión de base de datos sql</a></li>
	</ul>


</body>
</html>