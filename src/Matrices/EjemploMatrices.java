package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        int [][] numeros = new int[2][4];
        numeros[0][0]=12;
        numeros[1][3]=44;
        System.out.println("El numero de filas es = "+numeros.length);
        System.out.println("numero de columnas es = " + numeros[0].length);
        System.out.println("EL primer elemento de la matriz es = " + numeros[0][0]);
        System.out.println("EL ultimo elemento de la matriz es = "+ numeros[numeros.length-1][numeros[0].length-1]);
        //int numero1=numeros[0][0]=13;
        int numero1=numeros[0][0]+13;
        System.out.println("numero1 = " + numero1);
        System.out.println("EL primer elemento de la matriz es = " + numeros[0][0]);
    }
}
