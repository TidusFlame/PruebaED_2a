package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {
	
	Curso c = new Curso();

	@Test
	void testEliminarAlumno() {
		//clase valida
				boolean lanzaException=false;
				try {
					c.eliminarAlumno("123456789");
				} catch (Exception e) {
					lanzaException =true;
				}
				assertFalse(lanzaException);
				
				//clase invalida
				lanzaException=false;
				try {
					c.eliminarAlumno("1234567");
				} catch (Exception e) {
					lanzaException =true;
				}
				assertTrue(lanzaException);
			}

	@Test
	void testAniadirAlumno() {
		Persona p = new Persona("123456789Z", "Aitor", "Careaga");
		int sizeBefore = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter = c.numeroAlumnos();
		
		assertEquals(sizeBefore, sizeAfter-1);
	}

	@Test
	void testEstaRegistrado() {
		String dni1 = "12345678Z";
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
