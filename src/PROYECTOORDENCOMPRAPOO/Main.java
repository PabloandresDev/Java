package PROYECTOORDENCOMPRAPOO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PurchaseOrder orderOne = new PurchaseOrder("Orden de compra 1");
        orderOne.setFecha(new Date());
        orderOne.setCliente(new Client("Pablo ", "Onofre"));
        orderOne.addProduct(new Product("Chino","Auriculares",100));
        orderOne.addProduct(new Product("Chino","Auriculares",200));
        orderOne.addProduct(new Product("Chino","Auriculares",600));
        orderOne.addProduct(new Product("Chino","Auriculares",100));
        System.out.println(orderOne.toString());
        System.out.println("El total de los productos es "+ orderOne.total());

        PurchaseOrder orderTwo = new PurchaseOrder("Orden de compra 2");
        PurchaseOrder orderThree = new PurchaseOrder("Orden de compra 3");
    }
}
