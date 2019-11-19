package Dominio;

public class clienteInexistenteException extends Exception {

	public clienteInexistenteException(){
	super("Ingrese un cliente valido");
	}
}
