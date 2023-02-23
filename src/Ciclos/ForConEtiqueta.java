package Ciclos;

public class ForConEtiqueta {
    public static void main(String[] args) {
        bucle1:
        for (int i=0; i<5; i++){
            System.out.println();
            for (int j=0; j<5; j++){
                if (i==2){
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = "+ j + "],");
            }
        }
        bucle2:
        for (int i=0; i<5; i++){
            System.out.println();
            for (int j=0; j<5; j++){
                if (i==2){
                    break bucle2;
                }
                System.out.println("[i = " + i + ", j = "+ j + "],");
            }
        }
    }
}
