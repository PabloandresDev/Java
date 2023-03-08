package Arrays;

public class EjemploArrayOrdenamientoBurbuja {
    public static void main(String[] args) {

        Integer [] numeros = {1,2,3,4,5,6,7,8,9,10};
        Integer [] numeros2 ={11,12,13,14,15,16,17,18,19,20};
        // Metodo burbuja
        String [] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        int total = productos.length;
        for (int i=0; i<total; i++){
            for(int j=0; j<total; j++)
            {
                if(productos[i].compareTo(productos[j])<0){
                    String aux = productos[i];
                    productos[i]=productos[j];
                    productos[j]=aux;
                }
            }
        }
        for (int i=0; i<total; i++){
            System.out.println("productos = " + productos[i]);
        }

        // mostrar arreglo por pares con el primero y el ultimo del mismo arreglo
        for (int i=0; i< numeros.length/2; i++){
            System.out.println("numeros posicion " + i + " = " + numeros[i] + " " + numeros[numeros.length-i-1]);
        }
        //crear un tercer arreglo con los valores intercalados de los dos arreglos 0a ob
        Integer [] aux = new Integer[20];
        int totalAux = aux.length;
        System.out.println("totalAux = " + totalAux);
        for (int i=0; i< 10; i++){
            aux[i+i]=numeros[i];
            aux[i+i+1]=numeros2[i];
        }
        for (int i=0; i< totalAux; i++){
            System.out.println("aux = " + aux[i]);
        }
        // crear arreglo nuevo con los dos primeros valores de cada arreglo y asi sucesivamente
        Integer [] aux2 = new Integer[20];

        int aux3 = 0;
        for (int i=0; i<(totalAux/2); i+=2){
            for(int j=0; j<2; j++){
                aux2[aux3++]=numeros[i+j];
            }
            for(int j=0; j<2; j++){
                aux2[aux3++]=numeros2[i+j];
            }
        }
        for (int i=0; i<totalAux; i++){
            System.out.println("aux2 "+i+" " + aux2[i]);
        }


    }
}

// crear arreglo nuevo con los dos primeros valores de cada arreglo y asi sucesivamente
