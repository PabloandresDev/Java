package Arrays;

import java.util.Scanner;

public class EjemploArrayAgregarElementoPosicionIndicada {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10,0};
        Scanner s = new Scanner(System.in);
        System.out.println("Digite la posicion a ingresar");
        int posicion = s.nextInt();
        System.out.println(" Digite el valor a ingresar en la posicion anterior");
        int valor =s.nextInt();
        int aux=0;
        //guardamos la posicion anterior de la posicion a cambiar
        aux=a[posicion];
        // le asignamos el nuevo valor a la posicion que escogio el usuario
        a[posicion]=valor;
        // realizamos el intercambio de numeros
        for (int i =a.length-1 ; i > posicion+1 ; i--) {
            a[i]=a[i-1];
        }
        //agregamos la posicion despues de agregar el nuevo valor, osea en el valor que le sigue
        a[posicion+1]=aux;

        //System.out.println(aux);
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
