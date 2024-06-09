package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Patrulla;

public interface PatrullaManager {
    
    public List<Patrulla> getPatrullaAll();
    
    public Patrulla getPatrulla(int id);
    
    public void addPatrulla(Patrulla p);
    
    public void updatePatrulla(Patrulla p);
    
    public void deletePatrulla(Patrulla p);
}