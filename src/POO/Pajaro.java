package POO;

public class Pajaro extends Animal{
    public Pajaro(String nombre, String especie, int edad) {
        super(nombre, especie, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro Chifla");
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
