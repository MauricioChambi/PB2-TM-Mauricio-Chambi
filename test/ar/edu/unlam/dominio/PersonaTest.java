package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void dadoQueExsiteUnaPersonaCunadoLaInstacioLosAtributosSePuedenConsultar() {
		Persona persona = new Persona("Matias", 30, 123456);
		assertEquals(123456, (int) persona.getDni());
		assertEquals("Matias", persona.getNombre());
		assertEquals(30, (int) persona.getEdad());
		assertEquals("Soy una persona", persona.toString());

	}

	@Test
	public void dadoQueExisteUnaPersonaAsalariadoCuandoLaInstancioLosAtributosSePuedenConsultar() {
		Asalariado asalariado = new Asalariado("Jose", 30, 123456, 1500.0);
		assertEquals(123456, (int) asalariado.getDni());
		assertEquals("Jose", asalariado.getNombre());
		assertEquals(30, (int) asalariado.getEdad());
		assertEquals("Soy una persona Asalariada", asalariado.toString());

	}

	@Test
	public void dadoQueExisteUnaPersonaVoluntarioCuandoLaInstancioLosAtributosSePuedenConsultar() {
		Voluntario voluntario = new Voluntario("Nando", 30, 123456, 4);
		assertEquals(123456, (int) voluntario.getDni());
		assertEquals("Nando", voluntario.getNombre());
		assertEquals(30, (int) voluntario.getEdad());
		assertEquals(4, (int) voluntario.getHorasDisponibles());
		assertEquals("Soy una persona Voluntaria", voluntario.toString());
		voluntario.metodoInterface();
	}

//	@Test
//	public void tets() {
//		
//		Persona persona = new Persona();
//		Voluntario persona2 = new Voluntario();
//		Asalariado persona3 = new Asalariado();
//		
//		List<Voluntario> listas= new ArrayList<>();
//		
//		assertTrue(listas.add((Voluntario)persona));
//		assertTrue(listas.add(persona2));
//		//No se puede agregar clases hijs entre si solo clases padres
////		assertTrue(listas.add((Voluntario)persona3));
//		
//		((Voluntario)persona).getHorasDisponibles();
//	}

	@Test
	public void test() {

		Persona asalariado = new Asalariado("Matias", 30, 134556, 1000000D);

		System.out.println(asalariado.toString());

		asalariado.ayudar();

		Asalariado otroAsalariado = new Asalariado("Matias", 30, 12345678, 1000000D);
		Voluntario voluntario = new Voluntario("Matias", 30, 12345678, 4);

		List<Voluntario> voluntarios = new ArrayList<>();
		Set<Voluntario> voluntariosHashSet = new HashSet<>();

		List<Voluntario> voluntariosLinkedList = new LinkedList<Voluntario>();
		voluntariosLinkedList = new ArrayList<Voluntario>();

		List<Persona> personas = new ArrayList<Persona>();
		personas.add(voluntario);
		personas.add(asalariado);

		for (Persona persona : personas) {

			if (persona instanceof Voluntario) {
				System.out.println("Voluntario: " + ((Voluntario) persona).getHorasDisponibles());
			}

		}

		ArrayList<Persona> personasDos = new ArrayList<>();
		personasDos.add(asalariado);
		personasDos.add(voluntario);

		personasDos.add(otroAsalariado);
		otroAsalariado.getSalario();
		otroAsalariado.getNombre();

		((Asalariado) asalariado).getSalario();

	}

}