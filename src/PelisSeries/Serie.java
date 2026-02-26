package PelisSeries;

public class Serie extends Contenido implements Clasificable{

    //Atrubutos
    int episodio, temporadas;

    public Serie(String titulo, int year, int duracionEnMin, int temporadas, int episodio) {
        super(titulo, year, duracionEnMin);
        this.temporadas = temporadas;
        this.episodio = episodio;
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public int obtenerClasificacion() {
        return 0;
    }
}
