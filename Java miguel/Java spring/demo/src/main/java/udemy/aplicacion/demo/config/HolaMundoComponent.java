package udemy.aplicacion.demo.config;

import org.springframework.stereotype.Component;

@Component
public class HolaMundoComponent {

    private int numero;

    public HolaMundoComponent(){
        super();
        this.numero = (int)Math.floor(Math.random()*10+1);
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
