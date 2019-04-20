package net.tecgurus.business.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.tecgurus.business.util.AbstractMapper;
import net.tecgurus.common.dto.CuentaDTO;
import net.tecgurus.common.exception.ServiceException;
import net.tecgurus.persistence.dao.impl.CuentaDAO;
import net.tecgurus.persistence.entities.Cuenta;

@Service
@Slf4j
public class CuentaService {
	
	//private static final Logger log = LoggerFactory.getLogger(CuentaService.class);

	@Autowired
	private CuentaDAO dao;
	private AbstractMapper<CuentaDTO, Cuenta> mapper = new AbstractMapper<CuentaDTO, Cuenta>() {
	};
	
	public Integer saveCuenta(CuentaDTO cuenta) throws ServiceException {
		try{
			/*
			Cuenta entity = new Cuenta();
			entity.setBlncCta(cuenta.getBlncCta());
			entity.setFchAlt(cuenta.getFchAlt());
			entity.setFchCre(cuenta.getFchCre());
			entity.setFchMod(cuenta.getFchMod());
			entity.setIdEst(cuenta.getIdEst());
			entity.setIdTipCta(cuenta.getIdTipCta());
			entity.setNoCta(cuenta.getNoCta());
			entity.setNoTar(cuenta.getNoTar());
			*/
			Cuenta entity = mapper.getEntity(cuenta);
			return (Integer) dao.create(entity);
		}catch(Exception e) {
			log.error("Error al guardar entidad: {}", e.getMessage());
			log.error("Traza: ", e);
			throw new ServiceException();
		}
		
	}
	
}
