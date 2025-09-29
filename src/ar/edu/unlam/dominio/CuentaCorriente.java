package ar.edu.unlam.dominio;

public class CuentaCorriente extends Cuenta implements Extraible{
	
	private Double limiteDeDescubierto;
	
	public CuentaCorriente(Integer cbu, Cliente cliente) {
		super(cbu, cliente);
		this.limiteDeDescubierto = 500.0;
	}

	@Override
	public Double extraer(Double montoAExtraer) {
		if (montoAExtraer <= super.getSaldo() + this.limiteDeDescubierto) {
			super.setSaldo(super.getSaldo()-montoAExtraer);;
		}
		return super.getSaldo();
	}

}
