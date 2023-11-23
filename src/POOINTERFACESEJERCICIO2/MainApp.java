package POOINTERFACESEJERCICIO2;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    private static List<Electrodomestico> electrodomestico = new ArrayList<>();
    public static void main(String[] args) {

        Electrodomestico lavadora = new Lavadora(1000, Color.NEGRO,ConsumoEnergetico.C,25.7,200);
        System.out.println(lavadora.precioFinal(lavadora));
        electrodomestico.add(lavadora);

        Electrodomestico televisor = new Televisor(300,Color.AZUL,ConsumoEnergetico.C,50,35,false);
        System.out.println(televisor.precioFinal(televisor));
        electrodomestico.add(televisor);

        Electrodomestico lavadora2 = new Lavadora(400, Color.NEGRO,ConsumoEnergetico.C,25.7,200);
        System.out.println(lavadora2.precioFinal(lavadora2));
        electrodomestico.add(lavadora2);

        Electrodomestico televisor2 = new Televisor(700,Color.AZUL,ConsumoEnergetico.C,50,35,false);
        System.out.println(televisor2.precioFinal(televisor2));
        electrodomestico.add(televisor2);

        double total= 0;
        for (Electrodomestico elec:electrodomestico) {
             total += elec.precioFinal(elec);
        }

        System.out.println("EL precio total de los articulos es "+ total);
    }


}
