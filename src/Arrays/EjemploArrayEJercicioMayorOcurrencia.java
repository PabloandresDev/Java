package Arrays;

import java.util.Arrays;

public class EjemploArrayEJercicioMayorOcurrencia {
    public static void main(String[] args) {
        int [] a = { 1,2,3,1,3,5,5,5,5,7,7,7,7,7,7,7,5,5,6,7,2,2,2};
        int [] cont = new int[a.length];
        System.out.println("a.length = " + a.length);

        for (int i = 0; i <a.length ; i++) {
            int contador=0;
            for(int j = 0; j < a.length ; j++) {
                if(a[i]==a[j]){
                    contador++;
                }
            }cont[i]=contador;
        }
        int indice = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
        int max = cont[0]; // la cantidad mayor de veces (la mayor ocurrencia)
        for (int i = 1; i < 10; i++) {
            if(cont[i]>max){
                max=cont[i];
                indice=i;
            }
        }
        Arrays.sort(cont);
        System.out.println("numero con mayor concurrencia = " + cont[cont.length-1] + " con un valor de:  "+ a[indice] );
        for (int i = 0; i < cont.length ; i++) {
            System.out.println("cont[ "+i+" ] = " + cont[i]);

        }
    }
}
