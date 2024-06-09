package es.sotero.integrado.business.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="modelo")
public class Modelo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int idModelo;
	
	public String nombre;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "modelo")
	public List<Aeronave> aeronaveList;

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
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
