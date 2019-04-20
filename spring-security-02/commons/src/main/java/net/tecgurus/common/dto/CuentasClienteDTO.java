package net.tecgurus.common.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuentasClienteDTO implements Serializable {

	private Integer idCtaCte;
	private Integer idCta;
	private Integer idCte;
	private Date fchCre;
	private Integer idEdoCtaCte;
	private String cmntCtaCte;
	private Integer idTipCtaCte;
}
