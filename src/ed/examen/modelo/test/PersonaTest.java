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
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
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
