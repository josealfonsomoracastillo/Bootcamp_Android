package ejercicios2;

public class persona {

	
	private String nombre;
	private String apellido;
	private int Rut;
	
	
	// @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("persona [nombre=").append(nombre).append(", apellido=").append(apellido).append(", Rut=")
				.append(Rut).append("]");
		return builder.toString();
	}


	/**
	 * 
	 */
	public persona() {
		super();
	}


	/**
	 * @param nombre
	 * @param apellido
	 * @param rut
	 */
	public persona(String nombre, String apellido, int rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		Rut = rut;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
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
	 * @return the rut
	 */
	public int getRut() {
		return Rut;
	}


	/**
	 * @param rut the rut to set
	 */
	public void setRut(int rut) {
		Rut = rut;
	}
	
	
	
	
	
}
