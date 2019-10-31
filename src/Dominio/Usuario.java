package Dominio;

public class Usuario extends Persona {

	private String mail;
	private String password;
	private Integer ID;
	private Integer puntosAcumulados;
	private Double saldo;

	public Usuario(String nombre, String apellido, String mail, String password) {
		super(nombre, apellido);
		this.mail = mail;
		this.password = password;
		this.ID = 0;
		this.puntosAcumulados = 0;
		this.saldo = 0.0;
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

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
