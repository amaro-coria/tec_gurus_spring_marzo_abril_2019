package net.tecgurus.interfaces.implementaciones;

import net.tecgurus.interfaces.Conferencia;
import net.tecgurus.interfaces.Reportero;

public class ConferenciaMatutina implements Conferencia{
	
	private Reportero reportero;
	
	

	public Reportero getReportero() {
		return reportero;
	}



	public void setReportero(Reportero reportero) {
		this.reportero = reportero;
	}



	public String organizaRondaDePreguntas() {
		return reportero.elaboraPregunta();
	}

}
