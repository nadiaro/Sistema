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
	
	public Integer getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Usuario [mail=" + mail + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		return true;
	}

	public boolean loguin(String mail) {

		if(this.mail.equals(mail)){
			return true;
		}return false;
	}

	
}
