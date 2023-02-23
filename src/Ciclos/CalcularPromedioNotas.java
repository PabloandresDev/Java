package Ciclos;

import java.util.Scanner;

public class CalcularPromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notasMayor5 = 0, notasMenos4 = 0;
        int nota1 = 0, cont5 = 0, cont4 = 0;
        boolean bandera = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la nota def entre 1-7 del estudiante " + (i + 1));
            double nota = scanner.nextDouble();
            System.out.println("nota = " + nota);
            ;
            if (nota > 5) {
                notasMayor5 += nota;
                cont5++;
            }
            if (nota < 4 && nota > 1) {
                notasMenos4 += nota;
                cont4++;
            }
            if (nota == 1) {
                nota1++;
            }
            if (nota == 0) {
                System.out.println("Error finalizado el programa");
                bandera = true;
                break;
            }
        }
        while (bandera == false) {
            System.out.println("EL promedio de notas mayores a 5 es " + notasMayor5 / cont5);
            System.out.println("EL promedio de notas menores a 4 es " + notasMenos4 / cont4);
            System.out.println("El numero de notas = 1 es " + nota1);
            break;
        }
    }
}
