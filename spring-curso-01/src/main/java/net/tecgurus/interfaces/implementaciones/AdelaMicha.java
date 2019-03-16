package net.tecgurus.interfaces.implementaciones;

import net.tecgurus.interfaces.Presidente;
import net.tecgurus.interfaces.Reportero;

public class AdelaMicha implements Reportero{
	
	private Presidente presidente;
	
	public AdelaMicha(Presidente presidente) {
		this.presidente = presidente;
	}

	public String elaboraPregunta() {
		return presidente.daNombre() + " ... y los peluche????";
	}

}
