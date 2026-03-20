package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
        
        //set objetos que no estan repetidos
        //HashSet no tiene un orden
        Set<String> conjunto1  = new HashSet<String>();
        conjunto1.add("Hola");

        //List si admite elementos duplicados y tiene una posicion
        //ArrayList
        List<Libro> conjunto2 = new ArrayList<Libro>();
        
        
        //Map
        //HashMap
        Map<String, Libro> conjunto3 = new HashMap<String, Libro>();
        

        

    }



}
