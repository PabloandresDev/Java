package POOEJERCICIOCLASEABSTRACTA.Canino;

public class Perro extends Canino {

    private int fuerzaMordida;
    public Perro(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos, int fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, colmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
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
