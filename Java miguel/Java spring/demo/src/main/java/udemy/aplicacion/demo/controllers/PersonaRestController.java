package udemy.aplicacion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

    @Autowired
    private PersonaService PersonaService;

    @PostMapping
    private ResponseEntity<?> addPersona(@RequestBody Persona persona){
        PersonaService.addPersona(persona);
        return ResponseEntity.ok(persona);
    }

}
