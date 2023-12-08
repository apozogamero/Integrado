package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Averia;
import es.sotero.integrado.business.repositories.AveriaRepository;

@Service
public class JPAAveriaManager implements AveriaManager {

    @Autowired
    private AveriaRepository aveRepository;

    public List<Averia> getAveriaAll() {
        return (List<Averia>) aveRepository.findAll();
    }

	@Override
	public Averia getAveria(int id) {
		return aveRepository.findById(id);
	}
}