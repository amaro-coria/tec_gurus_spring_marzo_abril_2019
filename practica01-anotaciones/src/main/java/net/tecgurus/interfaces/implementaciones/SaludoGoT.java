package net.tecgurus.interfaces.implementaciones;

import org.springframework.stereotype.Component;

import net.tecgurus.interfaces.Saludo;

@Component
public class SaludoGoT implements Saludo{

	public String saluda() {
		return "Vallar Morgulius";
	}

	
	
}
