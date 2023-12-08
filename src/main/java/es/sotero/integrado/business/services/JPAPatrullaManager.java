package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Patrulla;
import es.sotero.integrado.business.repositories.PatrullaRepository;

@Service
public class JPAPatrullaManager implements PatrullaManager {

    @Autowired
    private PatrullaRepository patRepository;

    public List<Patrulla> getPatrullaAll() {
        return (List<Patrulla>) patRepository.findAll();
    }

	@Override
	public Patrulla getPatrulla(int id) {
		return patRepository.findById(id);
	}
}