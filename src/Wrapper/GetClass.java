package Wrapper;

import java.lang.reflect.Method;

public class GetClass {
    public static void main(String[] args) {
        String texto = "Hola pablo";
        Class strClass = texto.getClass();

        Integer num = 12;
        Class intClass = num.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for (Method metodo :strClass.getMethods()) {
            System.out.println(" String metodo.getName() = " + metodo.getName());
        }

        for (Method metodo :intClass.getMethods()) {
            System.out.println("Int metodo.getName() = " + metodo.getName());
        }
    }
}
