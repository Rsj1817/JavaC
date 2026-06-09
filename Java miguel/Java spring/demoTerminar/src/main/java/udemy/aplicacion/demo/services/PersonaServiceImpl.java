package udemy.aplicacion.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.persistence.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona addPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> getPersona() {
        return personaRepository.findAll();
    }

    @Override
    public Persona updatePersona(Persona persona) {
        Persona p = personaRepository.findByNombre(persona.getNombre());
        if(p != null){
            p.setEdad(persona.getEdad());
            return personaRepository.save(p);
        }else{
            return null;
        }
    }

    @Override
    public Persona deletePersona(String nombre) {
        Persona p = personaRepository.findByNombre(nombre);
        personaRepository.delete(p);
        return p;
    };

    


}
