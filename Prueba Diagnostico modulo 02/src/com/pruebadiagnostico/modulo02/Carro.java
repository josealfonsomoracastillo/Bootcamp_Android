package com.pruebadiagnostico.modulo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carro {

 // 1- Agregar los atributos:	
	protected int cantidadOcupantes;
	protected int fechaIngreso;
	protected int cantidadColumnas;
	protected int cantidadFilas;
	
 // 2- Generar to string:		
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [cantidadOcupantes=").append(cantidadOcupantes).append(", fechaIngreso=")
				.append(fechaIngreso).append(", cantidadColumnas=").append(cantidadColumnas)
				.append(", cantidadFilas=").append(cantidadFilas).append("]");
		return builder.toString();
	}
	

 // 3- Agregar constructor vacio:
          public Carro() {
	        super();
          }


 // 4- Agregar constructor con atributos:
   public Carro(int cantidadOcupantes, int fechaIngreso, int cantidadColumnas, int cantidadFilas) {
	  super();
	  this.cantidadOcupantes = cantidadOcupantes;
	  this.fechaIngreso = fechaIngreso;
	  this.cantidadColumnas = cantidadColumnas;
	  this.cantidadFilas = cantidadFilas;
}


// 5- Agregar Get and Set: 
			
		
    //   cantidadColumnas to get	
      public int getCantidadColumnas() {
	    return cantidadColumnas;
      }


    // cantidadColumnas to set
      public void setCantidadColumnas(int cantidadColumnas) {
	     this.cantidadColumnas = cantidadColumnas;
      }


    // cantidadFilas to get
      public int getCantidadFilas() {
	     return cantidadFilas;
      }


    // cantidadFilas to set
      public void setCantidadFilas(int cantidadFilas) {
	     this.cantidadFilas = cantidadFilas;
      }
        
    // cantidadOcupantes to get	
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
