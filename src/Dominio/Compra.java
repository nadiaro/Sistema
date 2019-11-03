package Dominio;

public class Compra {
	
	private Cliente cliente;
	private Producto producto;
	private Integer cantidad;
	private Integer num;
	
	
	public Compra(Cliente cliente, Producto producto, Integer num, Integer cantidad) {
		this.cliente=cliente;
		this.producto=producto;
		this.cantidad=cantidad;
		this.num=num;
	}
	
	public Double precioTotalCompra(Compra compra){
		Double precioTotal=0.0;
		if(producto.getCodigo().equals(producto)){
			precioTotal=producto.getPrecio()*cantidad;
		}return precioTotal;
		
	}
	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

}
