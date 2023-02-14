import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

package com.pruebadiagnostico.modulo02;

public class Carro {

 // 1- Agregar los atributos:	
	protected int cantidadOcupantes;
	protected int fechaIngreso;
	
	
 // 2- Generar to string:		
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [cantidadOcupantes=").append(cantidadOcupantes).append(", fechaIngreso=")
				.append(fechaIngreso).append("]");
		return builder.toString();
	}


 // 3- Agregar constructor vacio:
          public Carro() {
	        super();
          }


 // 4- Agregar constructor con atributos:
		public Carro(int cantidadOcupantes, int fechaIngreso) {
			super();
			this.cantidadOcupantes = cantidadOcupantes;
			this.fechaIngreso = fechaIngreso;
		}


 // 5- Agregar Get and Set: 
		
	//  cantidadOcupantes to get	
		
		public int getCantidadOcupantes() {
			return cantidadOcupantes;
		}


	// cantidadOcupantes to set
		 
		public void setCantidadOcupantes(int cantidadOcupantes) {
			this.cantidadOcupantes = cantidadOcupantes;
		}


	//  fechaIngreso to get
		 
		public int getFechaIngreso() {
			return fechaIngreso;
		}


		// fechaIngreso to set
		 
		public void setFechaIngreso(int fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}
	


 	
	
	
	
	
	
	
	
	
	
}
