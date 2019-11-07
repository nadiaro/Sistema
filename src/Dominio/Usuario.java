package Dominio;

public abstract class Usuario extends Persona {
	
	private String mail;
	private String password;

	
	public Usuario(String nombre, String apellido, String mail, String password) {
		super(nombre, apellido);
		this.mail=mail;
		this.password=password;
		}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
