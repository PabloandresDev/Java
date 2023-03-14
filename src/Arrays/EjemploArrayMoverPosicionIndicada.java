package Arrays;

import java.util.Scanner;

public class EjemploArrayMoverPosicionIndicada {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Digite la posicion para insertar un numero y modificar el arreglo");
        Scanner s = new Scanner(System.in);
        int resp=s.nextInt();
        System.out.println("INgrese el valor a agregar");
        int valor= s.nextInt();

        for (int i = a.length-1; i > resp ; i--) {
            a[i]=a[i-1];
        }
        a[resp]=valor;

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
