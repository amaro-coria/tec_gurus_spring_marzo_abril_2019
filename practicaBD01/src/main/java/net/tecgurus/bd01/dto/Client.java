package net.tecgurus.bd01.dto;

import java.io.Serializable;

public class Client implements Serializable{
	
	public Client() {
	}
	
	public Client(Integer id, String name, String lastname, String lastname2, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.lastname2 = lastname2;
		this.phone = phone;
		this.email = email;
	}
	
	private Integer id;
	private String name;
	private String lastname;
	private String lastname2;
	private String phone;
	private String email;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname2() {
		return lastname2;
	}
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((lastname2 == null) ? 0 : lastname2.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (lastname2 == null) {
			if (other.lastname2 != null)
				return false;
		} else if (!lastname2.equals(other.lastname2))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastname=" + lastname + ", lastname2=" + lastname2
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
}
