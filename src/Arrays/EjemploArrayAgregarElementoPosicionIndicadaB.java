package Arrays;

import java.util.Scanner;

public class EjemploArrayAgregarElementoPosicionIndicadaB {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        //creamos nuestro nuevo array para hacer la copia
        int [] b = new int[a.length+1];
        Scanner s = new Scanner(System.in);
        System.out.println("Digite la posicion a ingresar");
        int posicion = s.nextInt();
        System.out.println(" Digite el valor a ingresar en la posicion anterior");
        int valor =s.nextInt();
        int aux=0;
        // hacemos copia del ultimo valor
        int ultimo=a[a.length-1];
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
        //Hacemos la copia del array
        System.arraycopy(a,0,b,0,a.length);
        // agregamos el ultimo numero guardado
        b[b.length-1]=ultimo;
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
