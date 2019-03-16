package net.tecgurus.interfaces.implementaciones;

import org.springframework.stereotype.Component;

import net.tecgurus.interfaces.Presidente;

@Component
public class PresidenteLopezObrador implements Presidente{

    public  String daDiscurso() {
    	return "Los pueblos unidos y la paz ..... pausa ..... son la causa ... pausa ... ";
    }
	
	public String daNombre() {
		return "Andres Manuel Lopez Obrador";
	}
	
	
}
