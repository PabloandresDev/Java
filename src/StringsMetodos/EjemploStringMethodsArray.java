package StringsMetodos;

import java.util.stream.IntStream;

public class EjemploStringMethodsArray {
    public static void main(String[] args) {
        String trabalengua = "      trabalengua    ";
        String cadena = "12345678";
        // convertir String a array de tipo char
        char [] array = trabalengua.trim().toCharArray();
        System.out.println("array = " + array);
        for ( int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        // convertir string a array de tipo string
        String [] array2 = trabalengua.trim().split("a");
        System.out.println(array2);
        for ( int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        // convertir string a array de tipo int
        char[] caracteres = cadena.toCharArray();
        int[] numeros = new int[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            numeros[i] = Character.getNumericValue(caracteres[i]);
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }
    }
}
