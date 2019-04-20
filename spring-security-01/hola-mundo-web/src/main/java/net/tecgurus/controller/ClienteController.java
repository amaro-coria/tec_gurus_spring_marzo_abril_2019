package net.tecgurus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import net.tecgurus.business.service.ClienteService;
import net.tecgurus.common.dto.ClienteDTO;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	public ModelAndView clienteCreated(@ModelAttribute ClienteDTO cliente) {
		ModelAndView mv = new ModelAndView();
		try {
			service.save(cliente);
			mv.setViewName("cliente-ok");
		}catch(Exception e) {
			//TODO manejar la exception y mandar a una JSP distinta
			mv.setViewName("cliente-fail");
		}
		return mv;
	}
	
}
