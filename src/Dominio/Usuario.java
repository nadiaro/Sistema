package Dominio;

public abstract class Usuario extends Persona {
	
	private String mail;
	private String password;
	private Integer Id;
	private Integer puntosTotales;

	
	public Usuario(String nombre, String apellido, String mail, String password) {
		super(nombre, apellido);
		this.mail=mail;
		this.password=password;
		this.Id=0;
		this.puntosTotales=0;
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

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPuntosTotales() {
		return puntosTotales;
	}

	public void setPuntosTotales(Integer puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Usuario [mail=" + mail + ", password=" + password + ", Id="
				+ Id + ", puntosTotales=" + puntosTotales + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
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

	
	
}
