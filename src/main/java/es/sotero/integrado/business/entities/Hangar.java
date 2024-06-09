package es.sotero.integrado.business.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="hangar")
public class Hangar implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int idHangar;
	
	public String nombre;
	
	public int capacidad;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "hangar")
	public List<Aeronave> aeronaveList;
	
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
		return "Hangar [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

	public List<Aeronave> getAeronaveList() {
		return aeronaveList;
	}

	public void setAeronaveList(List<Aeronave> aeronaveList) {
		this.aeronaveList = aeronaveList;
	}

}
