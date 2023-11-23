package POOEJERCICIOCLASEABSTRACTA.Felino;

public class Tigre extends Felino {
    private String especie;

    public Tigre(String habitad, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad, String especie) {
        super(habitad, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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
