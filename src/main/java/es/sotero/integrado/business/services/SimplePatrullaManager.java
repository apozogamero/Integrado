package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Patrulla;

public class SimplePatrullaManager implements PatrullaManager {
	
	private List<Patrulla> listaPat;
	private Patrulla pat;

    public List<Patrulla> getPatrullaAll() {
        return listaPat;    
    }
	
    public void setPatrullaAll(List<Patrulla> listaPat) {
        this.listaPat = listaPat;
    }

	public Patrulla getPatrulla(int id) {
		return pat;
	}
}