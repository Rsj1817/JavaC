package udemy.aplicacion.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.persistence.repository.HolaMundoRepository;

@Service
public class HolaMundoServiceImpl implements  HolaMundoService{

    //ESTO ES La inyeccion de dependencias
    @Autowired
    HolaMundoRepository repository;

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
