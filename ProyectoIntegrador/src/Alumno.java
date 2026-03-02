
public class Alumno extends Persona{

    private String matricula;
    private String carrera;

    Materia[] materiasInscritas;

    @Override
    public String toString() {
        return super.toString() + " Alumno [matricula=" + matricula + ", carrera=" + carrera + ", materias=" + materias + "]";
    }

    Materia materias;

    public Alumno(String nombre, int edad, String matricula, String carrera, Materia materias){
        super(nombre,edad);
        this.matricula=matricula;
        this.carrera=carrera;
        this.materias=materias;
    }

    public Alumno(){
        this.materias= new Materia();
    }

    public void inscribirMateria(Materia m){
        this.materias=m;
    }

    public String mostrarMaterias(){
        return materias.toString();
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }


}
