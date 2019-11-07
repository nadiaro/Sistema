package Dominio;

public abstract class Cliente extends Usuario {

	private Integer puntosAcumulados;
	private Integer Id;
	
	
	public Cliente(String mail, String password, String nombre, String apellido,Integer puntosAcumulados, Integer Id) {
		super(mail, password, nombre, apellido);
		this.puntosAcumulados=0;
		this.Id=0;
	}
	
	
	
	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}


	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}

}
