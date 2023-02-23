package StringsMetodos;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Pablo";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println(("nombre.toLowerCase() =") + nombre.toLowerCase());
        System.out.println(("nombre.equals() =") + nombre.equals("Pablo"));
        System.out.println(("nombre.equals() =") + nombre.equals("pablo"));
        System.out.println(("nombre.equals() =") + nombre.equalsIgnoreCase("pablo"));
        System.out.println(("nombre.charAt(5) =") + nombre.charAt(0));
        System.out.println(("nombre.charAt(nombre.length()-1) =") + nombre.charAt(nombre.length()-1));
        System.out.println(("nombre.substring(2) =") + nombre.substring(2));
        System.out.println(("nombre.substring(1,4) =") + nombre.substring(1,4));
        //Otro String
        String trabalengua = "      trabalengua    ";
        System.out.println("trabalengua = " + trabalengua);

        System.out.println("Trabalenguas = " + trabalengua.replace("a","x"));
        System.out.println(("trabalengua.indexOf =") + trabalengua.indexOf("b"));
        System.out.println(("trabalengua.lastIndexOf =") + trabalengua.lastIndexOf("o"));
        System.out.println(("trabalengua.contains =") + trabalengua.contains("l"));
        System.out.println(("trabalengua.trim =") + trabalengua.trim());

    }
}
