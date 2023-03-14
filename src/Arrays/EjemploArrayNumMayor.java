package Arrays;

public class EjemploArrayNumMayor {

    public static void main(String[] args) {
        int[] a = {-5, -4, -1, -700, -3, -100, -190};
        int auxiliar = 0;
        for (int i = 1; i < a.length; i++) {
            auxiliar = (a[auxiliar] > a[i]) ? i : auxiliar;
        }
        System.out.println("auxiliar el numero menor es = " + a[auxiliar]);
    }

}
