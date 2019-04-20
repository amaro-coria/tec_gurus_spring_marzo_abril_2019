package net.tecgurus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaMundoController {
	
	@RequestMapping(value = "/saluda")
	public String holaMundo() {
		return "hola";
	}
	
	
	@RequestMapping(value = "/parametros", params = {"nombre","apellido","otro"})
	public ModelAndView pruebaMensajeServer(ModelAndView model,
											@RequestParam String nombre, 
											@RequestParam String apellido, 
											@RequestParam String otro) {
		model.addObject("mensaje", "Hola TecGurus!!! Web MVC (Y) ");
		model.setViewName("params");
		model.addObject("parametro", nombre+apellido+otro);
		return model;
	}

}
