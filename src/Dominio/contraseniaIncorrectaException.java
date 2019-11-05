package Dominio;

public class contraseniaIncorrectaException extends Exception {
	public contraseniaIncorrectaException() {
		super("Contraseña incorrecta");
	}
}
