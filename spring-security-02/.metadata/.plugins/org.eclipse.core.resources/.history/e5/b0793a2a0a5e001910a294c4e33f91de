package net.tecgurus.business.test;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.business.facade.ClienteCtasFacade;
import net.tecgurus.common.dto.ClienteCuentaNuevoDTO;
import net.tecgurus.common.dto.ClienteDTO;
import net.tecgurus.common.dto.CuentaDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-business.xml" })
//@Transactional
public class ClienteCtaTest {

	@Autowired
	private ClienteCtasFacade facade;
	
	@Test
	public void testAltaClienteCuentas() {
		ClienteCuentaNuevoDTO dto = new ClienteCuentaNuevoDTO();
		ClienteDTO cliente = new ClienteDTO();
		  cliente.setApeMatCte("Aranda");
		  cliente.setApePatCte("Ayala");
		  cliente.setDirCte("Edo Mex");
		  cliente.setIdEdoCte(1);
		  cliente.setNomCte("Debbie");
		  cliente.setTelCte("5543727751");
		CuentaDTO cuenta = new CuentaDTO();
		  cuenta.setBlncCta(BigDecimal.valueOf(1000));
		  cuenta.setFchAlt(new Date());
		  cuenta.setFchCre(new Date());
		  cuenta.setIdEst(1l);
		  cuenta.setNoCta("944372363");
		  cuenta.setNoTar("2323432424");
		  cuenta.setIdTipCta(1);
		dto.setCliente(cliente);
		dto.setCuenta(cuenta);
		facade.altaClienteCta(dto);
	}
	
}
