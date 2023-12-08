package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Maniobra;
import es.sotero.integrado.business.repositories.ManiobraRepository;

@Service
public class JPAManiobraManager implements ManiobraManager {

    @Autowired
    private ManiobraRepository manRepository;

    public List<Maniobra> getManiobraAll() {
        return (List<Maniobra>) manRepository.findAll();
    }

	@Override
	public Maniobra getManiobra(int id) {
		return manRepository.findById(id);
	}
}