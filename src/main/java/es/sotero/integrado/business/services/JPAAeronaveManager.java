package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Aeronave;
import es.sotero.integrado.business.repositories.AeronaveRepository;

@Service
public class JPAAeronaveManager implements AeronaveManager {

    @Autowired
    private AeronaveRepository aerRep;

    public List<Aeronave> getAeronaveAll() {
        return (List<Aeronave>) aerRep.findAll();
    }

	@Override
	public Aeronave getAeronave(int id) {
		return aerRep.findByIdAeronave(id);
	}
    
    @Override
    public void addAeronave(Aeronave a) {
    	aerRep.save(a);
    }
    
    @Override
    public void updateAeronave(Aeronave a) {
    	aerRep.save(a);
    }
	
    @Override
	public void deleteAeronave(Aeronave a) {
		aerRep.delete(a);
	}
}