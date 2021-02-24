package ed.examen.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Añadiremos los datos de la Persona
	 * @param dni - Escribimos el dni de la Persona
	 * @param nombre - Escribimos el nombre de la Persona
	 * @param apellido1 - Escribimos el apellido de la Persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Nos permite conocer el dni de la Persona
	 * @return - Devuelve el dni de la Persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Nos permite modificar el dni de la Persona
	 * @param dni - Insertamos el dni de la Persona
	 * @throws Exception Devolvera error cuando el ultimo caracter no sea una letra
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	
	
	/**
	 * Nos permite obtener el nombre de la Persona
	 * @return - Devolvera el nombre de la Persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Nos permite modificar el nombre de una Persona
	 * @param nombre - Es el nuevo nombre que tendra la Persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Nos permite obtener el apellido de una Persona
	 * @return - Devolvera el apellido de una Persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Nos permite modificar el apellido de una Persona
	 * @param apellido1 - Es el apellido nuevo que tendra la Persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
