package Arrays;

import java.util.Scanner;

public class EjemploArrayEliminarElemento {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Digite la posicion a eliminar");
        Scanner s = new Scanner(System.in);
        int eliminar = s.nextInt();
        if (eliminar > 0 && eliminar < a.length) {
            for (int i = eliminar; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            for (int i = 0; i < a.length - 1; i++) {
                System.out.println("a[i] = " + a[i]);
            }
        } else {
            System.out.println("Posicion no valida");
        }
    }
}
