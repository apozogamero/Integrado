package es.sotero.integrado.business.dto;

public class HangarDto {
	
	public int idHangar;
	public String nombre;
	public int capacidad;
	public int getIdHangar() {
		return idHangar;
	}
	public void setIdHangar(int idHangar) {
		this.idHangar = idHangar;
	}
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
		return "HangarDto [idHangar=" + idHangar + ", nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
}
