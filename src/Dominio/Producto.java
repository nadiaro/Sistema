package Dominio;

public class Producto {

	private String descripcion;
	private Integer codigo;
	private Double precio;
	private Integer precioPuntos;

	public Producto(String descripcion, Integer codigo, Double precio, Integer precioPuntos) {
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.precio = precio;
		this.precioPuntos = precioPuntos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getPrecioPuntos() {
		return precioPuntos;
	}

	public void setPrecioPuntos(Integer precioPuntos) {
		this.precioPuntos = precioPuntos;
	}

}
