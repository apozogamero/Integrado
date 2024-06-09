package es.sotero.integrado.business.dto;

public class PilotoDto {
	
	public int idPiloto;
	public String nombre;
	public String dni;
	public char sexo;
	public int edad;
	public int idAeronave;
	
	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
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

	public int getIdAeronave() {
		return idAeronave;
	}

	public void setIdAeronave(int idAeronave) {
		this.idAeronave = idAeronave;
	}

	@Override
	public String toString() {
		return "PilotoDto [idPiloto=" + idPiloto + ", nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", edad="
				+ edad + ", idAeronave=" + idAeronave + "]";
	}
}
