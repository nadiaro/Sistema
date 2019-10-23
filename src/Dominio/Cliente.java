package Dominio;

public abstract class Cliente extends Usuario {

	private Integer puntosAcumulados;
	
	
	public Cliente(String mail, String password, String nombre, String apellido,Integer ID, Integer puntosAcumulados) {
		super(mail, password, nombre, apellido, ID);
		this.puntosAcumulados=0;
	}
	
	
	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}


	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

}
