import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class AccesoDB {

    public static void main(String[] args) {
        
        //insertarAlumno();
        //actualizarAlumno();
        //eliminarAlumno();
        seleccionarAlumno();



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

    public static void actualizarAlumno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el di del alumno que deseas actualizar");
        String id = sc.nextLine();
        System.out.println("Ingresa la nueva edd que deseas que tenga el alumno");
        int edad = sc.nextInt();
        sc.close();

        DBConnection con = new DBConnection();
        String sql = "UPDATE Alumno SET Edad = " + edad + " WHERE id = '" + id + "'";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeQuery(sql);
            System.out.println("Alumno actualizado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void eliminarAlumno(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el id del alumno que deseas aliminar");
        String id = sc.nextLine();
        sc.close();

        DBConnection con = new DBConnection();
        String sql = "DELETE FROM Alumno WHERE id = '" + id + "'";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeQuery(sql);
            System.out.println("Alumno eliminado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static void seleccionarAlumno(){

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM Alumno";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("Nombre");
                int edad = rs.getInt("Edad");
                System.out.println("Alumno con id " + id + " Nombre " + nombre + " y edad " + edad);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
