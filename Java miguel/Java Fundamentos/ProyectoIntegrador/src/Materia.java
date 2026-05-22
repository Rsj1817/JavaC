public class Materia {

    private String nombreMateria;
    private int creditos;
    private double calificacion;

    @Override
    public String toString() {
        return "Materia [nombreMateria=" + nombreMateria + ", creditos=" + creditos + ", calificacion=" + calificacion
                + "]";
    }

    public boolean estaAprobada(){
        if(calificacion >= 7){
            return true;
        }else{
            return false;
        }
    }

    public Materia(String nombreMateria, int creditos, double calificacion){
        this.nombreMateria=nombreMateria;
        this.creditos=creditos;
        this.calificacion=this.calificacion-1+calificacion;
    }


    public Materia() {
        this.calificacion=-1;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }



}
