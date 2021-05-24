<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING</title>
</head>
<body>
	<h1>RESULTADO DE LA SUMA</h1>
	<h3>El resultado de la suma de los numeros es: ${resultado}</h3>
	
	<br><br>
	<a href="<%=request.getContextPath() %>/numeros/">Volver a ingresar n&uacute;meros</a>
	<br>
	<!-- <a href="<%=request.getContextPath() %>">Volver a MENU</a>  -->
	
</body>
</html>