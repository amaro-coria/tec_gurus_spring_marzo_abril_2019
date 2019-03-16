package net.tecgurus.interfaces.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.interfaces.Presidente;
import net.tecgurus.interfaces.Reportero;

@Component
public class AdelaMicha implements Reportero{
	
	private Presidente presidente;
	
	@Autowired
	public AdelaMicha(Presidente presidente) {
		this.presidente = presidente;
	}

	public String elaboraPregunta() {
		return presidente.daNombre() + " ... y los peluche????";
	}

}
