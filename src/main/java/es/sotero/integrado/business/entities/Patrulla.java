package es.sotero.integrado.business.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="patrulla")
public class Patrulla {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
	public String nombre;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "patrulla")
	public List<Aeronave> aeronaveList;
	
    @ManyToMany(mappedBy = "patrullaList", fetch = FetchType.EAGER)
    public List<Maniobra> maniobraList;

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

}
