package POOEJERCICIOCLASEABSTRACTA.Canino;

import POOEJERCICIOCLASEABSTRACTA.Mamifero.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected double colmillos;

    public Canino(String habitad, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.colmillos = colmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getColmillos() {
        return colmillos;
    }

    public void setColmillos(double colmillos) {
        this.colmillos = colmillos;
    }
}
