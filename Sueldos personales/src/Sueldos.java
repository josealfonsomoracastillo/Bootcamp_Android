
public class Sueldos {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
	    protected final int salarioMinimo = 410000;
	    protected int sueldo; 

	    public void comparaSueldos() {
	        if (sueldo == salarioMinimo) {
	            System.out.println("La persona recibe salario mínimo");
	        } else if (sueldo < salarioMinimo) {
	            System.out.println("La persona esta pobre");
	        } else  (sueldo > salarioMinimo) {
	            System.out.println("La persona esta bien económica");
	        }
	    }

	    public void recibeBono() {
	        if (sueldo == salarioMinimo) {
	            System.out.println("Recibe Bono Marzo");
	        } else if (sueldo < salarioMinimo) {
	            System.out.println("Recibe Bono Marzo más canasta familiar");
	        } else (sueldo > salarioMinimo) {
	            System.out.println("La persona esta bien económica no recibe nada");
	        }
	    }
	    
	    
	   
	  
	}
