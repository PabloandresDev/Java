package Arrays;

public class EjemploArrayEjercicioHistogramaNumeros {
    public static void main(String[] args) {
        int [] a = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int [] n = new int[a.length];
        for (int i = 1; i <=6; i++) {
            int cont=0;
            String asterisco = "";
            for (int j = 0; j < a.length ; j++) {
                if(i==a[j]){
                    cont ++;
                    asterisco+="*";
                }
            }
//            System.out.println("cont = " + cont);
            System.out.println("numero = " + (i) + " "+asterisco);
        }
    }
}
