package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Piloto;

public class SimplePilotoManager implements PilotoManager {
	
	private List<Piloto> listaPil;
	private Piloto pil;

    public List<Piloto> getPilotoAll() {
        return listaPil;    
    }
	
    public void setPilotoAll(List<Piloto> listaPil) {
        this.listaPil = listaPil;
    }

	public Piloto getPiloto(String id) {
		return pil;
	}

//    public int averageEdad() {
//    	if (pilotos != null) {
//    		
//    		int suma = 0;
//    		
//            for (Piloto piloto : pilotos) {
//                suma += piloto.getEdad();
//            }
//            
//            int result = suma / pilotos.size();
//            return result;
//        } else {
//        	return -1;
//        }
//	}
}
