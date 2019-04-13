package net.tecgurus.common.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuentaDTO implements Serializable{

	private Integer idCta;
	private String noCta;
	private Integer idTipCta;
	private Date fchAlt;
	private Long idEst;
	private Date fchCre;
	private Date fchMod;
	private String noTar;
	private BigDecimal blncCta;
	
}
