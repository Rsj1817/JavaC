package com.juego.lobby.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juego.lobby.models.Jugador;
import com.juego.lobby.services.JugadorService;


@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {

    @Autowired
    private JugadorService servicio;

    @GetMapping
    public List<Jugador>mostrarTodos(){
        return servicio.obtenerTodos();
    }

    @GetMapping("/pro")
    public List<Jugador>mostrarPros(){
        return servicio.obtenerJugadoresPro();
    }
    

}
