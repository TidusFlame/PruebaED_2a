package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import ed.examen.modelo.Persona;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p = new Persona("123456789Z", "Aitor", "Careaga");

	@Test
	void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		assertEquals("123456789Z", p.getDni());
	}

	@Test
	void testSetDni() {
		//clase valida
				try {
					p.setDni("12345678P");
				} catch (Exception e) {
					e.printStackTrace();
				}
				assertEquals("12345678P", p.getDni());
				
				//clase invalida
				boolean exceptionLanzada=false;
				try {
					p.setDni("12345678");
				} catch (Exception e) {
					exceptionLanzada=true;
				}
				assertTrue(exceptionLanzada);
			}

	@Test
	void testGetNombre() {
		assertEquals("Aitor", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Carla");
		assertEquals("Carla", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
