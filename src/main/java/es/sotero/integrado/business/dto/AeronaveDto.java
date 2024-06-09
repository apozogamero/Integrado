package es.sotero.integrado.business.dto;

public class AeronaveDto {
	
	public int idAeronave;
	public String nombre;
	public int idPiloto;
	public int idModelo;
	public int idHangar;
	public int idPatrulla;
	
	public int getIdAeronave() {
		return idAeronave;
	}
	public void setIdAeronave(int idAeronave) {
		this.idAeronave = idAeronave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}
	public int getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	public int getIdHangar() {
		return idHangar;
	}
	public void setIdHangar(int idHangar) {
		this.idHangar = idHangar;
	}
	public int getIdPatrulla() {
		return idPatrulla;
	}
	public void setIdPatrulla(int idPatrulla) {
		this.idPatrulla = idPatrulla;
	}
	
	@Override
	public String toString() {
		return "AeronaveDto [idAeronave=" + idAeronave + ", nombre=" + nombre + ", idPiloto=" + idPiloto + ", idModelo="
				+ idModelo + ", idHangar=" + idHangar + ", idPatrulla=" + idPatrulla + "]";
	}
}
