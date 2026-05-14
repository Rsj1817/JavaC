package udemy.aplicacion.demo.persistence.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import udemy.aplicacion.demo.persistence.entities.Persona;

public class HolaMundoRepository {


    List<Persona> personas = new ArrayList<Persona>(Arrays.asList(
        new Persona ("Miguel",30),
        new Persona("Jose",5)
    ));

    public List<Persona>gePersonas(){
        return personas;
    }

}
