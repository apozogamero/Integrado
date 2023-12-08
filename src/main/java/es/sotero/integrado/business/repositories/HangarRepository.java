package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Hangar;

public interface HangarRepository extends CrudRepository<Hangar, Long> {

	public Hangar findById(int id);
	
}