package Dominio;

public class Cliente extends Usuario {

	private Integer puntosIniciales=25;
		
	public Cliente(String mail, String password, String nombre, String apellido) {
		super(mail, password, nombre, apellido);
		
	}

	public Integer getPuntosIniciales() {
		return puntosIniciales;
	}

	public void setPuntosIniciales(Integer puntosIniciales) {
		this.puntosIniciales = puntosIniciales;
	}
		
	

}
