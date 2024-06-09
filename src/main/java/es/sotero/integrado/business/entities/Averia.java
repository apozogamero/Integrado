package es.sotero.integrado.business.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="averia")
public class Averia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "secAveria")
	@SequenceGenerator(name = "secAveria", sequenceName = "SEC_AVERIA", allocationSize = 1)
	@Column(name="id")
	public int idAveria;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_aeronave")
	public Aeronave aeronave;
	
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

	@Override
	public String toString() {
		return "Averia [descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}

	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}

}
