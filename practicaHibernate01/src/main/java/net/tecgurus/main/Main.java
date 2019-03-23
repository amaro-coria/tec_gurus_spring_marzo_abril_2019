package net.tecgurus.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.persistence.dao.ClienteDAO;
import net.tecgurus.persistence.entities.Clientes;

public class Main {

	public static void main(String args[]) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClienteDAO dao = appCtx.getBean(ClienteDAO.class);
		for(Clientes c : dao.findAll()) {
			System.out.println(c.toString());
		}
	}
	
}
