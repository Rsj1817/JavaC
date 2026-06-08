package udemy.aplicacion.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import udemy.aplicacion.demo.config.ClasePrueba;
import udemy.aplicacion.demo.config.HolaMundoComponent;
import udemy.aplicacion.demo.config.PropsComponent;
import udemy.aplicacion.demo.persistence.entities.Persona;
import udemy.aplicacion.demo.services.HolaMundoService;



@RestController
@RequestMapping("/pruebas")
public class HolaMundoRestController {

    //esto es inyeccion de dependencias
    //se desacopla las capas controller, persistence y service
    @Autowired
    private HolaMundoService servicio;

    @Autowired
    private HolaMundoComponent holaMundoComponent;

    @Autowired
    private PropsComponent props;

    @Autowired
    private ClasePrueba clasePrueba;

    @GetMapping("/hola")
    public ResponseEntity<String> saludo(){
        System.out.println("Ejecutando enpont /hola");
        String s = "Hola mundo. Bienvenido a Spring boot";
        return ResponseEntity.ok(s);
    }

    @GetMapping("/mayoresEdad")
    public ResponseEntity<Integer> mayoresEdad(){

        Integer i = servicio.mayoresEdad();
        return ResponseEntity.ok(i);
    };

    //Aqui cambia por que se antandariza a la norma apiRest
    @GetMapping("/parametros")
    public ResponseEntity<String> parametros1(@RequestParam String parametro){
        String s =  "Recibiendo parametros con valor " + parametro; 
        return ResponseEntity.ok(s);
    };

    @GetMapping("/parametros/{parametro2}")
    public ResponseEntity<String> parametros2(@PathVariable String parametro2) {
        String s =  "Recibiendo path variable con valor " + parametro2; 
        return ResponseEntity.ok(s);
    }
    
    @PostMapping("/parametros")
    public ResponseEntity<String> postMethodName(@RequestBody Persona persona) {
        
        String s = "Recibiendo a la persona con nombre " + persona.getNombre();
        return ResponseEntity.ok(s);
    }
    
    @GetMapping("/componentes")
    public ResponseEntity<Integer> componente(){
        Integer in = holaMundoComponent.getNumero();
        return ResponseEntity.ok(in);
    }
    
    @GetMapping("/props")
    public ResponseEntity<String> getProps() {
        String valor1 = props.getValor1();
        String valor2 = props.getValor2();
        String s = "Valor 2 " + valor1 + " Valor 2 " + valor2;
        return ResponseEntity.ok(s);
    }
    
    @GetMapping("/bean")
    public ResponseEntity<String> beans() {
        String s = clasePrueba.getNombre();
        return ResponseEntity.ok(s);
    }
    

}
