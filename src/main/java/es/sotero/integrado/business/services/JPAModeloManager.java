package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Modelo;
import es.sotero.integrado.business.repositories.ModeloRepository;

@Service
public class JPAModeloManager implements ModeloManager {

    @Autowired
    private ModeloRepository modRepository;

    public List<Modelo> getModeloAll() {
        return (List<Modelo>) modRepository.findAll();
    }

	@Override
	public Modelo getModelo(int id) {
		return modRepository.findById(id);
	}
}