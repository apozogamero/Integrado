package es.sotero.integrado.business.entities;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="aeronave")
public class Aeronave {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	public String nombre;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_piloto")
	public Piloto piloto;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_modelo")
	public Modelo modelo;

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_hangar")
	public Hangar hangar;
	

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_patrulla")
	public Patrulla patrulla;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "aeronave")
	public List<Averia> averiaList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Aeronave [nombre=" + nombre + "]";
	}

	public List<Averia> getAveriaList() {
		return averiaList;
	}

	public void setAveriaList(List<Averia> averiaList) {
		this.averiaList = averiaList;
	}

	public Hangar getHangar() {
		return hangar;
	}

	public void setHangar(Hangar hangar) {
		this.hangar = hangar;
	}

	public Patrulla getPatrulla() {
		return patrulla;
	}

	public void setPatrulla(Patrulla patrulla) {
		this.patrulla = patrulla;
	}

}
