public class Profesor extends Persona{

    private int numeroEmpleado;

    @Override
    public String toString() {
        return super.toString() + " Profesor [numeroEmpleado=" + numeroEmpleado + ", materiaQueImparte=" + materiaQueImparte + "]";
    }

    Materia materiaQueImparte;

    public Profesor(){
        this.materiaQueImparte = new Materia();
    }

    public Profesor(String nombre, int edad, int numeroEmpleado, Materia materiaQueImparte){
        super(nombre,edad);
        this.numeroEmpleado=numeroEmpleado;
        this.materiaQueImparte=materiaQueImparte;
    }

    public void asignarMateria(Materia m){
        this.materiaQueImparte=m;
    }



    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Materia getMateriaQueImparte() {
        return materiaQueImparte;
    }

    public void setMateriaQueImparte(Materia materiaQueImparte) {
        this.materiaQueImparte = materiaQueImparte;
    }


}
