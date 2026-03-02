public class App {
    public static void main(String[] args) throws Exception {
        
        Nacionalidad nacionalidad1 = new Nacionalidad(2,"Mexico");
        Nacionalidad nacionalidad2 = new Nacionalidad();

        
        Empleado empleado1 = new Empleado("20243DS185","Luis angel",1500,nacionalidad1);
        Empleado empleado2 = new Empleado("20243DS185","Luis angel",1500,nacionalidad1);
        System.out.println( empleado1.getClass());

  

        if(empleado1.equals(empleado2)){
            System.out.println("iguales");
        }else{
            System.out.println("Distintos");
        }

        /* 
        empleado2.incrementarSalario(500);
        
        System.out.println(empleado1.toString());

        System.out.println(empleado2.toString());

        empleado2.setDni("20243DS167");
        System.out.println(empleado2.getDni());

        System.out.println(Empleado.getNumero());

        empleado1.getNacionalidad().setNombre("Brasil");
        System.out.println(empleado1.getNacionalidad().getNombre());*/


        Informatico info1 = new Informatico("20256GF","Miguel",1500,nacionalidad1,"Java");
        Abogado abo1 = new Abogado("9023CDDF","Luis Angel",200,nacionalidad2,12);

        Empleado[] empleados ={info1, abo1};
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        info1.incrementarSalario(200);
        System.out.println(info1.getSalario());

        abo1.incrementarSalario(200);
        System.out.println(abo1.getSalario());


    }
}
