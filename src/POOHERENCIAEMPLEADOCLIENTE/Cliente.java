package POOHERENCIAEMPLEADOCLIENTE;

public class Cliente extends Persona {
    private int id;

    public Cliente(String nombre,String apellido, String cc, String direccion,int id) {
        super(nombre,apellido,cc,direccion);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "Id persona = "+ this.getId();
    }
}
