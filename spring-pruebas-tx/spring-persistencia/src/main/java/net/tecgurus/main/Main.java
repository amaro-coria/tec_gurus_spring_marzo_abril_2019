package net.tecgurus.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.persistence.dao.CatalogoGeneralDAO;
import net.tecgurus.persistence.dao.impl.ClienteDAO;
import net.tecgurus.persistence.entities.CatalogoGeneral;

public class Main {

	public static void main(String[] args) {
		CatalogoGeneral c1 = new CatalogoGeneral();
		c1.setDscComCat("Test");
		c1.setFchCre(new Date());
		c1.setDscCorCat("Test");
		c1.setIdEstCat(1);
		
		ApplicationContext appCtx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CatalogoGeneralDAO dao = appCtx.getBean(CatalogoGeneralDAO.class);
		dao.save(c1);
		
		ClienteDAO clienteDAO = appCtx.getBean(ClienteDAO.class);
		

	}

}
