package POO;

public class Gato extends Animal{
    public Gato(String nombre, String especie, int edad) {
        super(nombre, especie, edad);
    }

    //Metodods hererdados de la clase padre "Animal"
    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " maulla");
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
