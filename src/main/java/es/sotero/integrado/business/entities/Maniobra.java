package es.sotero.integrado.business.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="maniobra")
public class Maniobra {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(
        name = "man_pat",
        joinColumns = @JoinColumn(name = "id_maniobra"),
        inverseJoinColumns = @JoinColumn(name = "id_patrulla")
    )
    private List<Patrulla> patrullaList;
	
	public String descripcion;
	
	public Date fecha;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

}
