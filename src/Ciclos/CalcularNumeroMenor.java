package Ciclos;

import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de numeros para determinar el menor");
        int cant = scanner.nextInt();
        int men = 0;
        int numero;
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el numero " + (i+1));
            int num = scanner.nextInt();
            System.out.println("num = " + num);
            if (i == 0) {
                men = num;
            }
            if (num < men) {
                men = num;
            }
        }
        System.out.println("EL numero menor es  = " + men);
        System.out.println(men > 10 ? "El numero menor es mas grande que 10" : "EL numero menor es mas pequeño que 10");
    }

}
