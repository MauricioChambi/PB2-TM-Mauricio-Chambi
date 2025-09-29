package ar.edu.unlam.dominio;

public class CajaDeAhorro extends Cuenta implements Extraible{

	public CajaDeAhorro(Integer cbu, Cliente cliente) {
		super(cbu, cliente);
	}

	@Override
	public Double extraer(Double montoAExtraer) {
		if (montoAExtraer <= super.getSaldo() && montoAExtraer > 0) {
			super.setSaldo(super.getSaldo()-montoAExtraer);;
		}
		return super.getSaldo();
	}
}
