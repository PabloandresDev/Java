package POOINTERFACESEJERCICIO1;

public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public String mostrarAlimento() {
        return nombre+" se alimenta de "+alimento;
    }
}
