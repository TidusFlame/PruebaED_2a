package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {

	Curso c = new Curso();
	Persona p = new Persona("123456789Z", "Aitor", "Careaga");
	Persona p2 = new Persona("123456789A", "Aito", "Careag");

	@Test
	void testEliminarAlumno() {
		// clase valida
		boolean lanzaException = false;
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e) {
			lanzaException = true;
		}
		assertFalse(lanzaException);

		// clase invalida
		lanzaException = false;
		try {
			c.eliminarAlumno("1234567");
		} catch (Exception e) {
			lanzaException = true;
		}
		assertTrue(lanzaException);
	}

	@Test
	void testAniadirAlumno() {
		Persona p = new Persona("123456789Z", "Aitor", "Careaga");
		int sizeBefore = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter = c.numeroAlumnos();

		assertEquals(sizeBefore, sizeAfter - 1);
	}

	@Test
	void testEstaRegistrado() {
		c.aniadirAlumno(p);

		boolean expected = true;

		assertEquals(expected, c.estaRegistrado("123456789Z"));
	}

	@Test
	void testCurso() {
		c.aniadirAlumno(p);
		c.aniadirAlumno(p2);
		Integer dos = 2;
		assertEquals(dos, c.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		int lista = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int listaNueva = c.numeroAlumnos();
		assertEquals(lista, listaNueva - 1);
	}

}
