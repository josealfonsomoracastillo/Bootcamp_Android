import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

package com.pruebadiagnostico.modulo02;

public class Kromi extends Carro {

 // 1- Agregar los atributos:
	protected int añoFabricación;
	protected String marca;

 // 2- Generar to string:	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kromi [añoFabricación=").append(añoFabricación).append(", marca=").append(marca)
				.append(", cantidadOcupantes=").append(cantidadOcupantes).append(", fechaIngreso=").append(fechaIngreso)
				.append("]");
		return builder.toString();
	}

 // 3- Agregar constructor vacio:
	      public Kromi() {
		    super();
	      }
	      
 // 4- Agregar constructor con atributos:
		public Kromi(int añoFabricación, String marca) {
			super();
			this.añoFabricación = añoFabricación;
			this.marca = marca;
		}

		
 // 5- Agregar Get and Set: 		

		
		//  añoFabricación to get
		 
		public int getAñoFabricación() {
			return añoFabricación;
		}

		// añoFabricación to set
		 
		public void setAñoFabricación(int añoFabricación) {
			this.añoFabricación = añoFabricación;
		}

		// marca to get
		 
		public String getMarca() {
			return marca;
		}

		// marca to set
		 
		public void setMarca(String marca) {
			this.marca = marca;
		}
	

	
	
	
	
}
