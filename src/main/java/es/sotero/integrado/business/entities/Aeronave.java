package es.sotero.integrado.business.entities;

import java.io.Serializable;

public class Aeronave implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aeronave [nombre=" + nombre + "]";
	}

}