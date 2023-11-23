package POOINTERFACES;

import POOINTERFACES.Modelo.Curriculum;
import POOINTERFACES.Modelo.Hoja;
import POOINTERFACES.Modelo.Informe;

public class MainAPP {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("2023","Pablo ONOfre","Sistemas") ;
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring framework");
        cv.addExperiencias("Hibernate");

        Informe informe = new Informe("EStudio microserviois","martis lwa","james");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
        
    }
}
