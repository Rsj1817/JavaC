public class Vehiculo {

    private int numBastidor;
    private double peso;

    @Override
    public String toString() {
        return "Vehiculo [numBastidor=" + numBastidor + ", peso=" + peso + "]";
    }

    public Vehiculo(int numBastidor, double peso){
        this.numBastidor=numBastidor;
        this.peso=peso;
    }

    public Vehiculo(){
        
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double impuestoBase(){
        return 0.45*peso;
    }



}
