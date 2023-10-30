package Matrices;

public class MatricesString {
    public static void main(String[] args) {
        String [][] nombres = new String[3][2];
        nombres[0][0]="pablo";
        nombres[0][1]="pablo2";
        //nombres[1][0]="pablo3";
        nombres[1][1]="pablo4";
        nombres[2][0]="pablo5";
        nombres[2][1]="pablo6";
        for (int i = 0; i < nombres.length  ; i++) {
            for (int j = 0; j < nombres[0].length; j++) {
                System.out.println("nombre en la posicion  = " + i + j + " = "+nombres[i][j]);
            }
        }

        System.out.println("Iterando con un foreach");
        for (String[] i:nombres) {
            for (String j:i) {
                System.out.println("nombre = " + j);
            }
        }
        System.out.println(4.999999999999999999999999999999999999999999999999999999);


    }
}
