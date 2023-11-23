package POOINTERFACES.Modelo;

public class Informe extends Hoja{
    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public Informe(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return "Informe escrito por:"+ autor+
                "Revisado por:"+revisor+
                "\n"+this.contenido;
    }
}
