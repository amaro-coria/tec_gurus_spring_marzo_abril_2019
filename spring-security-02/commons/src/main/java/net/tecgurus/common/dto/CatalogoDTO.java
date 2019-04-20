package net.tecgurus.common.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogoDTO implements Serializable {

	private Integer id;
	private String codCorto;
	private String codComp;
	private Date fchCrea;
	private Date fchModi;
	
}
