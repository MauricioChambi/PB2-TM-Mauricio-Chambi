package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuentaTest {

	/*
	 * Cuenta de ahorro -----> saldo, cbu, id, propietario 
	 * Cuenta corriente -----> saldo, cbu, id, propietario, limite de descubierto
	 * 
	 * CA depo - consultar saldo - extraer(NO PUEDE EXTRAER MAS DE LO QUE YA TIENE)
	 * CC depo - consultar saldo - extraer(PUEDE TENER UN SALDO NEGATIVO QUE
	 * CORRESPONDE)
	 * 
	 */

	@Test
	public void dadoQueExisteUnaCajaDeAhorroPuedeConConsultarSuSaldo() {

		Integer dni = 44797113;
		String apellido = "Nando";
		Cliente cliente = new Cliente(dni, apellido);

		Integer cbu = 12345;
		CajaDeAhorro ca = new CajaDeAhorro(cbu, cliente);

		Double saldoObtenido = ca.obtenerSaldo();
		Double saldoEsperado = 0.0;
		assertEquals(saldoEsperado, saldoObtenido);
	}

	@Test
	public void dadoQueExisteUnaCajaDeAhorroYDepositoMilPesosPuedoConsultarSuSaldoYobtengoMil() {

		Integer dni = 44797113;
		String apellido = "Nando";
		Cliente cliente = new Cliente(dni, apellido);

		Integer cbu = 12345;
		CajaDeAhorro ca = new CajaDeAhorro(cbu, cliente);

		Double depositar = 1000.0;
		Double cargarDeposito = ca.cargarDeposito(depositar);

		Double saldoObtenido = ca.obtenerSaldo();
		Double saldoEsperado = 1000.0;
		assertEquals(saldoEsperado, saldoObtenido);
	}

	@Test
	public void dadoQueExisteUnaCajaDeAhorroYDepositoMilPesosYExtraigoQuinientosPesosObtengoQuinientosPesos() {

		Integer dni = 44797113;
		String apellido = "Nando";
		Cliente cliente = new Cliente(dni, apellido);

		Integer cbu = 12345;
		CajaDeAhorro ca = new CajaDeAhorro(cbu, cliente);

		Double depositar = 1000.0;
		Double cargarDeposito = ca.cargarDeposito(depositar);

		Double montoAExtraer = 500.0;
		Double extraerDeposito = ca.extraer(montoAExtraer);

		Double saldoObtenido = ca.obtenerSaldo();
		Double saldoEsperado = 500.0;
		assertEquals(saldoEsperado, saldoObtenido);
	}

	@Test
	public void dadoQueExisteUnaCuentaCorrienteYDepositoMilPesosYExtraigoHastaTenerUnSaldoNegativoSinSobrePasarEseLimiteObtengoSuSaldo() {

		Integer dni = 44797113;
		String apellido = "Nando";
		Cliente cliente = new Cliente(dni, apellido);

		Integer cbu = 12345;
		CuentaCorriente cc = new CuentaCorriente(cbu, cliente);

		Double depositar = 1000.0;
		Double cargarDeposito = cc.cargarDeposito(depositar);

		Double montoAExtraer = 1400.0;
		Double extraerDeposito = cc.extraer(montoAExtraer);

		Double saldoObtenido = cc.obtenerSaldo();
		Double saldoEsperado = -400.0;
		assertEquals(saldoEsperado, saldoObtenido);
	}
	
	@Test
	public void recordatorio() {
		/*
		 * Si instancio una caja de ahorro o caja corriente, ademas instancio una interface y una de cuenta
		 * en la interface voy a poder obtener sus metodos pero solo de la interface
		 * en cambio, en una de cuenta voy a tener el de la cuenta
		 * pero si tengo de caja de ahorro o corriente voy a tener todo
		 * 
		 *  */
	}
}
