package PracticaCineRecomendacion;


import java.util.Arrays;
import java.util.List;

public class Pelicula {
    /*Atributos de clase*/
    String titulo, genero;
    int duracion, calificacion;

    List<Integer> calificaciones = Arrays.asList(1, 2, 3, 4, 5);

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    /* *********** Constructores *********** */

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int duracion, int calificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public Pelicula(String genero, String titulo, int duracion, int calificacion, List<Integer> calificaciones) {
        this.genero = genero;
        this.titulo = titulo;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.calificaciones = calificaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", calificacion=" + calificacion + "\n" +
                '}';
    }
}