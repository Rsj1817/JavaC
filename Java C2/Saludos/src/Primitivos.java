public class Primitivos {

    public static void main(String[] args) {

        byte valorByte = 127;

        System.out.println("w " + valorByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en byte a " + Byte.MAX_VALUE);
        System.out.println("Tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("Valor " + String.CASE_INSENSITIVE_ORDER);

        System.out.println(Integer.MAX_VALUE);

        long numeroLongo = 2223L;

        Float valorFloat = 344.8959F;
        System.out.println(Float.BYTES + "" + valorFloat);

        var numeroVar = true;

        System.err.print("fff " + numeroVar);

        float realFloat = 2.34e8f;
        System.out.println("El valor es " + realFloat);

    }

}
