package udemy.aplicacion.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.aplicacion.demo.services.HolaMundoServiceImpl;

@RestController
public class HolaMundoRestController {

    private HolaMundoServiceImpl servicio = new HolaMundoServiceImpl();


    @GetMapping("/hola")
    public String saludo(){
        System.out.println("Ejecutando enpont /hola");
        return "Hola mundo";
    }

    @GetMapping("/mayoresEdad")
    public int mayoresEdad(){

        return servicio.mayoresEdad();
    };

}
