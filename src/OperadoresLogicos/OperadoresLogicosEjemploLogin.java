package OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {
    public static void main(String[] args) {

        String user = "Pablo";
        String pwd = "1997";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido\nIngrese su usuario ");
        String u = scanner.next();
        System.out.println("Ingrese su contraseña ");
        String c = scanner.next();

        if(user.equals(u)&&pwd.equals(c)){
            System.out.println("Usuario verificado");
        }else{

            System.out.println("Usuario no autenticado ");
        }




    }
}
