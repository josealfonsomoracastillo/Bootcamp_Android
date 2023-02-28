

		public class SumatoriaNumerosNaturales {	
			private int numero;

			public SumatoriaNumerosNaturales(int numero) {		
				this.numero = numero;
			}

			//Este método suma todos los números naturales hasta el número asignado 
			//como atributo de la clase

			public int sumaNumerosNaturales() {
				int suma = 0;
				for(int i = 1; i <= numero; i++) {
					suma += i;
				}
				return suma;		
			}
			//Este método suma todos los números pares hasta el número asignado 
			//como atributo de la clase
			public int sumaNumerosNaturalesPares() {
				int suma = 0;
				for(int i = 1; i <= numero; i++) {
					if(i % 2 == 0) {
						suma += i;
					}			
				}
				return suma;		
			}

			public int getNumero() {
				return numero;
			}

			public void setNumero(int numero) {
				this.numero = numero;
			}


	}
	
	
	
