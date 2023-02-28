package com.pruebadiagnostico.modulo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tablero extends Carro {

 // 1- Agregar los atributos:
    
	 protected List<Interger> carro = new ArrayList<>();
	 protected List<Interger> huevo = new ArrayList<Interger>(Interger);
	 
 // agregar los carros a la lista
	 
	  int cantidadKromi = 3;
	  int cantidadCaguano = 5;
	  int cantidadTrupalla = 10;
	 
	 
	for (int i = 0; i < cantidadKromi; i++) {
	 carro.add(1);
	}
	
	for (int i = 0; i < cantidadCaguano; i++) {
		 carro.add(2);
		}
	 
	for (int i = 0; i < cantidadTrupalla; i++) {
		 carro.add(3);
		}

	
 // 2- Generar to string:
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tablero [cantidadKromi=").append(cantidadKromi).append(", cantidadCaguano=")
				.append(cantidadCaguano).append(", cantidadTrupalla=").append(cantidadTrupalla).append(", i=").append(i)
				.append(", cantidadOcupantes=").append(cantidadOcupantes).append(", fechaIngreso=").append(fechaIngreso)
				.append(", cantidadColumnas=").append(cantidadColumnas).append(", cantidadFilas=").append(cantidadFilas)
				.append("]");
		return builder.toString();
	}


	

// Métodos de los atributos List:

		

 // 3- Agregar constructor vacio:
		
public Tablero() {
	super();
}

 // 4- Agregar constructor con atributos:
		
public Tablero(List<Interger> carro, List<Interger> huevo, int cantidadKromi, int cantidadCaguano, int cantidadTrupalla,
		int i) {
	super();
	this.carro = carro;
	this.huevo = huevo;
	this.cantidadKromi = cantidadKromi;
	this.cantidadCaguano = cantidadCaguano;
	this.cantidadTrupalla = cantidadTrupalla;
	this.i = i;
}



 // 5- Agregar get and set:	

      // to get the carro

           public List<Interger> getCarro() {
	         return carro;
           }




     // carro to set carro
 
          public void setCarro(List<Interger> carro) {
	         this.carro = carro;
          }



    //  to get huevo

           public List<Interger> getHuevo() {
	         return huevo;
           }


   // to set huevo

           public void setHuevo(List<Interger> huevo) {
	          this.huevo = huevo;
           }


  // to get cantidadKromi

          public int getCantidadKromi() {
	        return cantidadKromi;
          }



  // to set cantidadKromi
 
          public void setCantidadKromi(int cantidadKromi) {
	         this.cantidadKromi = cantidadKromi;
          }



  //to get cantidadCaguano
 
          public int getCantidadCaguano() {
	         return cantidadCaguano;
          }



  // to set cantidadCaguano

           public void setCantidadCaguano(int cantidadCaguano) {
	          this.cantidadCaguano = cantidadCaguano;
           }



 // to get  cantidadTrupalla
 
          public int getCantidadTrupalla() {
	         return cantidadTrupalla;
          }


 //to set cantidadTrupalla

          public void setCantidadTrupalla(int cantidadTrupalla) {
	        this.cantidadTrupalla = cantidadTrupalla;
          }
	
	
		
		 

		
}