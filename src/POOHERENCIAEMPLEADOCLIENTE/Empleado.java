package POOHERENCIAEMPLEADOCLIENTE;

public class Empleado extends Persona {
    private double remuneracion;
    private int idEmpleado;

    public Empleado(String nombre, String apellido, String cc, String direccion, double remuneracion, int idEmpleado) {
        super(nombre, apellido, cc, direccion);
        this.remuneracion = remuneracion;
        this.idEmpleado = idEmpleado;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "remuneracion=" + remuneracion +
                ", idEmpleado=" + idEmpleado ;
    }
}
