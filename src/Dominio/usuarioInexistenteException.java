package Dominio;

public class usuarioInexistenteException extends Exception {

	public usuarioInexistenteException(String mensaje){
		super("usuario inexistente");
	}
}
