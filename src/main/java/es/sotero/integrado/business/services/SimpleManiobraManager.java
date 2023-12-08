package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Maniobra;

public class SimpleManiobraManager implements ManiobraManager {
	
	private List<Maniobra> listaMan;
	private Maniobra man;

    public List<Maniobra> getManiobraAll() {
        return listaMan;    
    }
	
    public void setManiobraAll(List<Maniobra> listaMan) {
        this.listaMan = listaMan;
    }

	public Maniobra getManiobra(int id) {
		return man;
	}
}