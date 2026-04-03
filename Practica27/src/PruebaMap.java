import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PruebaMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> alumnos = new HashMap<String, Integer>();
        System.out.println();
        int opcion = -1;

        while (opcion != 2) {

            System.out.println("Introduce la opcion que deseas: ");
            System.out.println("1- Introducir asignatura y creditos ");
            System.out.println("2- Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            

            if (opcion == 1) {
                System.out.println("Introduce el nombre de la asignatura");
                String asignatura = sc.nextLine();
                System.out.println("Introduce los creditos de esa asignatura");
                int creditos = sc.nextInt();
                alumnos.put(asignatura, creditos);
            }
        }

        int totalCreditos = 0;

        for(String asig: alumnos.keySet()){
            totalCreditos = totalCreditos + alumnos.get(asig);
        }

        System.out.println("El numero de creditos que estas curson es " + totalCreditos);

    }

}
