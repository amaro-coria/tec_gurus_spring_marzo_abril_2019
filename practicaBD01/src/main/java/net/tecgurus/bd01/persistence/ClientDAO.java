package net.tecgurus.bd01.persistence;

import java.util.List;

import net.tecgurus.bd01.dto.Client;

public interface ClientDAO {
	
	
	List<Client> findAll();

}
