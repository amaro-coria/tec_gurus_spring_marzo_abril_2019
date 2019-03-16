package net.tecgurus.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.interfaces.Conferencia;
import net.tecgurus.interfaces.Saludo;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("#####################################");
		System.out.println("Hola mundo!");
        ApplicationContext appCtx = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
	    Saludo objetoTraidoDelXml = appCtx.getBean(Saludo.class);
	    System.out.println(objetoTraidoDelXml.saluda());
	    System.out.println("#####################################");
	    System.out.println("=====================================");
	    Conferencia objetoDesdeXml = appCtx.getBean(Conferencia.class);
	    System.out.println(objetoDesdeXml.organizaRondaDePreguntas());
	    System.out.println("=====================================");
	    
	}

}
