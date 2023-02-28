package com.bootcam_Sprint;

public class Accidente {

	
	protected int identificadorDelAccidente;
	protected int rutcliente;
	protected String fecha;
	protected String hora;
	protected String lugar;
	protected String origen;
	protected String consecuencias;
    	
	
	
	
	// To String

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Accidente [identificadorDelAccidente=").append(identificadorDelAccidente)
				.append(", rutcliente=").append(rutcliente).append(", fecha=").append(fecha).append(", hora=")
				.append(hora).append(", lugar=").append(lugar).append(", origen=").append(origen)
				.append(", consecuencias=").append(consecuencias).append("]");
		return builder.toString();
	}

	
	// Constructor vacio
		public Accidente() {
			super();
		}

	
	// Constructor con atributos 
	public Accidente(int identificadorDelAccidente, int rutcliente, String fecha, String hora, String lugar,
			String origen, String consecuencias) {
		super();
		this.identificadorDelAccidente = identificadorDelAccidente;
		this.rutcliente = rutcliente;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	// Get and Set

	// To get area
	public int getIdentificadorDelAccidente() {
		return identificadorDelAccidente;
	}


	/**
	 * @param identificadorDelAccidente the identificadorDelAccidente to set
	 */
	public void setIdentificadorDelAccidente(int identificadorDelAccidente) {
		this.identificadorDelAccidente = identificadorDelAccidente;
	}


	// To get rutcliente
	public int getRutcliente() {
		return rutcliente;
	}

	// To set rutcliente
	public void setRutcliente(int rutcliente) {
		this.rutcliente = rutcliente;
	}


	// To get fecha
	public String getFecha() {
		return fecha;
	}


	// To set fecha
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	// To get hora
	public String getHora() {
		return hora;
	}


	// To set hora
	public void setHora(String hora) {
		this.hora = hora;
	}


	// To get lugar
	public String getLugar() {
		return lugar;
	}


	// To set lugar
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	// To get origen
	public String getOrigen() {
		return origen;
	}


	// To set origen
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	// To get consecuencias
	public String getConsecuencias() {
		return consecuencias;
	}


	// To set consecuencias
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
