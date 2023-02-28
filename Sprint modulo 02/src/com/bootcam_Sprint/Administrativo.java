package com.bootcam_Sprint;

public class Administrativo {

	protected String area;
	protected String experienciaPrevia;
    	
	
	// To String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrativo [area=").append(area).append(", experienciaPrevia=").append(experienciaPrevia)
				.append("]");
		return builder.toString();
	}

	
	
	// Constructor vacio
	public Administrativo() {
		super();
	}



	// Constructor con atributos 
	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}


	// Get and Set


	// To get area
	public String getArea() {
		return area;
	}



	// To set area
	public void setArea(String area) {
		this.area = area;
	}



	// To get experienciaPrevia
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}



	// To set experienciaPrevia
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
