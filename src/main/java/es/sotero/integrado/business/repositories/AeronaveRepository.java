package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Aeronave;

public interface AeronaveRepository extends CrudRepository<Aeronave, Long> {

	public Aeronave findById(int id);
	
	public void deleteById(int id);
	
}
