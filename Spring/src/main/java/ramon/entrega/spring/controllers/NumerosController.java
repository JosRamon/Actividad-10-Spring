package ramon.entrega.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ramon.entrega.spring.model.SumaNumeros;

@Controller
@RequestMapping("/numeros")
public class NumerosController {

	
	@RequestMapping("/")
	public String inicio() {		
		return "numeros/inicioNumeros";
	}
	
	@RequestMapping(value = "/sumarNumeros", method = RequestMethod.POST)
	public String sumarNumeros(Model model, double valor1, double valor2) {
		
		SumaNumeros sm = new SumaNumeros(valor1, valor2);
		model.addAttribute("resultado", sm.getResultado());
		
		return "numeros/resultadoSuma";
	}
		
}
