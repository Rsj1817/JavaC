public class Informatico extends Empleado{

    private String lenguajeProgramacion;

    @Override
    public String toString() {
        return super.toString() + " Informatico [lenguajeProgramacion=" + lenguajeProgramacion + "]";
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Informatico(){

    }

    public Informatico(String dni, String nombre, double salario, Nacionalidad nacionalidad, String lenguajeProgramacion){
        super(dni, nombre, salario, nacionalidad);
        this.lenguajeProgramacion=lenguajeProgramacion;
    }

    public void decirLenguajeDominante(){
        System.out.println("El lenguaje que domino es: " + lenguajeProgramacion);
    }

    public void incrementarSalario(double salario){
        super.setSalario(super.getSalario() + 100 + salario);
    }




}
