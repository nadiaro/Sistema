package Dominio;

public class Producto {
	
	private String descripcion;
	private Integer codigo;
	private Double precio;
	private Integer valorPuntos;
	
	
	public Producto(String descripcion, Integer codigo, Double precio, Integer valorPuntos) {
		this.descripcion=descripcion;
		this.codigo=codigo;
		this.precio=precio;
		this.valorPuntos=valorPuntos;
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

	public Integer getValorPuntos() {
		return valorPuntos;
	}

	public void setValorPuntos(Integer valorPuntos) {
		this.valorPuntos = valorPuntos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", codigo=" + codigo
				+ ", precio=" + precio + ", valorPuntos=" + valorPuntos + "]";
	}

	
	

}
