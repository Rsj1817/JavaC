import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {

    static String bd = "concesionario";
    static String port = "3306";
    static String login = "root";
    static String password = "rootroot";
    static String url = "jdbc:mariadb://localhost:" + port + "/" + bd;

    Connection connection = null;

    public DBconnection(){

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,password);

            if (connection == null) {
                System.out.println("La conexion con" + bd + " a fallado");
            }
            else{
                System.out.println("Conexion csatisfactoria");
            }
        }
        catch(Exception ex){
            System.out.println("Uy casi, error " + ex.getMessage());
        }
        
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }

}
