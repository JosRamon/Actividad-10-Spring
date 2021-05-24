//Funcion que permite que solo se ingresen numeros y algunos caracteres especiales si el campo es de tipo numerico
function esNumericoPlus(e) {
	//devuelve true si es numero o tab, enter, backspace, delete, flecha izquierda o flecha derecha. (incluye "-", "." y ",")
	var tecla = (e.keyCode) ? e.keyCode : e.which;
	return  (((tecla >= 44) && (tecla <= 57)) 
  			|| (tecla == 8) 
  			|| (tecla == 9) || (tecla == 13) 
  			|| (tecla == 37) || (tecla == 39));

}

//Permite ingresar solo n�meros o "." 
	//Sirve para cualquier navegador.
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