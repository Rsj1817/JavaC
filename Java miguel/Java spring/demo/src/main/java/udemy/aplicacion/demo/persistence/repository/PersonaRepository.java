package udemy.aplicacion.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import udemy.aplicacion.demo.persistence.entities.Persona;

@Service
public interface PersonaRepository extends JpaRepository<Persona, String>{


}
