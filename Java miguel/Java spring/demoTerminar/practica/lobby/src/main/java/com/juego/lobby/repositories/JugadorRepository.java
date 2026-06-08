package com.juego.lobby.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.juego.lobby.models.Jugador;

@Repository
public class JugadorRepository {

    private List<Jugador>jugadoresConectados = new ArrayList<>();

    public JugadorRepository(){
        jugadoresConectados.add(new Jugador("Faker",99,15,5000));
        jugadoresConectados.add(new Jugador("Peter parker",45,99,890));
        jugadoresConectados.add(new Jugador("Tio ben",123,90,300));
    }

    public List<Jugador>obtenerTodos(){
        return jugadoresConectados;
    }

    public void guardar(Jugador ju){ 
        jugadoresConectados.add(ju);
    }
    

}
