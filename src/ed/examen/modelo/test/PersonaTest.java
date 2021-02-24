package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import ed.examen.modelo.Persona;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p = new Persona("123456789Z", "Aitor", "Careaga");

	@Test
	void testPersonaStringStringString() {
		assertEquals("123456789Z", p.getDni());
		assertEquals("Aitor", p.getNombre());
		assertEquals("Careaga", p.getApellido1());
	}

	@Test
	void testGetDni() {
		assertEquals("123456789Z", p.getDni());
	}

	@Test
	void testSetDni() {
		//clase valida
				try {
					p.setDni("123456789A");
				} catch (Exception e) {
					e.printStackTrace();
				}
				assertEquals("12345679A", p.getDni());
				
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
		assertEquals("Careaga", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("FLAME");
		assertEquals("FLAME", p.getApellido1());
		
	}

}
