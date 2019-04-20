package net.tecgurus.persistence.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import net.tecgurus.persistence.dao.AbstractHibernateDao;
import net.tecgurus.persistence.entities.Roles;

@Repository
public class RolDAO extends AbstractHibernateDao<Roles> {

	public List<Roles> findRolesByUsername(String username) {
		String sql = " SELECT r FROM Roles r  "
				+ "  	JOIN UsuariosRoles ur "
				+ "     ON  ur.idRol.idRol = r.idRol "
				+ "     JOIN Usuarios u"
				+ "		ON u.idUsuario = ur.idUsuario.idUsuario"
				+ "		WHERE u.nombreUsuario = :username";
		Query<Roles> query = getCurrentSession().createQuery(sql);
		query.setParameter("username", username);
		return query.list();
	}
	
}
