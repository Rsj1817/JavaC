
public class Empleado {

    //Atributos de empleado
    private String dni;
    private String nombre;
    private double salario;

    //composicion
    private Nacionalidad nacionalidad;

    private static int numero=0;

    public void incrementarSalario(double incremento){
        salario=salario+incremento;
    }

    public Empleado(String dni, String nombre, double salario, Nacionalidad nacionalidad){
        this.dni=dni;
        this.nombre=nombre;
        this.salario=salario;
        this.nacionalidad=nacionalidad;
        numero++;
    }

    public Empleado(){
        this.dni="Sin registro";
        numero++;
        //inicializada sin parametros
        nacionalidad = new Nacionalidad();
    }

    @Override
    public String toString(){
        return this.dni + ", " + this.nombre + ", " + this.salario + this.nacionalidad.toString();
    }

    //getter and setter
    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getNumero(){
        return numero;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean equals(Empleado e){
        if(this.dni.equals(e.getDni())){
            return true;
        }else{
            return false;
        }
    }

    


}
