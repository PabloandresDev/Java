package POOEJERCICIOCLASEABSTRACTA.Canino;

public class Lobo extends Canino{
    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos, int numeroCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, colmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    protected String dormir() {
        return null;
    }

    @Override
    protected String correr() {
        return null;
    }

    @Override
    protected String comunicarse() {
        return null;
    }
}
