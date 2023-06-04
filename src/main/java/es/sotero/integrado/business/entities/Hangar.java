package es.sotero.integrado.business.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="hangar")
public class Hangar {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
	public String nombre;
	
	public int capacidad;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "hangar")
	public List<Aeronave> aeronaveList;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
