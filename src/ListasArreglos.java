import java.util.ArrayList;
import java.util.List;

public class ListasArreglos {
    /*
    * Tablas de multiplicar [1,10]
    * */

    String[] changos = new String[4];//Sintaxys de definicio de un arreglocon tamaño definido
    String changos2 = new String();

    public void llenarArreglo(){
        changos[2] = "Osvaldo";
        changos[1] = "Joaquin";
        changos[3] = "Adrian";
        changos[0] = "Hansel";
    }

    public String getChangos(int posicion) {
        return changos[posicion];
    }

    //Arreglos bidimencionales --> Tabla
    String[][] tablasMultiplicar = new String[10][2];

    private void listas(){
        List<String> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Double> lista3 = new ArrayList<>();
        List<Calculadora> lista4 = new ArrayList<>();

        lista.add(2, "Adrian");
        lista.add("Joaquin");
        lista.add("Osvaldo");
        lista.add("Hansel");

        for (String item : lista) {
            System.out.println(item);

        }

    }

}
