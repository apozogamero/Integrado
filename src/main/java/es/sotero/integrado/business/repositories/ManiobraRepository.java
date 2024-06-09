package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Maniobra;

public interface ManiobraRepository extends CrudRepository<Maniobra, Long> {

	public Maniobra findByIdManiobra(int id);
	
}