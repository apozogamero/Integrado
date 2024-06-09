package es.sotero.integrado.business.dto;

public class PatrullaDto {
	
	public int idPatrulla;
	public String nombre;
	
	public int getIdPatrulla() {
		return idPatrulla;
	}
	public void setIdPatrulla(int idPatrulla) {
		this.idPatrulla = idPatrulla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "PatrullaDto [idPatrulla=" + idPatrulla + ", nombre=" + nombre + "]";
	}
}
