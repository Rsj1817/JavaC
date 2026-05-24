package udemy.aplicacion.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.persistence.repository.PersonaRepository;

public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona addPersona(Persona persona) {
        return personaRepository.save(persona);
    }


}
