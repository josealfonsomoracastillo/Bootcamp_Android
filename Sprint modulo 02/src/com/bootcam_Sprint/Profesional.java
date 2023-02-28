package com.bootcam_Sprint;

import java.time.LocalDate;

public class Profesional extends Usuario {

	protected String titulo;
	protected LocalDate fechadeIngreso;
        	
	
	
    // To String
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Profesional [titulo=").append(titulo).append(", fechadeIngreso=").append(fechadeIngreso)
					.append("]");
			return builder.toString();
		}
	
	// Constructor vacio
	public Profesional() {
		super();
	}



	// Constructor con atributos 
	public Profesional(String titulo, LocalDate fechadeIngreso) {
		super();
		this.titulo = titulo;
		this.fechadeIngreso = fechadeIngreso;
	}


	// Get and Set

	// To get titulo
	public String getTitulo() {
		return titulo;
	}

	// To set titulo
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// To get fechadeIngreso
	public LocalDate getFechadeIngreso() {
		return fechadeIngreso;
	}

	// To set fechadeIngreso
	public void setFechadeIngreso(LocalDate fechadeIngreso) {
		this.fechadeIngreso = fechadeIngreso;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
