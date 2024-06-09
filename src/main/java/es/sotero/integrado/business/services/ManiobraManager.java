package es.sotero.integrado.business.services;

import java.util.List;

import es.sotero.integrado.business.entities.Maniobra;

public interface ManiobraManager {
    
    public List<Maniobra> getManiobraAll();
    
    public Maniobra getManiobra(int id);
    
    public void addManiobra(Maniobra m);
    
    public void updateManiobra(Maniobra m);
    
    public void deleteManiobra(Maniobra m);
}