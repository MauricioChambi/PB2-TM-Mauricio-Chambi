package ar.edu.unlam.dominio;

public class CuentaAhorro extends Cuenta {
	
	public CuentaAhorro(Integer id, Cliente cliente ,Integer cbu) {
		super(id, cliente, cbu);
		
	}

	public void depositar(Double monto) {
		super.setSaldo(getSaldo()+monto);
	}

	@Override
	public void extraer(Double monto) {
		if (monto < getSaldo()) {
			setSaldo(getSaldo()-monto);
		}
	}

}
