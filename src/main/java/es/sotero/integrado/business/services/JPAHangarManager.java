package es.sotero.integrado.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.integrado.business.entities.Hangar;
import es.sotero.integrado.business.repositories.HangarRepository;

@Service
public class JPAHangarManager implements HangarManager {

    @Autowired
    private HangarRepository hanRep;

    public List<Hangar> getHangarAll() {
        return (List<Hangar>) hanRep.findAll();
    }

	@Override
	public Hangar getHangar(int id) {
		return hanRep.findByIdHangar(id);
	}
    
	@Override
    public void addHangar(Hangar h) {
    	hanRep.save(h);
    }
    
	@Override
    public void updateHangar(Hangar h) {
    	hanRep.save(h);
    }
    
    @Override
    public void deleteHangar(Hangar h) {
    	hanRep.delete(h);
    }
}