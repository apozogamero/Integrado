package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Averia;

public interface AveriaRepository extends CrudRepository<Averia, Long> {

	public Averia findById(int id);
	
}
