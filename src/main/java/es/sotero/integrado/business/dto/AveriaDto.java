package es.sotero.integrado.business.dto;

import java.sql.Date;

public class AveriaDto {
	
	public int idAveria;
	public int idAeronave;
	public String descripcion;
	public Date fecha;
	
	public int getIdAveria() {
		return idAveria;
	}
	public void setIdAveria(int idAveria) {
		this.idAveria = idAveria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdAeronave() {
		return idAeronave;
	}
	public void setIdAeronave(int idAeronave) {
		this.idAeronave = idAeronave;
	}
	
	@Override
	public String toString() {
		return "AveriaDto [idAveria=" + idAveria + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
}
