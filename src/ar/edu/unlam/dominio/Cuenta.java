package ar.edu.unlam.dominio;

public abstract class Cuenta {
	
	private Integer id;
	private Integer cbu;
	private Cliente cliente;
	private Double saldo;
	
	public Cuenta(Integer id, Cliente cliente ,Integer cbu) {
		this.id = id;
		this.cliente = cliente;
		this.cbu = cbu;
		this.saldo = 0.0;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}


	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}


	public Integer getCbu() {
		return cbu;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double getSaldo() {
		return saldo;
	}


	public Integer getId() {
		return id;
	}
	
	public abstract void depositar(Double monto);
	
	public abstract void extraer(Double monto);
}
