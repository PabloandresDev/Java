package Arrays;

public class EJemploArrayImprimirNumeroMasAlto {
    public static void main(String[] args) {
        int [] numeros = {1664,-330,15,36,78,21,43};
        int max=numeros[0];
        for (int i = 1; i <numeros.length ; i++) {
            max = (numeros[i]>max)? numeros[i] :max;
        }
        System.out.println("max = " + max);
    }
}
