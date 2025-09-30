package ar.edu.unlam.dominio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BancoTest {

	@Test
	public void enunciado() {
		/*
		 * Banco CrearClientes 
		 * 
		 * No puede haber 2 clientes con el mismo DNI
		 * 
		 * Craer Cuentas Corrientes 
		 * 
		 * crear CajasDeAhorro
		 * 
		 * No se puede crear UnaCuenta Si El Cliente No fue dado de alta previamente
		 * Para crear Una cuenta se debe pasar por parametro el dni del clente
		 * hacer Transferica entre cuentas (id_Origen, cbuDestino)
		 * 
		 * 
		 * Si algunas no existen las cuentas no se realiza la transferencias
		 * no se puede realizar una transferencia si de la cuenta origen no hay sufiente dinero
		 * 
		 * */
	}
	
	@Test
	public void dadoQueExisteUnClienteSePordraRegistrarAUnBanco() {
		Integer dni = 44696113;
		Integer cbu = 123456;
		
		Cliente cliente = new Cliente(dni);
		
		Banco banco = new Banco();
		assertTrue(banco.agregarCliente(cliente));
	}
	
	@Test
	public void dadoQueExisteUnClienteSePordraRegistrarAUnBancoPeroNoPodraEseClienteRegistraseDeVueltaAEseBanco() {
		Integer dni = 44696113;
		Integer cbu = 123456;
		
		Cliente cliente = new Cliente(dni);
		Cliente cliente2 = new Cliente(dni);
		
		Banco banco = new Banco();
		assertTrue(banco.agregarCliente(cliente));
		assertFalse(banco.agregarCliente(cliente2));
	}
	
	@Test
	public void dadoQueExisteUnClienteYVerificoQueEsteRegistradoEnElBancoPodreCrearUnCuentaAhorroSegunSuDniYaRegistarloAUnaCuenta() {
		Integer dni = 44696113;
		Integer cbu = 123456;
		Integer id = 1;
		
		Cliente cliente = new Cliente(dni);
		Cliente cliente2 = new Cliente(123);
		
		Banco banco = new Banco();
		assertTrue(banco.agregarCliente(cliente));
		assertTrue(banco.agregarCliente(cliente2));
		
		Boolean obetenerResultado = banco.crearCuentaAhorro(dni, id, cbu);
		assertTrue(obetenerResultado);
	}
	
	@Test
	public void dadoQueExisteUnClienteYVerificoQueEsteRegistradoEnElBancoPodreCrearUnCuentaCorrienteSegunSuDniYaRegistarloAUnaCuenta() {
		Banco banco = new Banco();
		
		Integer dni = 4470114;
		Integer cbu = 1234;
		Integer id = 1;
		Cliente cliente1 = new Cliente(dni);
		
		Integer dni2 = 441234;
		Integer cbu2 = 12345;
		Integer id2 = 2;
		Cliente cliente2 = new Cliente(dni2);
		
		banco.agregarCliente(cliente1);
		banco.agregarCliente(cliente2);
		
		banco.crearCuentaAhorro(id, cliente1.getDni() ,cbu);
		Integer limiteCubierto = 500;
		banco.crearCuentaCorriente(id2 , cliente2.getDni(), cbu2, limiteCubierto);
		
		Cuenta cuenta1 = banco.buscarCuentaPorId(id);
		Double monto = 1000.0;
		cuenta1.depositar(monto);
		
		Double montoATransferir = 500.0;
		
		Cuenta cuenta2 = banco.buscarCuentaPorId(id);
		Cuenta cuenta3 = banco.buscarCbu(cbu2);
		
		Boolean tranferir = banco.transferir(cuenta2.getId(), cuenta3.getCbu(), montoATransferir);
		assertTrue(tranferir);
	}
	
	@Test
	public void dadoQueExisteUnBancoYClient() {
		Banco banco = new Banco();
		Integer dni = 44696113;
		Integer cbu = 123456;
		
		Cliente cliente = new Cliente(dni);
		
	}
}
