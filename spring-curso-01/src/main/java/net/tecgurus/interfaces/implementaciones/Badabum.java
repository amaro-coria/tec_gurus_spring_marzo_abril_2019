package net.tecgurus.interfaces.implementaciones;

import net.tecgurus.interfaces.Presidente;
import net.tecgurus.interfaces.Reportero;

public class Badabum implements Reportero{
	
	private Presidente presidente;
	
	public Badabum(Presidente presidente) {
		this.presidente = presidente;
	}

	public String elaboraPregunta() {
		return presidente.daNombre() + " ..... son pareja?";
	}

}
