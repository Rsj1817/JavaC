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
        conjunto1.add("adios");

        for (String s : conjunto1) {
            System.out.println(s);
        }

        //List si admite elementos duplicados y tiene una posicion
        //ArrayList
        List<Libro> conjunto2 = new ArrayList<Libro>();
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        conjunto2.add(libro1);
        conjunto2.add(1, libro2);
        conjunto2.isEmpty();

        for(Libro l: conjunto2){
            System.out.println(l.toString());
        }
        
        System.out.println();
        
        //Map
        //HashMap
        Map<String, Libro> conjunto3 = new HashMap<String, Libro>();
        conjunto3.put("Elemento1", libro1);
        conjunto3.put("Elemto2", libro2);
        conjunto3.get("Elemto1");
        for(String clave:conjunto3.keySet()){
            Libro l = (Libro) conjunto3.get(clave);
            System.out.println(l.toString());
        }
        
        
        
    }



}
