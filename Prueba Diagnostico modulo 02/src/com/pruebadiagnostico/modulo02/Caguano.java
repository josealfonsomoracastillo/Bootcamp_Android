import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

package com.pruebadiagnostico.modulo02;

public class Caguano extends Carro {

 // 1- Agregar los atributos:
	protected int alcanceTiro;
	protected String colorConfeti;

	
 // 2- Generar to string:		
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caguano [alcanceTiro=").append(alcanceTiro).append(", colorConfeti=").append(colorConfeti)
				.append(", cantidadOcupantes=").append(cantidadOcupantes).append(", fechaIngreso=").append(fechaIngreso)
				.append("]");
		return builder.toString();
	}


 // 3- Agregar constructor vacio:
	        public Caguano() {
		       super();
	        }

 // 4- Agregar constructor con atributos:
			public Caguano(int alcanceTiro, String colorConfeti) {
				super();
				this.alcanceTiro = alcanceTiro;
				this.colorConfeti = colorConfeti;
			}

 // 5- Agregar Get and Set: 
			
			// alcanceTiro to get
			 
			public int getAlcanceTiro() {
				return alcanceTiro;
			}


			// alcanceTiro to set
			 
			public void setAlcanceTiro(int alcanceTiro) {
				this.alcanceTiro = alcanceTiro;
			}


			// colorConfeti to get
			 
			public String getColorConfeti() {
				return colorConfeti;
			}


			// colorConfeti to set
			 
			public void setColorConfeti(String colorConfeti) {
				this.colorConfeti = colorConfeti;
			}
	
 
	
	
	
	
	
}
