package Dominio;

import java.util.ArrayList;
import java.util.Iterator;


public class Sistema {
	
	private String nombre;
	
	private ArrayList<Producto>listaProductos;
	private ArrayList<Persona>listaUsuarios;
	private ArrayList<Compra>listaCompras;
	
	
	
	public Sistema(String nombre){//constructor
		
		this.nombre=nombre;
		this.listaCompras=new ArrayList<Compra>();
		this.listaProductos=new ArrayList<Producto>();
		this.listaUsuarios=new ArrayList<Persona>();
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
		}
		return false;
}

	
	 public boolean agregarCompra(Compra nuevo){//agrega una compra a la lista de compras
			if(!listaCompras.contains(nuevo)){
				return listaCompras.add(nuevo);
			}else return false;
		}

	 public boolean pagar(Compra compra){
	    	Double montoAPagar=0d;
	    	if(listaUsuarios.contains(compra)){
	    		if(montoAPagar>=compra.getProducto().getPrecio()){
	    		montoAPagar-=compra.getProducto().getPrecio();
	    		return true;
	    		}
	    	}
	    	return false;
}
	
	public boolean eliminarCompra(Integer IdCompra){//elimina una compra de la lista de compras
		Iterator<Compra>it=listaCompras.iterator();
		while(it.hasNext()){
			Compra listaCompras=it.next();
			if(listaCompras.getIdCompra().equals(IdCompra));
			it.remove();
			return true;
		}
		return false;
	}
	
	public boolean eliminarCliente(String mail){//elimina un cliente de la lista de clientes por su mail
		Iterator<Persona>it=listaUsuarios.iterator();
		while(it.hasNext()){
			Cliente listaUsuarios=(Cliente) it.next();
			if(listaUsuarios.getMail().equals(mail));
			it.remove();
			return true;
		}
		return false;
	}
	
	public boolean agregarProducto(Producto nuevo){//agrega un producto a la lista de productos
		if(!listaProductos.contains(nuevo)){
			return listaProductos.add(nuevo);
		}else return false;
	}
	
	public boolean eliminarProducto(Producto producto){//elimina un producto de la lista de productos
		Iterator<Producto>it=listaProductos.iterator();
		while(it.hasNext()){
			Producto listaProductos=it.next();
			if(listaProductos.getCodigo().equals(producto.getCodigo()));
			it.remove();
			return true;
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
