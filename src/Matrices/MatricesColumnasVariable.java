package Matrices;

public class MatricesColumnasVariable {
    public static void main(String[] args) {
//        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        System.out.println("Ingrese una letra");
        char letra = new java.util.Scanner(System.in).next().charAt(0);
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        boolean esVocal = false;
        for (char vocal : vocales) {
            if (vocal == letra) {
                esVocal = true;
                break;
            }
        }
        if (esVocal) {
            System.out.println("La letra " + letra + " es una vocal");
        } else {
            System.out.println("La letra " + letra + " no es una vocal");
        }


    }
}
