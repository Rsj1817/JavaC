package ClasesAbstractas;

public class Triangulo extends Figura{

    private double lado;
    private double altura;

    public Triangulo(String nombre, double lado, double altura){
        super(nombre);
        this.lado=lado;
        this.altura=altura;
    }

    @Override
    public double area() {
        
        return (lado*altura)/2;
    }

    @Override
    public double perimetro() {

        return lado * 3;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    



}
