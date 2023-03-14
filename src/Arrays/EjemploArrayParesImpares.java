package Arrays;

public class EjemploArrayParesImpares {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contPares = 0;
        int contImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }
        int contP = 0;
        if (contPares > 0) {
            int[] b = new int[contPares];
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    b[contP] = a[i];
                    contP ++;
                }
            }
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);;
            }
        }
        System.out.println("///////////////////////////////////////////////////");
        int contI = 0;
        if (contImpares > 0) {
            int[] c = new int[contImpares];
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    c[contI] = a[i];
                    contI ++;
                }
            }
            for (int i = 0; i < c.length; i++) {
                System.out.println(c[i]);;
            }
        }
    }
}
