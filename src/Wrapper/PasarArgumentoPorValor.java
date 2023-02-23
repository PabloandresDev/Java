package Wrapper;

public class PasarArgumentoPorValor {
    public static void main(String[] args) {
        Integer i=10;
        System.out.println("INiciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finalizamos el metodo test con i = " + i);
    }

    public static void test(Integer i){
        System.out.println("INiciamo el metodo test con i = " + i);
        i=35;
        System.out.println("Finalizamos el metodo test con i = " + i);
    }
}
