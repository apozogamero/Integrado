package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Piloto;
import es.sotero.integrado.business.repositories.PilotoRepository;

@Service
public class JPAPilotoManager implements PilotoManager {

    @Autowired
    private PilotoRepository pilRepository;

    public List<Piloto> getPilotoAll() {
        return (List<Piloto>) pilRepository.findAll();
    }

	@Override
	public Piloto getPiloto(String id) {
		return pilRepository.findById(id);
	}
}