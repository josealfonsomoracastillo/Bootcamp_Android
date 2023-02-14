import java.time.*;

public class Persona {

	// 1- agregar atributos.
	private String rut;
	private String nombre;
	private LocalDate fechaNacimiento;

	// 2- Agregar constructor vacio
	public Persona() {
		super();
	}

	// 3- Agregar constructor con atributos.
	public Persona(String rut, String nombre, LocalDate fechaNacimiento) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	// 4- Agregar métodos.
	public void mostrarEdad() {

	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
}