package Dominio;

import java.util.ArrayList;

public abstract class Cliente extends Usuario {

	private Integer puntosAcumulados;
	private ArrayList<Compra>listaCompras;
	
	
	public Cliente(String mail, String password, String nombre, String apellido,Integer ID, Integer puntosAcumulados) {
		super(mail, password, nombre, apellido, ID);
		this.puntosAcumulados=0;
		this.listaCompras=new ArrayList<Compra>();
	}
	
	public boolean comprar(Compra producto){
			
		if(!listaCompras.contains(producto)){
			listaCompras.add(producto);
			puntosAcumulados++;
			return true;
		}return false;
	}
	
	public boolean pagar(Compra listaCompras){
		
		if(listaCompras.calcularPrecioTotalCompra(listaCompras).equals(listaCompras)){
			return true;
		}
		return false;
	}
	
	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}


	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}



		
}
