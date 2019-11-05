package Dominio;

public class usuarioExistenteException extends Exception {
	public usuarioExistenteException(String mensaje) {
		super(mensaje);
	}
}