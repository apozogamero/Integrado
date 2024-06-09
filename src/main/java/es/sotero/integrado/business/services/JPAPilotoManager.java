package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Piloto;
import es.sotero.integrado.business.repositories.PilotoRepository;

@Service
public class JPAPilotoManager implements PilotoManager {
	
    @Autowired
    private PilotoRepository pilRep;

    public List<Piloto> getPilotoAll() {
        return (List<Piloto>) pilRep.findAll();
    }

    @Override
	public Piloto getPiloto(int id) {
		return pilRep.findByIdPiloto(id);
	}
    
    @Override
    public void addPiloto(Piloto p) {
    	pilRep.save(p);
    }
    
    @Override
    public void updatePiloto(Piloto p) {
    	pilRep.save(p);
    }
    
    @Override
    public void deletePiloto(Piloto p) {
    	pilRep.delete(p);
    }
}