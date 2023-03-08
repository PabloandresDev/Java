package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArrayForInversoMutable {
    public static void main(String[] args) {
        String [] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        int total = productos.length;
        //Arrays.sort(productos);
//        System.out.println("==========Usando un for y haciendolo de la manera tradicional ======");
//        for (int i=0; i<total/2;i++){
//            String ultimo = productos[total-1-i];
//            String primero = productos[i];
//            productos[i]=productos[total-1-i];
//            productos[total-1]=primero;
//        }
//        for (int i=0; i<total;i++){
//            System.out.println("productos = " + productos[i]);
//        }

        System.out.println("==========Usando Collections con for=============");
        Collections.reverse(Arrays.asList(productos));
        for (int i=0; i<total;i++){
            System.out.println("productos = " + productos[i]);
        }
    }

}
