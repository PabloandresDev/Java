package Arrays;

public class EjemploArrayEjercicioPromedioPositivosNegativos {
    public static void main(String[] args) {
        int [] numeros = {1664,-330,-660,36,78,21,43};
        int positivos=0, conPositivos=0;
        int negativos=0, conNegativo=0;
        for (int i = 0; i <7 ; i++) {
            if(numeros[i]>-1){
                positivos++;
                conPositivos+=numeros[i];
            }else{
                negativos++;
                conNegativo+=numeros[i];
            }
        }

        System.out.println(" promedio negativos = " + conNegativo/negativos);
        System.out.println("promedio positivos = " + conPositivos/positivos);
    }
}
