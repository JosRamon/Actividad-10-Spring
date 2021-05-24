package ramon.entrega.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ramon.entrega.spring.model.Triangulo;
import ramon.entrega.spring.services.Service;

@Controller
@RequestMapping("/triangulos")
public class TrianguloController {

	@RequestMapping("/")
	public String inicio() {		
		return "triangulo/inicioTriangulo";
	}
	
	@RequestMapping(value = "/calcularDatos", method = RequestMethod.POST)
	public String sumarNumeros(Model model, double base, double altura) {
		
		Triangulo triangulo = new Triangulo(base, altura);
		
		//ALMACENAR EN LA BD
		String mensaje = "";
		if(Service.getInstance().insertarTriangulo(triangulo)) {
			mensaje = "El triangulo se guardo correctamente. El area es " + 
					triangulo.getArea() + " y el perimetro es " + triangulo.getPerimetro();
		} else {
			mensaje = "ERROR DE CONEXION";
		}
		model.addAttribute("resultado", mensaje);
		
		return "triangulo/resultadoTriangulo";
	}

		
}
