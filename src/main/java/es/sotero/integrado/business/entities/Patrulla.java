package es.sotero.integrado.business.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="patrulla")
public class Patrulla implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int idPatrulla;
	
	public String nombre;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "patrulla")
	public List<Aeronave> aeronaveList;

	@LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(mappedBy = "patrullaList")
    public List<Maniobra> maniobraList;

	public int getIdPatrulla() {
		return idPatrulla;
	}

	public void setIdPatrulla(int idPatrulla) {
		this.idPatrulla = idPatrulla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Patrulla [nombre=" + nombre + "]";
	}

	public List<Aeronave> getAeronaveList() {
		return aeronaveList;
	}

	public void setAeronaveList(List<Aeronave> aeronaveList) {
		this.aeronaveList = aeronaveList;
	}

	public List<Maniobra> getManiobraList() {
		return maniobraList;
	}

	public void setManiobraList(List<Maniobra> maniobraList) {
		this.maniobraList = maniobraList;
	}

}
