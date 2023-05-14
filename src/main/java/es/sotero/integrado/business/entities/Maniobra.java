package es.sotero.integrado.business.entities;

import java.io.Serializable;
import java.sql.Date;

public class Maniobra implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String descripcion;
	private Date fecha;
	
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
		return "Maniobra [descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}

}
