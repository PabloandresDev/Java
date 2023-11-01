package POOHERENCIA;

public class MainAppSobreCargaConstructores {
    public static void main(String[] args) {
        Persona persona = new Persona("Pablo","Andres",26);
        Alumno alumno = new Alumno("Pablo","Andres",
                26,"CCP",4,5,3);
       mostrarDetalle(persona);
       mostrarDetalle(alumno);
       AlumnoInternacional  alumnoInternacional= new AlumnoInternacional("Pablo","Onofre","Colombia", 4);
       mostrarDetalle(alumnoInternacional);
       Profesor profesor = new Profesor("Doris","Riascos","Matematicas");
       mostrarDetalle(profesor);
    }

    public static void mostrarDetalle(Persona persona){
        System.out.println("===============DATOS PERSONA=================");
        System.out.println("Hola mi nombre es "+ persona.getNombre());
        System.out.println("Hola mi apellido es " + persona.getApellido());
        System.out.println("Hola mi edad es " + persona.getEdad());
        System.out.println("Hola mi email es " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("===============DATOS ALUMNO=================");
            System.out.println("Institucion= " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematica = " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Castellano = " + ((Alumno) persona).getNotaCastellano());
            System.out.println("Nota Historia = " + ((Alumno) persona).getNotaHistoria());
            System.out.println("El promedio de notas es " + ((Alumno) persona).calcularPromedio());
            if(persona instanceof AlumnoInternacional){
                System.out.println("===============DATOS ALUMNO INTERNACIONAL=================");
                System.out.println("Nota ingles= " + ((AlumnoInternacional)persona).getPais());
                System.out.println("Nota ingles= " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("El promedio de notas es " + ((AlumnoInternacional) persona).calcularPromedio());
            }
        }
        if(persona instanceof Profesor){
            System.out.println("===============DATOS PROFESOR=================");
            System.out.println("Asignatura dictada= " + ((Profesor)persona).getAsignatura());
        }
    }
}
