package udemy.aplicacion.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cglib.beans.BeanMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.aplicacion.demo.persistence.entities.Persona;

@RestController
public class HolaMundoRestController {

    List<Persona> personas = new ArrayList<Persona>(Arrays.asList(
        new Persona ("Miguel",30),
        new Persona("Jose",5)
    ));

    @GetMapping("/hola")
    public String saludo(){
        System.out.println("Ejecutando enpont /hola");
        return "Hola mundo";
    }

    @GetMapping("/mayoresEdad")
    public int mayoresEdad(){

        int contador = 0;
        for (Persona p : personas) {
            if(p.getEdad() > 18){
                contador++;
            }
            
        }
        return contador;
    };

}
