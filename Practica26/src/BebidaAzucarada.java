public class BebidaAzucarada extends Bebida{

    private double porcentajeAzucar;

    public BebidaAzucarada(int id, double capacidad, String marca, double precio, double porcentajeAzucar){
        super(id,capacidad,marca,precio);
        this.porcentajeAzucar=porcentajeAzucar;
    }
    
    public BebidaAzucarada(){
        
    }


       //getter and setter
    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " BebidaAzucarada [porcentajeAzucar=" + porcentajeAzucar + "]";
    }


}
