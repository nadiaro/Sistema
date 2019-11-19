package Dominio;

public class contraseniaInvalidaException extends Exception {

	public contraseniaInvalidaException (String mensaje){
		super("Ingrese una contraseña valida");
	}
}
