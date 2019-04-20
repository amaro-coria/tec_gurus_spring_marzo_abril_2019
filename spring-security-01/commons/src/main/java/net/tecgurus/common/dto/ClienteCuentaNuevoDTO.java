package net.tecgurus.common.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteCuentaNuevoDTO implements Serializable{

	private ClienteDTO cliente;
	private CuentaDTO cuenta;
	
}
