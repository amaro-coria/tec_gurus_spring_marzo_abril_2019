package net.tecgurus.common.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO implements Serializable{

	private Integer idCte;
	private String nomCte;
	private String apePatCte;
	private String apeMatCte;
	private String telCte;
	private String dirCte;
	private Integer idEdoCte;
	
	
}
