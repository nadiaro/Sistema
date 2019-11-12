package Dominio;

public class Compra {
	
	private Cliente cliente;
	private Producto producto;
	private Integer IdCompra;
	private Integer cantidad;
	private Integer cantidadPuntos;
	
	
	public Compra(Cliente cliente, Producto producto, Integer IdCompra, Integer cantidad, Integer cantidadPuntos) {
		this.cliente=cliente;
		this.producto=producto;
		this.IdCompra=IdCompra;
		this.cantidad=cantidad;
		this.cantidadPuntos=cantidadPuntos;
	}
	
	public enum medioPago{
		EFECTIVO, PUNTOS;
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


	public Integer getIdCompra() {
		return IdCompra;
	}


	public void setIdCompra(Integer idCompra) {
		IdCompra = idCompra;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public Integer getCantidadPuntos() {
		return cantidadPuntos;
	}


	public void setCantidadPuntos(Integer cantidadPuntos) {
		this.cantidadPuntos = cantidadPuntos;
	}
	
	
	
//	public Integer getMedioPago() {
//		return medioPago;
//	}
//
//
//	public void setMedioPago(Integer medioPago) {
//		this.medioPago = medioPago;
//	}
//
	

}
