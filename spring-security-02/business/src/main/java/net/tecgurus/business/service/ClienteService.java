package net.tecgurus.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.tecgurus.business.util.ClienteMapper;
import net.tecgurus.common.dto.ClienteDTO;
import net.tecgurus.common.exception.ServiceException;
import net.tecgurus.persistence.dao.impl.ClienteDAO;
import net.tecgurus.persistence.entities.Cliente;

@Service
@Slf4j
public class ClienteService {

	@Autowired
	private ClienteDAO dao;
	@Autowired
	private ClienteMapper mapper;
	
	public Integer save(ClienteDTO clienteDTO) throws ServiceException{
		try {
			/*
			Cliente entity = new Cliente();
			entity.setApeMatCte(clienteDTO.getApeMatCte());
			entity.setApePatCte(clienteDTO.getApePatCte());
			entity.setDirCte(clienteDTO.getDirCte());
			entity.setIdEdoCte(clienteDTO.getIdEdoCte());
			entity.setNomCte(clienteDTO.getNomCte());
			entity.setTelCte(clienteDTO.getTelCte());*/
			Cliente entity = mapper.toEntity(clienteDTO);
			Integer id = (Integer) dao.create(entity);
			return id;
		}catch(Exception e) {
			//TODO detallar llamada de constructor
			log.error("Error al guardar entidad: {}", e.getMessage());
			log.error("Traza: ", e);
			throw new ServiceException();
		}
		
	}
	
}
