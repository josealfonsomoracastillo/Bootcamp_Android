import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

package com.pruebadiagnostico.modulo02;

public class Trupalla extends Carro {

 // 1- Agregar los atributos:
	protected int nivelArmadura;
	protected String nombreOperador;
	
 // 2- Generar to string:	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trupalla [nivelArmadura=").append(nivelArmadura).append(", nombreOperador=")
				.append(nombreOperador).append(", cantidadOcupantes=").append(cantidadOcupantes)
				.append(", fechaIngreso=").append(fechaIngreso).append("]");
		return builder.toString();
	}
	
	
 // 3- Agregar constructor vacio:
	
	public Trupalla() {
		super();
	}

	
 // 4- Agregar constructor con atributos:
	

	public Trupalla(int nivelArmadura, String nombreOperador) {
		super();
		this.nivelArmadura = nivelArmadura;
		this.nombreOperador = nombreOperador;
	}


 // 5- Agregar Get and Set: 
	
	//nivelArmadura to get
	 
	public int getNivelArmadura() {
		return nivelArmadura;
	}


	// nivelArmadura to set
	 
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}


	// nombreOperador to get
	
	public String getNombreOperador() {
		return nombreOperador;
	}


	// nombreOperador to set
	 
	public void setNombreOperador(String nombreOperador) {
		this.nombreOperador = nombreOperador;
	}


 


	




	
	
	
}
