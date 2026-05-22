package udemy.aplicacion.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolaMundoBean {

    @Bean
    public ClasePrueba bean1(){
        return new ClasePrueba("Clase instanciada por un Bean");
    }
}
