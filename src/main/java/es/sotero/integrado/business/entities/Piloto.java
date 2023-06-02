package es.sotero.integrado.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="piloto")
public class Piloto{

	@Id
	@Column(name="id")
	public Long id;
	public String nombre;
    public String dni;
	public char sexo;
	public int edad;

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
