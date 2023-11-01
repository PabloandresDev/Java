package POOHERENCIAEMPLEADOCLIENTE;

public class Main {
    public static void main(String[] args) {
        int referenciaID=0;
        Gerente gerente = new Gerente("Pablo","Onofre","1233190","Rosario",1000,++referenciaID,4000);
        System.out.println(gerente);
    }
}
