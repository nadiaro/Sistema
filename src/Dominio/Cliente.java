package Dominio;

public class Cliente extends Usuario {

	private Integer multiplicaPuntos=25;
		
	public Cliente(String mail, String password, String nombre, String apellido) {
		super(mail, password, nombre, apellido);
		
	}

	public Integer getPuntosIniciales() {
		return multiplicaPuntos;
	}

	public void setPuntosIniciales(Integer multiplicaPuntos) {
		this.multiplicaPuntos = multiplicaPuntos;
	}
		
	

}
