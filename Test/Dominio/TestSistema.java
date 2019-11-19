package Dominio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Dominio.Admin;
import Dominio.Cliente;
import Dominio.Sistema;
import Dominio.Usuario;


public class TestSistema {
	
	Sistema mi1;
	Usuario cliente;
	Usuario admin;
	Producto nuevo;

	
	@Before
	public void before(){
		
		mi1=new Sistema("Nadia Sierra");
		cliente=new Cliente("nadia@gmail.com","1234", "Nadia", "Sierra");
		admin=new Admin("juan@gmail.com","1267", "Juan", "Rodriguez");
		nuevo=new Producto("Jabon", 0025, 45.0d, 50);
		
	}
	
	@Test (expected= usuarioOContraseniaInvalidoException.class)
		public void verificarLogueoIncorrecto()throws Exception{
			Boolean valor=mi1.loguin(cliente.getMail(), cliente.getPassword());
			Assert.assertFalse(valor);
		}
	
	@Test
	public void verificarRegistrarUsuario() throws Exception{
		try{
		Boolean registrado= mi1.registrarUsuario(cliente);
		Assert.assertTrue(registrado);
		}
		catch (usuarioExistenteException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(expected= clienteInexistenteException.class)
	public void verificarEliminarCliente()throws Exception{
	
		Boolean eliminado= mi1.eliminarCliente("nadia@gmail.com");
		Assert.assertTrue(eliminado);
	}
}


	

