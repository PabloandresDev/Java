package StringsMetodos;

public class EjemploStringProgramaManejoDeNombres {
    public static void main(String[] args) {

        String name1 = "andres";
        String name2 = "maria";
        String name3 = "pepe";
        String newName, newName2, newName3;

        newName=""+name1.toUpperCase().charAt(1);
        newName+="."+name1.substring(name1.length()-2);
        newName2="_"+name2.toUpperCase().charAt(1);
        newName2+="."+name2.substring(name2.length()-2);;
        newName3="_"+name3.toUpperCase().charAt(1);
        newName3+="."+name3.substring(name3.length()-2);

        System.out.println(newName.concat(newName2).concat(newName3));

    }

    //Se pide por cada nombre de la persona una nueva variable del tipo String
    // al tomar el segundo carácter pero convertido en mayúscula y se le
    // concatena un punto y los dos últimos
    // caracteres de la persona. Por ejemplo para Andres debe quedar como N.es


}
