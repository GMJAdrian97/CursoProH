package PelisSeries;

public abstract class Contenido {
    //Atributos de clase
    protected String titulo;
    protected  int year, duracionEnMin;

    public Contenido(String titulo, int year, int duracionEnMin) {
        this.titulo = titulo;
        this.year = year;
        this.duracionEnMin = duracionEnMin;
    }

    public abstract void mostrarDetalles();
}
