package com.juego.lobby.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juego.lobby.models.Jugador;
import com.juego.lobby.repositories.JugadorRepository;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository repositorio;

    //Metodos para obtener a todos los jugadores
    public List<Jugador>obtenerTodos(){
        return repositorio.obtenerTodos();
    }

    public List<Jugador>obtenerJugadoresPro(){

        List<Jugador> todos = repositorio.obtenerTodos();

        List<Jugador> losPro = new ArrayList<>();

        for (Jugador j : todos) {
            
            if(j.getNivel() > 50 && j.getPing() < 50){
                losPro.add(j);
            }
        }
        return losPro;
    }



    

}
