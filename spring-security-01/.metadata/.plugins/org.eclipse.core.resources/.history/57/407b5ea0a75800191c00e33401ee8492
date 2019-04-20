package net.tecgurus.business.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.common.dto.CatalogoDTO;
import net.tecgurus.persistence.dao.CatalogoGeneralDAO;
import net.tecgurus.persistence.entities.CatalogoGeneral;

@Service
@Transactional
public class CatalogoFacade {
	
	@Autowired
	private CatalogoGeneralDAO dao;
	
	public List<CatalogoDTO> findAll(){
		List<CatalogoDTO> listDTO = null;
		try {
			List<CatalogoGeneral> listEntities = dao.findAll();
			listDTO = new ArrayList<CatalogoDTO>();
			if(listEntities == null || listEntities.isEmpty()) {
				return null;
			}
			for(CatalogoGeneral c : listEntities) {
				listDTO.add(
						new CatalogoDTO(c.getIdCat(), 
								c.getDscCorCat(), 
								c.getDscComCat(), 
								c.getFchCre(), 
								c.getFchMod()));
			}
			}catch(Exception e) {
			//TODO revisar manejo de excepciones
		}
		return listDTO;
	}
	
	public Integer save(CatalogoDTO dto) {
		try {
			CatalogoGeneral c = new CatalogoGeneral();
			c.setDscComCat(dto.getCodComp());
			c.setDscCorCat(dto.getCodCorto());
			c.setFchCre(dto.getFchCrea());
			c.setFchMod(dto.getFchModi());
			Integer saved = dao.save(c);
			return saved;
		}catch(Exception e) {
			//TODO revisar manejo de excepciones
			return null;
		}
	}

}
