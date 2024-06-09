package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Patrulla;
import es.sotero.integrado.business.repositories.PatrullaRepository;

@Service
public class JPAPatrullaManager implements PatrullaManager {

    @Autowired
    private PatrullaRepository patRep;

    public List<Patrulla> getPatrullaAll() {
        return (List<Patrulla>) patRep.findAll();
    }

	@Override
	public Patrulla getPatrulla(int id) {
		return patRep.findByIdPatrulla(id);
	}
    
    public void addPatrulla(Patrulla p) {
    	patRep.save(p);
    }
    
    public void updatePatrulla(Patrulla p) {
    	patRep.save(p);
    }
    
    public void deletePatrulla(Patrulla p) {
    	patRep.delete(p);
    }
}