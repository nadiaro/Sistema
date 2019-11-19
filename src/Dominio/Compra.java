package Dominio;

public class Compra {
	
	private Cliente cliente;
	private Producto producto;
	private Integer IdCompra;
	private Integer cantidad;
	private Integer cantidadPuntos;
	private String formaPago;
	private Integer puntosAcumulados;
	private Double precioTotalVenta;
	
	
	public Compra(Cliente cliente, Producto producto, Integer IdCompra, Integer cantidad, Integer cantidadPuntos, String formaPago) {
		this.cliente=cliente;
		this.producto=producto;
		this.IdCompra=IdCompra;
		this.cantidad=cantidad;
		this.cantidadPuntos=cantidadPuntos;
		this.formaPago=formaPago;
		this.puntosAcumulados=cantidad*producto.getValorPuntos();
		this.precioTotalVenta=cantidad*producto.getPrecio();
		
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


	public String getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}


	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}


	public Double getPrecioTotalVenta() {
		return precioTotalVenta;
	}


	public void setPrecioTotalVenta(Double precioTotalVenta) {
		this.precioTotalVenta = precioTotalVenta;
	}
	
	
	
	

}
