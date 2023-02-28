package com.bootcam_Sprint;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {

	protected int idVisita;
	protected String rutCliente;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected String lugar;
	protected String comentarios;
    	
	
	
	// To String
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("VisitaTerreno [idVisita=").append(idVisita).append(", rutCliente=").append(rutCliente)
					.append(", lugar=").append(lugar).append(", comentarios=").append(comentarios).append("]");
			return builder.toString();
		}


	// Constructor vacio
	public VisitaTerreno() {
		super();
	}

	// Constructor con atributos 
	public VisitaTerreno(int idVisita, String rutCliente, LocalDate fecha, LocalTime hora, String lugar,
			String comentarios) {
		super();
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}


	// Get and Set


	// To get area
	public int getIdVisita() {
		return idVisita;
	}


	// To set area
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}


	// To get area
	public String getRutCliente() {
		return rutCliente;
	}


	// To set area
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}


	// To get area
	public LocalDate getFecha() {
		return fecha;
	}


	// To set area
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	// To get area
	public LocalTime getHora() {
		return hora;
	}


	// To set area
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	// To get area
	public String getLugar() {
		return lugar;
	}


	// To set area
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	// To get area
	public String getComentarios() {
		return comentarios;
	}


	// To set area
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
