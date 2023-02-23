package Strings;

public class EJemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Pablo Andres Onofre Riascos";
        int numeroA =10;
        int numeroB =5;

        String detalle=curso+" con el instructor "+profesor;
        System.out.println(detalle);
        // EValua el tipo de dato de izquierda a derecha y segun eso hace sus conversiones
        System.out.println(detalle + numeroA + numeroB);
        System.out.println(numeroA + numeroB + detalle);

        // concatenar con metodo concat
        String unirString = curso.concat(" "+profesor);
        System.out.println(unirString);


    }
}
