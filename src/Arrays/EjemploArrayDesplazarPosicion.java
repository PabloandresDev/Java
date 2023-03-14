package Arrays;

public class EjemploArrayDesplazarPosicion {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int total= a.length-1;
        int aux=a[total];
        for (int i = total; i > 0  ; i--) {
           a[i]=a[i-1];
        }
        a[0]=aux;
        for (int i = 0; i <= total  ; i++) {
            System.out.println("posicion " +i+ " = " + a[i]);
        }
    }
}
