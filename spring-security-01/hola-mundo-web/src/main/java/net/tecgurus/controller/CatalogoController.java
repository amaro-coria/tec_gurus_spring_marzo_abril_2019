package net.tecgurus.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.tecgurus.business.facade.CatalogoFacade;
import net.tecgurus.common.dto.CatalogoDTO;
import net.tecgurus.common.exception.DatosException;

@Controller
public class CatalogoController {
	
	@Autowired
	//private CatalogoGeneralDAO dao;
	private CatalogoFacade facade;

	@RequestMapping(value = "/altaCatalogov2")
	public ModelAndView altaCatalogoPre() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("catalogo", new CatalogoDTO());
		mv.setViewName("catalogo");
		return mv;
	}
	
	@RequestMapping(value = "/altaCatalogov2Post", method = RequestMethod.POST)
	public ModelAndView altaCatalogoPost(@ModelAttribute CatalogoDTO catalogoGeneral) throws DatosException {
		//validar si ya hay un registro con XXXX carac.
		catalogoGeneral.setId(1);
		catalogoGeneral.setFchCrea(new Date());
		//dao.save(catalogoGeneral);
		ModelAndView mv = new ModelAndView();
		List<CatalogoDTO> lista = facade.findAll();
		mv.addObject("lista", lista);
		mv.setViewName("listado-catalogos");
		return mv;
	}
	
}
