package ClasesAbstractas;

public class Prueba {

    public static void main(String[] args) {
        /* 
        Figura f1 = new Figura("Triangulo");
        Figura f2 = new Figura("Cuadrado");

        f1.decirNombre();
        f2.decirNombre();*/

        Cuadrado c1 = new Cuadrado("cuadrado", 5);
        Triangulo t1 = new Triangulo("trianglo", 6, 4);

        System.out.println(c1.area());
        System.out.println(c1.perimetro());


        System.out.println(t1.area());
        System.out.println(t1.perimetro());

        Figura f = new Cuadrado("Cuadrado", 6);
        Figura f2 = new Triangulo("Triangulo", 3, 2);
        Figura f3 = new Triangulo("Triangulo", 8, 3);
        Figura f4 = new Triangulo("Triangulo", 3, 9);
        Figura f5 = new Cuadrado("Cuadrado", 3);

        System.out.println(f.area());

        System.out.println("----------------------------------------------------------");

        Figura[] figuras = new Figura[5];
        figuras[0] = f;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;

        for (Figura fig: figuras) {
            System.out.println(fig.area());
        }

    }

}
