package net.tecgurus.common.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UsuarioDTO implements Serializable{
	
	private Integer idUser;
	private String username;
	private String password;

}
