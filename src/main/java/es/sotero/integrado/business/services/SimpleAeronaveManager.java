package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Aeronave;

public class SimpleAeronaveManager implements AeronaveManager {
	
	private List<Aeronave> listaAer;
	private Aeronave aer;

    public List<Aeronave> getAeronaveAll() {
        return listaAer;    
    }
	
    public void setAeronaveAll(List<Aeronave> listaAer) {
        this.listaAer = listaAer;
    }

	public Aeronave getAeronave(String id) {
		return aer;
	}
}