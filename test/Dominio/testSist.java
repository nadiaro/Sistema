package Dominio;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testSist {

	Sistema nuevoSistema = new Sistema("Mi perfumeria");
	Usuario nuevo = new Cliente("jesica1234", "1234", "Jesica", "Delgado");

	@Test
	public void testQueRegistreUnUsuario() throws usuarioExistenteException {
		Assert.assertTrue(nuevoSistema.registrarUsuario(nuevo));
	}

	@Test(expected=usuarioExistenteException.class)
	public void testQueIntenteRegistrarUnUsuarioQueYaExiste() throws usuarioExistenteException {
		nuevoSistema.registrarUsuario(nuevo);
		Assert.assertTrue(nuevoSistema.registrarUsuario(nuevo));
	}
	
	@Test
	public void testQueLogueUnUsuario() throws usuarioExistenteException,loginIncorrectoException, contraseniaIncorrectaException{
		nuevoSistema.registrarUsuario(nuevo);
		Assert.assertTrue(nuevoSistema.login(nuevo.getMail(),nuevo.getPassword()));
	}
	
	@Test
	public void testQueIntenteLoguearUnUsuarioQueNoExiste() {
		try {
			Assert.assertTrue(nuevoSistema.login(nuevo.getMail(),nuevo.getPassword()));
		} catch (loginIncorrectoException e) {
			e.printStackTrace();
		} catch (contraseniaIncorrectaException e) {
			e.printStackTrace();
		}
	}
	
}
