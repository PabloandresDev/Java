package POOINTERFACESEJERCICIO2;

public class Electrodomestico {
       private double precio;
       private Color color;
       private ConsumoEnergetico consumo;
       private double peso;

       public Electrodomestico() {
              consumo=ConsumoEnergetico.F;
              color = Color.BLANCO;
       }

       public Electrodomestico(double precio, Color color, ConsumoEnergetico consumo, double peso) {
              this.precio = precio;
              this.color = color;
              this.consumo = consumo;
              this.peso = peso;
              comprobarConsumoEnergetico(this.consumo);
       }

       public double getPrecio() {
              return precio;
       }

       public void setPrecio(double precio) {
              this.precio = precio;
       }

       public Color getColor() {
              return color;
       }

       public void setColor(Color color) {
              this.color = color;
       }

       public ConsumoEnergetico getConsumo() {
              return consumo;
       }

       public void setConsumo(ConsumoEnergetico consumo) {
              this.consumo = consumo;
       }

       public double getPeso() {
              return peso;
       }

       public void setPeso(double peso) {
              this.peso = peso;
       }

       private void comprobarConsumoEnergetico(ConsumoEnergetico codigo) {
              // Convertir el char a un String para facilitar la comparación
              String codigoStr = String.valueOf(codigo);

              // Comprobar si el código está en la enumeración ConsumoEnergetico
              if (!ConsumoEnergetico.contains(codigoStr)) {
                     // Si no está en la enumeración, asignar el valor por defecto F
                     consumo = ConsumoEnergetico.F;
              } else {
                     // Si está en la enumeración, asignar el valor correspondiente al código
                     consumo = ConsumoEnergetico.valueOf(codigoStr);
              }
       }


       private void comprobarColor(Color color){
              String colorString = String.valueOf(color);
              if (!Color.contains(colorString)) {
                     // Si no está en la enumeración, asignar el valor por defecto F
                     this.color = Color.BLANCO;
              } else {
                     // Si está en la enumeración, asignar el valor correspondiente al código
                     this.color = Color.valueOf(colorString);
              }
       }

       public void crearElectrodomestico(){
              precio = 1000;
              color = Color.AZUL;
              consumo = ConsumoEnergetico.A;
              peso=10;
              comprobarColor(color);
              comprobarConsumoEnergetico(consumo);
       }

       public double precioFinal(Electrodomestico electrodomestico){
             double costoConsumo =100;
             switch (electrodomestico.consumo ) {
                    case A: costoConsumo =1000;
                    break;
                    case B: costoConsumo =800;
                    break;
                    case C: costoConsumo =600;
                    break;
                    case D: costoConsumo = 500;
                    break;
                    case E: costoConsumo = 300;
                    break;
                    case F: costoConsumo =100;
                    break;
                    default: costoConsumo =100;
             }
             if(electrodomestico.peso>=1 & electrodomestico.peso<=19){
                    costoConsumo+=100;
             } else if (electrodomestico.peso>=19 & electrodomestico.peso<=49) {
                    costoConsumo+=500;
             } else if (electrodomestico.peso>=50 & electrodomestico.peso<=79) {
                    costoConsumo+=800;
             } else {
                    costoConsumo+=1000;
             }
             costoConsumo += electrodomestico.precio ;
             return costoConsumo;
       }
}
