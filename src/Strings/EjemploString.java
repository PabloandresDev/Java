package Strings;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String( "Programacion Java");
        String curso3 = "Programacion Java";

        boolean esIgual1 = (curso==curso2);//compara por el tipo objeto
        boolean esIgual4 = (curso==curso3);//compara por el tipo de objeto
        boolean esIgual2 = (curso.equals(curso2));//copmpara por el valor del objeto
        boolean esIgual3 = (curso.equalsIgnoreCase(curso2));//compara por el valor del objeto
        System.out.println(esIgual1);
        System.out.println(esIgual2);
        System.out.println(esIgual3);
        System.out.println(esIgual4);
    }
}
