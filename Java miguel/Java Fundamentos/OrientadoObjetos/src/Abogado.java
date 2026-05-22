public class Abogado extends Empleado{

    private int numeroCol;

    @Override
    public String toString() {
        return super.toString() + " Abogado [numeroCol=" + numeroCol + "]";
    }

    public Abogado(){

    }

    public Abogado(String dni, String nombre, double salario, Nacionalidad nacionalidad,int numeroCol){
        super(dni, nombre, salario, nacionalidad);
        this.numeroCol=numeroCol;
    }

    public int getNumeroCol() {
        return numeroCol;
    }

    public void setNumeroCol(int numeroCol) {
        this.numeroCol = numeroCol;
    }


}
