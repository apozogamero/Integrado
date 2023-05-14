package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Piloto;

public class SimplePilotoManager implements PilotoManager {

	private static final long serialVersionUID = 1L;
	
	private List<Piloto> pilotos;

    public List<Piloto> getPilotos() {
        return pilotos;    
    }

    public int averageEdad() {
    	if (pilotos != null) {
    		
    		int suma = 0;
    		
            for (Piloto piloto : pilotos) {
                suma += piloto.getEdad();
            }
            
            int result = suma / pilotos.size();
            return result;
        } else {
        	return -1;
        }
	}
	
    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;      
    }
}
