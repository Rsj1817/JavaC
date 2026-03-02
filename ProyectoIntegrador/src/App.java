public class App {
    public static void main(String[] args) throws Exception {

        Materia m1 = new Materia("matematicas",12,7);
        Materia m2 = new Materia("Programacion",7,10);
        Materia m3 = new Materia("Calculo",23,6);

        Profesor p1 = new Profesor("Juan",45,12,m1);

        Alumno a1 = new Alumno("Ana",20,"20243DS123","Ing en sistemas",m2);
        Alumno a2 = new Alumno("Luis",21,"20243DS908","Ciberseguridad",m2);

        Persona[] personas = {p1,a1,a2};

        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println();

        a1.inscribirMateria(m3);
        a2.materias.setCalificacion(6);

        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println(a1.materias.estaAprobada());
    }
}
