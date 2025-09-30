package ar.edu.unlam.dominio;

public class CuentaCorriente extends Cuenta {

	private Integer limiteDescuento;
	
	public CuentaCorriente(Integer id, Cliente cliente ,Integer cbu, Integer limiteDescuento) {
		super(id, cliente ,cbu);
		this.limiteDescuento = limiteDescuento;
	}

	@Override
	public void depositar(Double monto) {
		super.setSaldo(getSaldo()+monto);
	}

	@Override
	public void extraer(Double monto) {
		if (monto > getSaldo() + this.limiteDescuento) {
			setSaldo(getSaldo()-monto);
		}
	}
}
