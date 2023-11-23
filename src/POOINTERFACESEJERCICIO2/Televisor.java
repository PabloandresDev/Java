package POOINTERFACESEJERCICIO2;

public class Televisor extends Electrodomestico {
    protected double resolucionPulgadas;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(double precio, Color color, ConsumoEnergetico consumo, double peso, double resolucionPulgadas, boolean tdt) {
        super(precio, color, consumo, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.tdt = tdt;
    }

    public double getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(double resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean getTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor(){
        super.crearElectrodomestico();
        this.resolucionPulgadas =100;
        this.tdt = true;
    }

    @Override
    public double precioFinal(Electrodomestico tv) {
        double precioFinal = super.precioFinal(tv);
        if(this.resolucionPulgadas>40){
            precioFinal=precioFinal*1.1;
        }
        if(this.tdt){
            precioFinal+=500;
        }
        return  precioFinal;
    }
}
