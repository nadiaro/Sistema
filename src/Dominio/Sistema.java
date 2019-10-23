package Dominio;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Sistema {
	
	private String nombre;
	
	private ArrayList<Producto>listaProductos;
	private LinkedList<Persona>listaUsuarios;
	private ArrayList<Compra>listaCompras;
	
	public Sistema(String nombre){
		this.nombre=nombre;
		this.listaCompras=new ArrayList<Compra>();
		this.listaProductos=new ArrayList<Producto>();
		this.listaUsuarios=new LinkedList<Persona>();
	}

	public abstract boolean loguin();
	
	public abstract boolean registrarUsuario();
	
	public abstract boolean comprar();
	
	public abstract boolean pagar();
	
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

	public LinkedList<Persona> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(LinkedList<Persona> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	
}
