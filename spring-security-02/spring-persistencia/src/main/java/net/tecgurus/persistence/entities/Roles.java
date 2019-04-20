package net.tecgurus.persistence.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
public class Roles implements Serializable{
	
	@Column(name = "id_rol")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRol;
	@Column(name = "rol_nombre")
	private String nombreRol;
	@Column(name = "desc_rol")
	private String descRol;
	@Column(name = "habilitado")
	private Integer habilitado;
	
	@OneToMany(mappedBy = "idRol")
	private List<UsuariosRoles> usuarioRol;
	
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	public String getDescRol() {
		return descRol;
	}
	public void setDescRol(String descRol) {
		this.descRol = descRol;
	}
	public Integer getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Integer habilitado) {
		this.habilitado = habilitado;
	}
	
	

}
