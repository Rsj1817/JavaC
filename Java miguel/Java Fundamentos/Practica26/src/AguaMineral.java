public class AguaMineral extends Bebida{

    private String origen;

    public AguaMineral(){
        
    }


    public AguaMineral(int id, double capacidad, String marca, double precio, String origen){
        super(id,capacidad,marca,precio);
        this.origen=origen;
    }

    //getter and setter
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +  " AguaMineral [origen=" + origen + "]";
    }


    

}
