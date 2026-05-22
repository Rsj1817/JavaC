public class App {
    public static void main(String[] args) throws Exception {
        
        AguaMineral b1 = new AguaMineral(1,1,"Ciel",12.90,"Rio Negro");
        AguaMineral b2 = new AguaMineral(2,.700,"E pura",13,"Manantial");

        BebidaAzucarada b3 = new BebidaAzucarada(3,1,"Coca cola",40,56);
        BebidaAzucarada b4 = new BebidaAzucarada(4,0.5,"Bonafont",21,34);

        Almacen almacen = new Almacen();
        almacen.agregarBebida(b1);
        almacen.agregarBebida(b2);
        almacen.agregarBebida(b3);
        almacen.agregarBebida(b4);
        almacen.eliminarBebida(b2);

        System.out.println(almacen.precioTotalMarca("Ciel"));
        System.out.println(almacen.precioTotal());
        almacen.mostrarInformacion();

    }
}
