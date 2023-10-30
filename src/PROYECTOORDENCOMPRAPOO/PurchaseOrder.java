package PROYECTOORDENCOMPRAPOO;

import java.util.Arrays;
import java.util.Date;

public class PurchaseOrder {
    private int id;
    private String description;
    private Date date;
    private Client client;
    private final Product[] products = new Product[4];
    private static int referenciaId=0;
    private static int referenciaProducts=0;

    public PurchaseOrder(String description) {
        this.description = description;
        this.id =++referenciaId;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getFecha() {
        return date;
    }

    public Client getCliente() {
        return client;
    }

    public Product[] getProductos() {
        return products;
    }

    public void setFecha(Date date) {
        this.date = date;
    }

    public void setCliente(Client client) {
        this.client = client;
    }

    public void addProduct(Product p){
        products[referenciaProducts]=p;
        referenciaProducts++;
    }

    public double total(){
        double total=0;
        for (Product p:products) {
           total+=p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", client=" + client.getNombre() +" "+client.getApellido() +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
