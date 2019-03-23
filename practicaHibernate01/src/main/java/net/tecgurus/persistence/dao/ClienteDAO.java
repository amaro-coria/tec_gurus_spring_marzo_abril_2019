package net.tecgurus.persistence.dao;

import java.util.List;

import net.tecgurus.persistence.entities.Clientes;

public interface ClienteDAO {
	
	List<Clientes> findAll();

}
