<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING</title>


<script type="text/javascript">

//Permite ingresar solo numeros o "."
function esNumericoDecimal(event, texto) {
	var tecla;
	(event.keyCode) ? tecla = event.keyCode : tecla = event.which;
	if ((tecla >= 48 && tecla <= 57) //es numero 
			|| (tecla == 8) 
			|| (tecla == 9) || (tecla == 13) 
			|| (tecla == 37) || (tecla == 39))
		return true;
	else if(tecla==46 && texto.length!=0 && texto.indexOf(".")==-1) 
		//es punto y esta una sola vez en el texto
		return true;
	return false;
}

</script>
</head>
<body>

	<h1>TRIANGULOS</h1>
	<h3>Ingrese la base y la altura del tri&aacute;ngulo para obtener el &aacute;rea y el per&iacute;metro</h3>
	
	<form action="<%=request.getContextPath() %>/triangulos/calcularDatos" method="post">
		<table style="align-content: center; border: 0;">
		<tr>
			<td>Base</td>
			<td><input type="text" name="base" id="base" required="required" value="" onkeypress="return esNumericoDecimal(event);" />
		</tr>
		<tr>
			<td>Altura</td>
			<td><input type="text" name="altura" id="altura" required="required" value="" onkeypress="return esNumericoDecimal(event);" />
		</tr>
		<tr>
			<td><input type="submit" value="CALCULAR" /></td>
		</tr>
		</table>
	
	</form>
	

</body>
</html>