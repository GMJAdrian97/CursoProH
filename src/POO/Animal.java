package POO;

public abstract class Animal {

    //Atributos de clase
    protected String nombre, especie;
    protected int edad;

    //Constructor sbre cargado

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }


    //Metodos de la calse

    public abstract void hacerSonido();

    public abstract void comer();

    public abstract void dormir();



}
