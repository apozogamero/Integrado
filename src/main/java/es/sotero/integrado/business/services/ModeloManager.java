package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Modelo;

public interface ModeloManager {
    
    public List<Modelo> getModeloAll();
    
    public Modelo getModelo(int id);
    
    public void addModelo(Modelo m);
    
    public void updateModelo(Modelo m);
    
    public void deleteModelo(Modelo m);
}