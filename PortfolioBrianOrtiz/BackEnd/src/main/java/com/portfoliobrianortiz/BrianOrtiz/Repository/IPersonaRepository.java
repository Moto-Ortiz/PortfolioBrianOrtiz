package com.portfoliobrianortiz.BrianOrtiz.Repository;

import com.portfoliobrianortiz.BrianOrtiz.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
