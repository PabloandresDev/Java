package POO;

public class Main {
    public static void main(String[] args) {
        Motor motorMazda = new Motor(1600, TipoMotor.GASOLINA);
        Automovil mazda = new Automovil("Mazda SAS","2021",Color.AMARILLO, motorMazda, new Estanque(100), new Persona("Pablo", "Onofre"));
        System.out.println(mazda.toString());
    }
}
