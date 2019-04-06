package net.tecgurus.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.tecgurus.persistence.dao.CatalogoGeneralDAO;
import net.tecgurus.persistence.entities.CatalogoGeneral;

@Controller
public class CatalogoController {
	
	@Autowired
	private CatalogoGeneralDAO dao;

	@RequestMapping(value = "/altaCatalogov2")
	public ModelAndView altaCatalogoPre() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("catalogo", new CatalogoGeneral());
		mv.setViewName("catalogo");
		return mv;
	}
	
	@RequestMapping(value = "/altaCatalogov2Post", method = RequestMethod.POST)
	public ModelAndView altaCatalogoPost(@ModelAttribute CatalogoGeneral catalogoGeneral) {
		//validar si ya hay un registro con XXXX carac.
		catalogoGeneral.setIdEstCat(1);
		catalogoGeneral.setFchCre(new Date());
		dao.save(catalogoGeneral);
		ModelAndView mv = new ModelAndView();
		List<CatalogoGeneral> lista = dao.findAll();
		mv.addObject("lista", lista);
		mv.setViewName("listado-catalogos");
		return mv;
	}
	
}
