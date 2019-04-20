package net.tecgurus.business.util;

import org.springframework.stereotype.Component;

import net.tecgurus.common.dto.ClienteDTO;
import net.tecgurus.persistence.entities.Cliente;

@Component
public class ClienteMapper {

	public Cliente toEntity(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setApeMatCte(clienteDTO.getApeMatCte());
		cliente.setApePatCte(clienteDTO.getApePatCte());
		cliente.setDirCte(clienteDTO.getDirCte());
		cliente.setIdCte(clienteDTO.getIdCte());
		cliente.setIdEdoCte(clienteDTO.getIdEdoCte());
		cliente.setNomCte(clienteDTO.getNomCte());
		cliente.setTelCte(clienteDTO.getTelCte());
		return cliente;
	}
	
}
