package net.tecgurus.business.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.common.dto.RolDTO;
import net.tecgurus.persistence.dao.impl.RolDAO;
import net.tecgurus.persistence.entities.Roles;

@Service
@Transactional
public class RoleService {

	@Autowired
	private RolDAO dao;
	
	
	public List<RolDTO> findRolesByUsername(String username){
		List<Roles> listRoles = dao.findRolesByUsername(username);
		List<RolDTO> listDTO = new ArrayList<>();
		for(Roles r: listRoles) {
			RolDTO dto = new RolDTO();
			dto.setIdRol(r.getIdRol());
			dto.setNomRol(r.getNombreRol());
			listDTO.add(dto);
		}
		return listDTO;
	}
	
	
}
