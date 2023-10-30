package PROYECTOFACTURASPOO;

import java.util.Date;

public class Factura {
    private int idFactura;
    private String description;
    private Date date;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    private int indiceIdFactura;

    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.items = new ItemFactura[10];
        this.indiceItems++;
        this.idFactura = ++indiceIdFactura;
        this.date = new Date();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        this.items[indiceItems++] = item;
    }

    public float calcularTotalFactura() {
        float total = 0f;
        for (ItemFactura item : items) {
            if (item == null) {
                continue;
            }
            total += item.calcularTotalItem();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(idFactura)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getCc())
                .append("\nDescripcion ")
                .append(this.description)
                .append("\n").append("\n#\tNombre        \tPrecio\tCant.\tTotal")
                .append("\n");

        for(ItemFactura item:items) {
            if(item==null){
                continue;
            }
            sb.append(item.getProducto().getId())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularTotalItem())
                    .append("\n");

        }
        sb.append("\n Gran Total: ").append(calcularTotalFactura());
        return sb.toString();
    }


}
