package net.tecgurus.persistence.entities;
// Generated 30/03/2019 10:27:41 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CuentasCliente generated by hbm2java
 */
@Entity
@Table(name = "Cuentas_Cliente", catalog = "tec_gurus")
public class CuentasCliente implements java.io.Serializable {

	private Integer idCtaCte;
	private Integer idCta;
	private Integer idCte;
	private Date fchCre;
	private Integer idEdoCtaCte;
	private String cmntCtaCte;
	private Integer idTipCtaCte;

	public CuentasCliente() {
	}

	public CuentasCliente(Integer idCta, Integer idCte, Date fchCre, Integer idEdoCtaCte, String cmntCtaCte,
			Integer idTipCtaCte) {
		this.idCta = idCta;
		this.idCte = idCte;
		this.fchCre = fchCre;
		this.idEdoCtaCte = idEdoCtaCte;
		this.cmntCtaCte = cmntCtaCte;
		this.idTipCtaCte = idTipCtaCte;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_cta_cte", unique = true, nullable = false)
	public Integer getIdCtaCte() {
		return this.idCtaCte;
	}

	public void setIdCtaCte(Integer idCtaCte) {
		this.idCtaCte = idCtaCte;
	}

	@Column(name = "id_cta")
	public Integer getIdCta() {
		return this.idCta;
	}

	public void setIdCta(Integer idCta) {
		this.idCta = idCta;
	}

	@Column(name = "id_cte")
	public Integer getIdCte() {
		return this.idCte;
	}

	public void setIdCte(Integer idCte) {
		this.idCte = idCte;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_cre", length = 26)
	public Date getFchCre() {
		return this.fchCre;
	}

	public void setFchCre(Date fchCre) {
		this.fchCre = fchCre;
	}

	@Column(name = "id_edo_cta_cte")
	public Integer getIdEdoCtaCte() {
		return this.idEdoCtaCte;
	}

	public void setIdEdoCtaCte(Integer idEdoCtaCte) {
		this.idEdoCtaCte = idEdoCtaCte;
	}

	@Column(name = "cmnt_cta_cte", length = 50)
	public String getCmntCtaCte() {
		return this.cmntCtaCte;
	}

	public void setCmntCtaCte(String cmntCtaCte) {
		this.cmntCtaCte = cmntCtaCte;
	}

	@Column(name = "id_tip_cta_cte")
	public Integer getIdTipCtaCte() {
		return this.idTipCtaCte;
	}

	public void setIdTipCtaCte(Integer idTipCtaCte) {
		this.idTipCtaCte = idTipCtaCte;
	}

}
