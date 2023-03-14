package Arrays;

public class EjemploArrayDetectarOrden {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean asc = false;
        boolean des = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                asc = true;
            }
            if (a[i] > a[i + 1]) {
                des = true;
            }
        }
        if(asc && !des){
            System.out.println("el array es  ascendente");
        }
        if(!asc && des){
            System.out.println("el array es  descendente");
        }
        if(!asc && !des){
            System.out.println("el array es contiene elementos iguales");
        }
        if(asc && des){
            System.out.println("El array esta desordenado");
        }
    }
}
