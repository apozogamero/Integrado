package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Hangar;
import es.sotero.integrado.business.repositories.HangarRepository;

@Service
public class JPAHangarManager implements HangarManager {

    @Autowired
    private HangarRepository hanRepository;

    public List<Hangar> getHangarAll() {
        return (List<Hangar>) hanRepository.findAll();
    }

	@Override
	public Hangar getHangar(int id) {
		return hanRepository.findById(id);
	}
}