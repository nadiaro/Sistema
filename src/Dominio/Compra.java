package Dominio;

public class Compra {

	private Integer numeroDeOrden;
	private Usuario comprador;
	private Producto producto;
	private Integer cantidad;
	private Double precioTotal;
	private Integer precioTotalPuntos;
	private String medioDePago;
	private Integer cantidadDePuntos;

	public Compra(Integer numeroDeOrden, Usuario comprador, Producto producto, Integer cantidad, Double precioTotal,
			Integer precioTotalPuntos, String medioDePago, Integer cantidadDePuntos) {
		this.numeroDeOrden = numeroDeOrden;
		this.comprador = comprador;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
		this.precioTotalPuntos = precioTotalPuntos;
		this.medioDePago = medioDePago;
		this.cantidadDePuntos = cantidadDePuntos;
	}

	public Integer getNumeroDeOrden() {
		return numeroDeOrden;
	}

	public void setNumeroDeOrden(Integer numeroDeOrden) {
		this.numeroDeOrden = numeroDeOrden;
	}

	public Usuario getComprador() {
		return comprador;
	}

	public void setComprador(Usuario comprador) {
		this.comprador = comprador;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Integer getPrecioTotalPuntos() {
		return precioTotalPuntos;
	}

	public void setPrecioTotalPuntos(Integer precioTotalPuntos) {
		this.precioTotalPuntos = precioTotalPuntos;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public Integer getCantidadDePuntos() {
		return cantidadDePuntos;
	}

	public void setCantidadDePuntos(Integer cantidadDePuntos) {
		this.cantidadDePuntos = cantidadDePuntos;
	}

	// public Double calcularPrecioTotalCompra(Compra listaCompras){
	// Double precioTotal=0.0;
	// if(producto.getPrecio().equals(producto.getPrecio())){
	// precioTotal=producto.getPrecio()*cantidad;
	// }return precioTotal;
	//
	// }

}
