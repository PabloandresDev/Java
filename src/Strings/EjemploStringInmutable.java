package Strings;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Pablo Andres Onofre Riascos";
        // concatenar con metodo concat
        String resultado=curso.concat(" "+profesor);
        System.out.println(curso);
        System.out.println(resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + "con" + profesor;
        });
        System.out.println("Curso "+ curso);
        System.out.println("resultado2 = " + resultado2);
        
        String resultado3=resultado2.replace("R","X");
        System.out.println(resultado2);
        System.out.println("resultado2 = " + resultado3);




    }
}
