package net.tecgurus.bd01.persistence.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import net.tecgurus.bd01.dto.Client;
import net.tecgurus.bd01.dto.ClienteDTO;
import net.tecgurus.bd01.persistence.ClientDAO;

public class ClientDAOImpl implements ClientDAO{
	
	
	private JdbcTemplate jdbcTemplate;

	public List<Client> findAll() {
		final String sql = "select * from clientes";
		
		List<Client> list = jdbcTemplate.query(sql, new RowMapper<Client>() {

			public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
				Client client = new Client();
				client.setEmail(rs.getString("email"));
				client.setPhone(rs.getString("telefono"));
				client.setLastname(rs.getString("apellido_p_cliente"));
				client.setLastname2(rs.getString("apellido_m_cliente"));
				client.setName(rs.getString("nombre_cliente"));
				client.setId(rs.getInt("id_cliente"));
				return client;
			}
			
		});
		return list;
	}
	

	public List<ClienteDTO> findAllClienteDTO() {
		final String sql = "select * from clientes";
		List<ClienteDTO> lista = 
				jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ClienteDTO.class));
		return lista;
	}
	// Getters & Setters
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	

}
