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
	
	
	public void generarId(Usuario usuario){
			if(!listaUsuarios.contains(usuario)){
				if(usuario instanceof Cliente){
					usuario.setID(listaUsuarios.size()+1);
				} if(usuario instanceof Admin){
					usuario.setID(listaUsuarios.size()+2);
				}
			}
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
    
    
    public boolean comprar(Compra compra){
    	if(listaCompras.contains(compra)){
    		return false;
    	}
    		listaCompras.add(compra);
			return true;
    }

    public boolean pagar(Compra compra){
    	Double montoAPagar=0d;
    	if(listaUsuarios.contains(compra)){
    		if(montoAPagar>=compra.precioTotalCompra(compra)){
    		montoAPagar-=compra.precioTotalCompra(compra);
    		return true;
    		}
    	}
    	return false;
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
