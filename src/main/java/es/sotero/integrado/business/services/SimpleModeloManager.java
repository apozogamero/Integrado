package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Modelo;

public class SimpleModeloManager implements ModeloManager {
	
	private List<Modelo> listaMod;
	private Modelo mod;

    public List<Modelo> getModeloAll() {
        return listaMod;    
    }
	
    public void setModeloAll(List<Modelo> listaMod) {
        this.listaMod = listaMod;
    }

	public Modelo getModelo(int id) {
		return mod;
	}
}