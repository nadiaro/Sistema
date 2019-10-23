package Dominio;

public abstract class Usuario extends Persona {
	
	private String mail;
	private String password;
	private Integer ID;
	 
	
	
	public Usuario(String nombre, String apellido, String mail, String password, Integer ID) {
		super(nombre, apellido);
		this.mail=mail;
		this.password=password;
		this.ID=ID;
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
