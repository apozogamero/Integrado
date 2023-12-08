package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Patrulla;

public interface PatrullaManager {
    
    public List<Patrulla> getPatrullaAll();
    
    public Patrulla getPatrulla(int id);
}