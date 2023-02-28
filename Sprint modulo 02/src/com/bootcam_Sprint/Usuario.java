package com.bootcam_Sprint;

import java.time.LocalDate;

public class Usuario {


	protected String nombre;
	protected LocalDate fechadeNacimiento;
	protected int run;
                   
	// To String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nombre=").append(nombre).append(", fechadeNacimiento=").append(fechadeNacimiento)
				.append(", run=").append(run).append("]");
		return builder.toString();
	}

	// Constructor vacio
	public Usuario() {
		super();
	}

	// Constructor con atributos
	public Usuario(String nombre, LocalDate fechadeNacimiento, int run) {
		super();
	//Método de validación del nombre		
		if (nombre == null || nombre.length() < 10 || nombre.length() > 50) {
			throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
		}
		this.nombre = nombre;
		this.fechadeNacimiento = fechadeNacimiento;
		
	//Método de validación del run	
		if (run >= 9999999) {
			throw new IllegalArgumentException("El RUN debe ser menor a 99.999.99.");
		}
		this.run = run;
		isFechadeNacimientoValida();
	}

   //Métodos de validación de la fecha de Nacimiento
	public boolean isFechadeNacimientoValida() {
		if (fechadeNacimiento == null || fechadeNacimiento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento no es válida.");
		}
		return true;
	}
	
	
	// Get and Set
	
	// To get nombre
	public String getNombre() {
		return nombre;
	}

	// To set nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// To get fechadeNacimiento
	public LocalDate getFechadeNacimiento() {
		return fechadeNacimiento;
	}

	// To set fechadeNacimiento
	public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
		this.fechadeNacimiento = fechadeNacimiento;
	}

	// To get run
	public int getRun() {
		return run;
	}

	// To set run
	public void setRun(int run) {
		if (run >= 9999999) {
			throw new IllegalArgumentException("El RUN debe ser menor a 99.999.99.");
		}
		this.run = run;
	}

}