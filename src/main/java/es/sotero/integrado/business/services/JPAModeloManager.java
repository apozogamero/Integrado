package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Modelo;
import es.sotero.integrado.business.repositories.ModeloRepository;

@Service
public class JPAModeloManager implements ModeloManager {

    @Autowired
    private ModeloRepository modRep;

    public List<Modelo> getModeloAll() {
        return (List<Modelo>) modRep.findAll();
    }

	@Override
	public Modelo getModelo(int id) {
		return modRep.findByIdModelo(id);
	}
    
    public void addModelo(Modelo m) {
    	modRep.save(m);
    }
    
    public void updateModelo(Modelo m) {
    	modRep.save(m);
    }
    
    public void deleteModelo(Modelo m) {
    	modRep.delete(m);
    }
}