package POOEJERCICIOCLASEABSTRACTA.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitad, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, garras, velocidad);
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
