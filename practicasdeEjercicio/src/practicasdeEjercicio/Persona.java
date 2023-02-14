package practicasdeEjercicio;

import java.util.Objects;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String rut;
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param rut
	 */
	Persona(String nombre, String apellido, int edad, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
	}
	/**
	 * @return the nombre
	 */
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 */
	private Persona() {
		super();
	}
	/**
	 * 
	 */
	private Persona() {
		super();
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=").append(nombre).append(", apellido=").append(apellido).append(", edad=")
				.append(edad).append(", rut=").append(rut).append("]");
		return builder.toString();
	}
	
	
}
