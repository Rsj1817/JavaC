package ClasesAbstractas;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre){
        this.nombre=nombre;
    }

    public Figura() {
    }


    // absctraccion
    public abstract double area();


    public abstract double perimetro();

    // getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void decirNombre(){
        System.out.println("La figura es: " + nombre);
    }



}
