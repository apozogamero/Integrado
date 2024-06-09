package es.sotero.integrado.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.sotero.integrado.business.entities.Piloto;

@Repository
public interface PilotoRepository extends CrudRepository<Piloto, Long> {

	public Piloto findByIdPiloto(int id);

}
