package net.tecgurus.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.persistence.dao.impl.RolDAO;
import net.tecgurus.persistence.dao.impl.UsuarioDAO;
import net.tecgurus.persistence.entities.Roles;
import net.tecgurus.persistence.entities.Usuarios;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@Transactional
public class UserTest {
	
	@Autowired
	private UsuarioDAO daoUsers;
	@Autowired
	private RolDAO daoRoles;
	
	@Test
	public void testUserByUsername() {
		final String username = "admin";
		Usuarios u = daoUsers.findByUsername(username);
		assertEquals(username, u.getNombreUsuario());
	}
	
	@Test
	public void testRolesByUsername() {
		final String username = "admin";
		List<Roles> listRoles = daoRoles.findRolesByUsername(username);
		assertEquals(2, listRoles.size());
	}

}
