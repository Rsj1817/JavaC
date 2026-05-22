public class Electrico extends Vehiculo {

    private double precio;
    

    @Override
    public String toString() {
        return super.toString() + " Electrico [precio=" + precio + "]";
    }

    public Electrico(int numBastidor, double peso, double precio){
        super(numBastidor,peso);
        this.precio=precio;
    }

    public Electrico(){
        
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double impuestoBase(){
        return super.impuestoBase() + 0.09 * precio;
    }




}
