package PelisSeries;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    List<Contenido> listCatalogo = new ArrayList<>();

    public void agregarContenido (Contenido c){
        listCatalogo.add(c);
    }
    public void buscarPorTitulo (String nombre){
        //Caso ForEach

        /*boolean peliEncontrada = false;
        for(Contenido item : listCatalogo){
            if (item.titulo.equals(nombre)) {
                System.out.println("Si existe el contenido exite y es: " + item.titulo);
                peliEncontrada = true;
                break;
            }
        }
        if (!peliEncontrada){
            System.out.println("No existe el contenido");
        }*/

        //Caso Stream (estructura)
        Contenido item = listCatalogo.stream()
                .filter(a -> a.titulo.equals(nombre))
                .findFirst()
                .orElse(null);
        if (item == null){
            System.out.println("No existe el contenido");
        }else{
            System.out.println("Si existe el contenido y es: " + item.titulo);
        }

    }
    public void mostrarTodo (){
        for (Contenido item : listCatalogo){
            System.out.println("Titulo: "+ item.titulo +" " + "Año: " + item.year + "Duracion (min):" + item.duracionEnMin);
        }
    }
}