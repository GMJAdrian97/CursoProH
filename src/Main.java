import POO.*;
import PelisSeries.Catalogo;
import PelisSeries.Contenido;
import PelisSeries.Pelicula;
import PelisSeries.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {

    public static void main(String[] args) {
        VariablesyAtributos vya = new VariablesyAtributos(); //Intanciamos el objeto
        vya.sumar(1);
        vya.sumar(1);
        System.out.println(vya.resultado);

        //Intanciamos objeto de la clase Calculadora
        Calculadora cal =  new Calculadora();
        //Ciclos(for, while, do-while)... (foreach, map, stream)
        boolean continuar = false;
        int tabla, opcion = 0;
        double numero1, numero2;
        char operador;
        String operacion;

        do{ //ciclo do se ejecuta hasta que una bandera cambie de valor
            System.out.println("********** Menu mamalon de operaciones **********");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Divicion");
            System.out.println("5.- Libre");
            System.out.println("6.- Escribe la opreacion");
            System.out.println("7.- Mostrar una tabla de multiplicacion");
            System.out.println("Ingresa la opcion deseada");
            //Guardamos la entrada de texto del teclado
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            //
            switch (opcion){
                case 1: // Operacion Suma
                    System.out.println("Dame el primer numero a sumar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a sumar");
                    numero2 = sc.nextDouble();
                    cal.sumar(numero1, numero2);
                    System.out.println("El resultado de tu suma es: " + cal.getResultado());
                    break;
                case 2: // Operacion resta
                    System.out.println("Damel el primer numero a restar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a restar");
                    numero2 = sc.nextDouble();
                    cal.restar(numero1,numero2);
                    System.out.println("El resultado de la resta es: " + cal.getResultado());
                    break;
                case 3: // Operacion Multiplicacion
                    System.out.println("Dame el primer nuemero a multiplicar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a multiplicar");
                    numero2 = sc.nextDouble();
                    cal.multiplicar(numero1, numero2);
                    System.out.println("El resultado de la multiplicacion es: " + cal.getResultado());
                    break;
                case 4: // Operacion Divicion
                    System.out.println("Dame el dividendo");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el divisor");
                    numero2 = sc.nextDouble();
                    cal.dividir(numero1, numero2);
                    System.out.println("El resultado de la multiplicacion es: " + cal.getResultado());
                    break;
                case 5: // Operacion Libre
                    System.out.println("Dame el signo de la operacion que deseas hacer");
                    operador = sc.next().charAt(0);
                    System.out.println("Dame el primer numero a operar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a operar");
                    numero2 = sc.nextDouble();
                    cal.operar(operador,numero1,numero2);
                    System.out.println("El resultado de la operacion es: " + cal.getResultado());
                    break;
                case 6: // Operacion Mas libre Libre
                    System.out.println("teclea toda la operacion que deseas hacer");
                    operacion = sc.next();
                    cal.operarLibre(operacion);
                    System.out.println("El resultado de la operacion es: " + cal.getResultado());
                    break;
                case 7: // Operacion Mas libre Libre
                    System.out.println("Dame la tabla que quieres ver");
                    tabla = sc.nextInt();
                    cal.listarTblMultiplicar(tabla);
                    System.out.println("Tu tabla es " + cal.getResultado());
                    break;
                default:
                    System.out.println("Adiosito para el gears");
            }
            System.out.println("Quires hacer otra operacion? ... Teclea 1 para volver a legir, preciona cualquier tecla para salir");
            int regresar = sc.nextInt();
            continuar = regresar == 1;
        } while(continuar);
        System.out.println("Adiosito para el gears");

    }

}*/

