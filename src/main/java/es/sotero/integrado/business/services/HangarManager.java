package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Hangar;

public interface HangarManager {
    
    public List<Hangar> getHangarAll();
    
    public Hangar getHangar(int id);
}