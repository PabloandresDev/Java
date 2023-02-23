package Strings;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i=0; i<100000; i++){
                //c = c.concat(a).concat(b).concat("\n"); // mientras mas repeticiones mas lento
                //c = c + a + b + "\n"; // mientras mas repeticiones mejora con respecto a concat
                sb.append(a); // es el mas rapido
                sb.append(b);
                sb.append("\n");
        }

        long fin =System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("Pablo Onofre");
        System.out.println("c = " + sb);
    }
}
