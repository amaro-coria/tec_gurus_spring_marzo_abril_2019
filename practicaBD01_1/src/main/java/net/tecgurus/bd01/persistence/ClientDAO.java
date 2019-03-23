package net.tecgurus.bd01.persistence;

import java.util.List;

import net.tecgurus.bd01.dto.Client;
import net.tecgurus.bd01.dto.ClienteDTO;

public interface ClientDAO {
	
	
	List<Client> findAll();
	
	List<ClienteDTO> findAllClienteDTO();

}
