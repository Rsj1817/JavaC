public class Combustion extends Vehiculo{

    private int cilindrada;


    @Override
    public String toString() {
        return super.toString() + " Combustion [cilindrada=" + cilindrada + "]";
    }

    public Combustion(int numBastidor, double peso, int cilindrada){
        super(numBastidor,peso);
        this.cilindrada=cilindrada;
    }

    public Combustion(){
        
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double impuestoBase(){
        return super.impuestoBase() + 3*cilindrada;
    }

}
