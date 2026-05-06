package PracticaCineRecomendacion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GestorCine {
    /*Atributos de clase*/
    List<Pelicula> pelis = new ArrayList<>();

    /*Metodos de clase*/

    /*Anadir peliculas a la lista*/
    public void agregarPeli(Pelicula peli) {
        boolean peliculaExistente = false;
        for (Pelicula itemPelicula : pelis) {
            /*Si al gun nombre de las peliculas que tiene la lista pelis (itemPelicula del foreach) es igual al algun titulo de nuestra peli*/
            if (itemPelicula.getTitulo().equals(peli.titulo)) {
                peliculaExistente = true;
                System.out.println("Error al ingresar la pelicula, la pelicula esta duplicada");
            }
        }
        if (peliculaExistente == false) {
            pelis.add(peli);
            System.out.println("La pelicula de: " + peli.getTitulo() + " fue agregada correctamente");
        }
    }

    /*Ver peliculas de a la lista*/
    public void mostrarPelis() {
        if (pelis != null && !pelis.isEmpty()) {
            System.out.println("\n Las Peliculas son las siguientes: \n");
            int item = 1;
            for (Pelicula itemPelicula : pelis) {
                System.out.println(item + ".- " + itemPelicula.toString());
                item++;
            }
        } else {
            System.out.println("\n Aun no has agregado Peliculas \n");
        }
    }

    public void clasificarPorGnero(String clasificacionGenero) {
        System.out.println("Peliculas de genero: " + clasificacionGenero);
        List<Pelicula> pelisPorGnero = new ArrayList<>();
        for (Pelicula itemPelis : pelis) {
            if (itemPelis.getGenero().equalsIgnoreCase(clasificacionGenero)) {
                pelisPorGnero.add(itemPelis);
            }
        }
        if (pelisPorGnero != null && !pelisPorGnero.isEmpty()) {
            System.out.println("Las peliculas del genero " + clasificacionGenero + "son: \n");
            int item = 1;
            for (Pelicula itemPeliPorGenero : pelisPorGnero) {
                System.out.println(item + ".- " + "Nombre: " + itemPeliPorGenero.getTitulo() + ", Genero: " + itemPeliPorGenero.getGenero() + "\n");
                item++;
            }
        } else {
            System.out.println("No exixsten peliculas del genero " + clasificacionGenero + "en tu lista ");
        }
    }

    public void calificarPeli(String tituloPeli, int calificacionPeli) {
        Pelicula peliAcalificar = new Pelicula();
        Pelicula itemAcalificar = pelis.stream()
                .filter(pelicula -> pelicula.titulo.equals(tituloPeli))
                .findFirst()
                .orElse(null);

        if (itemAcalificar == null) {
            System.out.println("No existe la peli");
            return;
        }

        int nota = peliAcalificar.getCalificaciones().indexOf(calificacionPeli);
        nota = nota + 1;
        itemAcalificar.setCalificacion(nota);
        System.out.println("Le diste la calificacio de: " + nota + " a la Pelicula " + itemAcalificar.getTitulo());
        System.out.println(itemAcalificar.toString());


        System.out.println("La pelicula seleccionada es: " + itemAcalificar.getTitulo());

    }

    public void clasificacionMejoresValoradas() {
        List<Pelicula> pelisMejoresValoradas = new ArrayList<>();
        for (Pelicula itemPeli : pelis) {
            if (itemPeli.getCalificacion() >= 4) {
                pelisMejoresValoradas.add(itemPeli);
            }
        }
        if (pelisMejoresValoradas != null && !pelisMejoresValoradas.isEmpty()) {
            System.out.println("Las Mejores pelis son; \n");
            int item = 1;
            for (Pelicula itemMejorPeli : pelisMejoresValoradas) {
                System.out.println(item + ".- " + "Nombre: " + itemMejorPeli.getTitulo() + ", Calificacion: " + itemMejorPeli.calificacion + "\n");
                item++;
            }
        }else {
            System.out.println("No tienes peliculas valoradas de 4 y 5");
        }
    }
}
