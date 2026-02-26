package PelisSeries;

public class Pelicula extends Contenido implements Clasificable{

    //Atributos
    String director;

    public Pelicula(String titulo, int year, int duracionEnMin, String director) {
        super(titulo, year, duracionEnMin);
        this.director = director;
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public int obtenerClasificacion() {
        return 0;
    }
}
