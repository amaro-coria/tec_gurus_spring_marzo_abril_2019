package net.tecgurus.bd01.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable{
	
	private Integer idCliente;
	private String nombreCliente;
	private String apellidoPCliente;
	private String apellidoMCliente;
	private String telefono;
	private String email;

}
