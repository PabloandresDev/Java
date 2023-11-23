package POOEJERCICIOCLASEABSTRACTA.Felino;

import POOEJERCICIOCLASEABSTRACTA.Mamifero.Mamifero;

abstract public class Felino extends Mamifero {
    protected double garras;
    protected int velocidad;
    public Felino(String habitad, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.garras = garras;
        this.velocidad = velocidad;
    }

    public double getGarras() {
        return garras;
    }

    public void setGarras(double garras) {
        this.garras = garras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
