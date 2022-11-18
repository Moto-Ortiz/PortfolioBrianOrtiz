package com.portfoliobrianortiz.BrianOrtiz.Interface;

import com.portfoliobrianortiz.BrianOrtiz.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void SavePersona(Persona persona);
    
    //Eliminar un objeto pero lo eliminamos por ID
    public void DeletePersona(Long id);
    
    
    //Buscar una persona por ID
    
    public Persona FindPersona(Long id);
   

}
