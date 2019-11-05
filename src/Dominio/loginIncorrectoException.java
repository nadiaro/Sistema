package Dominio;

public class loginIncorrectoException extends Exception {
public loginIncorrectoException() {
	super("Usuario o contraseña incorrecta");
}
}
