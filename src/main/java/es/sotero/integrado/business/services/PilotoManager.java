package es.sotero.integrado.business.services;

import java.io.Serializable;
import java.util.List;

import es.sotero.integrado.business.entities.Piloto;

public interface PilotoManager extends Serializable {
	
	public int averageEdad();
    
    public List<Piloto> getPilotos();
}
