package es.sotero.integrado.business.dto;

import java.sql.Date;

public class ManiobraDto {
	
	public int idManiobra;
	public String descripcion;
	public Date fecha;
	
	public int getIdManiobra() {
		return idManiobra;
	}
	public void setIdManiobra(int idManiobra) {
		this.idManiobra = idManiobra;
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
	@Override
	public String toString() {
		return "ManiobraDto [idManiobra=" + idManiobra + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
}
