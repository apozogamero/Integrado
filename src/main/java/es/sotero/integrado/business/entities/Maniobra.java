package es.sotero.integrado.business.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="maniobra")
public class Maniobra {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;

	@LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "man_pat",
        joinColumns = @JoinColumn(name = "id_maniobra"),
        inverseJoinColumns = @JoinColumn(name = "id_patrulla")
    )
    private List<Patrulla> patrullaList;
	
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
		return "Maniobra [descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}

	public List<Patrulla> getPatrullaList() {
		return patrullaList;
	}

	public void setPatrullaList(List<Patrulla> patrullaList) {
		this.patrullaList = patrullaList;
	}

}
