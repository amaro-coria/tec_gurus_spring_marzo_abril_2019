package net.tecgurus.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.tecgurus.business.service.RoleService;
import net.tecgurus.business.service.UserService;
import net.tecgurus.common.dto.RolDTO;
import net.tecgurus.common.dto.UsuarioDTO;

//@Service
public class UserAuthentication implements UserDetailsService{
	
//	@Autowired
	private UserService service;
//	@Autowired
	private RoleService serviceRol;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//1 - username, 2 - password, 3 - roles
		UsuarioDTO usuario = service.findByUsername(username);
		String password = usuario.getPassword();
		List<RolDTO> listRoles = serviceRol.findRolesByUsername(username);
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		for(final RolDTO r : listRoles) {
			GrantedAuthority g = new GrantedAuthority() {
				
				public String getAuthority() {
					return r.getNomRol();
				}
			};
			list.add(g);
		}
		User user = new User(username, password, list);
		return user;
		//User user = new 
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public RoleService getServiceRol() {
		return serviceRol;
	}

	public void setServiceRol(RoleService serviceRol) {
		this.serviceRol = serviceRol;
	}

}
