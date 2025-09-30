package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Banco {

	private HashSet<Cliente> clientes;
	private List<Cuenta> cuentas;
	
	public Banco() {
		this.clientes = new HashSet<>();
		this.cuentas = new ArrayList<>();
	}
	
	public Boolean agregarCliente(Cliente cliente) {
		return this.clientes.add(cliente);
	}
	
	public Boolean transferir(Integer id, Integer cbu, Double montoATranferir) {
		
		Cuenta cuentaOrigin = buscarCuentaPorId(id);
		Cuenta cuentaDestino = buscarCbu(cbu);
		
		Boolean resultado = false;
		if (cuentaDestino != null && cuentaOrigin != null) {
			cuentaOrigin.extraer(montoATranferir);
			resultado = true;
			if (resultado) {
				cuentaDestino.depositar(montoATranferir);
			}
		}
		return resultado;
	}

	public Boolean crearCuentaAhorro(Integer id, Integer dni, Integer cbu) {
		Cliente buscarCliente = buscarCliente(dni);
		for (Cliente cliente : clientes) {
			if (cliente.getDni().equals(dni)) {
				Cuenta cuentaAhorro = new CuentaAhorro(id, buscarCliente ,cbu);
				this.cuentas.add(cuentaAhorro);
				return true;
			}
		}
		return false;
	}
	
	public Boolean crearCuentaCorriente(Integer id, Integer dni, Integer cbu, Integer limiteDescubierto) {
		Cliente clienteEncontrado = buscarCliente(dni);
		for (Cliente cliente : clientes) {
			if (cliente.getDni().equals(dni)) {
				Cuenta cuentaAhorro = new CuentaCorriente(id , clienteEncontrado, cbu , limiteDescubierto);
				this.cuentas.add(cuentaAhorro);
				return true;
			}
		}
		return false;
	}
	
	public Cliente buscarCliente(Integer dni) {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : clientes) {
			if (cliente.getDni().equals(dni)) {
				clienteEncontrado = cliente;
				return clienteEncontrado;
			}
		}
		return clienteEncontrado;
	}
	
	public Cuenta buscarCuentaPorId(Integer id) {
		Cuenta cuentaBuscada = null;
		for (Cuenta cuenta : cuentas) {
			if (cuenta.getId().equals(id)) {
				cuentaBuscada = cuenta;
				return cuentaBuscada;
			}
		}
		return cuentaBuscada;
	}
	
	public Cuenta buscarCbu(Integer cbu) {
		Cuenta cbuEncontrado = null;
		for (Cuenta cuenta : cuentas) {
			if (cuenta.getCbu().equals(cbu)) {
				cbuEncontrado = cuenta;
				return cbuEncontrado;
			}
		}
		return cbuEncontrado;
	}
}
