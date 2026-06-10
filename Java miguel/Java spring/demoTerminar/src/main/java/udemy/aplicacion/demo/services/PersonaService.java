package udemy.aplicacion.demo.services;

import java.util.List;

import udemy.aplicacion.demo.persistence.entities.Persona;

public interface PersonaService {

    public Persona addPersona(Persona persona);

    public List<Persona>getPersona();

    public Persona updatePersona(Persona persona);

    public Persona deletePersona(String nombre);
}
