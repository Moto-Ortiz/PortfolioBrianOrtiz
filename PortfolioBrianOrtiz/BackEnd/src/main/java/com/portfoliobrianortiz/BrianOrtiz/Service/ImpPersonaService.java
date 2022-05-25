package com.portfoliobrianortiz.BrianOrtiz.Service;

import com.portfoliobrianortiz.BrianOrtiz.Entity.Persona;
import com.portfoliobrianortiz.BrianOrtiz.Interface.IPersonaService;
import com.portfoliobrianortiz.BrianOrtiz.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void SavePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void DeletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona FindPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona findPersona(long l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
