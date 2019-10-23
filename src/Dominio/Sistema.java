package Dominio;

import java.util.ArrayList;


public class Sistema {
	
	private String nombre;
	
	private ArrayList<Producto>listaProductos;
	private ArrayList<Persona>listaUsuarios;
	private ArrayList<Compra>listaCompras;
	
	
	
	public Sistema(String nombre){
		
		this.nombre=nombre;
		this.listaCompras=new ArrayList<Compra>();
		this.listaProductos=new ArrayList<Producto>();
		this.listaUsuarios=new ArrayList<Persona>();
	}
	
	
	public Integer generarID(Cliente cliente){//generar ID para cada cliente
		Integer ID = 0;
		Integer idCliente=0;
		for(int i=1; i<listaUsuarios.size();i++){
			if(listaUsuarios!=null){
				if(listaUsuarios.size()>ID){
					ID=listaUsuarios.size()+1;
					idCliente=ID;
				}				
	}
	}
		return idCliente;
	}

	public Integer generarID(Admin admin){//generar ID para cada admin
		Integer ID = 0;
		Integer idAdmin=0;
		for(int i=1; i<listaUsuarios.size();i++){
			if(listaUsuarios!=null){
				if(listaUsuarios.size()>ID){
					ID=listaUsuarios.size()+1;
					idAdmin=ID;
				}				
	}
	}
		return idAdmin;
	}

    public boolean loguin(Usuario usuario){//loguea un usuario en el sistema y verifica mail
    		if(!listaUsuarios.contains(usuario.equals(usuario.getMail()))){
    			return true;
    		}return false;
    }    
	
    public boolean registrarUsuario(Usuario usuario){//registra un usuario nuevo en la lista de usuarios
    	if(!listaUsuarios.contains(usuario)){
    		listaUsuarios.add(usuario);
    		return true;
    	}return false;
    }
    
    
    public void comprar(Cliente cliente, Producto producto){
    	
    }

    public void pagar(Producto producto){
    	
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public ArrayList<Persona> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Persona> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	
}
