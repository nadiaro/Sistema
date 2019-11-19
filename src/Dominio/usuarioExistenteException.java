package Dominio;

public class usuarioExistenteException extends Exception {
	
	public usuarioExistenteException(String mensaje){
		super ("el usuario ya existe");
	}

}
