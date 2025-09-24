package ar.edu.unlam.dominio;

public class Voluntario extends Persona {

	private Integer horasDisponibles;

	public Voluntario() {
	}

	public Voluntario(String nombre, Integer edad, Integer dni, Integer horasDisponibles) {
		super(nombre, edad, dni);
		this.horasDisponibles = horasDisponibles;
	}

	public Integer getHorasDisponibles() {
		return horasDisponibles;
	}

	@Override
	public String toString() {
		return "Soy una persona Voluntaria";
	}
	
	@Override
	public void metodoInterface() {
		System.out.println("nando");
	}
}