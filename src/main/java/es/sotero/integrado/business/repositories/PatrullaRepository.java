package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Patrulla;

public interface PatrullaRepository extends CrudRepository<Patrulla, Long> {

	public Patrulla findById(int id);
	
}