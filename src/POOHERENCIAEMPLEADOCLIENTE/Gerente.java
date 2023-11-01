package POOHERENCIAEMPLEADOCLIENTE;

public class Gerente extends Empleado{
    private double presupuesto;
    public Gerente(String nombre, String apellido, String cc, String direccion,
                   double remuneracion, int idEmpleado,double presupuesto) {
        super(nombre, apellido, cc, direccion, remuneracion, idEmpleado);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "presupuesto=" + presupuesto;
    }
}
