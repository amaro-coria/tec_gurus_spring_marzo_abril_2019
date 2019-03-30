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
 * CatalogoGeneral generated by hbm2java
 */
@Entity
@Table(name = "Catalogo_General", catalog = "tec_gurus")
public class CatalogoGeneral implements java.io.Serializable {

	private Integer idCat;
	private String dscCorCat;
	private String dscComCat;
	private Integer idEstCat;
	private Date fchCre;
	private Date fchMod;

	public CatalogoGeneral() {
	}

	public CatalogoGeneral(String dscCorCat, String dscComCat, Integer idEstCat, Date fchCre, Date fchMod) {
		this.dscCorCat = dscCorCat;
		this.dscComCat = dscComCat;
		this.idEstCat = idEstCat;
		this.fchCre = fchCre;
		this.fchMod = fchMod;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_cat", unique = true, nullable = false)
	public Integer getIdCat() {
		return this.idCat;
	}

	public void setIdCat(Integer idCat) {
		this.idCat = idCat;
	}

	@Column(name = "dsc_cor_cat", length = 20)
	public String getDscCorCat() {
		return this.dscCorCat;
	}

	public void setDscCorCat(String dscCorCat) {
		this.dscCorCat = dscCorCat;
	}

	@Column(name = "dsc_com_cat", length = 50)
	public String getDscComCat() {
		return this.dscComCat;
	}

	public void setDscComCat(String dscComCat) {
		this.dscComCat = dscComCat;
	}

	@Column(name = "id_est_cat")
	public Integer getIdEstCat() {
		return this.idEstCat;
	}

	public void setIdEstCat(Integer idEstCat) {
		this.idEstCat = idEstCat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_cre", length = 26)
	public Date getFchCre() {
		return this.fchCre;
	}

	public void setFchCre(Date fchCre) {
		this.fchCre = fchCre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_mod", length = 26)
	public Date getFchMod() {
		return this.fchMod;
	}

	public void setFchMod(Date fchMod) {
		this.fchMod = fchMod;
	}

}
