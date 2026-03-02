package ClasesAbstractas;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
    

}
