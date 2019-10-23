package Dominio;

import java.util.ArrayList;

public class Compra {
	
	private Cliente cliente;
	private Producto producto;
	private Integer cantidad;
	private Integer num;
	private ArrayList<Compra>listaCompras;
	
	
	public Compra(Cliente cliente, Producto producto, Integer num, Integer cantidad) {
		this.cliente=cliente;
		this.producto=producto;
		this.cantidad=cantidad;
		this.num=num;
		this.listaCompras=new ArrayList<Compra>();
	}
	
	public Double calcularPrecioTotalCompra(Compra listaCompras){
		Double precioTotal=0.0;
		if(producto.getPrecio().equals(producto.getPrecio())){
			precioTotal=producto.getPrecio()*cantidad;
		}return precioTotal;
		
	}
	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}


	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}


	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Compra [cliente=" + cliente + ", producto=" + producto + "]";
	}
	
	
	
}
