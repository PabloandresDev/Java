package POOHERENCIA;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Inicializando constructor Alumno\n");
    }

    public Alumno(String nombre, String apellido) {
         super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre,apellido,edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaMatematica, double notaCastellano, double notaHistoria) {
        this(nombre, apellido, edad,institucion);   // utilizamos el anterior constructor
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }


    public double calcularPromedio(){
        return (this.notaCastellano+this.notaHistoria+this.notaMatematica)/3;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "institucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                '}';
    }
}
