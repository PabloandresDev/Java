package POOINTERFACESEJERCICIO2;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora(){

    }

    public Lavadora(double precio, Color color, ConsumoEnergetico consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        super.crearElectrodomestico();
        carga = 20;
    }

    @Override
    public double precioFinal(Electrodomestico lavadora) {
        double precioFinal= super.precioFinal(lavadora);
        if(carga>30){
            precioFinal+=500;
        }  return precioFinal;
    }
}
