package TestSistema;

import org.junit.Assert;

import Dominio.Admin;
import Dominio.Cliente;
import Dominio.Sistema;
import Dominio.Usuario;


public class Test {
	
	public void verificarRegistrarusuario(){

		Sistema mi1= new Sistema("nadia");
		
		Usuario uno= new Cliente("nadia@gmail.com","1234", "nadia", "sierra");
		Usuario dos= new Admin ("nadia@gmail.com","1234", "nadia", "sierra");
		
		mi1.registrarUsuario(uno);
		mi1.registrarUsuario(dos);
		
		Assert.assertEquals(2,mi1.getListaUsuarios());
	}

}
