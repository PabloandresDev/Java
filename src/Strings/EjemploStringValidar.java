package Strings;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = "hola";
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if (esNulo == false) {
            System.out.println(curso.toUpperCase());
        }
        System.out.println("Bienvedio al curso".concat(" desde cero!"));
    }
}
