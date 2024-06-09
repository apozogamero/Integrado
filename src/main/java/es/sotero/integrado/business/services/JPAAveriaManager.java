package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Averia;
import es.sotero.integrado.business.repositories.AveriaRepository;

@Service
public class JPAAveriaManager implements AveriaManager {

    @Autowired
    private AveriaRepository aveRep;

    public List<Averia> getAveriaAll() {
        return (List<Averia>) aveRep.findAll();
    }

	@Override
	public Averia getAveria(int id) {
		return aveRep.findByIdAveria(id);
	}
    
    public void addAveria(Averia av) {
    	aveRep.save(av);
    }
    
    public void updateAveria(Averia av) {
    	aveRep.save(av);
    }
    
    public void deleteAveria(Averia av) {
    	aveRep.delete(av);
    }
}