package es.sotero.integrado.business.dto;

public class ModeloDto {
	
	public int idModelo;
	public String nombre;
	public int getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "ModeloDto [idModelo=" + idModelo + ", nombre=" + nombre + "]";
	}
}
