package net.tecgurus.persistence.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import net.tecgurus.persistence.dao.AbstractHibernateDao;
import net.tecgurus.persistence.entities.Usuarios;

@Repository
public class UsuarioDAO extends AbstractHibernateDao<Usuarios>{
	
	public Usuarios findByUsername(String username) {
		String sql = "from Usuarios u where u.nombreUsuario = :username";
		Session currentSession = getCurrentSession();
		Query<Usuarios> query = currentSession.createQuery(sql);
		query.setParameter("username", username);
		Usuarios user = query.getSingleResult();
		return user;
	}

}
