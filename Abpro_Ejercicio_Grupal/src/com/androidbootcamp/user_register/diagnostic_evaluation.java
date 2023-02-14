package com.androidbootcamp.user_register;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class diagnostic_evaluation {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String respuesta;
		 
	//	Scanner scanner = new scanner(System.in);

 //  1- Crear tres perfiles: cliente, profesional y administrativo. 


		int cliente = 1;
		int profesional = 2;
		int administrativo = 3;
		
		System.out.println(" ");
		System.out.println("Seleccione usuario (1, 2 o 3):");
		System.out.println(" ");
		System.out.println("1. Cliente");
		System.out.println("2. Profesional");
		System.out.println("3. Administrativo");
		
		respuesta = entrada.nextLine();
	






    //   Para cada usuario: nombre, fecha de nacimiento y RUN.(*)


 /*  2- Por cada perfil registrar datos específicos: 

          •2a-  Cliente: 
                          dirección*, fon*, Qx empleados → usuario_cliente = empresa 
          
         

          •2b Profesional: 
                          años de experiencia, departamento* 
          

         •2c Administrativo:
                          función*, nombre superior. */
                          

 /*   **Los datos de los usuarios están almacenados en una matriz de 100 filas y 10 columnas. 
        n fila corresponde a n usuario, cada columna es uno de los atributos antes mencionados, 
        En orden de mención */
      
   

 /*  3- Registro de usuarios 

        • Crear función  registrar usuario. No es necesario que retorne nada.

             **No es obligatorio que la función pida los datos a registrar.** 

        • Desde code del algoritmo, solicitar crear al menos un usuario de cada tipo. */


/*   4- Generación de listados:

       •4a Cree función “mostrarUsuarios”, que entregue listado total de usuarios registrados en la matriz. 
 ** Solo mostrar las filas de la tabla que tienen datos ingresados, las filas “vacías”, no se consideran.**


       •4b Cree función “contarUsuariosPorCategoria”, que entrega resumen indicando el tipo de usuario 
             y la Qx asociada a cada uno, solo cuentan las filas con datos ingresados.

       •4c Genere rutinas para invocar las dos funciones creadas antes, mostrando por pantalla sus
             valores de retorno. */



/*   5- Modificar usuario: 

       •5a Cree función “modificarUsuario”, debe recibir un RUT de usuario.
            Siempre que el usuario exista, debe pedir nuevamente sus datos, y actualizar la posición
            correspondiente en el arreglo. */



/*    6- Eliminar usuario: 

        •6a  Cree función “eliminarUsuario”, debe recibir un RUT, y eliminar el usuario desde el arreglo. 
 ** si elimina un usuario, la fila que usa en la matriz no puede quedar vacía. Esto significa que,
    eliminado el usuario, todos los registros ubicados bajo él deben ser desplazados hacia la fila anterior. */ 


/*    7- Menú principal:

        •7a El programa principal, debe desplegar un menú con seis opciones:

                 ▪1 Registrar usuario 
                 ▪2 Mostrar usuarios 
                 ▪3 Contar usuarios por categoría 
                 ▪4 Modificar usuarios 
                 ▪5 Eliminar usuario
                 ▪6 Salir. 

  ** El menú anterior se debe mostrar constantemente, hasta que se seleccione la opción 6 **
  
     - Si se ingresa un número no perteneciente al grupo anterior se debe indicar con un mensaje de error y
       solicitar nuevamente la selección. 
     - Cada vez que se seleccione una opción correcta, se debe llamar a la función correspondiente.*/ 

		
	
		
		

	}

}
