package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Aeronave;

public interface AeronaveManager {
    
    public List<Aeronave> getAeronaveAll();
    
    public Aeronave getAeronave(int id);
    
    public void deleteAeronave(int id);
}