package Ciclos;

public class EjercicioEncontrarPalabraEnFraseConCharAt {
    public static void main(String[] args) {
        String frase = "Pablito clavo un clavito  pablito en la calva " +
                "de un calvito como   pablito un clavito calvito";
        String palabra = "clavito";
        int totalFrase = frase.length();
        int totalPalabras = 0;
        int contadorPalabra = 0;
        etiqueta:
        for (int i = 0; i < totalFrase; i++) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.toLowerCase().charAt(k++) != palabra.toLowerCase().charAt(j)) {
                    continue etiqueta;
                }
            }
            totalPalabras++;
        }
        System.out.println(totalPalabras);
    }
}
// de la forma afirmativa
//    public static void main(String[] args) {
//        String frase = "Pablito clavo un clavito x pablito en la xcalva " +
//                "de un calvitox como x  pablitox un clavitox calvito";
//        String palabra = "calvito";
//        int totalFrase = frase.length();
//        int totalPalabras = 0;
//        int contadorPalabra = 0;
//        etiqueta:
//        for (int i = 0; i < totalFrase; i++) {
//            contadorPalabra = 0;
//            int k = i;
//            for (int j = 0; j < palabra.length(); j++) {
//                if (frase.toLowerCase().charAt(k++) == palabra.toLowerCase().charAt(j)) {
//                    contadorPalabra++;
//                    System.out.println("contadorPalabra = " + contadorPalabra);
//                    if (contadorPalabra == palabra.length()) {
//                        totalPalabras++;
//                    }
//                } else {
//                    System.out.println("no se encontro en posicion " + i);
//                    continue etiqueta;
//                }
//            }
//        }System.out.println(totalPalabras);
//    }