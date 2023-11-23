package POOEJERCICIOCLASEABSTRACTA;

import POOEJERCICIOCLASEABSTRACTA.Felino.Leon;
import POOEJERCICIOCLASEABSTRACTA.Mamifero.Mamifero;

import java.util.ArrayList;

public class MainAPP {
    public static void main(String[] args) {
        ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
        Mamifero leon = new Leon("Selva",1.2,1.5,140,"Panthera leo",4,70,1,7f);;

        Leon leon1 = new Leon("Selva",1.2,1.5,140,"Panthera leo",4,70,1,7f);
        mamiferos.add(leon);
        System.out.println();





    }
}
