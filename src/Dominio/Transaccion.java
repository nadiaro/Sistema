package Dominio;

public class Transaccion {

	private Cliente cliente;
	private String tipo;
	
	public Transaccion(Cliente cliente, String tipo){
		this.cliente=cliente;
		this.tipo=tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
	
	

