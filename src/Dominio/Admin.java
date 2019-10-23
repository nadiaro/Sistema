package Dominio;

import java.util.ArrayList;
import java.util.Iterator;

public class Admin extends Usuario {
	
	private ArrayList<Compra>listaCompras;
	private ArrayList<Cliente>listaClientes;
	
	
	public Admin(String nombre, String apellido, String mail, String password, Integer ID) {
		super(nombre, apellido, mail, password, ID);
		this.listaCompras=new ArrayList<Compra>();
		this.listaClientes=new ArrayList<Cliente>();
		
	}
	
		
	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}


	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}


	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	public boolean agregarCompra(Compra nuevo){
		if(!listaCompras.contains(nuevo)){
			return listaCompras.add(nuevo);
		}else return false;
	}
	
	public boolean eliminarCompra(Integer num){
		Iterator<Compra>it=listaCompras.iterator();
		while(it.hasNext()){
			Compra listaCompras=it.next();
			if(listaCompras.getNum().equals(num));
			it.remove();
			return true;
		}
		return false;
	}
	
	public boolean eliminarCliente(Integer ID){
		Iterator<Cliente>it=listaClientes.iterator();
		while(it.hasNext()){
			Cliente listaClientes=it.next();
			if(listaClientes.getID().equals(ID));
			it.remove();
			return true;
		}
		return false;
	}
}
