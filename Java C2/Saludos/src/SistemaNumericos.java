public class SistemaNumericos {

    public static void main(String[] args) {
        

        int numeroDecimal = 500;
        System.out.println("Tu numero es " + numeroDecimal);

        System.out.println("Tu binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println(numeroBinario);

        System.out.println(Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764;

        System.out.println(numeroOctal);

        System.out.println(Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;

        System.out.println(numeroHex);

    }


}
