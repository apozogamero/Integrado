package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Piloto;

public interface PilotoRepository extends CrudRepository<Piloto, String> {

	public Piloto findByDni(String dni);

}
