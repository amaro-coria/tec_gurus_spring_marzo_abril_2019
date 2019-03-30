package net.tecgurus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {
	
	@RequestMapping(value = "/saluda")
	public String holaMundo() {
		return "hola";
	}

}
