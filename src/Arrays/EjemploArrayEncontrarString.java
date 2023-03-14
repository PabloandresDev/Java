package Arrays;

import java.util.Scanner;

public class EjemploArrayEncontrarString {
    public static void main(String[] args) {
        String [] a = {"1","2","3","4","5","6","7","8","9","10"};
        Scanner s = new Scanner(System.in);
        String b;
        boolean c = false;
        System.out.println("Digite el numero a encontrar dentro del array");
        b=s.next();
        for (int i = 0; i <a.length ; i++) {
            if(a[i].compareTo(b)==0){
                c=true;
                System.out.println("el elemento se encontro en la posicion = " + i);
                break;
            }
        }
        if(c==false){
            System.out.println("El numero no se encontro en el array");
        }
    }
}
