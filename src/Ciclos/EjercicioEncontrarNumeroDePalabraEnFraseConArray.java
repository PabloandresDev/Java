package Ciclos;

public class EjercicioEncontrarNumeroDePalabraEnFraseConArray {
    public static void main(String[] args) {
        String frase = "     Pablito clavo un clavito   x   pablito        en la calva " +
                "de un calvito como   pablito un x x clavito calvito";
        String[] palabras = frase.trim().split(" ++");
        int max = palabras.length;
        int cont = 0;
        String palabra = "x";
        for (String palabrita : palabras) {
            if (palabra.equalsIgnoreCase(palabrita)) {
                cont++;
            }
            System.out.print(palabrita + " ");
        }
        System.out.println(" \ncont = " + cont);
    }
}
