package com.bootcam_Sprint;

public class Cliente extends Usuario {

	protected int rut;
	protected String nombres;
	protected String apellidos;
	protected String telefono;
	protected String afp;
	protected String sistemadeSalud;
	protected String direccion;
	protected String comuna;
	protected int edad;
        	

	
    // To String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [rut=").append(rut).append(", nombres=").append(nombres).append(", apellidos=")
				.append(apellidos).append(", telefono=").append(telefono).append(", afp=").append(afp)
				.append(", sistemadeSalud=").append(sistemadeSalud).append(", direccion=").append(direccion)
				.append(", comuna=").append(comuna).append(", edad=").append(edad).append("]");
		return builder.toString();
	}
	
	
	
    // Constructor vacio
		public Cliente() {
			super();
		}
	
	
    // Constructor con atributos 
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, String sistemadeSalud,
			String direccion, String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemadeSalud = sistemadeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}



	// Get and Set


	// To get rut
	public int getRut() {
		return rut;
	}



	// To set rut
	public void setRut(int rut) {
		this.rut = rut;
	}



	// To get nombres
	public String getNombres() {
		return nombres;
	}



	// To set nombres
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	// To get apellidos
	public String getApellidos() {
		return apellidos;
	}


	// To set apellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	// To get telefono
	public String getTelefono() {
		return telefono;
	}



	// To set telefono
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	// To get afp
	public String getAfp() {
		return afp;
	}



	// To set afp
	public void setAfp(String afp) {
		this.afp = afp;
	}


	// To get sistemadeSalud
	public String getSistemadeSalud() {
		return sistemadeSalud;
	}



	// To set sistemadeSalud
	public void setSistemadeSalud(String sistemadeSalud) {
		this.sistemadeSalud = sistemadeSalud;
	}



	// To get direccion
	public String getDireccion() {
		return direccion;
	}



	// To set direccion
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	// To get comuna
	public String getComuna() {
		return comuna;
	}



	// To set comuna
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	// To get edad
	public int getEdad() {
		return edad;
	}



	// To set edad
	public void setEdad(int edad) {
		this.edad = edad;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
