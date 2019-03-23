package net.tecgurus.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.persistence.dao.ClienteDAO;
import net.tecgurus.persistence.entities.Clientes;

@Repository
@Transactional
public class ClienteDAOImpl implements ClienteDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Clientes> findAll() {
		//select * from clientes
		/*
		 * from Clientes
		 * select from Clientes
		 * select c from Clientes c
		 */
		List<Clientes> lista = null;
		Query<Clientes> query = sessionFactory.getCurrentSession().createQuery("from Clientes");
		return query.list();
	}

}
