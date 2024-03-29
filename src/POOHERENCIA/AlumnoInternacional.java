package POOHERENCIA;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class AlumnoInternacional extends Alumno{
   private String pais;
   private double notaIdiomas;
   public AlumnoInternacional() {
       System.out.println("Inicializando constructor ALumno Internacional");
   }
   public AlumnoInternacional(String nombre, String apellido) {
       super(nombre,apellido);
   }
   public AlumnoInternacional(String nombre, String apellido,String pais, double notaIdiomas){
       super(nombre,apellido);
       this.pais = pais;
       this.notaIdiomas = notaIdiomas;
   }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio()*3)+this.notaIdiomas)/4;
    }

    @Override
    public String toString() {

        return "AlumnoInternacional{" +
                        "pais='" + pais + '\'' +
                        ", notaIdiomas=" + notaIdiomas +
                        '}';
    }
}
