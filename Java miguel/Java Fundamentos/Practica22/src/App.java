public class App {
    public static void main(String[] args) throws Exception {
        Fecha f1 = new Fecha(7,4,1995);
        Fecha f2 = new Fecha(17,12,2005);
        Fecha f3 = new Fecha(3,1,2005);

        Persona p1 = new Persona("Rigoberto","Sanchez Jimenez",f1);
        Persona p2 = new Persona("Veronica","Sanchez Jimenez",f2);
        Persona p3 = new Persona("Luis Angel","Mirinda Piedraza",f3);

        Persona[] personas = {p1,p2,p3};

        for (Persona persona : personas) {
            System.out.println(persona.getFecha_nacimiento().toString());
        }

    }
}
