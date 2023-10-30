package PROYECTOFACTURASPOO;

public class MainAPP {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCc("1233190760");
        cliente.setNombre("Pablo Onofre");

        Factura factura = new Factura("Palo de madera",cliente);
        for (int i=0; i<5; i++){
            Producto producto = new Producto();
            producto.setNombre("Producto N#"+i);
            producto.setPrecio(100+i);
            ItemFactura item = new ItemFactura((i+1),producto);
            factura.addItemFactura(item);
        }
        System.out.println(factura.generarDetalle());
    }
}
