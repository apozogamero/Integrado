package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Maniobra;
import es.sotero.integrado.business.repositories.ManiobraRepository;

@Service
public class JPAManiobraManager implements ManiobraManager {

    @Autowired
    private ManiobraRepository manRep;

    public List<Maniobra> getManiobraAll() {
        return (List<Maniobra>) manRep.findAll();
    }

	@Override
	public Maniobra getManiobra(int id) {
		return manRep.findByIdManiobra(id);
	}
    
    public void addManiobra(Maniobra m) {
    	manRep.save(m);
    }
    
    public void updateManiobra(Maniobra m) {
    	manRep.save(m);
    }
    
    public void deleteManiobra(Maniobra m) {
    	manRep.delete(m);
    }
}