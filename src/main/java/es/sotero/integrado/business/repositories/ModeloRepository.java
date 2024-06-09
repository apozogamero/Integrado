package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.integrado.business.entities.Modelo;

public interface ModeloRepository extends CrudRepository<Modelo, Long> {

	public Modelo findByIdModelo(int id);
	
}
