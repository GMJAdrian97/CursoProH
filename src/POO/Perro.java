package POO;

public class Perro extends Animal {

    public Perro(String nombre, String especie, int edad) {
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

    //Tambien pueden tener metodos propios y no heredados de la clase padre
    public void moverCola(){
        System.out.println(" Mueve la cola");
    }
}
