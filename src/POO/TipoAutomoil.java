package POO;

public enum TipoAutomoil {
    SEDAN ("Sedan","Auto mediano",4),
    STATION_WAGON ("Station Wagon","Auto Grade",4),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupe","Auto pequeño",2),
    CONVERTIBLE ("Convertible","Auto deportivo",2),
    FURGON ("Furgon","Auto utilitario",4);

    TipoAutomoil(String nombre, String description,int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.description = description;
    }

    private final String nombre;
    private final int numeroPuertas;
    private final String description;

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TipoAutomoil{" +
                "nombre='" + nombre + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", description='" + description + '\'' +
                '}';
    }
}
