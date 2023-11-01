package POOHERENCIAEMPLEADOCLIENTE;

public class Persona {
    private  String nombre;
    private String apellido;
    private String cc;
    private String direccion;

    public Persona(String nombre, String apellido, String cc, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cc='" + cc + '\'' +
                ", direccion='" + direccion + '\'' ;
    }
}
