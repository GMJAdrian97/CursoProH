package POO;

import java.util.ArrayList;
import java.util.List;

public class ListaAnimales {
    List<String> listaAnimales = new ArrayList<>();

    //Metodos
    public void RegistrarAnimal(Animal nuevoAnimal){
        listaAnimales.add("Especie: " + nuevoAnimal.especie + "Nombre: " + nuevoAnimal.nombre + "Edad: " +nuevoAnimal.edad);
    }

    public void MostrarAnimales(){
        int numero = 1;
        for (String nombre : listaAnimales) {
            System.out.println(numero +".- "+ nombre);
            numero ++ ;
        }
    }
}