/*public class Main {

    public static void main(String[] args) {
        String nombre, especie;
        int confirmacionRegistro, edad, OpcionMenu;
        boolean BanderaMenu = true;

        Animal animalperro = new Perro("Spayk","Perro", 2);
        animalperro.hacerSonido();

        Animal animalGato = new Gato("Ceniza", "Gato",2);
        animalGato.hacerSonido();

        ListaAnimales lstAnimales = new ListaAnimales();

       do{
           System.out.println("********** Bienvenido Al Refugio De Patitas **********");
           System.out.println("********** Porfavor Elige Una Opcion **********");
           System.out.println("********** 1.- Registrar un Animal **********");
           System.out.println("********** 2.- Ver la lista de los aniamles **********");
           System.out.println("********** 3.- Hacer que todos hablen **********");
           System.out.println("********** 4.- Salir **********");
           Scanner st = new Scanner(System.in);
           OpcionMenu = st.nextInt();
           if(OpcionMenu == 4){
               BanderaMenu = false;
               System.out.println("********** Gracias por su visita, vuelva pronto **********");
               System.exit(0);
           }else {
               switch (OpcionMenu) {
                   case 1:
                       System.out.println("********** Registro de animal **********");
                       System.out.println("Escribe la especie de la cuel será tu animal?");
                       System.out.println("Perro");
                       System.out.println("Gato");
                       System.out.println("Mapache");
                       System.out.println("Pajaro");
                       Scanner scAnimal = new Scanner(System.in);
                       especie = scAnimal.next();

                       switch (especie) {
                           case "Perro":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Perro(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           case "Gato":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Gato(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           case "Mapache":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Mapache(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           case "Pajaro":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Pajaro(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           default:
                               System.out.println("No tecleaste una especie valida");

                       }

                       break;
                   case 2:
                        lstAnimales.MostrarAnimales();
                       break;
                   case 3:

                       break;
                   case 4:
                       System.out.println("Caso 4");
                       break;
                   default:
                       System.out.println("Elige una opcion valida 1 - 4");
               }
           }
           System.out.println("Quires reegrsar al menú ?");
           System.out.println("1.- Si");
           System.out.println("2.- No");
           int regresar = st.nextInt();
           BanderaMenu = regresar == 1;
       }while(BanderaMenu);
        System.out.println("********** Gracias por su visita, vuelva pronto **********");*/


public class Main {

    public static void main(String[] args) {

        boolean BanderaMenu = true;

        Catalogo catalogo = new Catalogo();
        catalogo.agregarContenido(new Pelicula("Tom",2000,120,"CN"));
        catalogo.agregarContenido(new Serie("LALA",2000,120,2, 2));
        do {
            System.out.println("********** Peliculas y series **********");
            System.out.println(" --- Porfavor Elige Una Opcion ---");
            System.out.println(" 1.- Añadir Pelicula/Serie ");
            System.out.println(" 2.- Buscar Contenido ");
            System.out.println(" 3.- Listar Catalogo ");
            System.out.println(" 4.- Salir ");
            Scanner seleccionMenu = new Scanner(System.in);
            int OpcionMenu = seleccionMenu.nextInt();
            switch (OpcionMenu) {
                case 1:
                    System.out.println("Anadir pelicula \n");
                    System.out.println("Que tipo de contenido agregaras? \n 1.- Pelicula \n 2.- Serie \n");
                    int Op = seleccionMenu.nextInt();
                    String titulo, director;
                    int year, duracionEnMinutos;
                    seleccionMenu.nextLine();
                    System.out.println("Escribe el titulo de tu "+((Op == 1) ? "Peli" : "Serie"+"."));
                    titulo = seleccionMenu.nextLine();
                    System.out.println("Dame el año de la "+((Op == 1) ? "Peli" : "Serie"+"."));
                    year = seleccionMenu.nextInt();
                    System.out.println("Dame la duracion de la "+((Op == 1) ? "Peli" : "Serie"+" en minutos"));
                    duracionEnMinutos = seleccionMenu.nextInt();
                    if (Op == 1) {
                        System.out.println("Dame el nombre del director de tu peli");
                        director = seleccionMenu.next();
                        Contenido peli = new Pelicula(titulo, year, duracionEnMinutos, director);
                        catalogo.agregarContenido(peli);
                    } else {
                        int episodios, temporadas;
                        System.out.println("Dame los episodios");
                        episodios = seleccionMenu.nextInt();
                        System.out.println("Dame las temporadas");
                        temporadas = seleccionMenu.nextInt();
                        Contenido serie = new Serie(titulo, year, duracionEnMinutos, episodios, temporadas);
                        catalogo.agregarContenido(serie);
                    }
                    break;
                case 2:
                    seleccionMenu.nextLine();
                    System.out.println("Buscar pelicula \n ");
                    System.out.println("Escribe el titulo que deseas buscar");
                    titulo = seleccionMenu.nextLine();
                    catalogo.buscarPorTitulo(titulo);
                    break;
                case 3:
                    System.out.println("Listar Catalogo \n");
                    catalogo.mostrarTodo();
                    break;
                case 4:
                    BanderaMenu = false;
                    break;
                default:
                    System.out.println("********** Elige una opcion valida **********");
            }
        } while (BanderaMenu);
        System.out.println("********** Gracias por su visita, vuelva pronto **********");

        /*System.out.println("Holis");*/

    }

}