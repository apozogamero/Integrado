package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Averia;

public class SimpleAveriaManager implements AveriaManager {
	
	private List<Averia> listaAve;
	private Averia ave;

    public List<Averia> getAveriaAll() {
        return listaAve;    
    }
	
    public void setAveriaAll(List<Averia> listaAve) {
        this.listaAve = listaAve;
    }

	public Averia getAveria(int id) {
		return ave;
	}
}