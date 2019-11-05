package Dominio;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sistema {

	private String nombre;

	private LinkedList<Producto> listaProductos;
	private LinkedList<Usuario> listaUsuarios;
	private LinkedList<Compra> listaCompras;

	public Sistema(String nombre) {

		this.nombre = nombre;
		this.listaCompras = new LinkedList<Compra>();
		this.listaProductos = new LinkedList<Producto>();
		this.listaUsuarios = new LinkedList<Usuario>();
	}

//	public boolean login(String email, String contrasenia) throws loginIncorrectoException {// loguea un usuario en el sistema y verifica mail
//		for (Usuario lista : this.listaUsuarios) {
//			if (lista.getMail().equals(email) && lista.getPassword().equals(contrasenia))
//				return true;
//		}
//		throw new loginIncorrectoException();
//	}
	
	public boolean login(String email, String contrasenia) throws loginIncorrectoException, contraseniaIncorrectaException {// loguea un usuario en el sistema y verifica mail
		for (Usuario lista : this.listaUsuarios) {
			if (lista.getMail().equals(email)) {
				if(lista.getPassword().equals(contrasenia))
					return true;
				else
					throw new contraseniaIncorrectaException();
			}
		}
		throw new loginIncorrectoException();
	}

	public boolean registrarUsuario(Usuario usuario)throws usuarioExistenteException  {// registra un usuario nuevo en la lista de usuarios
		if (!listaUsuarios.contains(usuario)) {
			usuario.setID(this.listaUsuarios.size() + 1);
			listaUsuarios.add(usuario);
			return true;
		}
		throw new usuarioExistenteException("El usuario ya existe");
	}

	public void comprar(Usuario comprador, Integer cantidad, Producto producto, String medioDePago) {
		for (Producto lista : this.listaProductos) {

			if (lista.equals(producto)) {
				Double precioTotal=cantidad*producto.getPrecio();
				Integer precioTotalPuntos=cantidad*producto.getPrecioPuntos();
				Integer cantidadDePuntos=(int)(producto.getPrecio()*obtenerFactorDePuntos(comprador));
				Compra nueva=new Compra(this.listaCompras.size()+1, comprador, producto, cantidad, precioTotal, precioTotalPuntos, medioDePago, cantidadDePuntos);
				pagar(nueva);
			}
		}
	}
	
	public Integer obtenerFactorDePuntos(Usuario parametro) {
		if(parametro instanceof Cliente)
			return ((Cliente) parametro).getFactorDePuntos();
		else if(parametro instanceof Admin)
			return ((Admin) parametro).getFactorDePuntos();
		else
			return 0;
	}

	public void pagar(Compra nueva) {
		
	}

}
