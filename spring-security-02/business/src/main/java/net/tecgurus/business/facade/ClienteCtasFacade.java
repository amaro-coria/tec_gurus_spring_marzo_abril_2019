package net.tecgurus.business.facade;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.business.service.ClienteService;
import net.tecgurus.business.service.CuentaService;
import net.tecgurus.business.service.CuentasClienteService;
import net.tecgurus.common.dto.ClienteCuentaNuevoDTO;
import net.tecgurus.common.dto.ClienteDTO;
import net.tecgurus.common.dto.CuentaDTO;
import net.tecgurus.common.dto.CuentasClienteDTO;
import net.tecgurus.common.exception.ServiceException;

//@Service
@Component
@Transactional
public class ClienteCtasFacade {

	@Autowired
	private ClienteService serviceCte;
	@Autowired
	private CuentaService serviceCta;
	@Autowired
	private CuentasClienteService serviceCtaCte;
	
	public void altaClienteCta(ClienteCuentaNuevoDTO nuevoDTO) {
		ClienteDTO cliente = nuevoDTO.getCliente();
		CuentaDTO cuenta = nuevoDTO.getCuenta();
		try {
			Integer idCliente = serviceCte.save(cliente);
			Integer idCuenta = serviceCta.saveCuenta(cuenta);
			CuentasClienteDTO ctaCliente = 
					new CuentasClienteDTO(null, idCuenta, idCliente, 
							new Date(), 1, null, 1);
			serviceCtaCte.saveCtaCliente(ctaCliente);
		}catch(ServiceException e) {
			e.printStackTrace();
		}
	}
	
}
