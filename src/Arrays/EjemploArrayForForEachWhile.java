package Arrays;
import java.util.Arrays;
import java.util.Collections;

public class EjemploArrayForForEachWhile {
    public static void main(String[] args) {

//        String [] productos = new String[7];
//        productos[0] = "Kingston Pendrive 64GB";
//        productos[1] = "Samsung Galaxy";
//        productos[2] = "Disco Duro SSD Samsung Externo";
//        productos[3] = "Asus Notebook";
//        productos[4] = "Macbook Air";
//        productos[5] = "Chromecast 4ta Generación";
//        productos[6] = "Bicicleta Oxford";

        String [] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta Generación", "Bicicleta Oxford"};

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        // Imprimimos los productos con un for
        System.out.println("Usando un for");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

        // Imprimimos los productos con un for each
        System.out.println("Usando un for each");
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }

        // print the array with a while loop
        System.out.println("Usando un while");
        int i = 0;
        while (i < productos.length) {
            System.out.println("productos[" + i + "] = " + productos[i]);
            i++;
        }

        // print the array with a do while loop
        System.out.println("Usando un do while");
        int j = 0;
        do {
            System.out.println("productos[" + j + "] = " + productos[j]);
            j++;
        } while (j < productos.length);

        // print the array decremented with a for loop
        System.out.println("Usando un for decreciente");
        for (int k = productos.length - 1; k >= 0; k--) {
            System.out.println("productos[" + k + "] = " + productos[k]);
        }


    }
}

