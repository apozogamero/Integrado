package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Hangar;

public class SimpleHangarManager implements HangarManager {
	
	private List<Hangar> listaHan;
	private Hangar han;

    public List<Hangar> getHangarAll() {
        return listaHan;    
    }
	
    public void setHangarAll(List<Hangar> listaHan) {
        this.listaHan = listaHan;
    }

	public Hangar getHangar(int id) {
		return han;
	}
}