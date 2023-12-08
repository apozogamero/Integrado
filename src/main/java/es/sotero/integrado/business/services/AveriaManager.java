package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Averia;

public interface AveriaManager {
    
    public List<Averia> getAveriaAll();
    
    public Averia getAveria(int id);
}