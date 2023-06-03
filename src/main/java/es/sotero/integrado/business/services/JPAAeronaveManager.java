package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Aeronave;
import es.sotero.integrado.business.repositories.AeronaveRepository;

@Service
public class JPAAeronaveManager implements AeronaveManager {

    @Autowired
    private AeronaveRepository aerRepository;

    public List<Aeronave> getAeronaveAll() {
        return (List<Aeronave>) aerRepository.findAll();
    }

	@Override
	public Aeronave getAeronave(int id) {
		return aerRepository.findById(id);
	}
}