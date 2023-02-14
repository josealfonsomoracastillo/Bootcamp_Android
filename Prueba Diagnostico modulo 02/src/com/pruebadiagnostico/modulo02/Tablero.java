import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

package com.pruebadiagnostico.modulo02;

public class Tablero extends Carro {

 // 1- Agregar los atributos:
     protected List<Integer> tipoVehiculos;
	 protected List<Integer> numeroLanzamientos;
	 
	 
 // 2- Generar to string:
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tablero [tipoVehiculos=").append(tipoVehiculos).append(", numeroLanzamientos=")
				.append(numeroLanzamientos).append(", cantidadOcupantes=").append(cantidadOcupantes)
				.append(", fechaIngreso=").append(fechaIngreso).append("]");
		return builder.toString();
	}

// Métodos de los atributos List:

		public Tablero() {
		    tipoVehiculos = new ArrayList<Integer>();
		    for (int i = 1; i <= 18; i++) {
		      tipoVehiculos.add(i);
		      }
		    
        	  numeroLanzamientos = new ArrayList<Integer>();
		        int contador = 1;
		        while (true) {
		        numeroLanzamientos.add(contador);
		          contador++;
		        }	    
		    }

 // 3- Agregar constructor vacio:
		public Tablero() {
			super();
		}

 // 4- Agregar constructor con atributos:
		public Tablero(List<Integer> tipoVehiculos, List<Integer> numeroLanzamientos) {
			super();
			this.tipoVehiculos = tipoVehiculos;
			this.numeroLanzamientos = numeroLanzamientos;
		}

		
 // 5- Agregar constructor vacio:			
		
		// the tipoVehiculos to get
		 
		public List<Integer> getTipoVehiculos() {
			return tipoVehiculos;
		}

		// tipoVehiculos to set
		 
		public void setTipoVehiculos(List<Integer> tipoVehiculos) {
			this.tipoVehiculos = tipoVehiculos;
		}

		// numeroLanzamientos to get
		 
		public List<Integer> getNumeroLanzamientos() {
			return numeroLanzamientos;
		}

		// numeroLanzamientos to set
		 
		public void setNumeroLanzamientos(List<Integer> numeroLanzamientos) {
			this.numeroLanzamientos = numeroLanzamientos;
		}
		
		
		
		
		
}