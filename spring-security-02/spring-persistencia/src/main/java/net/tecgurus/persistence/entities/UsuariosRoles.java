package net.tecgurus.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Usuario_Roles")
@Entity
public class UsuariosRoles implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ur")
	private Integer idUr;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuarios idUsuario;
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private Roles idRol;
	
	
	public Integer getIdUr() {
		return idUr;
	}
	public void setIdUr(Integer idUr) {
		this.idUr = idUr;
	}
	public Usuarios getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Roles getIdRol() {
		return idRol;
	}
	public void Roles(Roles idRol) {
		this.idRol = idRol;
	}
	
	

}
