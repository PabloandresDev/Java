package PROYECTOORDENCOMPRAPOO;

public class Client {
    private String nombre;
    private String apellido;

    public Client(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
