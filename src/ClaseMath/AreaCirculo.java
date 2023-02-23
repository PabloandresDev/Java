package ClaseMath;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Digite el radio del circulo");
        double radio= s.nextDouble();
        double area= (Math.PI)*(Math.pow(radio,2));
        System.out.println("El area del circulo es " + area);

    }
}
