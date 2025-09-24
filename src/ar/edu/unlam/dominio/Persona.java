package ar.edu.unlam.dominio;

public class Persona implements Interface {

	private String nombre;
	private Integer edad;
	private Integer dni;

	public Persona(){ 
	}
	
	public Persona(String nombre, Integer edad, Integer dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public Integer getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Soy una persona";
	}

	@Override
	public void metodoInterface() {
		
	}

	@Override
	public void ayudar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operacion() {
		// TODO Auto-generated method stub
		
	}

}