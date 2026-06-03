package com.juego.lobby.models;

public class Jugador {

    private String nombre;
    private int nivel;
    private int ping;
    private int puntos;



    //Crear contructor vacia
    public Jugador(){

    }

    //constructor con parametros
    public Jugador(String nombre, int nivel, int ping, int puntos){
        this.nombre=nombre;
        this.nivel=nivel;
        this.ping=ping;
        this.puntos=puntos;
    }

    //Crear getter and setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }



}
