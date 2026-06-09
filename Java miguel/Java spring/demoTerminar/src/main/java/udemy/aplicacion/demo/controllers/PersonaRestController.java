package udemy.aplicacion.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {


    @Autowired
    private PersonaService personaService;


    @PostMapping
    private ResponseEntity<?> addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
        return ResponseEntity.ok(persona);
    }

    @GetMapping
    private ResponseEntity<?> getPersona(){
        List<Persona> personas = personaService.getPersona();
        return ResponseEntity.ok(personas);
    };

    @PutMapping
    private ResponseEntity<?>updatePersona(@RequestBody Persona persona){
        Persona p = personaService.updatePersona(persona);
        return ResponseEntity.ok(p);
    };

    @DeleteMapping("/{nombre}")
    private ResponseEntity<?> deletePersona(@PathVariable String nombre){
        Persona p = personaService.deletePersona(nombre);
        return ResponseEntity.ok(p);
    };
}
