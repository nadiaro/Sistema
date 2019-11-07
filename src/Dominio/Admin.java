package Dominio;


public class Admin extends Usuario {
	
	private Integer Id;
	
	
	public Admin(String nombre, String apellido, String mail, String password, Integer ID) {
		super(nombre, apellido, mail, password);
		this.Id=0;
		
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}
	
		
	

	
	
}
