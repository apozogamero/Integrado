package es.sotero.integrado.business.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="modelo")
public class Modelo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
	public String nombre;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "modelo")
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

	public List<Aeronave> getAeronaveList() {
		return aeronaveList;
	}

	public void setAeronaveList(List<Aeronave> aeronaveList) {
		this.aeronaveList = aeronaveList;
	}

	@Override
	public String toString() {
		return "Modelo [nombre=" + nombre + "]";
	}

}
