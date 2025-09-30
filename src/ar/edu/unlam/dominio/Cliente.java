package ar.edu.unlam.dominio;

import java.util.Objects;

public class Cliente {

	private Integer dni;
	
	public Cliente(Integer dni) {
		this.dni = dni;
	}

	public Integer getDni() {
		return dni;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
