package POO;

public class Mapache extends Animal{
    public Mapache(String nombre, String especie, int edad) {
        super(nombre, especie, edad);
    }

    public void lavarAlimento(){
        System.out.println("El mapache lava su alimento...");
    }

    @Override
    public void hacerSonido() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
