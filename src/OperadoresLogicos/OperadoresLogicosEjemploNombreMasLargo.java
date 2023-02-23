package OperadoresLogicos;

public class OperadoresLogicosEjemploNombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = "Pablo ANdres ONOFRE RIASCOS";
        String nombre2 = " Carlos mario ceasdasdasdasdadsron"    ;
        String nombre3 = "Pablo ANdres               RIASCOS";
        String n1 = nombre1.replaceAll(" +","").trim();
        String n2 = nombre2.replaceAll(" +","").trim();
        String n3 = nombre3.replaceAll(" +","").trim();
        System.out.println(n1 + "\n"+ n2 +"\n" + n3);
        String max= (n1.length()>n2.length() ? n1 : n2);
        String maximo = (n3.length()>max.length() ? n3 : max);
        System.out.println("EL nombre con el tamaño mas largo es = " + maximo);

    }
}
