package net.tecgurus.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.common.dto.UsuarioDTO;
import net.tecgurus.persistence.dao.impl.UsuarioDAO;
import net.tecgurus.persistence.entities.Usuarios;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UsuarioDAO dao;
	
	public UsuarioDTO findByUsername(String username) {
		Usuarios user =  dao.findByUsername(username);
		UsuarioDTO dto = new UsuarioDTO();
		dto.setIdUser(user.getIdUsuario());
		dto.setPassword(user.getPasswordUsuario());
		dto.setUsername(user.getNombreUsuario());
		return dto;
	}

}
