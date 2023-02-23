package OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicosOperadorTernarioLogin {
    public static void main(String[] args) {
        String user = "Pablo";
        String pwd = "1997";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido\nIngrese su usuario ");
        String u = scanner.next();
        System.out.println("Ingrese su contraseña ");
        String c = scanner.next();
        String autenticado = (user.equals(u) && pwd.equals(c)) ? "Bienvenido al programa" : "User o pwd incorrecto";
        System.out.println("" + autenticado);
    }
}
