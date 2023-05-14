package es.sotero.integrado.business.entities;

import java.io.Serializable;

public class Hangar implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int capacidad;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Hangar [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

}
