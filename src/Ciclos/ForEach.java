package Ciclos;

public class ForEach {
    public static void main(String[] args) {
        int[] primos = {1, 3, 5, 7, 11};
        for (int num : primos) {
            System.out.println("num = " + num);
        }
        //recordar el tipo de dato
        String[] names = {"Carlos", "Maria", "Juan"};
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
