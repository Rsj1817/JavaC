public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta cuenta1 = new Cuenta("Luis Angel");
        Cuenta cuenta2 = new Cuenta("Judas");

        cuenta1.ingresar(200);
        cuenta2.ingresar(500);

        cuenta1.ingresar(-100);

        System.out.println(cuenta1.getCantidad());
        System.out.println(cuenta2.getCantidad());

        cuenta2.retirar(499);

        System.out.println(cuenta2.getCantidad());

        cuenta2.ingresar(4);

        System.out.println(cuenta2.toString());


    }
}
