package es.sotero.integrado.business.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="averia")
public class Averia {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_aeronave")
	public Aeronave aeronave;
	
	public String descripcion;
	
	public Date fecha;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
