package net.tecgurus.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.tecgurus.common.dto.CuentasClienteDTO;
import net.tecgurus.common.exception.ServiceException;
import net.tecgurus.persistence.dao.impl.CuentasClienteDAO;
import net.tecgurus.persistence.entities.CuentasCliente;

@Service
@Slf4j
public class CuentasClienteService {

	@Autowired
	private CuentasClienteDAO dao;
	
	public Integer saveCtaCliente(CuentasClienteDTO dto) throws ServiceException {
		try {
			CuentasCliente entity = new CuentasCliente();
			entity.setIdCta(dto.getIdCta());
			entity.setIdCtaCte(dto.getIdCtaCte());
			entity.setFchCre(dto.getFchCre());
			entity.setCmntCtaCte(dto.getCmntCtaCte());
			entity.setIdTipCtaCte(dto.getIdTipCtaCte());
			return (Integer) dao.create(entity);
		}catch(Exception e) {
			log.error("Error al guardar entidad: {}", e.getMessage());
			log.error("Traza: ", e);
			throw new ServiceException();
		}
		
	}
	
}
