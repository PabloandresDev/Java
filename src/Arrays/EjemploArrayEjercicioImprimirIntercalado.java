package Arrays;

import java.util.Scanner;

public class EjemploArrayEjercicioImprimirIntercalado {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Digite el numero en la posicion: " + i );
            numeros[i]=s.nextInt();
        }
        int total = numeros.length-1;
        for (int i = 0; i < total ; i++) {
            System.out.println(numeros[total--]);
            System.out.println(numeros[i]);
        }
    }
}
