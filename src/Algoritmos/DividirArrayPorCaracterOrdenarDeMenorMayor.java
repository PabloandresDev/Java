package Algoritmos;

import java.util.Arrays;

public class DividirArrayPorCaracterOrdenarDeMenorMayor {
    public static void main(String[] args) {
        /*
Se tiene un arreglo myArray que contiene bloques de números. Los bloques pueden ser de cualquier largo,
los números contenidos están en el rango de 1 a 9 y se separan por un cero para definir los bloques.
Se deben ordenar los números de los bloques individualmente de menor a mayor e imprimir las secuencias
separando los bloques por un espacio. Por ejemplo, para el arreglo: (1,3,2,0,7,8,1,3,0,6,7,1)
la respuesta esperada es:
123 1378 167  */
    int posicionInicial=0;
    int posicionFinal=0;

        Integer [] numeros = {1, 3, 2, 0, 7, 8, 1, 3, 0, 6, 7, 1};
        Integer [] aux1 = new Integer [12];

        for(int i=0; i< numeros.length;i++){
            if(numeros[i]==0){
                System.out.println("se encontro un 0 en la posicion = " + i);
                posicionFinal=i;
                aux1 = Arrays.copyOfRange(numeros,posicionInicial+1,posicionFinal);
                Arrays.sort(aux1);

            }posicionInicial=posicionFinal;
        }
        for (int i = 0; i < aux1.length ; i++) {
            System.out.println("aux1 = " + aux1[i]);
        }

    }
}





