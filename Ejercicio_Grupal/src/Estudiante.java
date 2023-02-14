import java.util.ArrayList;

//1- agregar atributos.
public class Estudiante extends Persona {
	private ArrayList<String> anotaciones = new ArrayList();
	private float[] notas;

	// 2- Agregar constructor vacio
	public Estudiante() {
		super();
	}

	//3- Agregar constructor con atributos.
	/**
	 * @param anotaciones
	 * @param notas
	 */
	public Estudiante(ArrayList<String> anotaciones, float[] notas) {
		super();
		this.anotaciones = anotaciones;
		this.notas = notas;
	}
	
	

	// 4- Agregar métodos.
	public float mostrarPromedio() {
	  float promedio = 0f;
	  float suma = 0f;
	  for (float nota: notas) {
	  suma = suma + nota; 
	}
	  
	  promedio = suma / notas.length;
	return promedio;
	}
	

	public void mostrarAnotaciones() {
    for (String anotacion: anotaciones) {
    	System.out.println(anotacion);
    }
    }

	/**
	 * @return the anotaciones
	 */
	public ArrayList<String> getAnotaciones() {
		return anotaciones;
	}

	/**
	 * @return the notas
	 */
	public float[] getNotas() {
		return notas;
	}
	
	
}