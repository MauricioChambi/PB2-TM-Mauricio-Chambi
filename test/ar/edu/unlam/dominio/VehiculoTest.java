package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;

public class VehiculoTest {

	@Test
	public void dadoQueExisteUnVehiculoYPasajerosEstosPodranIngresarAlVehiculo() {
		String patente = "abc";
		Double pesoMax = 500.0;
		
		Vehiculo vehiculo = new Vehiculo(patente, pesoMax);
		
		Pasajero pasajero = new Pasajero(410.0);
		Pasajero pasajero2 = new Pasajero(89.0);
		Boolean pasajeroCargado = vehiculo.cargarPasajero(pasajero);
		Boolean pasajeroCargado2 = vehiculo.cargarPasajero(pasajero2);
		assertTrue(pasajeroCargado);
		assertTrue(pasajeroCargado2);
	}
	
	@Test
	public void dadoQueExisteUnVehiculoYPasajerosEstosPodranObtenerLaCantidadDePasajeroDentro() {
		String patente = "abc";
		Double pesoMax = 500.0;
		
		Vehiculo vehiculo = new Vehiculo(patente, pesoMax);
		
		Pasajero pasajero = new Pasajero(110.0);
		Pasajero pasajero1 = new Pasajero(510.0);
		Pasajero pasajero2 = new Pasajero(310.0);
		Boolean pasajeroCargado = vehiculo.cargarPasajero(pasajero);
		Boolean pasajeroCargado1 = vehiculo.cargarPasajero(pasajero1);
		Boolean pasajeroCargado2 = vehiculo.cargarPasajero(pasajero2);
		
		assertTrue(pasajeroCargado);
		assertFalse(pasajeroCargado1);
		assertTrue(pasajeroCargado2);
		
		HashSet<Pasajero> cantidadDePasajeros = vehiculo.obtenerCantidadDePasajerosEnElVehiculo();
		HashSet<Pasajero> cantidadDePasajerosEsperado = vehiculo.getCapacidadMax();
		assertEquals(cantidadDePasajerosEsperado, cantidadDePasajeros);
	}

}
