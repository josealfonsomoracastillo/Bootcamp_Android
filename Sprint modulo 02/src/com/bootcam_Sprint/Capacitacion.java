package com.bootcam_Sprint;

import java.time.LocalTime;

public class Capacitacion {


    protected int identificador;
    protected Cliente cliente;
    protected String dia;
    protected LocalTime hora;
    protected String lugar;
    protected String duracion;
    protected int cantidadDeAsistentes;
                
    
    // to String
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Capacitacion [identificador=").append(identificador).append(", cliente=").append(cliente)
                .append(", dia=").append(dia).append(", lugar=").append(lugar).append(", duracion=").append(duracion)
                .append(", cantidadDeAsistentes=").append(cantidadDeAsistentes).append("]");
        return builder.toString();
    }

    // Constructor Vacio
    public Capacitacion() {
        super();
    }

    // Constructor con todos los atributos
    public Capacitacion(int identificador, Cliente cliente, String dia, LocalTime hora, String lugar, String duracion,
            int cantidadDeAsistentes) {
        super();
        this.identificador = identificador;
        this.cliente = cliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

   // métodos de validación de los atributos
    public Capacitacion(Cliente cliente, String dia, LocalTime hora, String lugar, String duracion,
            int cantidadDeAsistentes) {
        super();
        this.cliente = cliente;

        if (esDiaValido(dia)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Este día no existe");
        }

        if (esHoraValida(hora)) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora no es válida");
        }

        if (esLugarValido(lugar)) {
            this.lugar = lugar;
        } else {
            throw new IllegalArgumentException("Este lugar no es válido");
        }

        if (duracion.length() <= 70) {
            this.duracion = duracion;
        } else {
            throw new IllegalArgumentException("La duración no corresponde el rango adecuado");
        }

        if (cantidadDeAsistentes > 0 && cantidadDeAsistentes < 1000) {
            this.cantidadDeAsistentes = cantidadDeAsistentes;
        } else {
            throw new IllegalArgumentException(
                    "La cantidad de asistentes no corresponde al rango de número de asistentes");
        }
    }
	
	// Get and Set
	
	
	// To get identificador
	public int getIdentificador() {
		return identificador;
	}


	
	// To set identificador
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	
	// To get cliente
	public Cliente getCliente() {
		return cliente;
	}


	// To set cliente
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	
	// To get dia
	public String getDia() {
		return dia;
	}


	// To set dia
	public void setDia(String dia) {
		this.dia = dia;
	}


	
	// To get hora
	public LocalTime getHora() {
		return hora;
	}


	// To set hora
	public void setHora(LocalTime hora) {
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


	// To get duracion
	public String getDuracion() {
		return duracion;
	}


	// To set duracion 
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}



	// To get cantidadDeAsistentes
	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}


	
	// To set cantidadDeAsistentes
	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
}
