package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Elimina a un alumno de la clase
	 * @param dni - Poner el dni del alumno
	 * @throws Exception - El dni no tiene una largura de 9 caracteres y el ultimo caracter sea una letra
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Añade un alumno a la clase
	 * @param p - Poner todos los atributos de la clase Persona
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Permite saber si alguien con un dni esta registrado en el curso
	 * @param dni - Poner el dni del alumno
	 * @return Devuelve falso si no existe un dni de una persona en el curso
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Lista a todos los alumnos que estan en el curso
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * Nos permite saber cuantos alumnos hay en el curso
	 * @return Devuelve el numero total de alumnos en el curso
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
