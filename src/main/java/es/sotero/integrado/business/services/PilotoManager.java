package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Piloto;

public interface PilotoManager {
    
    public List<Piloto> getPilotoAll();
    
    public Piloto getPiloto(int id);
    
    public void addPiloto(Piloto p);
    
    public void updatePiloto(Piloto p);
    
    public void deletePiloto(Piloto p);
}