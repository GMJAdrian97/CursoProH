package POO;

public class Mono extends Animal{
    public Mono(String nombre, String especie, int edad) {
        super(nombre, especie, edad);
    }
    //Metodos heredados de la clase animal
    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " ladra");
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

}
