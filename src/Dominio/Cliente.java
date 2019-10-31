package Dominio;

public class Cliente extends Usuario {

	private Integer factorDePuntos;

	public Cliente(String mail, String password, String nombre, String apellido) {
		super(mail, password, nombre, apellido);
		this.factorDePuntos = 60;
	}

	public Integer getFactorDePuntos() {
		return factorDePuntos;
	}

	public void setFactorDePuntos(Integer factorDePuntos) {
		this.factorDePuntos = factorDePuntos;
	}

}
