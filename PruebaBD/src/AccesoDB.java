import java.sql.Statement;
import java.util.Scanner;

public class AccesoDB {

    public static void main(String[] args) {
        
        insertarAlumno();



    }


    public static void insertarAlumno(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertar el dni del Alumno");
        String dni = sc.nextLine();
        System.out.println("Ingrea el nombre del alumni");
        String nombre = sc.nextLine();
        System.out.println("Inserte la edad");
        int edad = sc.nextInt();
        sc.close();

        DBConnection con = new DBConnection();
        String sql = "INSERT INTO Alumno VALUES( '" + dni + "','" + nombre + "'," + edad + ")"; 


        try {
            Statement st = con.getConnection().createStatement();
            st.executeQuery(sql);
            System.out.println("Inserccion realizada");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        con.desconectar();

    }



}
