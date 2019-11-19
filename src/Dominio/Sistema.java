package Dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Sistema {
	
	private String nombre;
	
	private Set<Producto>listaProductos;
	private Set <Usuario>listaUsuarios;
	private List<Compra>listaCompras;
	
	
	
	public Sistema(String nombre){//constructor
		
		this.nombre=nombre;
		this.listaCompras=new ArrayList<Compra>();//polimorfismo
		this.listaProductos=new TreeSet<Producto>();
		this.listaUsuarios=new HashSet<Usuario>();
}
	
	public boolean registrarUsuario(Usuario usuario)throws Exception{//registra un usuario nuevo en la lista de usuarios
		if(!listaUsuarios.contains(usuario)){
		listaUsuarios.add(usuario);
		usuario.setId(listaUsuarios.size()+1);//genera Id para cada tipo de usuario
		return true;
		}
		throw new usuarioExistenteException("el usuario ya existe");
}
	
	public boolean loguin(String mail, String password)throws Exception{//loguea un usuario en el sistema y verifica mail y contrasenia
		for(Usuario c:listaUsuarios){
			if(c.getMail().equals(mail)){
				if(c.getPassword().equals(password)){
					return true;
				}
			}
		}
		throw new usuarioOContraseniaInvalidoException("Error de logueo");
		}

	
	 public boolean agregarCompra(Compra nuevo){//agrega una compra a la lista de compras
			if(!listaCompras.contains(nuevo)){
				return listaCompras.add(nuevo);
			}else return false;
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

	 public boolean pagar(Compra compra){//efectua el pago de una compra
	    	Double montoAPagar=0d;
	    	if(listaUsuarios.contains(compra)){
	    		if(montoAPagar>=compra.getProducto().getPrecio()){
	    		montoAPagar-=compra.getProducto().getPrecio();
	    		return true;
	    		}
	    	}
	    	return false;
}
	
	public boolean eliminarCliente(String mail)throws Exception{//elimina un cliente de la lista de clientes por su mail
		Iterator<Usuario>it=listaUsuarios.iterator();
		while(it.hasNext()){
			Cliente listaUsuarios=(Cliente) it.next();
			if(listaUsuarios.getMail().equals(mail));
			it.remove();
			return true;
		}
		throw new clienteInexistenteException();
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

	public Set<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Set<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public Set<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Set<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	
	
}
