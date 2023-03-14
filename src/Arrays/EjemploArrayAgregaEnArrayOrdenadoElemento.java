package Arrays;

import java.util.Scanner;

public class EjemploArrayAgregaEnArrayOrdenadoElemento {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,9,10,12,23};
        int [] b =new int[a.length+1];
        System.out.println("Digite el numero a ingresar en el array");
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        int aux=0, cont=0;
        int ultimo = a[a.length-1];
        boolean noEncontro=false;
        for (int i = 0; i <a.length ; i++) {
            if(valor<a[i]){
                cont =i;
                aux=a[i];
                a[i]=valor;
                noEncontro=true;
                // Importantisimo el break si no genera el mismo numero de aqui ena delante ya que sigue comparando
                break;
            }
        }
        if(noEncontro){
            System.out.println("si se encontro el valor");
            System.out.println("a.length = " + a.length);
            System.out.println("cont = " + cont);
            for (int i = a.length-1; i > cont ; i--) {
                a[i]=a[i-1];
            }
            if(cont==a.length-1){
                a[cont]=valor;
            }else{
                a[cont+1]=aux;
            }
            System.arraycopy(a,0,b,0,a.length);
            b[b.length-1]=ultimo;
            for (int i = 0; i <b.length ; i++) {
                System.out.println(b[i]);
            }
        }else{
            a[a.length-1]=valor;
            for (int i = 0; i <a.length ; i++) {
                System.out.println(a[i]);
            }
       }

    }
}
