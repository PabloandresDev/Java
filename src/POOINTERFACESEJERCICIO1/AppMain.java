package POOINTERFACESEJERCICIO1;

public class AppMain {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich","Carnitas",15,"Doberman");
        System.out.println(perro1.mostrarAlimento());

        Animal perro2 = new Perro("Tony","Croquetas",10,"Champas");
        System.out.println(perro2.mostrarAlimento());

        Animal gato1 = new Gato("mati","concentrado",6,"siames");
        System.out.println(gato1.mostrarAlimento());

        Animal caballo1 = new Caballo("Spark","Pasto",25,"FIno");
        System.out.println(caballo1.mostrarAlimento());
    }
}
