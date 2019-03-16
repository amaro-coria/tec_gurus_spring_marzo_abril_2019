package net.tecgurus.interfaces.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.tecgurus.interfaces.Conferencia;
import net.tecgurus.interfaces.Reportero;

@Component
public class ConferenciaMatutina implements Conferencia{
	
	private Reportero reportero;
	
	

	public Reportero getReportero() {
		return reportero;
	}


    @Autowired
    @Qualifier(value = "badabum")
    //@Qualifier(value = "adelaMicha")
	public void setReportero(Reportero reportero) {
		this.reportero = reportero;
	}



	public String organizaRondaDePreguntas() {
		return reportero.elaboraPregunta();
	}

}
