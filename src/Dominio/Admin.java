package Dominio;

public class Admin extends Usuario {

	private Integer factorDePuntos;

	public Admin(String nombre, String apellido, String mail, String password) {
		super(nombre, apellido, mail, password);
		this.factorDePuntos = 120;
	}

	public Integer getFactorDePuntos() {
		return factorDePuntos;
	}

	public void setFactorDePuntos(Integer factorDePuntos) {
		this.factorDePuntos = factorDePuntos;
	}

	// public boolean agregarCompra(Compra nuevo){//agrega una compra a la lista de
	// compras
	// if(!listaCompras.contains(nuevo)){
	// return listaCompras.add(nuevo);
	// }else return false;
	// }
	//
	// public boolean eliminarCompra(Integer num){//elimina una compra de la lista
	// de compras
	// Iterator<Compra>it=listaCompras.iterator();
	// while(it.hasNext()){
	// Compra listaCompras=it.next();
	// if(listaCompras.getNum().equals(num));
	// it.remove();
	// return true;
	// }
	// return false;
	// }
	//
	// public boolean eliminarCliente(String mail){//elimina un cliente de la lista
	// de clientes por su mail
	// Iterator<Cliente>it=listaClientes.iterator();
	// while(it.hasNext()){
	// Cliente listaClientes=it.next();
	// if(listaClientes.getMail().equals(mail));
	// it.remove();
	// return true;
	// }
	// return false;
	// }
	//
	// public boolean agregarProducto(Producto nuevo){//agrega un producto a la
	// lista de productos
	// if(!listaProductos.contains(nuevo)){
	// return listaProductos.add(nuevo);
	// }else return false;
	// }
	//
	// public boolean eliminarProducto(Producto producto){//elimina un producto de
	// la lista de productos
	// Iterator<Producto>it=listaProductos.iterator();
	// while(it.hasNext()){
	// Producto listaProductos=it.next();
	// if(listaProductos.getCodigo().equals(producto.getCodigo()));
	// it.remove();
	// return true;
	// }
	// return false;
	// }

}
