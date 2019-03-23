package net.tecgurus.bd01.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.bd01.dto.Client;
import net.tecgurus.bd01.dto.ClienteDTO;
import net.tecgurus.bd01.persistence.ClientDAO;

public class Main {
	
	public static void main(String args[]) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClientDAO dao = appCtx.getBean(ClientDAO.class);
		for(Client c : dao.findAll()) {
			System.out.println(c.toString());
		}
		for(ClienteDTO c : dao.findAllClienteDTO()) {
			System.out.println(c.toString());
		}
	}

}
