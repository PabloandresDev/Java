package Arrays;
import java.util.Arrays;

public class EjemploArray {
    public static void main(String[] args) {
        String [] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);

        int[] array = new int[5];
        array[0] = 199;
        array[1] = 27;
        array[2] = 3;
        array[3] = 49;
        array[4] = 5;

        Arrays.sort(array);

        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);
        System.out.println("array[2] = " + array[2]);
        System.out.println("array[3] = " + array[3]);
        System.out.println("array[4] = " + array[4]);
    }
}

