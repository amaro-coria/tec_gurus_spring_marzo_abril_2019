package net.tecgurus.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.persistence.dao.CatalogoGeneralDAO;
import net.tecgurus.persistence.entities.CatalogoGeneral;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@Transactional
public class TestCatalogoGeneral {
	
	@Autowired
	private CatalogoGeneralDAO dao;

	@Test
	public void testAlta() {
		System.out.println("====================================");
		System.out.println("============INICIO DE TEST============");
		List<CatalogoGeneral> list = dao.findAll();
		int size = 0;
		if(list != null && !list.isEmpty()) {
			size = list.size();
		}
		CatalogoGeneral c = new CatalogoGeneral();
		c.setDscComCat("test");
		c.setDscCorCat("test");
		c.setFchCre(new Date());
		c.setIdEstCat(1);
		Integer pk = dao.save(c);
		assertNotNull(pk);
		List<CatalogoGeneral> listAfter = dao.findAll();
		assertNotNull(listAfter);
		int sizeAfter = listAfter.size();
		assertNotEquals(size, sizeAfter);
		System.out.println("============FIN DE TEST============");
		System.out.println("====================================");
	}
	
}
