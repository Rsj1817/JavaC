package udemy.aplicacion.demo.services;

import java.util.List;

import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.persistence.repository.HolaMundoRepository;

public class HolaMundoServiceImpl implements  HolaMundoService{

    HolaMundoRepository repository = new HolaMundoRepository();

    public int mayoresEdad(){

        List<Persona> personas = repository.gePersonas();

        int contador = 0;
        for (Persona p : personas) {
            if(p.getEdad() > 18){
                contador++;
            }
            
        }
        return contador;
    };


}
