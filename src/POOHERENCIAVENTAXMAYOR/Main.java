package POOHERENCIAVENTAXMAYOR;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0]= new Lacteo("Queso",500,10,140);
        productos[1]= new Lacteo("Leche",300,7,90);
        productos[2]= new Fruta("Manzana",1500d,7,"Rojo");
        productos[3]= new Fruta("Pera",300d,7,"Verde");
        productos[4]= new Limpieza("Escoba",1500d,"Papel en tira",100);
        productos[5]= new Limpieza("Recogedor",300d,"plastico",20);
        productos[6]= new NoPerecible("noPerecible1",1800d,8,2);
        productos[7]= new NoPerecible("noPerecible2",600d,3,4);
        for (Producto produc:productos) {

            System.out.println(produc.toString());
        }
    }
}
