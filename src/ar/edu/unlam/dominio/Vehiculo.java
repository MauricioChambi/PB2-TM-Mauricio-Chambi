package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Vehiculo {

	private String patente;
	private Double pesoMax;
	HashSet<Pasajero> capacidadMax;

	public Vehiculo(String patente, Double pesoMax) {
		this.patente = patente;
		this.pesoMax = pesoMax;
		this.capacidadMax = new HashSet<>();
	}

	public HashSet<Pasajero> getCapacidadMax() {
		return capacidadMax;
	}

	public Boolean cargarPasajero(Pasajero pasajero) {
		if (pasajero.getPeso() <= this.pesoMax) {
			this.pesoMax-=pasajero.getPeso();
			return this.capacidadMax.add(pasajero);
		}
		return false;
	}

	public HashSet<Pasajero> obtenerCantidadDePasajerosEnElVehiculo() {
		HashSet<Pasajero> cantidad = new HashSet<>();
		for (Pasajero pasajero : capacidadMax) {
			if (pasajero != null) {
				cantidad.add(pasajero);
			}
		}
		return cantidad;
	}
}
