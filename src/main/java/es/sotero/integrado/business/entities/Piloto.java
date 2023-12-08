package es.sotero.integrado.business.entities;

import javax.persistence.*;

@Entity
@Table(name="piloto")
public class Piloto{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	public String nombre;
    public String dni;
	public char sexo;
	public int edad;
	@OneToOne(mappedBy = "piloto", fetch = FetchType.LAZY)
	public Aeronave aeronave;

	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    
    @Override
	public String toString() {
		return "Piloto [nombre = " + nombre + ", dni = " + dni + 
				", sexo = " + sexo + ", edad = " + edad + "]";
	}
}
