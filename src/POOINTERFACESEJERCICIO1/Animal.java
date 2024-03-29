package POOINTERFACESEJERCICIO1;

public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public abstract String mostrarAlimento();
}
