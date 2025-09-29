package ar.edu.unlam.dominio;

public abstract class Cuenta {
	
	private Integer cbu;
	private Cliente cliente;
	private Double saldo;
	private Integer id;
	private static int indentificador = 1;

	public Cuenta(Integer cbu, Cliente cliente) {
		this.cbu = cbu;
		this.cliente = cliente;
		this.saldo= 0.0;
		this.id = indentificador++;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double obtenerSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public Double cargarDeposito(Double depositar) {
		if (depositar > 0) {
			this.saldo+=depositar;
		}
		return this.saldo;
	}

//	public abstract Double extraer(Double montoAExtraer);

}
