package POOHERENCIA;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("============= Creando instancia Alumno=============");
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Pablo Andres");
        alumno1.setApellido("Onofre");

        System.out.println("============= Creando instancia Profesor=============");
        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Franklin");
        profesor1.setApellido("Jimenez");
        profesor1.setAsignatura("Matematicas");

        System.out.println("Alumno "+alumno1.getNombre()+" "+alumno1.getApellido());
        System.out.println("Profesor "+profesor1.getAsignatura()+" "+ profesor1.getNombre()+" "+profesor1.getApellido());

        System.out.println("============= Creando instancia AlumnoInternacional=============");
        AlumnoInternacional alumnoInternacional1 =  new AlumnoInternacional();
        alumnoInternacional1.setNombre("Pablo Andres");
        alumnoInternacional1.setApellido("Onofre RIascos");
        alumnoInternacional1.setPais("Estados Unidos");
        alumnoInternacional1.setInstitucion("Universidad De Nariño");
        alumnoInternacional1.setNotaIdiomas(3.6);
        alumnoInternacional1.setNotaCastellano(3.5);
        
        System.out.println(alumnoInternacional1);

        
        Class claseAmunoInternacional = alumnoInternacional1.getClass();
        while(claseAmunoInternacional.getSuperclass() != null){
            String hija = claseAmunoInternacional.getName();
            String padre = claseAmunoInternacional.getSuperclass().getName();
            System.out.println(hija+ " Es una clase hija de la clase padre "+ padre);
            claseAmunoInternacional = claseAmunoInternacional.getSuperclass();
        }

    }
}
