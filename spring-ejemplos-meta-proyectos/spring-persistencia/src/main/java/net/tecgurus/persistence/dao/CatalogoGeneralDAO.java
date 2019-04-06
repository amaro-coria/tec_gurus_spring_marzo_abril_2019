package net.tecgurus.persistence.dao;

import java.util.List;

import net.tecgurus.persistence.entities.CatalogoGeneral;

public interface CatalogoGeneralDAO {
	
	Integer save(CatalogoGeneral c);
	
	void update(CatalogoGeneral c);
	
	void delete(CatalogoGeneral c);
	
	List<CatalogoGeneral> findAll();
	
	CatalogoGeneral findById(Integer id);

}
