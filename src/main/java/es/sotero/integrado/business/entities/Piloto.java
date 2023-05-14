package es.sotero.integrado.business.entities;

import java.io.Serializable;

public class Piloto implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private String nombre;
    private String dni;
    private char sexo;
    private int edad;

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
