package ar.edu.unlam.dominio;

public class Asalariado extends Persona {

	private Double salario;

	public Asalariado() {
	}

	public Asalariado(String nombre, Integer edad, Integer dni, Double salario) {
		super(nombre, edad, dni);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Soy una persona Asalariada";
	}
	
	@Override
	public void metodoInterface() {
		
	}
}