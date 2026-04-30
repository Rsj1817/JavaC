
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aplicacion {

    private static int indice = 0;
    private static List<Coche>coches  = new ArrayList<Coche>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cargarCoche();

        if (coches.isEmpty()) {
            System.out.println("No hay coches para mostrar.");
            sc.close();
            return;
        }

        mostrarCoche();
        mostrarMenu();

        int op = sc.nextInt();

        while (op != 3) {
            
            if(op == 1){
                
                if(indice == coches.size() - 1){
                    indice = 0;
                }else{
                    indice++;
                }

                mostrarCoche();

            }
            else if(op== 2){

                if(indice == 0){
                    indice = coches.size() - 1;

                }else{
                    indice --;
                }
                    mostrarCoche();
                
            }
            
            mostrarMenu();
            op = sc.nextInt();

        }

        sc.close();
        
    }

    public static void cargarCoche(){
        DBconnection con = new DBconnection();
        String sql = "SELECT * FROM coches";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                String matricula = rs.getString("matricula");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String color = rs.getString("color");
                int anio = rs.getInt("anio");
                int precio = rs.getInt("precio");

                Coche c1  = new Coche(matricula, marca, modelo, color, anio, precio);
                coches.add(c1);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        con.desconectar();
    }

    public static void mostrarCoche(){
        System.out.println(coches.get(indice).toString());
    }

    public static void mostrarMenu() {
        System.out.println("1 siguiente");
        System.out.println("2 anterior");
        System.out.println("3 salir");

        System.out.println("Elije una opcion");
    }


}
