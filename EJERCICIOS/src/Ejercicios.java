import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Ejercicios {
		public static void main (String[] args) {
			
	Scanner entrada = new Scanner(System.in);
	
	
	
// System.out.println("\nCrea un arreglo de enteros de tamaño 5 y llénalo con valores ingresados por el usuario\n");
	 
   //System.out.println(" Ingres tamaño de arreglo:	 ");
	 //int tamaño = entrada.nextInt();
   
  
   
	 
	 int [] listadeEnteros = new int [tamaño];
	 
	 System.out.println(" Ingres elementos de arreglo:	 ");
	 
	 for (int i = 0; i < tamaño; i++) {
		 System.out.println("Ingrese elemento "  + (i+1)+ ":  \n");
		 listadeEnteros [i]= entrada.nextInt();
	 }
	 
	 
	 

	 for (int i = 0; i < tamaño; i++) {
		 System.out.println( 	listadeEnteros[i] );
	 }
	 
		}

		 
}