package Interfaces;

public class Clase1 implements Interfaz1, Interfaz2{

    @Override
    public void metodo1() {
        System.out.println("Implementado metodo 1");
        
    }

    @Override
    public String metodo2(int n) {
        return "hecho";
    }

    @Override
    public void metodo3() {
        System.out.println("IMplementado metodo 3");
    }


}
