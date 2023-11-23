package POOEJERCICIOCLASEABSTRACTA.Felino;

public class Leon extends Felino{

    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitad, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad, int numeroManada, float potenciaRugido) {
        super(habitad, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    public void setPotenciaRugido(float potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "Soy un leon y estoy comiendo";
    }

    @Override
    public String dormir() {
        return "SOy un leon y estoy durmiendo";
    }

    @Override
    public String correr() {
        return "SOy un leon y estoy corriendo";
    }

    @Override
    public String comunicarse() {
        return "SOy un leon y estoy comunicandome";
    }
}
