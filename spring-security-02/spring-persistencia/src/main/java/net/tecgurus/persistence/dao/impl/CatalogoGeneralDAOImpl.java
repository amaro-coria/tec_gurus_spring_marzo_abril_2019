package net.tecgurus.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.persistence.dao.CatalogoGeneralDAO;
import net.tecgurus.persistence.entities.CatalogoGeneral;

//@Component
@Repository
//@Transactional
public class CatalogoGeneralDAOImpl implements CatalogoGeneralDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Integer save(CatalogoGeneral c) {
		/*
		Integer pk = (Integer) sessionFactory.getCurrentSession().save(c);
		return pk;
		*/
		return (Integer) sessionFactory.getCurrentSession().save(c);
	}

	public void update(CatalogoGeneral c) {
		sessionFactory.getCurrentSession().update(c);
	}

	public void delete(CatalogoGeneral c) {
		sessionFactory.getCurrentSession().delete(c);
	}

	public List<CatalogoGeneral> findAll() {
		String sql = "from CatalogoGeneral";
		Query<CatalogoGeneral> query = sessionFactory.getCurrentSession().createQuery(sql);
		List<CatalogoGeneral> list = query.list();
		return list;
	}

	public CatalogoGeneral findById(Integer id) {
		return sessionFactory.getCurrentSession().get(CatalogoGeneral.class, id);
		//return sessionFactory.getCurrentSession().load(CatalogoGeneral.class, id);
	}

}
