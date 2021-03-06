package net.tecgurus.persistence.entities;
// Generated 30/03/2019 10:27:41 AM by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
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
 * MovimientosCuenta generated by hbm2java
 */
@Entity
@Table(name = "Movimientos_Cuenta", catalog = "tec_gurus")
public class MovimientosCuenta implements java.io.Serializable {

	private Integer idMovCta;
	private Integer idCta;
	private Date fchCre;
	private Integer idTipMov;
	private BigDecimal mntMov;
	private String dscMov;
	private String folAut;

	public MovimientosCuenta() {
	}

	public MovimientosCuenta(Integer idCta, Date fchCre, Integer idTipMov, BigDecimal mntMov, String dscMov,
			String folAut) {
		this.idCta = idCta;
		this.fchCre = fchCre;
		this.idTipMov = idTipMov;
		this.mntMov = mntMov;
		this.dscMov = dscMov;
		this.folAut = folAut;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_mov_cta", unique = true, nullable = false)
	public Integer getIdMovCta() {
		return this.idMovCta;
	}

	public void setIdMovCta(Integer idMovCta) {
		this.idMovCta = idMovCta;
	}

	@Column(name = "id_cta")
	public Integer getIdCta() {
		return this.idCta;
	}

	public void setIdCta(Integer idCta) {
		this.idCta = idCta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_cre", length = 26)
	public Date getFchCre() {
		return this.fchCre;
	}

	public void setFchCre(Date fchCre) {
		this.fchCre = fchCre;
	}

	@Column(name = "id_tip_mov")
	public Integer getIdTipMov() {
		return this.idTipMov;
	}

	public void setIdTipMov(Integer idTipMov) {
		this.idTipMov = idTipMov;
	}

	@Column(name = "mnt_mov", precision = 20)
	public BigDecimal getMntMov() {
		return this.mntMov;
	}

	public void setMntMov(BigDecimal mntMov) {
		this.mntMov = mntMov;
	}

	@Column(name = "dsc_mov", length = 50)
	public String getDscMov() {
		return this.dscMov;
	}

	public void setDscMov(String dscMov) {
		this.dscMov = dscMov;
	}

	@Column(name = "fol_aut", length = 20)
	public String getFolAut() {
		return this.folAut;
	}

	public void setFolAut(String folAut) {
		this.folAut = folAut;
	}

}
